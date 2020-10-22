package com.eomcs.pms.handler;

import java.sql.Date;
import java.util.List;
import com.eomcs.pms.domain.Todo;
import com.eomcs.util.Prompt;

public class TodoUpdateCommand implements Command {

  List<Todo> todoList;
  MemberListCommand memberListCommand;

  public TodoUpdateCommand(List<Todo> list, MemberListCommand memberListCommand) {
    this.todoList = list;
    this.memberListCommand = memberListCommand;
  }

  @Override
  public void execute() {
    System.out.println("[할 일 변경]");
    int no = Prompt.inputInt("번호? ");
    Todo todo = findByNo(no);

    if (todo == null) {
      System.out.println("해당 번호의 작업이 없습니다.");
      return;
    }

    //    boolean isdone = Prompt.inputString("완료?");
    //    if (done.equalsIgnoreCase("yes")) {
    //      todo.setDone(isDone) = true;
    //    }
    String content = Prompt.inputString(
        String.format("내용(%s)? ", todo.getContent()));
    Date deadline = Prompt.inputDate(
        String.format("날짜(%s)? ", todo.getDate()));
    String categories = null;
    switch (todo.getCategory()) {
      case 1:
        categories = "어학";
        break;
      case 2:
        categories = "독서";
        break;
      case 3:
        categories = "운동";
        break;
      case 4:
        categories = "코딩";
        break;
      default:
        categories = "기타";
    }
    int newCategories = Prompt.inputInt(
        String.format("카테고리?\n1: 어학\n2: 독서\n3: 운동\n4: 코딩\n> ", categories));

    //    String owner = null;
    //    while (true) {
    //      String name = Prompt.inputString(
    //          String.format("담당자(%s)?(취소: 빈 문자열) ", todo.getTitle()));
    //
    //      if (name.length() == 0) {
    //        System.out.println("작업 등록을 취소합니다.");
    //        return;
    //      } else if (memberListCommand.findByName(name) != null) {
    //        owner = name;
    //        break;
    //      }
    //      System.out.println("등록된 회원이 아닙니다.");
    //    }

    String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("작업 변경을 취소하였습니다.");
      return;
    }

    todo.setContent(content);
    todo.setDate(deadline);
    todo.setCategory(newCategories);
    //    todo.setTitle(title);

    System.out.println("작업을 변경하였습니다.");
  }

  private Todo findByNo(int no) {
    for (int i = 0; i < todoList.size(); i++) {
      Todo todo = todoList.get(i);
      if (todo.getNo() == no) {
        return todo;
      }
    }
    return null;
  }
}
