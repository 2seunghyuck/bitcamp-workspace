package com.eomcs.jdbc.ex01;
// FK(foreign key 가 참조하는 데이터 지우기

import java.sql.DriverManager;
import java.sql.SQLException;

public class Exam0361 {
  public static void main(String[] args) throws SQLException {

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();) {

      int count = stmt.executeUpdate(
          "delete from x_board_file where board_id = 1");
      System.out.printf("x_board_file 테이블의 %d 개 변경성공", count);

      //부모테이블의 데이터를 지우려면 부모테이블의 데이터를 참조하는 자식테이블의 데이터를 지운다.

      count = stmt.executeUpdate(
          "delete from x_board where board_id = 1");
      System.out.printf("x_board_file 테이블의 %d 개 변경성공", count);
    }
  }
}
