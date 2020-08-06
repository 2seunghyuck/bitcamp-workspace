package com.eomcs.oop.ex02;
// 낱개의 변수를 묶어 여러군데 변수를 사용할 수 있게 함;

public class Exam0115 {
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float avg;

    void compute() {
      this.sum = this.kor + this.eng + this.math;
      this.avg = this.sum / 3f;

    }
  }

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
