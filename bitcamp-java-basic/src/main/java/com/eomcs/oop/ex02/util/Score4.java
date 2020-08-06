package com.eomcs.oop.ex02.util;

public class Score4 {
  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float avg;

  public void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.avg = this.sum / 3f;

  }
// 생성자 => 인스턴스가 생성될때 호출되는 메서드;
//  => 이름을 클래스 이름과 같게함
  public Score4(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.compute();
  }
}
