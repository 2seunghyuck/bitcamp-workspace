// non-static nested class = inner class
package com.eomcs.oop.ex11.a;

public class Exam0211 {

  // 스태틱 멤버
  static int sValue;
  static void sm() {}
  static class A{} // static nested class

  // 인스턴스 멤버
  int iValue;
  void im() {}
  class B {} // non-static nested class => inner class


  // 결론:
  // nested class가 바깥 클래스의 인스턴스 멤버를 사용한다면
  // non-static nested class 로 정의하라!

  public static void main(String[] args) {
  }
}
