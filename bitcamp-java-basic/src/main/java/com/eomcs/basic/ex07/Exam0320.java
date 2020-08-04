package com.eomcs.basic.ex07;

public class Exam0320 {
  static class Myobject {
    int a;
    int b;
  }
  public static void main(String[] args) {
    Myobject ref = new Myobject();

    ref.a = 100;
    ref.b = 200;
    swap(ref);
    System.out.printf("main() => a=%d b=%d\n", ref.a, ref.b);
  }

  static void swap(Myobject re) {
    Myobject ref = new Myobject();
    ref.a = 0;
    ref.b = 100;

    System.out.printf("swap() => a=%d b=%d\n", ref.a, ref.b);
    int tmp = re.a;
    re.a = re.b;
    re.b = tmp;
    System.out.printf("swap() => a=%d b=%d\n", re.a, re.b);
  }
}
// 정수값이 아닌 새로운 class 지정으로 레퍼런스를 넘겨준다면 다른 메서드에서도 사용가능하다.
