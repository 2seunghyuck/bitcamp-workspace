package com.eomcs.pms.handler;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProjectListCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[프로젝트 목록]");

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select title, content, sdt, edt, owner, members"
                + " from pms_project order by no desc");
        java.sql.ResultSet rs = stmt.executeQuery();
        ) {

      System.out.println("제목, 내용, 시작일, 종료일, 만든이, 팀원");
      while (rs.next()) {
        System.out.printf("%d, %s, %s, %s, %s, %s, %s\n",
            rs.getInt("no"),
            rs.getString("title"),
            rs.getString("content"),
            rs.getDate("sdt"),
            rs.getDate("edt"),
            rs.getString("owner"),
            rs.getString("members"));
      }
    } catch (Exception e) {
      System.out.println("조회에 실패 했습니다.");
      e.printStackTrace();
    }
  }
}
