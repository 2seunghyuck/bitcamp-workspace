package com.eomcs.oop.ex03;

public class Exam0422 {

  static class Smartphone {

    int volume;
    int bright;
    int contrast;
    void playMusic() {

    }

    // 생성자가 한개라도 있으면 기본생성자가 자동으로 생성되지 않는다.
    public Smartphone (int a) {
      System.out.println("Smartphone() 생성자 호출됨");
    }

  }
  public static void main(String[] args) {
    // Smartphone obj1 = new Smartphone(); <-- int 값을 지정하지 않았음
    Smartphone obj1 = new Smartphone(100);
    // Smartphone obj1 = new Smartphone(3.14); <--- 존재하지 않는 datatype
    obj1.playMusic();
    System.out.println(obj1.volume);
    System.out.println(obj1.bright);
    System.out.println(obj1.contrast);
  }
}
