package com.eomcs.oop.ex03;

public class Exam0220 {
  static class A {
    int value;
    static void m1() {

    }
    void m2() {
      this.value = 100;
    }
    void m3() {
      value = 100;
    }
    void m4(int value) {
      value = 200; // <== 로컬변수임
      this.value = 300; // <== 인스턴스 변수임

    }
  }
  public static void main(String[] args) {
    A.m1();
    A obj1 = new A();
    obj1.m2(); //<== 인스턴스 메서드에는 주소를 받을수 있는 this 변수가 있다.
               // new A(); 로 Heap 에 생성된 기본 정보 주소.

  }
}
