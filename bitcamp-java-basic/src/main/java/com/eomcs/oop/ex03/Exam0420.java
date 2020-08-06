package com.eomcs.oop.ex03;

public class Exam0420 {

  static class Smartphone {

    int volume;
    int bright;
    int contrast;
    void playMusic() {

    }
    public Smartphone () {
      System.out.println("Smartphone() 생성자 호출됨");
    }

  }
  public static void main(String[] args) {
    Smartphone obj1 = new Smartphone();

    obj1.playMusic();
    System.out.println(obj1.volume);
    System.out.println(obj1.bright);
    System.out.println(obj1.contrast);
  }
}
