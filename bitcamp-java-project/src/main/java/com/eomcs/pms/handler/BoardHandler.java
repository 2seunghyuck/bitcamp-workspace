package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {

  // BoardHandler 가 사용할 BoardList 객체를 준비한다.
  BoardList boardlist = new BoardList();

  public void add() {
    System.out.println("[새 게시글]");
    Board board = new Board();

    board.no = Prompt.inputInt("번호 ? ");
    board.title = Prompt.inputString("제목 ? ");
    board.content = Prompt.inputString("내용 ?");
    board.writer = Prompt.inputString("작성자? ");
    board.registeredDate = new java.sql.Date(System.currentTimeMillis());
    System.out.println("게시글을 등록하였습니다.");
    board.viewCount = 0;

    boardlist.add(board);
  }

  public void list() {
    System.out.println("[게시글 목록]");
    Board[] boards = boardlist.toArray();

    for (Board board : boards) {
      System.out.printf("%d, %s, %s, %s, %d\n", board.no, board.title, board.writer, board.registeredDate, board.viewCount);
    }
  }
}
