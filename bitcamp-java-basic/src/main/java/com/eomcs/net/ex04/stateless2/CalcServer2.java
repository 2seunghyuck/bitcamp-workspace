package com.eomcs.net.ex04.stateless2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class CalcServer2 {

  static Map<Long, Integer> resultMap = new HashMap<>();

  public static void main(String[] args) throws Exception{

    System.out.println("서버 실행중");
    ServerSocket ss = new ServerSocket(8888);

    while(true) {
      Socket socket = ss.accept();
      System.out.println("클라이언트 요청처리");
      try {
        processRequest(socket);
      } catch (Exception e) {

      }
    }
  }
  static void processRequest(Socket socket) throws Exception {
    try (Socket socket2 = socket;
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream())) {

      long clientId = in.readLong();

      String op = in.readUTF();
      int value = in.readInt();

      Integer obj = resultMap.get(clientId);
      int result = 0;

      if (obj != null) {
        System.out.printf("%s 기존고객의 요청처리\n",clientId);
        result = obj;
      } else {
        clientId = System.currentTimeMillis();
        System.out.printf( "%d 새로운 아이디 발급\n",clientId);
      }
      switch (op) {
        case "+":
          result += value;
        case "-" :
          result -= value;
        case "/" :
          result /= value;
        case "*" :
          result *= value;
          break;
      }
      resultMap.put(clientId, result);

      out.writeLong(clientId);
      out.writeInt(result);
      out.flush();
    }

  }
}
