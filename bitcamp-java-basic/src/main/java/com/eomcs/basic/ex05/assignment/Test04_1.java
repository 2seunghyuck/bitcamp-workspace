package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

// # 과제 :
// - 다음 int 변수에 들어있는 값을
// 각 자리수에 10진수 값을 역순으로 출력하라
// 실행 예)
// 입력? 23459876
// 6
// 7
// 8
// 9
// 5
// 4
// 3
// 2
public class Test04_1 {
  public static void main(String[] args) {
    int value = 23459876;
    while (value >0) {// value 0 보다 작아질때까지 실행
      System.out.println(value % 10);
      value = value / 10;
    }
  }
}


