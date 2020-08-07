package com.eomcs.oop.ex03;

public class Exam0731 {
  public static class A {
    int a;
    int b;
    int c;
    {
      a = 100;
      System.out.println("인스턴스블럭 실행");
    }
// 위치와는 상관없이 선언한 순서로 실행
    A() {
      a = 100;
      b = 200;
      c = 300;
      System.out.println("A() 생성자 실행");
    }
    A(int b, int c) {

      this.b = b;
      this.c = c;
      System.out.println("A(int, int) 값을 int b, int c 에 저장");
    }
    A(int b) {
      this.b = b;
      System.out.println("A(int) 값을 int b 에 저장");
    }

  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("%d, %d, %d \n", obj1.a, obj1.b, obj1.c);
    A obj2 = new A(30);
    System.out.printf("%d, %d, %d \n", obj2.a, obj2.b, obj2.c);
    A obj3 = new A(80, 90);
    System.out.printf("%d, %d, %d \n", obj3.a, obj3.b, obj3.c);
  }
}
