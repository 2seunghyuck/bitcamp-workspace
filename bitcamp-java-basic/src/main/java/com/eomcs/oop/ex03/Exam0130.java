package com.eomcs.oop.ex03;

public class Exam0130 {
  // static 변수
  //
  static class A {
    // static field = class variable.
    static int v1;
    static boolean v2;
  }

  public static void main(String[] args) {

    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A();

    // 레퍼런스.변수명 = 100;
    // -레퍼런스 다음제 지정한 변수가 인스턴스 벼누가 아니라 클래스 변수라면
    //  컴파일러가 컴파일 하는 과정에 정확하게 클래스 변수를 가리키도록 기계어로 바꾼다.
    // - 즉 개발자가 레퍼런스를 통해 클래스 변수를 지정하더라도, 자동으로 클래스 변수를 사용하는 코드로 바꾼다.
    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;
    obj1.v2 = true;
    obj2.v2 = true;
    obj3.v2 = true;
    System.out.println(obj1.v1);
    System.out.println(obj2.v1);
    System.out.println(obj3.v1);

  }
}
