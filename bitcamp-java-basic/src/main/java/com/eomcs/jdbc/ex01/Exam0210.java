package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Exam0210 {
  public static void main(String[] args) throws SQLException {

    try (java.sql.Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb","study","1111");){

      System.out.println("DBMS와 연결됨");
    }
    System.out.println("DBMS와 연결 해제됨");
  }
}
