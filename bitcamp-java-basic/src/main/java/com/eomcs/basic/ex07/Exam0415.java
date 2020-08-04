package com.eomcs.basic.ex07;

public class Exam0415 {

  public static void main(String[] args) throws Exception {

    int result = 1;
    int n = 5;
    for (int i = 2; i <= n; i++) {
      result *= i;
    }

    System.out.println(result);
    System.out.println("------------------");

    result = factorial(5);
    System.out.println(result);
  }
// 재귀 호출 ;
// 생성한 메서드를 다시 불러들여사용하는법
  static int factorial(int n) {
    if (n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }
}
