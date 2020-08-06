package com.eomcs.oop.ex02;

public class Exam0100 {
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

    void init(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.compute();
    }
  }


  public static void main(String[] args) {

    Score s = new Score();
    Score s2 = new Score();

    s.init("홍길동", 100, 80, 60);
    s2.init("임꺽정", 80, 30, 70);

    printResult(s);
    printResult(s2);
  }
  static void printResult(Score s) {
    System.out.printf("이름 = %s\n국어 = %d\n영어 = %d\n수학 = %d\n합계 = %d\n평균 = %.1f\n", s.name, s.kor,
        s.eng, s.math, s.sum, s.avg);
  }
}

