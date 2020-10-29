package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Exam0360 {
  public static void main(String[] args) throws SQLException {

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();) {

      int count = stmt.executeUpdate(
          "delete from x_board where board_id = 4");
      System.out.printf("%d 개 변경성공", count);
    }
  }
}
