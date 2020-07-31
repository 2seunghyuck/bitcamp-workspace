// 반복문 for

package com.eomcs.basic.ex06;

public class Exam0430 {
  public static void main(String[] args) {
    // for문의 중첩사용
    for (int i = 2; i <= 9; i++) {
      if (i == 5) {
        continue;
      }
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%d * % d = %d\n", i, j, i * j);
      }
      System.out.println();
    }
  }
}

