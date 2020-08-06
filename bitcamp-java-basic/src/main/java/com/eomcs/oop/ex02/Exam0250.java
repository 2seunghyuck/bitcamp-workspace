package com.eomcs.oop.ex02;

import com.eomcs.oop.util.Calculator3;

// # 관련된 기능(메서드)을 묶어 분류하기 : 분류 전
//
public class Exam0250 {


    static void printResult(int value) {
      System.out.println("**********************");
      System.out.printf("==> 결과 = %d\n", value);
      System.out.println("**********************");
    }



  public static void main(String[] args) {
    // 두개의 식을 계산하기 위해 두가지의 calculator 변수를 준비하고 , 초기화 시켰지만.
    // Calculator class 의 메서드가 static 필드에 속해 변수를 공유하므로,
    // 결과값은 분리되지 않게된다.
    // 따라서 두가지의 식을 계산하기 위해서는, static변수가 아닌, 인스턴스 변수를 지정해주어야한다.
    Calculator3 c1 = new Calculator3();
    Calculator3 c2 = new Calculator3();

    c1.plus(2); // + 2
    c1.plus(3); // + 2 + 3
    c1.minus(1); // + 2 + 3 - 1
    c1.multiple(7); // + 2 + 3 - 1 * 7
    c1.divide(3); // + 2 + 3 - 1 * 7 / 3 = ?

    System.out.printf("result = %d\n", c1.result);
    c2.result = 0;

    c2.plus(3); // + 3
    c2.multiple(2); // + 3 * 2
    c2.plus(7); // + 3 * 2 + 7
    c2.divide(4); // + 3 * 2 + 7 / 4
    c2.minus(5); // + 3 * 2 + 7 / 4 - 5 = ?

    Calculator3.plus(3);

    System.out.printf("result = %d\n", c2.result);
  }
}

