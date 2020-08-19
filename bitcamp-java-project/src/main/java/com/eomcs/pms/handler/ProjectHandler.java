package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Project;
import com.eomcs.util.Prompt;

public class ProjectHandler {

  ProjectList projectlist = new ProjectList();

  // 프로젝트 데이터
  static final int LENGTH = 100;
  Project[] list = new Project[LENGTH];
  int size = 0;

  MemberHandler memberHandler;
  public ProjectHandler(MemberHandler memberHandler) {
    this.memberHandler = memberHandler;
  }

  public void add() {

    System.out.println("[프로젝트 등록]");
    Project p = new Project();
    p.no = Prompt.inputInt("번호? ");
    p.title = Prompt.inputString("프로젝트명? ");
    p.content = Prompt.inputString("내용? ");
    p.startDate = Prompt.inputDate("시작일? ");
    p.endDate = Prompt.inputDate("종료일? ");
    while (true) {
      String name = Prompt.inputString("만든이? (취소 : 빈문자열)");
      if (name.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return;
      } else if (memberHandler.findByName(name) != null) {
        p.owner = name;
        break;
      }
      System.out.println("등록된 회원이 아닙니다.");
    }

    StringBuilder names = new StringBuilder();
    while (true) {
      String name = Prompt.inputString("팀원? (완료 : 빈문자열) ");
      if (name.length() == 0) {
        break;
      } else if (memberHandler.findByName(name) != null) {
        if (names.length() > 0) {
          names.append(", ");
        }
        names.append(name);
      } else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }
    p.members = names.toString();

    projectlist.add(p);
  }

  public void list() {
    System.out.println("[프로젝트 목록]");
    Project[] projects = projectlist.toArray();
    for (Project p : projects) {
      System.out.printf("%d, %s, %s, %s, %s, [%s]\n", // 출력 형식 지정
          p.no, p.title, p.startDate, p.endDate, p.owner, p.members);
    }

  }
}
