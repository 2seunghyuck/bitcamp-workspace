package com.eomcs.oop.ex03;

public class Exam0710 {
  public static class A {
    int a;
    int b;
    int c;
    {
      a = 100;
      System.out.println("인스턴스블럭 실행");
    }
  }

  public static void main(String[] args) {
    A obj1 = new A();

    System.out.printf("%d, %d, %d \n", obj1.a, obj1.b, obj1.c);
  }
}
