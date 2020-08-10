package com.eomcs.pms;

import com.eomcs.pms.handler.MemberHandler1;
import com.eomcs.pms.handler.ProjectHandler1;
import com.eomcs.pms.handler.TaskHandler1;
import com.eomcs.util.prompt1;

public class App1 {
  public static void main(String[] args) {
    loop: while (true) {
      String command = prompt1.inputString("명령>");
      switch (command) {
        case "/member/add":
          MemberHandler1.add();
          break;
        case "/member/list":
          MemberHandler1.list();
          break;
        case "/project/add":
          ProjectHandler1.add();
          break;
        case "/project/list":
          ProjectHandler1.list();
          break;
        case "/task/add":
          TaskHandler1.add();
          break;
        case "/task/list":
          TaskHandler1.list();
          break;
        case "quit":
        case "exit":
          System.out.println("안녕!");
          break loop;
        default:
          System.out.println("잘못 입력하셨습니다.");
      }
    }
  prompt1.close();
  }
}
