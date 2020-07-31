// 반복문 for

package com.eomcs.basic.ex06;

public class Exam0430 {
  public static void main(String[] args) {
    // for문의 중첩사용
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < i; j++) {
        System.out.println("*");
      }
      System.out.println();
    }
  }
}

