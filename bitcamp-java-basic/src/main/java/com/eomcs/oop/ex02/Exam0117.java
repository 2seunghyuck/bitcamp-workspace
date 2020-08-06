package com.eomcs.oop.ex02;
// 변수 모음 클래스(Score)를 바깥으로 분리;

import com.eomcs.oop.ex02.util.Score2;

public class Exam0117 {


  public static void main(String[] args) {

    Score2 s1 = new Score2();
    Score2 s2 = new Score2();

    s1.init("홍길동", 100, 90, 80);
    s1.compute();
    printScore(s1);

    s2.init("임꺽정",50, 20, 10);
    s2.compute();
    printScore(s2);

  }

  static void printScore(Score2 s) {
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.avg);

  }
}
