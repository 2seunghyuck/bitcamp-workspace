package com.eomcs.pms.handler;

import java.util.List;
import com.eomcs.pms.domain.Todo;
import com.eomcs.util.Prompt;

public class TodoDeleteCommand implements Command {

  List<Todo> todoList;

  public TodoDeleteCommand(List<Todo> list) {
    this.todoList = list;
  }

  @Override
  public void execute() {
    System.out.println("[스케줄 삭제]");
    int no = Prompt.inputInt("번호? ");
    int index = indexOf(no);

    if (index == -1) {
      System.out.println("해당 번호의 작업이 없습니다.");
      return;
    }

    String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("작업 삭제를 취소하였습니다.");
      return;
    }

    todoList.remove(index);
    System.out.println("작업을 삭제하였습니다.");
  }

  private int indexOf(int no) {
    for (int i = 0; i < todoList.size(); i++) {
      Todo todo = todoList.get(i);
      if (todo.getNo() == no) {
        return i;
      }
    }
    return -1;
  }
}
