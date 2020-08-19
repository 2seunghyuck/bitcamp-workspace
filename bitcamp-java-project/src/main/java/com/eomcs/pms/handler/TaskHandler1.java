package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.prompt1;

public class TaskHandler1 {
  public static class Task {
    int no;
    String content;
    Date endDate;
    String Status;
    String producer;
  }

  final static int LENGTH = 100;
  Task[] list = new Task[LENGTH];
  int size;

  MemberHandler1 memberHandler1;

  public TaskHandler1(MemberHandler1 memberHandler1) {
    this.memberHandler1 = memberHandler1;
  }


  public void add() {
    System.out.println("[작업 추가]");
    Task t = new Task();
    t.no = prompt1.inputInt("번호? ");
    t.content = prompt1.inputString("내용?");
    t.endDate = prompt1.inputDate("종료일?");
    t.Status = prompt1.inputString("상태? \n 0.신규\n 1.진행중\n 2.완료\n =>");

    while(true) {
      String name =  prompt1.inputString("만든이? (취소 : 빈문자열)");
      if(name.length() == 0) {
        System.out.println("작업 등록이 취소 되었습니다.");
        return;
      } else if(memberHandler1.findByName(name) != null) {
        t.producer = name;
        break;
      }
      System.out.println("등록되지 않은 회원입니다.");
    }
    list[size++] = t;
  }

  public void list() {
    System.out.println("[작업 목록]");
    for (int i = 0; i < size; i++) {
      String currentState;
      Task t = list[i];
      switch (t.Status) {
        case "0":
          currentState = "신규";
          break;
        case "1":
          currentState = "진행중";
          break;
        default:
          currentState = "완료";

      }
      System.out.printf("%d, %s, %s, %s, %s\n", t.no, t.content, t.endDate, currentState,
          t.producer);
    }
  }
}
