package com.eomcs.pms.handler;

import java.util.List;
import com.eomcs.pms.domain.Todo;
import com.eomcs.util.Prompt;

public class TodoDetailCommand implements Command {

  List<Todo> todoList;

  public TodoDetailCommand(List<Todo> list) {
    this.todoList = list;
  }

  @Override
  public void execute() {
    System.out.println("[할 일 상세보기]");
    int no = Prompt.inputInt("번호? ");
    Todo todo = findByNo(no);

    if (todo == null) {
      System.out.println("해당 번호의 작업이 없습니다.");
      return;
    }

    System.out.printf("내용: %s\n", todo.getContent());
    System.out.printf("날짜: %s\n", todo.getDate());
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
    System.out.printf("카테고리: %s\n", categories);
    System.out.printf("할일: %s\n", todo.getTitle());
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
