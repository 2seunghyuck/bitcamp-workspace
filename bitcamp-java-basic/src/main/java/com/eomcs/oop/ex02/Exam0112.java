package com.eomcs.oop.ex02;
// 낱개의 변수를 묶어 여러군데 변수를 사용할 수 있게 함;

public class Exam0112 {
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float avg;
  }

  public static void main(String[] args) {

    Score s1 = new Score();
    Score s2 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.avg = s1.sum / 3f;
    printScore(s1);

    s2.name = "임꺽정";
    s2.kor = 50;
    s2.eng = 20;
    s2.math = 10;
    s2.sum = s2.kor + s2.eng + s2.math;
    s2.avg = s2.sum / 3f;
    printScore(s2);

  }

  static void printScore(Score s) {
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.avg);

  }
}
