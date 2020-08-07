// 스태틱 초기화 블록(static initializer) - 클래스 필드 사용
package com.eomcs.oop.ex03;

public class Exam0650 {

  public static class A {
    static int a = 100;

    static {
      a = 200;
      System.out.println("static {} 실행");
      // 순서 --> a => 100 으로 초기화
      //            => static {} 실행되면서 200으로 초기화;
    }
    // static 초기화 블럭은 선언 순서대로 진행된다.
    static {
      b = 400;
    }
    static int b = 300;
    // 변수 초기화 문장을 컴파일할 때,
    // - 일단 모든 스태틱 필드를 만든다.
    // - 스태틱 변수 초기화 문장을 스태틱 블럭으로 변경한 다음에
    //   모든 스태틱 블럭을 순서대로 한 스태틱 안에서 실행한다.
    // - 스태틱 변수 초기화 문장과 스태틱 블록을 '선언한 순서'대로 하나의 스태틱 블록에 합친다.
    // - 위의 문장은 다음문장으로 바뀐다.
    // static int a;
    // static {
    // a = 100;
    // a = 200;
    // System.out.println("static {} 실행");
    // b = 300;
    // b = 400;
    //}
  }

  public static void main(String[] args) throws Exception {

    System.out.println(A.a);
    System.out.println(A.b);
  }
}


