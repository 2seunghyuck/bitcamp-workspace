package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

public class Exam0110 {
  public static void main(String[] args) {

    try {

      java.sql.Driver mariadbDriver = new org.mariadb.jdbc.Driver();

      DriverManager.registerDriver(mariadbDriver);
      System.out.println("드라이버 등록 완료");

      // 확인하기 위해서는 jdbc:mariadb: 까지 적어줘야한다.
      // mariadb,mysql 은 서로 호환되므로 mariadb를 설치했지만 mysql도 사용할 수 있다.
      java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb:");
      System.out.println(driver);


    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
