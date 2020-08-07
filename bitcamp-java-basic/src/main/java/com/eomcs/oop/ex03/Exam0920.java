package com.eomcs.oop.ex03;

public class Exam0920 {
  static class Monitor {

    int bright = 50;
    int contrast = 50;
    int widthRes = 50;
    int heightRes = 50;

    void display() {
      System.out.println("----------------------------------");
      System.out.printf("밝기(%d)\n", this.bright);
      System.out.printf("명암(%d)\n", this.contrast);
      System.out.printf("해상도(%d x %d)\n", this.widthRes, this.heightRes);
      System.out.println("----------------------------------");
    }
  }
  public static void main(String[] args) {

    Monitor m1 = new Monitor();
    m1.display();
    // 인스턴스 변수는 자동으로 0으로 초기화 되어 있음

    /*
    m1.bright = 50;
    m1.contrast = 50;
    m1.heightRes = 50;
    m1.widthRes = 50;
    m1.display();
    번거롭지 않게 기본값을 클래스안에서 초기화 한다.
    */
    m1.bright = 40; // 물론 변수를 바꿀 수 있다.
    m1.display();
  }
}
