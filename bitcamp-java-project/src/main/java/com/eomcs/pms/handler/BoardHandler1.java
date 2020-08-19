package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class BoardHandler1 {

  static class Board {
    int no;
    String title;
    String content;
    String writer;
    Date registeredDate;
    int viewCount;
  }

  static final int MAX_LENGHT = 100;
  Board[] list = new Board[MAX_LENGHT];
  int size = 0;

  public void add() {

    System.out.println("[새 게시글]");
    Board b = new Board();
    b.no = Prompt.inputInt("번호? ");
    b.title = Prompt.inputString("제목? ");
    b.content = Prompt.inputString("내용? ");
    b.writer = Prompt.inputString("작성자? ");
    b.registeredDate = new java.sql.Date(System.currentTimeMillis());
    b.viewCount = 0;
    System.out.println("게시글 등록이 완료 되었습니다.");

    list[size++] = b;
  }
  public void list() {
    System.out.println("[게시글 목록]");
    for(int i = 0; i < size; i++) {
      Board b = list[i];
      System.out.printf("%d, %s, %s, %s, %s, %d \n", b.no, b.title, b.writer, b.registeredDate, b.viewCount);
    }
  }
}
