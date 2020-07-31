package com.eomcs.basic.ex06;

// 반복문의 사용.
// while 조건(문장);
// 중첩된 반복문 구구단 멈추기
// loop 사용하여 그상태에서 실행을종료하기.
public class Exam0342 {
  public static void main(String[] args) {
    int i = 1;
    int j = 1;
    loop: {
      while (i <= 9) {

        j = 1;
        while (j <= 9) {
          System.out.printf("%d x %d = %d\n", i, j, i * j);
          if (i == 5 && j == 2)
            break loop;
          j++;
        }
        i++;
      }
    }
  }
}
