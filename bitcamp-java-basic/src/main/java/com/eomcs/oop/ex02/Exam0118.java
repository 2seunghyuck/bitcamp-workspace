package com.eomcs.oop.ex02;
// 변수 모음 클래스(Score)를 바깥으로 분리;

import com.eomcs.oop.ex02.util.Score3;

public class Exam0118 {


  public static void main(String[] args) {

    Score3 s1 = new Score3();
    Score3 s2 = new Score3();

    s1.init("홍길동", 100, 90, 80);

    s2.init("임꺽정",50, 20, 10);

    printScore(s1);
    printScore(s2);
    s1.kor = 50;
    s1.compute();
    printScore(s1);
  }

  static void printScore(Score3 s) {
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.avg);

  }
}
