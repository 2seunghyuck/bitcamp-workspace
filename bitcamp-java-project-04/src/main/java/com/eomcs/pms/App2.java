package com.eomcs.pms;

import java.sql.Date;

public class App2 {

  public static void main(String[] args) {

    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    // 여러개의 프로젝트 정보를 입력받기 위한 변수 준비
    final int MAX_LENGTH = 100;
    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] main = new String[MAX_LENGTH];
    Date[] start = new Date[MAX_LENGTH];
    Date[] end = new Date[MAX_LENGTH];
    String[] prod = new String[MAX_LENGTH];
    String[] coop = new String[MAX_LENGTH];
    int count = 0;
    System.out.println("[프로젝트]");

    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명? ");
      name[i] = keyInput.nextLine();

      System.out.print("내용? ");
      main[i] = keyInput.nextLine();

      System.out.print("시작일? ");
      start[i] = java.sql.Date.valueOf(keyInput.nextLine());
      // 입력받은 날을 표준화 시키기위해 도구를 사용한다.
      System.out.print("종료일? ");
      end[i] = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      prod[i] = keyInput.nextLine();

      System.out.print("팀원? ");
      coop[i] = keyInput.nextLine();
      System.out.println();

      System.out.println("계속 입력하시겠습니까? (y/N)");
      String response = keyInput.nextLine();

      if (!response.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();

    }
    keyInput.close();

    System.out.println("----------------------------");
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", no[i], name[i], start[i], end[i], prod[i]);
    }
  }
}
