package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;

public class App3 {

  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);

    final int MAX_LENGTH = 5;
    String[] proj = new String[MAX_LENGTH];
    int[] no = new int[MAX_LENGTH];
    String[] text = new String[MAX_LENGTH];
    Date[] end = new Date[MAX_LENGTH];
    String[] stat = new String[MAX_LENGTH];
    String[] engi = new String[MAX_LENGTH];
    int count = 0;

    System.out.println("[작업]");

    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      System.out.print("프로젝트? ");

      proj[i] = keyInput.nextLine();

      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine(); // 입력값을 문자로 받아서 숫자로 리턴해줌

      System.out.print("내용? ");
      text[i] = keyInput.nextLine();

      System.out.print("완료일? ");
      end[i] = Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      stat[i] = keyInput.nextLine();

      System.out.print("담당자? ");
      engi[i] = keyInput.nextLine();
      System.out.println("더 입력하겠습니까 ? (y/N)");
      String response = keyInput.nextLine();
      if (response.equalsIgnoreCase("y") == false) {
        break;
      }
    }
    keyInput.close();

    System.out.println("-------------");


    // if (stat.equals("0")) {
    // System.out.println("신규");
    // } else if (stat.equals("1")) {
    // System.out.println("진행중");
    // } else {
    // System.out.println("완료");
    // }
    for (int i = 0; i < MAX_LENGTH; i++) {
      switch (stat[i]) {
        case "0":
          System.out.println("신규");
          break;
        case "1":
          System.out.println("진행중");
          break;
        default:
          System.out.println("종료");
      }
    }
    for (int i = 0; i < count; i++) {
      System.out.printf("%s, %d, %s, %s, %s, %s%n", proj[i], no[i], text[i], end[i], stat[i], engi[i]);
    }


  }
}
// String 문자열입력을 받을 리터럴을 비교할때 [a == b] 말고 [a.equals("b")] 해야함.

