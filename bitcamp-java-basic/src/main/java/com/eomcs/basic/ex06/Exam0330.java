package com.eomcs.basic.ex06;

// 반복문의 사용.
// while 조건(문장);
// 1 ~ 100 까지 짝수의 합.
public class Exam0330 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;
    while (count++ < 100) {
      if (count % 2 != 0)
        continue;//조건식이 참이면 아래 행을 실행하지 않고 상위 조건문으로 돌아간다;
      sum = sum + count;
    }
    System.out.println(sum);
  }
}
