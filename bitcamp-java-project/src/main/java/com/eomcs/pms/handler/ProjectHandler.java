package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Project;
import com.eomcs.util.ArrayList;
import com.eomcs.util.Prompt;

public class ProjectHandler {

  ArrayList<Project> projectlist = new ArrayList<>();

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
    p.setNo(Prompt.inputInt("번호? "));
    p.setTitle(Prompt.inputString("프로젝트명? "));
    p.setContent(Prompt.inputString("내용? "));
    p.setStartDate(Prompt.inputDate("시작일? "));
    p.setEndDate(Prompt.inputDate("종료일? "));
    while (true) {
      String name = Prompt.inputString("만든이? (취소 : 빈문자열)");
      if (name.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return;
      } else if (memberHandler.findByName(name) != null) {
        p.setOwner(name);
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
    p.setMembers(names.toString());

    projectlist.add(p);
  }

  public void list() {
    System.out.println("[프로젝트 목록]");
    Project[] projects = projectlist.toArray(new Project[] {});
    for (Project p : projects) {
      System.out.printf("%d, %s, %s, %s, %s, [%s]\n", // 출력 형식 지정
          p.getNo(), p.getTitle(), p.getStartDate(), p.getEndDate(), p.getOwner(), p.getMembers());
    }

  }
  public void detail () {
    System.out.println("[프로젝트 상세조회]");
    int no = Prompt.inputInt("번호?");
    Project project = findByNo(no);
    if (project == null) {
      System.out.println("해당번호의 회원이 없습니다.");
    } else {
      System.out.printf("프로젝트명 : %s\n", project.getTitle());
      System.out.printf("내용 : %s\n", project.getContent());
      System.out.printf("시작일 : %s\n", project.getStartDate());
      System.out.printf("종료일 : %s\n", project.getEndDate());
      System.out.printf("만든이 : %s\n", project.getOwner());
      System.out.printf("팀원 : %s\n", project.getMembers());
    }
  }
  private Project findByNo(int no) {
    for(int i = 0; i < projectlist.size(); i++) {
      Project project = projectlist.get(i);
      if (project.getNo() == no) {
        return project;
      }
    }
    return null;
  }
}
