package com.eomcs.basic.ex06;

// 반복문의 사용.
// while 조건(문장);
public class Exam0320 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;
    while (count++ < 5) {
      sum = sum + count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);
  }
}
