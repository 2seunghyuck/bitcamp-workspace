package com.eomcs.oop.ex03;

public class Exam0670 {
  public static class A {
    static int a = 5;
    static {
      System.out.println("A.static {} 실행");
      a += B.b;
    }
  }
  public static class B {
    static int b = 23;
    static {
      System.out.println("B.ststic{} 실행");
      b += A.a;
    }

  }

  public static void main(String[] args) {

    System.out.println(A.a); // a + (b+a) -> 33 B.b 를 계산할때 class B가 로딩되어있지 않은 상태여서, B를 로딩해 작업수행 후 class A 실행 재
    System.out.println(B.b); // b+a -> 28       이 출력됨;


  }
}


