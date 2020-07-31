package com.eomcs.pms;

import java.sql.Date;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    final int MAX_LENGTH = 100;
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
      String str = keyInput.nextLine();
      no[i] = Integer.parseInt(str); // 입력값을 문자로 받아서 숫자로 리턴해줌

      System.out.print("내용? ");
      text[i] = keyInput.nextLine();

      System.out.print("완료일? ");
      end[i] = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.println("상태 => 0: 신규, 1: 진행중, 2: 완료 ");
      System.out.print("> ");
      stat[i] = keyInput.nextLine();


      System.out.print("담당자? ");
      engi[i] = keyInput.nextLine();
      System.out.println();
      System.out.println("계속 입력하시겠습니까? (y/N)");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;
    }
    keyInput.close();

    System.out.println("--------------------");
    for (int i = 0; i < count; i++) {
      String statTi;
      switch(stat[i]) {
        case 0:
          System.out.println(statTi = "신규");
        case 1:
          System.out.println(statTi = "진행중");
        case 2:
          System.out.println(statTi = "완료");
      }
      System.out.printf("%d, %s ,%s, %s, %s%n", no[i], text[i], end[i], stat[i], engi[i]);
    }
  }



}

// String 문자열입력을 받을 리터럴을 비교할때 [a == b] 말고 [a.equals("b")] 해야함.

/*
 * switch (stat[i]) { case "0": System.out.println("신규"); break; case "1":
 * System.out.println("진행중"); break; default: System.out.println("완료");
 */
