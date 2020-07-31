package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    class Project {
      int no;
      String name;
      String main;
      Date start;
      Date end;
      String prod;
      String coop;
    }
    Scanner keyInput = new java.util.Scanner(System.in);
    // 여러개의 프로젝트 정보를 입력받기 위한 변수 준비
    final int MAX_LENGTH = 100;
    Project[] projects = new Project[MAX_LENGTH];
    int count = 0;
    System.out.println("[프로젝트]");

    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      Project p = new Project();
      System.out.print("번호? ");
      p.no = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명? ");
      p.name = keyInput.nextLine();

      System.out.print("내용? ");
      p.main = keyInput.nextLine();

      System.out.print("시작일? ");
      p.start = java.sql.Date.valueOf(keyInput.nextLine());
      // 입력받은 날을 표준화 시키기위해 도구를 사용한다.
      System.out.print("종료일? ");
      p.end = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      p.prod = keyInput.nextLine();

      System.out.print("팀원? ");
      p.coop = keyInput.nextLine();
      System.out.println();

      projects[i] = p;
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
      Project p = projects[i];
      System.out.printf("%d, %s, %s, %s, %s\n", p.no, p.name, p.start, p.end, p.prod);
    }
  }
}
