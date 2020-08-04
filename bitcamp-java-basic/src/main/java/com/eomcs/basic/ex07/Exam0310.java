package com.eomcs.basic.ex07;

public class Exam0310 {
  public static void main(String[] args) {
    int a = 100;
    int b = 200;
    swap(a, b);
    System.out.printf("main() => a=%d b=%d\n", a, b);
  }

  static void swap(int a, int b) {
    System.out.printf("swap() => a=%d b=%d\n", a, b);
    int tmp = a;
    a = b;
    b = tmp;
    System.out.printf("swap() => a=%d b=%d\n", a, b);
  }
}
// 정수값(value) 는 메서드 변환에 따라서 바뀌지 않고, 메서드 안에서 정의된 값으로 지정된다.
