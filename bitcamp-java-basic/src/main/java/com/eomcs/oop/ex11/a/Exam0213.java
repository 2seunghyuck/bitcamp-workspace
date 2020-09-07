// non-static nested class = inner class
package com.eomcs.oop.ex11.a;

public class Exam0213 {

  // 인스턴스 멤버
  int iValue;
  void im() {}

  class A {

    // 바깥 클래스의 인스턴스 주소를 저장하기 위해 컴파일러는 다음과 유사한 인스턴스 필드를
    // 컴파일 하는 과정에서 자동으로 삽입한다.
    // ex)  Exam0213 outer;
    // 또한 바깥 클래스의 인스턴스 주소를 설정하기 위해
    // 다음과 같은 파라미터를 생성자에 자동으로 추가한다.
    //    public A(Exam0213 outer) {
    //      this.outer = outer;
    //    }

    void m1() {
    }
  }
}
