package com.eomcs.oop.ex02;

// # 관련된 기능(메서드)을 묶어 분류하기 : 분류 전
//
public class Exam0230 {

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
  }

  static void printResult(int value) {
    System.out.println("**********************");
    System.out.printf("==> 결과 = %d\n", value);
    System.out.println("**********************");
  }

  public static void main(String[] args) {

    // 다음 식을 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
    // 2 + 3 - 1 * 7 / 3 = ?

    // 계산 결과를 보관할 변수는 더이상 필요가 없다.
    // Calculator 내부에서 계산 결과를 관리한다.
    // int result = 0;

    Calculator.plus(2);
    Calculator.plus(3);
    Calculator.minus(1);
    Calculator.multiple(7);
    Calculator.divide(3);

    System.out.printf("result = %d\n", Calculator.result);
  }
}


