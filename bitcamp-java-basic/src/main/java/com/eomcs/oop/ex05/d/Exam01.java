// 상속 - 상속 문법 이용
package com.eomcs.oop.ex05.d;

public class Exam01 {
  public static void main(String[] args) {
    Sedan c = new Sedan("비트자동차", "티코", 5, true, true);

    System.out.println(c.model);
    System.out.println(c.maker);
    System.out.println(c.capacity);
    System.out.println(c.sunroof);
    System.out.println(c.auto);
  }
}


