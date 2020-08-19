package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;
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
  Project[] list = new Project[LENGTH];
  int size;

  MemberHandler1 memberHandler1;

  public ProjectHandler1(MemberHandler1 memberHandler1) {
    this.memberHandler1 = memberHandler1;
  }

  public void add() {
    Project p = new Project();
    System.out.println("[새로운 프로젝트]");
    p.no = prompt1.inputInt("번호?");
    p.name = prompt1.inputString("이름?");
    p.content = prompt1.inputString("내용?");
    p.startDate = prompt1.inputDate("시작일?");
    p.endDate = prompt1.inputDate("종료일?");
    while (true) {
      String name = prompt1.inputString("만든이?(취소: 빈문자열)");
      if (name.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return;
      } else if (memberHandler1.findByName(name) != null) {
        p.producer = name;
        break;
      }
      System.out.println("등록된 회원이 아닙니다.");
    }

    StringBuilder names = new StringBuilder();
    while (true) {
      String name = Prompt.inputString("팀원? (완료 : 빈문자열) ");
      if (name.length() == 0) {
        break;
      } else if (memberHandler1.findByName(name) != null) {
        if (names.length() > 0) {
          names.append(", ");
        }
        names.append(name);
      } else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }
    p.cooperator = names.toString();

    list[size++] = p;
  }

  public void list() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < size; i++) {
      Project p = list[i];
      System.out.printf("%d, %s, %s, %s, %s\n", p.no, p.name, p.startDate, p.endDate, p.producer);
    }
  }
}
