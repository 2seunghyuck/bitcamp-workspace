package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    class Task {
      int no;
      String project;
      String text;
      Date endDate;
      String state;
      String engineer;

    }
    Scanner keyInput = new Scanner(System.in);
    final int MAX_LENGTH = 100;
    int count = 0;
    Task[] tasks = new Task[MAX_LENGTH];

    System.out.println("[작업]");
    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      Task t = new Task();
      System.out.print("프로젝트? ");
      t.project = keyInput.nextLine();
      System.out.print("번호? ");
      String str = keyInput.nextLine();
      t.no = Integer.parseInt(str); // 입력값을 문자로 받아서 숫자로 리턴해줌
      System.out.print("내용? ");
      t.text = keyInput.nextLine();
      System.out.print("완료일? ");
      t.endDate = Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.print("0: 신규");
      System.out.print("1: 진행중");
      System.out.print("2: 완료");
      System.out.print("> ");
      t.state = keyInput.nextLine();
      System.out.print("담당자? ");
      t.engineer = keyInput.nextLine();
      tasks[i] = t;

      System.out.println("계속 입력하시겠습니까? (y/N)");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;
    }
    keyInput.close();

    System.out.println("--------------------");
    for (int i = 0; i < count; i++) {
      Task t = tasks[i];
      String stateTitle;
      switch (t.state) {
        case "0":
          stateTitle = "신규";
          break;
        case "1":
          stateTitle = "진행중";
          break;
        default:
          stateTitle = "완료";
      }
      System.out.printf("%d, %s, %s, %s, %s\n", t.no, t.text, t.endDate, stateTitle, t.engineer);
    }
  }
}
// if (stat.equals("0")) {
// System.out.println("신규");
// } else if (stat.equals("1")) {
// System.out.println("진행중");
// } else {
// System.out.println("완료");
// }

/*
 * switch (stat) { case "0": System.out.println("신규"); break; case "1": System.out.println("진행중");
 * break; default: System.out.println("종료"); }
 *
 * System.out.printf("담당자: %s%n", engi); } } // String 문자열입력을 받을 리터럴을 비교할때 [a == b] 말고
 * [a.equals("b")] 해야함.
 */
