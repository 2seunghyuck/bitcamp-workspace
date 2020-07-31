package com.eomcs.basic.ex06;

public class Exam0160 {
  public static void main(String[] args) {
    int age = 9;

    if (age < 8)
      System.out.println("아동입니다.");
    else if (age < 14)
      {System.out.println("어린이입니다.");}
    else if (age < 19)
      {System.out.println("청소년입니다.");}
    else if (age < 65)
      {System.out.println("성인입니다.");}
    else
      {System.out.println("노인입니다.");}
    // 첫번째 if 가 8~19줄 까지를 실행하고, 그안에서 if 가 순차적으로 실행된다.

    if (age < 8)
      System.out.println("아동입니다.");
    else if (age < 14)
      System.out.println("어린이 입니다.");
    else if (age < 19)
      System.out.println("청소년 입니다.");
    else if (age < 65)
      System.out.println("성인 입니다.");
    else
      System.out.println("노인 입니다.");
    // 문단을 보기좋게 정렬한 것.
  }
}
