// non-static nested class = inner class
package com.eomcs.oop.ex11.a;

public class Exam0216 {
  public static void main(String[] args) {
    Exam0215 outer = new Exam0215();

    Exam0215.A obj;

    // 개발자가 작성한 코드
    obj = outer.new A();
    // 컴파일러가 위 코드를 컴파일하며 자동으로 바꾼 코드
    // obj = new A(outer);

    //개발자가 작성한 코드
    obj = outer.new A(100);
    // 컴파일러가 컴파일 하며 바꾼 코드
    // obj = new A(outer, 100);
  }
}
