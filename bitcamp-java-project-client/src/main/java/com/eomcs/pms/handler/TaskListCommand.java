package com.eomcs.pms.handler;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TaskListCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[작업 목록]");

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select no, content, deadline, owner, status"
                + " from pms_task order by no desc");
        java.sql.ResultSet rs = stmt.executeQuery();
        ) {

      System.out.println("내용, 마감일, 상태, 담당자");
      while (rs.next()) {
        System.out.printf("%d, %s, %s, %s, %d\n",
            rs.getInt("no"),
            rs.getString("content"),
            rs.getDate("deadline"),
            rs.getString("owner"),
            rs.getInt("status"));
      }
    } catch (Exception e) {
      System.out.println("조회에 실패 했습니다.");
      e.printStackTrace();
    }
  }
}
