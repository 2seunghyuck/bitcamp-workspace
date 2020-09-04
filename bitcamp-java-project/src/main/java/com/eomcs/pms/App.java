package com.eomcs.pms;

import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.AbstractList;
import com.eomcs.util.ArrayList;
import com.eomcs.util.LinkedList;
import com.eomcs.util.Prompt;
import com.eomcs.util.Queue;
import com.eomcs.util.Stack;

public class App {

  public static void main(String[] args) {

    AbstractList<Board> boardList = new LinkedList<>();
    // BoardHandler 가 작업하는데 필요한 의존객체를 외부에서 생성자를 통해 주입한다.
    // => 이를 의존객체 주입이라고 한다 (Dependency Injection)
    BoardHandler boardHandler = new BoardHandler(boardList);

    AbstractList<Member> memberList = new ArrayList<>();
    MemberHandler memberHandler = new MemberHandler(memberList);

    AbstractList<Project> projectList = new LinkedList<>();
    ProjectHandler projectHandler = new ProjectHandler(projectList, memberHandler);

    AbstractList<Task> taskList = new ArrayList<>();
    TaskHandler taskHandler = new TaskHandler(taskList, memberHandler);

    Stack<String> commandList = new Stack<>();
    Queue<String> commandList2 = new Queue<>();

    loop:
      while (true) {
        String command = Prompt.inputString("명령> ");

        // 사용자가 입력한 명령을 보관한다.
        commandList.push(command);
        commandList2.offer(command);

        switch (command) {
          case "/member/add": memberHandler.add(); break;
          case "/member/list": memberHandler.list(); break;
          case "/member/detail": memberHandler.detail(); break;
          case "/member/update": memberHandler.update(); break;
          case "/member/delete": memberHandler.delete(); break;
          case "/project/add": projectHandler.add(); break;
          case "/project/list": projectHandler.list(); break;
          case "/project/detail": projectHandler.detail(); break;
          case "/project/update": projectHandler.update(); break;
          case "/project/delete": projectHandler.delete(); break;
          case "/task/add": taskHandler.add(); break;
          case "/task/list": taskHandler.list(); break;
          case "/task/detail": taskHandler.detail(); break;
          case "/task/update": taskHandler.update(); break;
          case "/task/delete": taskHandler.delete(); break;
          case "/board/add": boardHandler.add(); break;
          case "/board/list": boardHandler.list(); break;
          case "/board/detail": boardHandler.detail(); break;
          case "/board/update": boardHandler.update(); break;
          case "/board/delete": boardHandler.delete(); break;

          // history 명령을 처리한다.
          case "history": printCommandHistory(commandList); break;
          case "history2": printCommandHistory2(commandList2); break;
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

    Prompt.close();
  }

  private static void printCommandHistory2(Queue<String> commandList2) {
    try {
      Queue<String> commandQueue = commandList2.clone();
      for (int count = 1; commandQueue.size() > 0; count++) {
        System.out.println(commandQueue.poll());

        if ((count % 5) == 0) {
          String response = Prompt.inputString(":");
          if (response.equalsIgnoreCase("q")) {
            break;
          }
        }
      }
    } catch (Exception e ) {
      System.out.println("history 명령 처리 중 오류 발생!");
    }
  }
  static void printCommandHistory(Stack<String> commandList) {
    try {
      Stack<String> commandStack = commandList.clone();
      for (int count = 1; !commandStack.empty(); count++) {
        System.out.println(commandStack.pop());

        if ((count % 5) == 0) {
          String response = Prompt.inputString(":");
          if (response.equalsIgnoreCase("q")) {
            break;
          }
        }
      }
    } catch (Exception e) {
      System.out.println("history 명령 처리 중 오류 발생!");
    }
  }
}
