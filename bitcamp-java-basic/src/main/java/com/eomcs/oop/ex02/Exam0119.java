package com.eomcs.oop.ex02;
// 변수 모음 클래스(Score)를 바깥으로 분리;

import com.eomcs.oop.ex02.util.Score4;

public class Exam0119 {


  public static void main(String[] args) {

    Score4 s1 = new Score4("홍길동", 100, 90, 80);
    Score4 s2 = new Score4("홍길동", 100, 90, 80);

    printScore(s1);
    printScore(s2);

  }

  static void printScore(Score4 s) {
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.avg);

  }
}
