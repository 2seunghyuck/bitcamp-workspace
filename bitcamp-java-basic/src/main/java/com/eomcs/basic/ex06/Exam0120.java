package com.eomcs.basic.ex06;

public class Exam0120 {
 public static void main(String[] args) {
  int age = 20;
  if (age >= 19)
    System.out.println("성인이다."); //if 뒤의 한문장만 첫 조건에 종속된다.
    System.out.println("일해야 한다.");
    System.out.println("세금납부 해야한다.");
    System.out.println("------------------------------");

    // 여러 문장을 if 문에 종속시키고 싶으면, 블록을 사용하라!
    if (age >= 19) {
      System.out.println("성인이다.");
      System.out.println("일해야 한다.");
      System.out.println("세금 납부해야 한다.");
    }
 }
}
