package com.eomcs.oop.ex04;

import java.util.Date;

public class Exam0240 {
  public static void main(String[] args) {

    Date d1 = new Date();
    System.out.println(d1.getYear() + 1900); // 1900 년부터 지난시간을 출력하므로 1900을 더함
    System.out.println(d1.getMonth() + 1); // 0 부터 시작하므로 현재월을 구하려면 1을 더함
    System.out.println(d1.getDate());

    long millis = Date.parse("Sat, 12 Aug 1995 13:30:00 GMT");
    System.out.println(millis);

    // 스태틱 메서드 활용
    long currMillis = System.currentTimeMillis();

    // 생성자 활용
    java.sql.Date today = new java.sql.Date(currMillis);

    // 인스턴스 메서드 활용
    String str = today.toString();
    System.out.println(str);

    // 스태틱 메서드 활용
    java.sql.Date d = java.sql.Date.valueOf("2019-12-30");
    System.out.println(d);
    // println()에 문자열을 주지 않고 그냥 객체(의 주소)를 넘기면
    // println() 내부에서 해당 객체의 toString()을 호출한 후에
    // 그 리턴 값을 출력한다.
  }
}
