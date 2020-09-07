package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Project;
import com.eomcs.util.AbstractList;
import com.eomcs.util.Iterator;
import com.eomcs.util.Prompt;

public class ProjectHandler {

  AbstractList<Project> projectList;
  MemberHandler memberHandler;


  public ProjectHandler (AbstractList<Project> list, MemberHandler memberHandler) {

    this.projectList = list;
    this.memberHandler = memberHandler;
  }

  // 프로젝트 데이터
  static final int LENGTH = 100;
  Project[] list = new Project[LENGTH];
  int size = 0;


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

    projectList.add(p);
  }

  public void list() {
    System.out.println("[프로젝트 목록]");
    Iterator<Project> iterator = projectList.iterator();
    while(iterator.hasNext()) {
      Project p = iterator.next();
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
  public void update() {
    System.out.println("[프로젝트 변경]");
    int no = Prompt.inputInt("번호?");
    Project project = findByNo(no);
    if (project == null) {
      System.out.println("해당번호의 프로젝트가 없습니다.");
    } else {
      String title = Prompt.inputString(
          String.format("프로젝트명(%s)? ", project.getTitle()));
      String content = Prompt.inputString(
          String.format("내용(%s)? ", project.getContent()));
      Date startDate = Prompt.inputDate(
          String.format("시작일(%s)? ", project.getStartDate()));
      Date endDate = Prompt.inputDate(
          String.format("종료일(%s)? ", project.getEndDate()));
      String owner = null;
      while (true) {
        String name = Prompt.inputString(
            String.format("만든이(%s)?(취소: 빈 문자열) ", project.getOwner()));
        if (name.length() == 0) {
          System.out.println("프로젝트 등록을 취소합니다.");
          return;
        } else if (memberHandler.findByName(name) != null) {
          owner = name;
          break;
        }
        System.out.println("등록된 회원이 아닙니다.");
      }

      StringBuilder members = new StringBuilder();
      while (true) {
        String name = Prompt.inputString(
            String.format("팀원(%s)?(완료: 빈 문자열) ", project.getMembers()));
        if (name.length() == 0) {
          break;
        } else if (memberHandler.findByName(name) != null) {
          if (members.length() > 0) {
            members.append(",");
          }
          members.append(name);
        } else {
          System.out.println("등록된 회원이 아닙니다.");
        }
      }
      String response = Prompt.inputString("정말 변경하시겠습니까 ? (y/N)");
      if (response.equalsIgnoreCase("y")) {
        project.setTitle(title);;
        project.setContent(content);
        project.setStartDate(startDate);
        project.setEndDate(endDate);
        project.setOwner(owner);
        project.setMembers(members.toString());
        System.out.println("프로젝트를 변경하였습니다.");
      }else {
        System.out.println("프로젝트 변경을 취소하였습니다.");
      }
    }
  }
  public void delete() {
    System.out.println("[프로젝트 삭제]");
    int no = Prompt.inputInt("번호?");
    int index = indexOf(no);
    if (index == -1) {
      System.out.println("해당번호의 프로젝트가 없습니다.");
    } else {
      String response = Prompt.inputString("정말 삭제 하시겠습니까 ? (y/N)");
      if (response.equalsIgnoreCase("y")) {
        projectList.remove(index);
        System.out.println("프로젝트를 삭제 하였습니다.");
      } else {
        System.out.println("삭제를 취소하였습니다.");
      }
    }
  }
  private int indexOf(int no) {
    for(int i = 0; i < projectList.size(); i++) {
      Project project = projectList.get(i);
      if (project.getNo() == no) {
        return i;
      }
    }    return -1;
  }
  private Project findByNo(int no) {
    for(int i = 0; i < projectList.size(); i++) {
      Project project = projectList.get(i);
      if (project.getNo() == no) {
        return project;
      }
    }
    return null;
  }
}
