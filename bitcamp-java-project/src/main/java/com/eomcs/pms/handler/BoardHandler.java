package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;
import com.eomcs.util.ArrayList;
import com.eomcs.util.Prompt;

public class BoardHandler {

  // BoardHandler 가 사용할 BoardList 객체를 준비한다.
  ArrayList<Board> boardlist = new ArrayList<>();

  public void add() {
    System.out.println("[새 게시글]");
    Board board = new Board();

    board.setNo(Prompt.inputInt("번호 ? "));
    board.setTitle(Prompt.inputString("제목 ? "));
    board.setContent(Prompt.inputString("내용 ?"));
    board.setWriter(Prompt.inputString("작성자? "));
    board.setRegisteredDate(new java.sql.Date(System.currentTimeMillis()));
    System.out.println("게시글을 등록하였습니다.");
    board.setViewCount(0);

    boardlist.add(board);
  }

  public void list() {
    System.out.println("[게시글 목록]");
    Board[] boards = boardlist.toArray(new Board[] {});


    for (Board board : boards) {
      System.out.printf("%d, %s, %s, %s, %d\n", board.getNo(), board.getTitle(), board.getWriter(), board.getRegisteredDate(), board.getViewCount());
    }
  }
  public void detail () {
    System.out.println("[게시글 상세조회]");
    int no = Prompt.inputInt("번호?");
    Board board = findByNo(no);
    if (board == null) {
      System.out.println("해당번호의 게시글이 없습니다.");
    } else {
      board.setViewCount(board.getViewCount() + 1);
      System.out.printf("제목 : %s\n", board.getTitle());
      System.out.printf("내용 : %s\n", board.getContent());
      System.out.printf("등록일 : %s\n", board.getRegisteredDate());
      System.out.printf("조회수 : %s\n", board.getViewCount());
    }
  }
  public void update() {
    System.out.println("[게시글 변경]");
    int no = Prompt.inputInt("번호?");
    Board board = findByNo(no);
    if (board == null) {
      System.out.println("해당번호의 게시글이 없습니다.");
    } else {
      String title = Prompt.inputString(
          String.format("제목(%s)? ", board.getTitle()));
      String content = Prompt.inputString(
          String.format("내용(%s)? ", board.getContent()));
      String writer = Prompt.inputString(
          String.format("작성자(%s)? ", board.getWriter()));
      String response = Prompt.inputString("정말 변경하시겠습니까 ? (y/N)");
      if (response.equalsIgnoreCase("y")) {
        board.setTitle(title);
        board.setContent(content);
        board.setWriter(writer);
        System.out.println("게시글을 변경하였습니다.");
      }else {
        System.out.println("게시글변경을 취소하였습니다.");
      }
    }
  }
  public void delete() {
    System.out.println("[게시글 변경]");
    int no = Prompt.inputInt("번호?");
    int index = indexOf(no);
    if (index == -1) {
      System.out.println("해당번호의 게시글이 없습니다.");
    } else {
      String response = Prompt.inputString("정말 삭제 하시겠습니까 ? (y/N)");
      if (response.equalsIgnoreCase("y")) {
        boardlist.remove(index);
        System.out.println("게시글을 삭제 하였습니다.");
      } else {
        System.out.println("삭제를 취소하였습니다.");
      }
    }
  }
  private int indexOf(int no) {
    for(int i = 0; i < boardlist.size(); i++) {
      Board board = boardlist.get(i);
      if (board.getNo() == no) {
        return i;
      }
    }    return -1;
  }

  private Board findByNo(int no) {
    for(int i = 0; i < boardlist.size(); i++) {
      Board board = boardlist.get(i);
      if (board.getNo() == no) {
        return board;
      }
    }
    return null;
  }


}
