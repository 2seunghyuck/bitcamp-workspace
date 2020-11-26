package com.eomcs.pms.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import com.eomcs.pms.service.BoardService;
import com.eomcs.util.Prompt;
@WebServlet("/board/delete")
public class BoardDeleteCommand extends GenericServlet {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {

    ServletContext ctx = request.getServletContext();
    BoardService boardService = (BoardService) ctx.getAttribute("boardService");

    PrintWriter out = response.getWriter();
    BufferedReader in = request.getReader();

    try {
      out.println("[게시물 삭제]");
      int no = Prompt.inputInt("번호? ", out, in);

      String responseText = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ", out, in);
      if (!responseText.equalsIgnoreCase("y")) {
        out.println("게시글 삭제를 취소하였습니다.");
        return;
      }

      if (boardService.delete(no) == 0) {
        out.println("해당 번호의 게시글이 없습니다.");
        return;
      }
      out.println("게시글을 삭제하였습니다.");

    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
      e.printStackTrace();
    }
  }
}
