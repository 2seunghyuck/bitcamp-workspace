package com.eomcs.pms.handler;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberListCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[회원 목록]");
    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select no, name, email, tel, cdt"
                + " from pms_member order by no desc");
        java.sql.ResultSet rs = stmt.executeQuery();
        ) {

      System.out.println("번호, 이름, 이메일, 전화번호, 등록일");
      while (rs.next()) {
        System.out.printf("%d, %s, %s, %s, %s\n",
            rs.getInt("no"),
            rs.getString("name"),
            rs.getString("email"),
            rs.getString("tel"),
            rs.getDate("cdt"));
      }
    } catch (Exception e) {
      System.out.println("조회에 실패 했습니다.");
      e.printStackTrace();
    }
  }
}
