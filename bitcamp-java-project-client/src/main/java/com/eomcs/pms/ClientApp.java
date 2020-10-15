package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import com.eomcs.util.Prompt;

// Stateful 통신
// => 서버와 연결하여 간단한 메세지 주고 받기
// => 사용자가 입력한 명령을 서버에 전송하기
// => 사용자가 quit 명령을 입력할 때 까지 반복한다.
// => 서버에서 응답의 끝을 알리는 빈줄을 보낼때 까지 서버의 클라이언트는 계속 읽는다.
// => 애플리케이션 아규먼트를 이용하여 서버의 주소를 입력받는다.

public class ClientApp {

  static String host;
  static int port;

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("프로그램 사용법 : ");
      System.out.println("java -cp ... clientApp 서버주소 포트번호");
      System.exit(0);
    }

    host = args[0];
    port = Integer.parseInt(args[1]);

    while(true) {

      String input = Prompt.inputString("명령 > ");
      if (input.equalsIgnoreCase("quit"))
        break;

      request(input);

      if(input.equalsIgnoreCase("stop"))
        break;
    }
    System.out.println("안녕!");


  }

  private static void request(String message) {

    boolean stop = false;
    try (Socket socket = new Socket(host, port);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

      out.println(message);
      out.flush();

      receiveResponse(out, in);

      if (message.equalsIgnoreCase("stop")) {
        stop = true;
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    if (stop) {
      // 서버를 멈추기 위해 접속했다가 끊는다.
      try (Socket socket = new Socket(host, port)) {
        // 서버가 stop할 기회를 주기위해 잠시 연결한다.
      } catch (Exception e) {
        // 아무것도 안한다.
      }
    }
  }

  private static void receiveResponse(PrintWriter out, BufferedReader in) throws Exception {

    while(true) {
      String response = in.readLine();
      if (response.length() == 0) {
        break;
      } else if (response.equals("!{}!")) {
        // 사용자로부터 입력을 받아 서버에 보낸다.
        out.println(Prompt.inputString(""));
        out.flush();
      } else {
        System.out.println(response);
      }
    }
  }
}
