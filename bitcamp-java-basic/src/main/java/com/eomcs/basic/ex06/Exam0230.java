package com.eomcs.basic.ex06;

public class Exam0230 {
  public static void main(String[] args) {
    byte b = 1;
    switch (b) {
      case 1:
      case 2:
        break;
      default:

    }
    short s = 2;
    switch (s) {
      case 1:
      case 2:
        break;
      default:
    }
    int i = 3;
    switch (i) {
      case 1:
      case 2:
        break;
      default:
    }
    /* long l = 1;  정수이지만 8byte인 long 타입은 사용불가
    switch (b) {
      case 1:
      case 2:
        break;
      default:
    }
    */
    char ch = 1; // <=유니코드 값으로 변환된 수가 사용됨.
    switch (ch) {
      case 'c':
        System.out.println("하");
      case 2:
        break;
      default:
        System.out.println("이");
    }
    String str = "Hello";
    switch (str) {
      // case 1: =>str 은변수로 사용되어 case 에 포함시킬수 없다.
      // 사용하려면 상수로 변환 해줘야한다.
      case "Hello":
      // case 3: 변수를 문자열로 선언했으므로 ""를사용한 문자열을 포함시켜야한다.
      case "World":
        break;
      default:
    }
  }
}
