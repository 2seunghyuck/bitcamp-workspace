package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.prompt1;

public class ProjectHandler1 {

  public static class Project {
    int no;
    String name;
    String content;
    Date startDate;
    Date endDate;
    String producer;
    String cooperator;
  }

  final static int LENGTH = 100;
  static Project[] list = new Project[LENGTH];
  static int size;

  public static void add() {
    Project p = new Project();
    System.out.println("[새로운 프로젝트]");
    p.no = prompt1.inputInt("번호?");
    p.name = prompt1.inputString("이름?");
    p.content = prompt1.inputString("내용?");
    p.startDate = prompt1.inputDate("시작일?");
    p.endDate = prompt1.inputDate("종료일?");
    p.producer = prompt1.inputString("만든이?");
    p.cooperator = prompt1.inputString("함께 만든이?");
    list[size++] = p;
  }

  public static void list() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < size; i++) {
      Project p = list[i];
      System.out.printf("%d, %s, %s, %s, %s\n", p.no, p.name, p.startDate, p.endDate, p.producer);
    }
  }
}
