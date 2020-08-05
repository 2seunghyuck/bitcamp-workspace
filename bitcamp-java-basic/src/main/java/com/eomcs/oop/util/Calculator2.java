package com.eomcs.oop.util;

public class Calculator2 {


  public int result = 0;

  // non-static 메서드는
  // 인스턴스 주소를 받는 this 라는 빌트인 변수가 있다.

  public static void plus(Calculator2 that, int value) {
    that.result += value;
  }
  public static void minus(Calculator2 that, int value) {
    that.result -= value;
  }
  public static void multiple(Calculator2 that, int value) {
    that.result *= value;
  }
  public static void divide(Calculator2 that, int value) {
    that.result /= value;
  }
 }
