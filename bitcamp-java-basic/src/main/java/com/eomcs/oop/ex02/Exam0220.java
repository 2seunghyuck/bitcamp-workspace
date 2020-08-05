package com.eomcs.oop.ex02;

// # 관련된 기능(메서드)을 묶어 분류하기 : 분류 전
//
public class Exam0220 {

  static class Calculator {
    static int result = 0;

    static void plus(int value) {
      result += value;
    }

    static void minus(int value) {
      result -= value;
    }

    static void multiple(int value) {
      result *= value;
    }

    static void divide(int value) {
      result /= value;
    }

    static void printResult(int value) {
      System.out.println("**********************");
      System.out.printf("==> 결과 = %d\n", value);
      System.out.println("**********************");
    }

  }


  public static void main(String[] args) {

    Calculator.plus(2); // + 2
    Calculator.plus(3); // + 2 + 3
    Calculator.minus(1); // + 2 + 3 - 1
    Calculator.multiple(7); // + 2 + 3 - 1 * 7
    Calculator.divide(3); // + 2 + 3 - 1 * 7 / 3 = ?

    System.out.printf("result = %d\n", Calculator.result);
    // 이렇게 계산을 완료한 후 다음 식을 계산해야 한다.

    // 식2 계산:
    // 다른 식을 계산하기 전에 기존의 계산 결과를 갖고 있는
    // result 변수를 0으로 초기화시켜야 한다.
    Calculator.result = 0;

    Calculator.plus(3); // + 3
    Calculator.multiple(2); // + 3 * 2
    Calculator.plus(7); // + 3 * 2 + 7
    Calculator.divide(4); // + 3 * 2 + 7 / 4
    Calculator.minus(5); // + 3 * 2 + 7 / 4 - 5 = ?

    System.out.printf("result = %d\n", Calculator.result);
  }
}

