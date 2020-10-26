package com.eomcs.net.ex04.stateless2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient2 {
  public static void main(String[] args) throws Exception{
    Scanner keyScan = new Scanner(System.in);

    long clientId = 0;

    while(true) {
      System.out.println("연산자입력");
      String op = keyScan.nextLine();

      System.out.println("값 입력");
      int value = Integer.parseInt(keyScan.nextLine());

      try (Socket socket = new Socket("localhost", 8888);
          DataOutputStream out = new DataOutputStream(socket.getOutputStream());
          DataInputStream in = new DataInputStream(socket.getInputStream())) {

        out.writeLong(clientId);
        out.writeUTF(op);
        out.writeInt(value);
        out.flush();

        clientId = in.readLong();

        int result = in.readInt();
        System.out.printf("계산결과 => %s",result);

      } catch (Exception e) {
        System.out.println("통신중 오류발생");
      }
      System.out.println("계속 하시겟습니까 ?(Y/n)");
      if (keyScan.nextLine().equalsIgnoreCase("n")) {
        break;
      }
    }
    keyScan.close();
  }
}
