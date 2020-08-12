package com.eomcs.oop.ex07.a;

class Practice1 {

  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float avg;

  public String setName(String name) {
    return this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setKor(int kor) {
    this.kor = kor;
    this.compute();
  }

  public int getKor() {
    return this.kor;
  }

  public void setEng(int eng) {
    this.eng = eng;
    this.compute();
  }

  public int getEng() {
    return this.eng;
  }

  public void setMath(int math) {
    this.math = math;
    this.compute();
  }

  public int getMath() {
    return this.math;
  }

  public int getSum() {
    return this.sum;
  }

  public float getAverage() {
    return this.avg;
  }

  private void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.avg = this.sum / 3f;
  }

}

public class Practice {
  public static void main(String[] args) {
    Practice1 s = new Practice1();
    s.setName("홍길동");
    s.setKor(100);
    s.setEng(90);
    s.setMath(80);

    System.out.printf("%s, %d, %d, %d, %d, %.2f", s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getSum(),
        s.getAverage());
  }
}
