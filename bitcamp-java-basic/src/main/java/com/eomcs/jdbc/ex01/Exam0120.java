package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

public class Exam0120 {
  public static void main(String[] args) {

    // 인스턴스만 생성했지만 , 드라이버가 자동으로 등록된다.
    // 클래스가 로딩될 때 자동으로 생성된다.
    try {

      new org.mariadb.jdbc.Driver();
      new oracle.jdbc.driver.OracleDriver();
      new com.microsoft.sqlserver.jdbc.SQLServerDriver();

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
