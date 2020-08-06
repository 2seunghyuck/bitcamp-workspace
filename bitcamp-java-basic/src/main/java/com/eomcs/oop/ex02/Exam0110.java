package com.eomcs.oop.ex02;

public class Exam0110 {


  public static void main(String[] args) {
    String name = "홍길동";
    int kor = 100;
    int eng = 90;
    int math = 80;
    int sum = kor + eng + math;
    float avg = sum / 3f ;

    printScore(name, kor, eng, math, sum, avg);
  }

  static void printScore(String name, int kor, int eng, int math, int sum, float avg) {
    System.out.printf("%s, %d, %d, %d, %d, %1f", name, kor, eng, math, sum, avg);

  }
}
