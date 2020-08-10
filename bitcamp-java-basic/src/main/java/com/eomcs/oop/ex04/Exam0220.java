package com.eomcs.oop.ex04;

public class Exam0220 {
  public static void main(String[] args) {

    // int -> Integer, byte -> Byte, short -> Short, long -> Long
    // float -> Float, double ->Double, char -> Character
    Integer i1 = new Integer(100); // 객체 지향적이지 않으므로 사용하지 않기를 권고함
    Integer i2 = new Integer(100);
    System.out.println(i1.toString());
    System.out.println(i2.toString());
    System.out.println(i1 == i2); // 값이 같더라도 주소가 두개생기지만

    Integer i3 = Integer.valueOf(100); // new Integer 을 대신할 valueOf를 사용한다.
    Integer i4 = Integer.valueOf(100);
    System.out.println(i3.toString());
    System.out.println(i4.toString());
    System.out.println(i3 == i4); // 공통 주소를 사용하므로 값이 같다면 true 값이 출력된다.
  }
}
