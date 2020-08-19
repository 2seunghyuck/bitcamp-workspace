package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class BoardHandler {
  static class Board {
    int no;
    String title;
    String content;
    String writer;
    Date registeredDate;
    int viewCount;
  }
  // 공통으로 사용할 값을 보관하는 변수는 스태틱 멤버로 만든다.
  static final int LENGTH = 100;

  // 개별적으로 값을 보관해야 하는 변수를 인스턴스 멤버(non-static) 로 만든다.
  Board[] list = new Board[LENGTH];
  int size = 0;

  public void add() {
    System.out.println("[새 게시글]");
    Board b = new Board();

    b.no = Prompt.inputInt("번호 ? ");
    b.title = Prompt.inputString("제목 ? ");
    b.content = Prompt.inputString("내용 ?");
    b.writer = Prompt.inputString("작성자? ");
    b.registeredDate = new java.sql.Date(System.currentTimeMillis());
    System.out.println("게시글을 등록하였습니다.");
    b.viewCount = 0;
    this.list[this.size++] = b;
  }

  public void list() {
    System.out.println("[게시글 목록]");

    for (int i = 0; i < this.size; i++) {
      Board b = this.list[i];
      System.out.printf("%d, %s, %s, %s, %d\n", b.no, b.title, b.writer, b.registeredDate, b.viewCount);
    }
  }
}
