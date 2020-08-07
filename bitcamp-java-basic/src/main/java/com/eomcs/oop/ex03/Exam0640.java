// 스태틱 초기화 블록(static initializer) - 클래스 필드 사용
package com.eomcs.oop.ex03;

public class Exam0640 {

  public static class A {
    static int a;

    static void m() {}

    static {
      System.out.println("Static{} 11111");
    }

    static {
      System.out.println("Static{} 22222");
    }
  }

  public static void main(String[] args) throws Exception {

    // 새로운 인스턴스 만들 떄도초기화;
    new A();
    System.out.println("종료!");
  }
}


