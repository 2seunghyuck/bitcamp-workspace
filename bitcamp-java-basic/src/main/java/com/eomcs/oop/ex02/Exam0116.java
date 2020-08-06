package com.eomcs.oop.ex02;
// 변수 모음 클래스(Score)를 바깥으로 분리;

import com.eomcs.oop.ex02.util.Score;

public class Exam0116 {


  public static void main(String[] args) {

    Score s1 = new Score();
    Score s2 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    s1.compute();
    printScore(s1);

    s2.name = "임꺽정";
    s2.kor = 50;
    s2.eng = 20;
    s2.math = 10;
    s2.compute();
    printScore(s2);

  }

  static void printScore(Score s) {
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.avg);

  }
}
