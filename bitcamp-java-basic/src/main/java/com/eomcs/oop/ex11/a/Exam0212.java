// non-static nested class = inner class
package com.eomcs.oop.ex11.a;

public class Exam0212 {

  public static void main(String[] args) {
    // static nested class의 레퍼런스 선언과 인스턴스 생성
    Exam0211.A obj = new Exam0211.A();

    // non-static nested class의 레퍼런스 선언과 인스턴스 생성
    Exam0211.B obj2; // 레퍼런스 선언은 static nested class 와 같다.
    // obj2 = new Exam0211.B(); <-- 컴파일 오류 (static nested class처럼 사용못한다)
    // 1)   바깥 클래스의 인스턴스 준비
    Exam0211 outer = new Exam0211();
    obj2 = outer.new B();

    outer.iValue = 200;
    outer.im(); // 바깥 클래스의 인스턴스 멤버를 사용하는 경우와 같다.


  }
}
