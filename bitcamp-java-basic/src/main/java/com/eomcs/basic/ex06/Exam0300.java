package com.eomcs.basic.ex06;

// 반복문의 사용.
// while 조건(문장);
public class Exam0300 {
  public static void main(String[] args) {

    // while (true) System.out.println("안녕!"); true면 계속 실행하는 가장간단한 조건문장식.
    int i = 0;
     do
      System.out.println(i);
    while (i++ < 10);
  }
}
