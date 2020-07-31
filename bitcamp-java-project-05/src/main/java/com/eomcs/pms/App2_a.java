package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;

public class App2_a {

  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);
    System.out.println("[프로젝트]");

    int[] no = new int[5];
    String[] project = new String[5];
    String[] object = new String[5];
    Date[] startdate = new Date[5];
    Date[] enddate = new Date[5];
    String[] prod = new String[5];
    String[] coop = new String[5];
    int count = 1;

    System.out.print("번호? ");
    no[0] = keyInput.nextInt();
    keyInput.nextLine();
    System.out.print("프로젝트명? ");
    project[0] = keyInput.nextLine();
    System.out.print("내용? ");
    object[0] = keyInput.nextLine();
    System.out.print("시작일? ");
    startdate[0] = Date.valueOf(keyInput.nextLine());
    System.out.print("종료일? ");
    enddate[0] = Date.valueOf(keyInput.nextLine());
    System.out.print("만든이? ");
    prod[0] = keyInput.nextLine();
    System.out.print("팀원? ");
    coop[0] = keyInput.nextLine();

    System.out.println("추가 정보를 입력하시겠습니까?(y/N)");
    String response = keyInput.nextLine();

    if (response.equalsIgnoreCase("y")) {
      count++;
      System.out.print("번호? ");
      no[1] = keyInput.nextInt();
      keyInput.nextLine();
      System.out.print("프로젝트명? ");
      project[1] = keyInput.nextLine();
      System.out.print("내용? ");
      object[1] = keyInput.nextLine();
      System.out.print("시작일? ");
      startdate[1] = Date.valueOf(keyInput.nextLine());
      System.out.print("종료일? ");
      enddate[1] = Date.valueOf(keyInput.nextLine());
      System.out.print("만든이? ");
      prod[1] = keyInput.nextLine();
      System.out.print("팀원? ");
      coop[1] = keyInput.nextLine();
      System.out.println("추가 정보를 입력하시겠습니까?(y/N)");
      if (response.equalsIgnoreCase("y")) {
        count++;
        System.out.print("번호? ");
        no[2] = keyInput.nextInt();
        keyInput.nextLine();
        System.out.print("프로젝트명? ");
        project[2] = keyInput.nextLine();
        System.out.print("내용? ");
        object[2] = keyInput.nextLine();
        System.out.print("시작일? ");
        startdate[2] = Date.valueOf(keyInput.nextLine());
        System.out.print("종료일? ");
        enddate[2] = Date.valueOf(keyInput.nextLine());
        System.out.print("만든이? ");
        prod[2] = keyInput.nextLine();
        System.out.print("팀원? ");
        coop[2] = keyInput.nextLine();
        System.out.println("추가 정보를 입력하시겠습니까?(y/N)");
        if (response.equalsIgnoreCase("y")) {
          count++;
          System.out.print("번호? ");
          no[3] = keyInput.nextInt();
          keyInput.nextLine();
          System.out.print("프로젝트명? ");
          project[3] = keyInput.nextLine();
          System.out.print("내용? ");
          object[3] = keyInput.nextLine();
          System.out.print("시작일? ");
          startdate[3] = Date.valueOf(keyInput.nextLine());
          System.out.print("종료일? ");
          enddate[3] = Date.valueOf(keyInput.nextLine());
          System.out.print("만든이? ");
          prod[3] = keyInput.nextLine();
          System.out.print("팀원? ");
          coop[3] = keyInput.nextLine();
          System.out.println("추가 정보를 입력하시겠습니까?(y/N)");
          if (response.equalsIgnoreCase("y")) {
            count++;
            System.out.print("번호? ");
            no[4] = keyInput.nextInt();
            keyInput.nextLine();
            System.out.print("프로젝트명? ");
            project[4] = keyInput.nextLine();
            System.out.print("내용? ");
            object[4] = keyInput.nextLine();
            System.out.print("시작일? ");
            startdate[4] = Date.valueOf(keyInput.nextLine());
            System.out.print("종료일? ");
            enddate[4] = Date.valueOf(keyInput.nextLine());
            System.out.print("만든이? ");
            prod[4] = keyInput.nextLine();
            System.out.print("팀원? ");
            coop[4] = keyInput.nextLine();
          }
        }
      }
    }
    keyInput.close();

    System.out.println("-----------------------------------------------");

    System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no[0], project[0], object[0],
        startdate[0].toString(), enddate[0].toString(), prod[0], coop[0]);
    if (count > 1) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no[1], project[1], object[1],
          startdate[1].toString(), enddate[1].toString(), prod[1], coop[1]);
      if (count > 2) {
        System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no[2], project[2], object[2],
            startdate[2].toString(), enddate[2].toString(), prod[2], coop[2]);
        if (count > 3) {
          System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no[3], project[3], object[3],
              startdate[3].toString(), enddate[3].toString(), prod[3], coop[3]);
          if (count > 4) {
            System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no[4], project[4], object[4],
                startdate[4].toString(), enddate[4].toString(), prod[4], coop[4]);
          }
        }
      }
    }
  }
}
