package com.eomcs.oop.ex04;

import java.util.Date;

public class Exam0230 {
  public static void main(String[] args) {
    // Math 클래스
    System.out.println(Math.abs(-100)); // <- 절대값
    System.out.println(Math.ceil(3.28)); // <- 보다 큰 가까운 정수값
    System.out.println(Math.floor(3.28)); // <- 보다 작은 가까운 정수값.
    System.out.println(Math.pow(2, 7)); // <- a 의 b 승
    System.out.println(Math.round(3.14)); // 반올림
    System.out.println("---------------------------");

    // Date 클래스
    Date d1 = new Date();
    System.out.println(d1.getYear() + 1900);
    System.out.println(d1.getMonth() + 1);
    System.out.println(d1.getDate());
    System.out.println(d1.getDay());

    long millis = Date.parse("Sat, 12 Aug 1995 13:30:25 GMT");
    System.out.println(millis);

    java.sql.Date d2 = java.sql.Date.valueOf("2020-08-10");
    System.out.println(d2.getYear() + 1900);
    System.out.println(d2.getMonth() + 1);
    System.out.println(d2.getDate());
    System.out.println(d2.getDay());

    long curr = System.currentTimeMillis();
    Date d3 = new Date(curr);
    System.out.println(d3.getYear() + 1900);
    System.out.println(d3.getMonth() + 1);
    System.out.println(d3.getDate());
    System.out.println(d3.getDay());
  }
}
