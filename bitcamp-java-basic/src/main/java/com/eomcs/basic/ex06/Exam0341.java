package com.eomcs.basic.ex06;

// 반복문의 사용.
// while 조건(문장);
// 중첩된 반복문 구구단 멈추기
public class Exam0341 {
  public static void main(String[] args) {
    int i = 1;
    int j = 1;
    while (i <= 9) {
     j = 1;
      while (j <= 9) {
        System.out.printf("%d x %d = %d\n", i, j, i * j);
        if (i == 5 && j == 2)
        break;
          j++;
      }
      i++;
    }

  }
}
