package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

public class Exam0110 {
  public static void main(String[] args) {

    try {

      java.sql.Driver mariadbDriver = new org.mariadb.jdbc.Driver();
      java.sql.Driver oracleDriver = new oracle.jdbc.driver.OracleDriver();
      java.sql.Driver mssqlDriver = new com.microsoft.sqlserver.jdbc.SQLServerDriver();

      DriverManager.registerDriver(mariadbDriver);
      DriverManager.registerDriver(mssqlDriver);
      DriverManager.registerDriver(oracleDriver);
      System.out.println("드라이버 등록 완료");

      // 확인하기 위해서는 jdbc:mariadb: 까지 적어줘야한다.
      // mariadb,mysql 은 서로 호환되므로 mariadb를 설치했지만 mysql도 사용할 수 있다.
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
