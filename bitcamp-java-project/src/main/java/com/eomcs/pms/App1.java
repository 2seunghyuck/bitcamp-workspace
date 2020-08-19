package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler1;
import com.eomcs.pms.handler.MemberHandler1;
import com.eomcs.pms.handler.ProjectHandler1;
import com.eomcs.pms.handler.TaskHandler1;
import com.eomcs.util.prompt1;

public class App1 {
  public static void main(String[] args) {
    BoardHandler1 boardHandler = new BoardHandler1();
    BoardHandler1 boardHandler2 = new BoardHandler1();
    BoardHandler1 boardHandler3 = new BoardHandler1();
    BoardHandler1 boardHandler4 = new BoardHandler1();
    BoardHandler1 boardHandler5 = new BoardHandler1();
    MemberHandler1 memberHandler = new MemberHandler1();
    ProjectHandler1 projectHandler = new ProjectHandler1(memberHandler);
    TaskHandler1 taskHandler = new TaskHandler1(memberHandler);

    loop: while (true) {
      String command = prompt1.inputString("명령>");
      switch (command) {
        case "/member/add": memberHandler.add(); break;
        case "/member/list": memberHandler.list(); break;
        case "/project/add": projectHandler.add(); break;
        case "/project/list": projectHandler.list(); break;
        case "/task/add": taskHandler.add(); break;
        case "/task/list": taskHandler.list(); break;
        case "/board/add": boardHandler.add(); break;
        case "/board/list": boardHandler.list(); break;
        case "/board2/add": boardHandler2.add(); break;
        case "/board2/list": boardHandler2.list(); break;
        case "/board3/add": boardHandler3.add(); break;
        case "/board3/list": boardHandler3.list(); break;
        case "/board4/add": boardHandler4.add(); break;
        case "/board4/list": boardHandler4.list(); break;
        case "/board5/add": boardHandler5.add(); break;
        case "/board5/list": boardHandler5.list(); break;

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
