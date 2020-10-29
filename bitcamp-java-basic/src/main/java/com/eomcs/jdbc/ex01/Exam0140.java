package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

public class Exam0140 {
  public static void main(String[] args) {

    System.out.printf("java.home = %s \n", System.getProperty("java.home"));
    System.out.printf("user.home = %s \n", System.getProperty("user.home"));
    System.setProperty("jdbc.drivers", "org.mariadb.jdbc.Driver:com.eomcs.jdbc.ex01.MyDriver");
    System.out.printf("jdbc.drivers = %s \n", System.getProperty("jdbc.drivers"));

    try {

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
