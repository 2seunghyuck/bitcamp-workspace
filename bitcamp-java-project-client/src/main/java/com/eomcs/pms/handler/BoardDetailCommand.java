package com.eomcs.pms.handler;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.eomcs.util.Prompt;

public class BoardDetailCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[게시물 상세보기]");
    int no = Prompt.inputInt("번호? ");

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select no, title, content, writer, cdt, vw_cnt"
                + " from pms_board where no=" + no);
        PreparedStatement stmt2 = con.prepareStatement(
            "update pms_board set vw_cnt = vw_cnt+1 where no=" + no);
        java.sql.ResultSet rs = stmt.executeQuery();) {

      if (rs.next()) {
        stmt2.executeUpdate();
        System.out.printf("제목 : %s\n",rs.getString("title"));
        System.out.printf("내용 : %s\n",rs.getString("content"));
        System.out.printf("작성자 : %s\n",rs.getString("writer"));
        System.out.printf("등록일 : %s\n",rs.getDate("cdt"));
        System.out.printf("조회수 : %s\n",rs.getInt("vw_cnt"));
      } else {
        System.out.println("해당번호의 게시물이 존재하지 않습니다.");
      }
    } catch (Exception e) {
      System.out.println("게시글 조회중 오류발생");
      e.printStackTrace();
    }
  }
}

