package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Exam0310 {
  public static void main(String[] args) throws SQLException {

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();) {

      System.out.println(stmt.getClass().getName());

      System.out.println("DBMS와 연결됨");
      int count = stmt.executeUpdate(
          "insert into x_board(title,contents) values('제목10','내용')");
      System.out.printf("%d 개 입력성공", count);

    } finally {
    }
  }
}
