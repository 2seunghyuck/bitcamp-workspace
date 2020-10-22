package com.eomcs.pms.handler;

import java.sql.Date;
import java.util.List;
import com.eomcs.pms.domain.Todo;
import com.eomcs.util.Prompt;

// Command 규칙에 따라 클래스를 정의한다.
public class TodoAddCommand implements Command {

  List<Todo> todoList;

  public TodoAddCommand(List<Todo> list) {
    this.todoList = list;
  }

  @Override
  public void execute() {
    System.out.println("[스케쥴 등록]");

    Todo todo = new Todo();
    todo.setNo(Prompt.inputInt("번호? " ));
    int index = indexOf(todo.getNo());

    if (index == 0) {
      System.out.println("해당 번호의 작업이 이미 존재합니다.");
      return;
    }
    todo.setDate(Prompt.inputDate("날짜 ?"));
    todo.setTitle(Prompt.inputString("할일 ? "));
    todo.setContent(Prompt.inputString("내용 ? "));
    todo.setCategory(Prompt.inputInt("카테고리?\n1: 어학\n2: 독서\n3: 운동\n4: 코딩\n> "));
    todo.setRegisteredDate(new Date(System.currentTimeMillis()));
    todoList.add(todo);

    System.out.println("스케줄을 등록하였습니다.");
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
