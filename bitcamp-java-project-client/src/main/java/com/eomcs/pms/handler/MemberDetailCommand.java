package com.eomcs.pms.handler;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.eomcs.util.Prompt;

public class MemberDetailCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[회원 상세보기]");
    int no = Prompt.inputInt("번호? ");
    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select no, name, email, password, photo, tel, cdt"
                + " from pms_member where no=" + no);
        java.sql.ResultSet rs = stmt.executeQuery();) {

      if (rs.next()) {
        System.out.printf("제목 : %s\n",rs.getString("name"));
        System.out.printf("내용 : %s\n",rs.getString("email"));
        System.out.printf("암호 : %s\n",rs.getString("password"));
        System.out.printf("사진 : %s\n",rs.getString("photo"));
        System.out.printf("전화번호 : %s\n",rs.getString("tel"));
        System.out.printf("등록일 : %s\n",rs.getDate("cdt"));
      } else {
        System.out.println("해당번호의 게시물이 존재하지 않습니다.");
      }
    } catch (Exception e) {
      System.out.println("게시글 조회중 오류발생");
      e.printStackTrace();
    }
  }
}
