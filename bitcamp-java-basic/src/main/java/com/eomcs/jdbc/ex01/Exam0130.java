package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

public class Exam0130 {
  public static void main(String[] args) {

    try {

      // Class.forName - 패키지를 포함한 전체 이름을 적어주면 클래스를 로딩하고 실행한다.

      Class.forName("org.mariadb.jdbc.Driver");
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

      java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb://");
      System.out.println(driver);
      java.sql.Driver driver2 = DriverManager.getDriver("jdbc:sqlserver://");
      System.out.println(driver2);
      java.sql.Driver driver3 = DriverManager.getDriver("jdbc:oracle:thin://");
      System.out.println(driver3);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
