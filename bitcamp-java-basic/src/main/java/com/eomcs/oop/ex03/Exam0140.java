package com.eomcs.oop.ex03;

public class Exam0140 {
  // static 변수
  static class A {

    static int v1; // 클래스 변수
    int v2; // 인스턴스 변수
  }

  public static void main(String[] args) {
    // 클래스 변수는 클래스가 로딩되는 시점에 Method area에 생성된다.
    // 클래스는 클래스를 사용할 때 로딩된다.
    // - 클래스 변수(static 변수)를 사용하거나, 클래스 메서드(class 변수)를 사용하려할때.
    A.v1 = 100;

    // 인스턴스 변수는 new로 인스턴스를 생성할 때 마다 Heap에 생성된다.
    A obj1 = new A();
    A obj2 = new A();
    obj1.v2 = 200;
    obj2.v2 = 300;

    System.out.println(A.v1);
    System.out.println(obj1.v1);
    System.out.println(obj2.v1);
    System.out.println(obj1.v2);
    System.out.println(obj2.v2);

  }
}
