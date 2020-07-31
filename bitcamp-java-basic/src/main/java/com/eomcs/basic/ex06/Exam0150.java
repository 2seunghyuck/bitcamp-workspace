package com.eomcs.basic.ex06;

public class Exam0150 {
  public static void main(String[] args) {
    int age = 17;

    if (age >= 19)
      if (age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
    else
        System.out.println("미성년입니다.");

    System.out.println("------------------------------");
    // 위문장의 else는 age >=19 에 종속되어있는것처럼 보이지만
    // "실제로는 지하철무임승차 가능합니다" 의 if 에 종속되어있으므로, 들여쓰기에 낚이지마라.


    if (age >= 19) {
      if (age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
      else
        System.out.println("미성년입니다.");
    }

    System.out.println("------------------------------");
    // 만약 else 문을 첫 번째 if 문에 소속되게 하고 싶다면 {}사용하여 범위를 지정.
  }
}
