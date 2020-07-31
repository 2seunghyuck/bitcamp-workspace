package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    class Task {
      String proj;
      int no;
      String text;
      Date end;
      String stat;
      String engi;
    }
    Scanner keyInput = new java.util.Scanner(System.in);
    final int MAX_LENGTH = 100;
    Task[] tasks = new Task[MAX_LENGTH];
    int count = 0;

    System.out.println("[작업]");
    for (int i = 0; i < MAX_LENGTH; i++) {
      Task t = new Task();
      count++;
      System.out.print("프로젝트? ");
      t.proj = keyInput.nextLine();

      System.out.print("번호? ");
      String str = keyInput.nextLine();
      t.no = Integer.parseInt(str); // 입력값을 문자로 받아서 숫자로 리턴해줌

      System.out.print("내용? ");
      t.text = keyInput.nextLine();

      System.out.print("완료일? ");
      t.end = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.println("상태 => 0: 신규, 1: 진행중, 2: 완료 ");
      System.out.print("> ");
      t.stat = keyInput.nextLine();


      System.out.print("담당자? ");
      t.engi = keyInput.nextLine();

      System.out.println();
      System.out.println("계속 입력하시겠습니까? (y/N)");

      tasks[i] = t;
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;
    }
    keyInput.close();

    System.out.println("--------------------");
    for (int i = 0; i < count; i++) {
      Task t = tasks[i];
      String statTitle;
      switch (t.stat) {
        case "0":
          statTitle = "신규";
          break;
        case "1":
          statTitle = "진행중";
          break;
        default:
          statTitle = "완료";
      }
      System.out.printf("%d, %s ,%s, %s, %s%n", t.no, t.text, t.end, statTitle, t.engi);
    }
  }



}

// String 문자열입력을 받을 리터럴을 비교할때 [a == b] 말고 [a.equals("b")] 해야함.

/*
 * switch (stat[i]) { case "0": System.out.println("신규"); break; case "1":
 * System.out.println("진행중"); break; default: System.out.println("완료");
 */
