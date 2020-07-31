package com.eomcs.basic.ex06;

public class Exam0110 {
  public static void main(String[] args) {
    int age = 60;

    // if문법은 true일때 아래 명령어를 실행한다.
    if (age >= 19) // if 문장의 ;까지 한문장으로 취급하지만, 블럭으로 묶으면여러문장을 실행할 수 있다.
      System.out.println("성인입니다.");
    if (age >= 65)
      System.out.println("노인연금 수령대상자 입니다.");

    System.out.println("--------------------------------");
    int gender = 2;

    if (gender == 1) {
      System.out.println("여성");
      System.out.println("-----");
    } else {// 단독으로 실행할 수 없다.
      System.out.println("남성");
      System.out.println("-----");
    }

    System.out.println("--------------------------------");

    int age2 = 17;

    if (age2 >= 19)
      if (age2 >= 65)
        System.out.println("지하철 무임승차 가능합니다.");
      else
        System.out.println("미성년 입니다.");
    System.out.println("--------------------------------");

    int age3 = 15;

    if (age3 < 8)
      System.out.println("아동!");
    else if (age3 < 14)
      System.out.println("어린이!");
    else if (age3 < 19)
      System.out.println("청소년!");
    else if (age3 < 65)
      System.out.println("성인!");
    else
      System.out.println("노인!");
    System.out.println("--------------------------------");

    age3 = 67;
    if (age3 < 8)
      System.out.println("아동!");
    else if (age3 < 14) // else if 라는문법은 없지만,보기좋게 정렬한 것.
      System.out.println("어린이!");
    else if (age3 < 19)
      System.out.println("청소년!");
    else if (age3 < 65)
      System.out.println("성인!");
    else
      System.out.println("노인!");
    System.out.println("--------------------------------");

    age3 = 22;
    if (age3 < 8)
      System.out.println("아동!");
    else if (age3 < 14)
      System.out.println("어린이!");
    else if (age3 < 19)
      System.out.println("청소년!");
    else if (age3 < 65)
      System.out.println("성인!");
    else
      System.out.println("노인!");

  }
}
