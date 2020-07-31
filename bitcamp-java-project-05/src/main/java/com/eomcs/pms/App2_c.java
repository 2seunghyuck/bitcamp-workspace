package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;

public class App2_c {

  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);
    System.out.println("[프로젝트]");
    final int MAX_LENGTH;
    MAX_LENGTH = 5;
    int[] no = new int[MAX_LENGTH];
    String[] project = new String[MAX_LENGTH];
    String[] object = new String[MAX_LENGTH];
    Date[] startdate = new Date[MAX_LENGTH];
    Date[] enddate = new Date[MAX_LENGTH];
    String[] prod = new String[MAX_LENGTH];
    String[] coop = new String[MAX_LENGTH];
    int count = 0;

    for (int i = 0; i < 5; i++) {
      count++;
      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();
      System.out.print("프로젝트명? ");
      project[i] = keyInput.nextLine();
      System.out.print("내용? ");
      object[i] = keyInput.nextLine();
      System.out.print("시작일? ");
      startdate[i] = Date.valueOf(keyInput.nextLine());
      System.out.print("종료일? ");
      enddate[i] = Date.valueOf(keyInput.nextLine());
      System.out.print("만든이? ");
      prod[i] = keyInput.nextLine();
      System.out.print("팀원? ");
      coop[i] = keyInput.nextLine();

      System.out.println("추가 정보를 입력하시겠습니까?(y/N)");
      String response = keyInput.nextLine();
      if (response.equalsIgnoreCase("y") == false) {
        break;
      }
    }
    keyInput.close();

    System.out.println("-----------------------------------------------");
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no[i], project[i], object[i],
          startdate[i].toString(), enddate[i].toString(), prod[i], coop[i]);
      }
  }
}
