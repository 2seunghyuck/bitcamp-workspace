// 반복문 for

package com.eomcs.basic.ex06;

public class Exam0432 {
  public static void main(String[] args) {
    // label 을 사용하여 반복문 전체를 멈추기
    loop: for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%d x %d = %d\n", i, j, i * j);
        if (i == 5 && j == 5) {
          continue loop;
        }
      }
      System.out.println("----------------------------");
    }
  }
}

