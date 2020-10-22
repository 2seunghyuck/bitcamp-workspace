package com.eomcs.pms.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import com.eomcs.context.ApplicationContextListener;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.listener.AppInitListener;
import com.eomcs.pms.listener.DataHandlerListener;
import com.eomcs.pms.listener.RequestMappingListener;

// Stateful 통신
// => 클라이언트가 연결되면 클라이언트가 보낸 메시지를 그대로 리턴해준다.
// => 클라이언트의 요청을 처리한 후 종료하지 않고 다음 요청을 진행한다.
// => 클라이언트가 quit 명령을 보내면 응답한 후 연결을 끊는다.
// => 응답의 끝에는 빈 줄을 보내도록 응답 프로토콜을 정의한다.
//  - 프로토콜이란 ? 클라이언트/서버 간의 데이터를 주고받는 형식이다.
// => 클라이언트 연결이 끊어지면 다음 클라이언트와 연결하는것을 반복한다.

public class ServerApp {

  // 클라이언트가 stop 명령을 보내면 이 값이 true로 변경된다.
  // - 이 값이 true 이면 다음 클라이언트 접속할 때 서버를 종료한다.
  static boolean stop = false;

  // 스레드 풀 준비
  ExecutorService threadPool = Executors.newCachedThreadPool();

  // 옵저버와 공유할 Map 객체
  static Map<String,Object> context = new Hashtable<>();

  List<ApplicationContextListener> listeners = new ArrayList<>();

  public void addApplicationContextListener(ApplicationContextListener listener) {
    listeners.add(listener);
  }

  public void removeApplicationContextListener(ApplicationContextListener listener) {
    listeners.remove(listener);
  }

  private void notifyApplicationContextListenerOnServiceStarted() {
    for (ApplicationContextListener listener : listeners) {

      listener.contextInitialized(context);
    }
  }

  private void notifyApplicationContextListenerOnServiceStopped() {
    for (ApplicationContextListener listener : listeners) {
      listener.contextDestroyed(context);
    }
  }

  public void service(int port) {
    notifyApplicationContextListenerOnServiceStarted();

    try (ServerSocket serverSocket = new ServerSocket(port)) {
      System.out.println("서버 실행 중...");

      while(true) {
        Socket clientSocket = serverSocket.accept();

        if (stop) {
          break;
        }
        //new Thread(() -> handleClient(clientSocket)).start();
        threadPool.execute(() -> handleClient(clientSocket));
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    notifyApplicationContextListenerOnServiceStopped();

    // 스레드풀을 종료한다.
    threadPool.shutdown();

    try {
      if (!threadPool.awaitTermination(10, TimeUnit.SECONDS)) {
        System.out.println("아직 종료 안된 작업이 있다.");
        System.out.println("남아 있는 작업의 강제 종료를 시도하겠다.");
        threadPool.shutdownNow();

        if (!threadPool.awaitTermination(5, TimeUnit.SECONDS)) {
          System.out.println("스레드풀의 강제 종료를 완료하지 못했다.");
        } else {
          System.out.println("모든 작업을 강제 종료했다.");
        }
      }
    } catch (Exception e) {
      // 스레드풀 종료중 발생한 예외는 무시한다.
    }
  }

  public static void main(String[] args) {
    ServerApp server = new ServerApp();

    // 옵저버(Listener/Subscriber) 등록
    server.addApplicationContextListener(new AppInitListener());
    server.addApplicationContextListener(new DataHandlerListener());
    server.addApplicationContextListener(new RequestMappingListener());

    server.service(8888);
  }

  private static void handleClient(Socket clientSocket) {

    InetAddress address = clientSocket.getInetAddress();
    System.out.printf("클라이언트(%s)와 연결되었습니다.\n ",address.getHostAddress());

    try (Socket socket = clientSocket;
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream());) {

      String request = in.readLine();

      if (request.equalsIgnoreCase("stop")) {
        stop = true ; // 서버의 상태를 멈추라는 의미로 사용
        out.println("서버를 종료하는 중입니다");
        out.println();
        out.flush();
        return;
      }

      Command command = (Command) context.get(request);
      if (command != null) {
        command.execute(out, in);
      } else {
        out.println("해당명령을 처리할 수 없습니다.");
      }
      // 응답의 끝을 알리는 빈 문자열을 보낸다.
      out.println();
      out.flush();

    } catch (Exception e) {
      System.out.println("클라이언트와 대화도중 예외 발생");
    }
    System.out.printf("클라이언트(%s)와 연결을 끊었습니다..\n ",address.getHostAddress());

  }
}


