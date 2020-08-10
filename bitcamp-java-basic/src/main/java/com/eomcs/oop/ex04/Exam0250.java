package com.eomcs.oop.ex04;

import java.util.Calendar;

public class Exam0250 {
  public static void main(String[] args) {
    // Calendar 클래스의 사용
    Calendar cal = Calendar.getInstance();

    System.out.println(cal.get(1)); // year
    System.out.println(cal.get(2) + 1); // month
    System.out.println(cal.get(5)); // date
    System.out.println(cal.get(7)); // day => 요일
    System.out.println(cal.get(4)); // 해당월의 몇째주인지.
    System.out.println(cal.get(10)); // hour 12시 기준
    System.out.println(cal.get(11)); // hour 24시 기준
    System.out.println(cal.get(12)); // minute
    System.out.println(cal.get(13)); // second
    System.out.println("---------------------");
    // 각 변수를 상수로 지정해서 혼란을 방지함.
    System.out.println(cal.get(Calendar.YEAR)); // year
    System.out.println(cal.get(Calendar.MONTH) + 1); // month
    System.out.println(cal.get(Calendar.DATE)); // date
    System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // day => 요일
    System.out.println(cal.get(Calendar.WEEK_OF_MONTH)); // 해당월의 몇째주인지.
    System.out.println(cal.get(Calendar.HOUR)); // hour 12시 기준
    System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // hour 24시 기준
    System.out.println(cal.get(Calendar.MINUTE)); // minute
    System.out.println(cal.get(Calendar.SECOND)); // second
  }
}
