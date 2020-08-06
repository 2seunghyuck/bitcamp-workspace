package com.eomcs.oop.ex03;

public class Exam0421 {

  static class Smartphone {

    int volume;
    int bright;
    int contrast;
    void playMusic() {

    }

    // 파라미터가 다른 생성자를 여러개 정의할 수 있따.
    public Smartphone () {
      System.out.println("Smartphone() 생성자 호출됨");
    }
    public Smartphone (int a) {
      System.out.println("Smartphone(int) 생성자 호출됨");
    }
    public Smartphone (String str, int a) {
      System.out.println("Smartphone(String, int) 생성자 호출됨");
    }
    public Smartphone (int a, String str) {
      System.out.println("Smartphone(int, String) 생성자 호출됨");
    }

  }
  public static void main(String[] args) {

    // 인스턴스를 생성할 때 생성자에 던지는 값에 따라 자동으로 호출될 생성자가 결정된다.
    new Smartphone();
    new Smartphone(100);
    new Smartphone("aaa", 100);
    new Smartphone(100, "bbb");
  }
}
