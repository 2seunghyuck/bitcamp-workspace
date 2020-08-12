// 오버라이딩(overriding) - 필드 오버라이딩
package com.eomcs.oop.ex06.c;

public class Exam0140 {
  public static void main(String[] args) {
    A4 obj1 = new A4();
    obj1.name = "홍길동";
    obj1.age = "20";
    //obj1.age = 20; <=안됨 . 하고싶으면
    ((A3)obj1).age = 20; //호출해줘야함
    //obj1.super.age = 20; <- 안됨......

    obj1.print();
    obj1.print3();
    System.out.println("-----------------------");
    obj1.test();
  }
}








