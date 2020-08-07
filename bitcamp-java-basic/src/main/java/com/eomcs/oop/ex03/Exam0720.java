package com.eomcs.oop.ex03;

public class Exam0720 {
  public static class A {
    int a;
    int b;
    int c;
    {
      a = 100;
      System.out.println("인스턴스블럭 실행");
    }

    // 초기화 해주는 별도의 블럭이없으면 자동으로 0으로 초기화.
    public A() {
      a = 200;
      System.out.println("A() 생성자 실행");

    }
  }

  public static void main(String[] args) {
    A obj1 = new A();

    System.out.printf("%d, %d, %d \n", obj1.a, obj1.b, obj1.c);
  }
}
