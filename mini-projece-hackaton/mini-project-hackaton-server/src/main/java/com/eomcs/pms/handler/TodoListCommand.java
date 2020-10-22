package com.eomcs.pms.handler;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import com.eomcs.pms.domain.Todo;

public class TodoListCommand implements Command {

  List<Todo> todoList;

  public TodoListCommand(List<Todo> list) {
    this.todoList = list;
  }


  @Override
  public void execute() {
    SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat date2 = new SimpleDateFormat("HH : mm");

    Calendar time = Calendar.getInstance();
    String date = date1.format(time.getTime());
    String timeNow = date2.format(time.getTime());
    System.out.println("[스케줄 목록]");
    System.out.println("===================================");
    System.out.printf("%s                 %s\n", date, timeNow);
    System.out.println("===================================");
    System.out.println("===================================");
    System.out.println("         .-----.");
    System.out.println("        |.-----.|");
    System.out.println("        ||x . x||");
    System.out.println("        ||_.-._||");
    System.out.println("        `--)-(--`");
    System.out.println("       __[=== o]___\'");
    System.out.println("       |:::::::::::|\'");
    System.out.println("       `-=========-`()");
    System.out.println("===================================");
    System.out.println("===================================");
    System.out.println("===================================");

    Iterator<Todo> iterator = todoList.iterator();

    while (iterator.hasNext()) {
      Todo todo = iterator.next();

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
      System.out.printf((todo.isDone() ? "● " : "○ ") + "%s" + " | "+ "%s" + " | " + "%s\n",
          todo.getDate(),
          categories,
          todo.getTitle());
    }
    System.out.println("===================================");
    System.out.println("===================================");
  }
}
