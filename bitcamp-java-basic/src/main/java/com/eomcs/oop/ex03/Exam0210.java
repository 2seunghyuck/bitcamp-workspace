package com.eomcs.oop.ex03;

public class Exam0210 {

  static class A {

    static int v1; // static field = class field = 스태틱 변수
    int v2; // instance field = non-static field = 인스턴스 변수

    // static method = class method
    static void m1() {
      System.out.println("m1()");
      A.v1 = 100;
      v1 =200; // A.같은 스태틱 멤버이기때문에 생략 가능

      //static method 는 this라는 내장변수가 없다.
      // this를 사용하여 접근하는 인스턴스 멤버(필드,메서드)를 사용할 수 없다.
      // -static method 에서 사용불가-
      // this.v2 = 200;
      // this.m2();
    }

    // non-static method = instance method
    void m2() {
      System.out.println("m2()");

      // 인스턴스 필드에 접근하려면 , 메서드 내장변수인 this 를 사용하라.
      // this는 메서드가 호출될 때 외부로부터 받은 인스턴스 주소를 갖고있다.
      //
      this.v2 = 300;
      v2 = 300; // <<-- 생략가능(this)

      // 스태틱필드는 인스턴스 레퍼런스를 통해 접근할 수 있다.
      // 그러나 하지마라.헷갈린다
      this.v1 = 100; // ==> A.v1 = 100;으로 바꾼다.
      v1 = 200; // => this 생략 가능 결국 A.v1 = 200 이됨
      A.v1 = 200; // <=== 걍 이렇게 써라

      m1();
      // 인스턴스 메서드는 인스턴스 멤버(field, method) 뿐만아니라
      // 클래스 멤버(field,method)도 사용할 수 있다.
    }
    int abs(int value) {
      if (value < 0) {
        return -value;
      } else {
        return value;
      }
    }
  }

  public static void main(String[] args) {

    A.m1();
    //A.m2();

    //non-static method <= 인스턴스 있어야만 호출가능
    A obj1 = new A();
    obj1.m2();
    System.out.println(obj1.abs(100));
    System.out.println(obj1.abs(-100));
    System.out.println(Math.abs(100));
    //굳이 이럴필요 없으니 , static 붙여서 그냥 클래스 이름으로 써라
  }
}
