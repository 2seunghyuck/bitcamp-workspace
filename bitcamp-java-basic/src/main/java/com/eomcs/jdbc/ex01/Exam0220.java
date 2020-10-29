package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Exam0220 {
  public static void main(String[] args) throws SQLException {

    java.sql.Connection con = null;
    try {

      con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb","study","1111");

      System.out.println("DBMS와 연결됨");
      System.out.println(con.getClass().getName());
    } finally {
      try {
        con.close();
      } catch (Exception e) {

      }
    }
  }
}
