package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.BoardService;
import com.eomcs.util.Prompt;

// Command 규칙에 따라 클래스를 정의한다.
@WebServlet("/board/add")
public class BoardAddCommand extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    ServletContext ctx = request.getServletContext();
    BoardService boardService = (BoardService) ctx.getAttribute("boardService");
    PrintWriter out = response.getWriter();
    BufferedReader in = request.getReader();
    Map<String,Object> session = request.getSession();

    try {
      out.println("[게시물 등록]");

      Board board = new Board();
      board.setTitle(Prompt.inputString("제목? ", out, in));
      board.setContent(Prompt.inputString("내용? ", out, in));

      Member loginUser = (Member) session.get("loginUser");
      board.setWriter(loginUser);

      boardService.add(board);

      out.println("게시글을 등록하였습니다.");

    } catch(Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }
}
