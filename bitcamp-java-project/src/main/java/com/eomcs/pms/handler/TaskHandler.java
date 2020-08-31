package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Task;
import com.eomcs.util.ArrayList;
import com.eomcs.util.Prompt;

public class TaskHandler {
  ArrayList<Task> tasklist = new ArrayList<>();

  static final int LENGTH = 100;
  Task[] list = new Task[LENGTH];
  int size = 0;

  MemberHandler memberHandler;
  public TaskHandler(MemberHandler memberHandler) {
    this.memberHandler = memberHandler;
  }
  public void add() {

    System.out.println("[작업 등록]");
    Task t = new Task();
    t.setNo(Prompt.inputInt("번호? "));
    t.setContent(Prompt.inputString("내용? "));
    t.setDeadline(Prompt.inputDate("마감일? "));
    t.setStatus(Prompt.inputInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> "));

    while (true) {
      String name = Prompt.inputString("담당자? (취소 : 빈문자열)");
      if (name.length() == 0) {
        System.out.println("작업 등록을 취소합니다.");
        return;
      } else if (memberHandler.findByName(name) != null) {
        t.setOwner(name);
        break;
      }
      System.out.println("등록된 회원이 아닙니다.");
    }

    tasklist.add(t);
  }

  public void list() {
    System.out.println("[작업 목록]");
    Task[] tasks = tasklist.toArray(new Task[] {});
    for (Task t : tasks) {
      String stateLabel = null;
      switch (t.getStatus()) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          t.getNo(), t.getContent(), t.getDeadline(), stateLabel, t.getOwner());
    }
  }
  public void detail () {
    System.out.println("[작업목록 상세조회]");
    int no = Prompt.inputInt("번호?");
    Task task = findByNo(no);
    if (task == null) {
      System.out.println("해당번호의 작업이 없습니다.");
    } else {
      System.out.printf("내용 : %s\n", task.getContent());
      System.out.printf("마감일 : %s\n", task.getDeadline());
      String stateLabel = null;
      switch (task.getStatus()) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      System.out.printf("상태 : %s\n", stateLabel);
      System.out.printf("담당자 : %s\n", task.getOwner());
    }
  }
  private Task findByNo(int no) {
    for(int i = 0; i < tasklist.size(); i++) {
      Task task = tasklist.get(i);
      if (task.getNo() == no) {
        return task;
      }
    }
    return null;
  }
}
