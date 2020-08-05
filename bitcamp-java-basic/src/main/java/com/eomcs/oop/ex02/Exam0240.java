package com.eomcs.oop.ex02;

// # 관련된 기능(메서드)을 묶어 분류하기 : 분류 전
//
public class Exam0240 {

  public static void main(String[] args) {


    Calculator.plus(2);
    Calculator.plus(3);
    Calculator.minus(1);
    Calculator.multiple(7);
    Calculator.divide(3);

    printResult(Calculator.result);
  }

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

}


