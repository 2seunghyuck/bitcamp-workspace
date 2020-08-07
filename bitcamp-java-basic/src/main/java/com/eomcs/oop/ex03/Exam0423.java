package com.eomcs.oop.ex03;

public class Exam0423 {

  static class Smartphone {

    int volume;
    int bright;
    int contrast;

    void playMusic() {

    }

    // 생성자가 한개라도 있으면 기본생성자가 자동으로 생성되지 않는다.
    public Smartphone() {// 생성자 내에서 생성자 호출하기
      this(50, 50, 50); // <====== 다른 생성자를 호출할때는 반드시 첫문장이어야한다.
      System.out.println("Smartphone() 생성자 호출됨");
    }

    public Smartphone(int volume) {
      System.out.println("Smartphone(int) 생성자 호출됨");
      this.volume = volume;
      this.bright = 50;
      this.contrast = 50;

    }

    public Smartphone(int volume, int bright) {
      System.out.println("Smartphone(int, int) 생성자 호출됨");
      this.volume = volume;
      this.bright = bright;
      this.contrast = 50;

    }

    public Smartphone(int volume, int bright, int contrast) {
      System.out.println("Smartphone(int, int, int) 생성자 호출됨");
      this.volume = volume;
      this.bright = bright;
      this.contrast = contrast;

    }
    void m1() {
      // 일반 메서드에서 생성자를 임의로 호출할 수 없다.

      //this();

    }
  }

  public static void main(String[] args) {

    Smartphone obj1 = new Smartphone();

    // 레퍼런스로 생성자를 임의로 호출할 수 없다.
    // 생성자 호출은 new 명령을 실행할 때만 오직 지정할 수 있다.
    // obj1. Smartphone();

  }
}
