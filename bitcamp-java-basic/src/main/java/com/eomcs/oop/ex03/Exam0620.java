// 스태틱 초기화 블록(static initializer) - 클래스 필드 사용
package com.eomcs.oop.ex03;

public class Exam0620 {

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


    A obj1; // 레퍼런스만 만들경우 staticfield 로딩안함
    A.m(); // static 필드 사용할때 도 초기화

    System.out.println("종료!");
  }
}


