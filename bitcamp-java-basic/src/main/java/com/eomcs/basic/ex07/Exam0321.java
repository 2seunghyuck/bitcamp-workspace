package com.eomcs.basic.ex07;

public class Exam0321 {
  static class Myobject {
    int a;
    int b;
  }

  public static void main(String[] args) {
    Myobject ref;
    ref = getMyobject();
    System.out.printf("메서드사용이 종료 되어도 Heap에 저장된 레퍼런스는 사라지지 않는다.\n %d, %d\n", ref.a, ref.b);
  }

  static Myobject getMyobject() {
    Myobject ref = new Myobject();
    ref.a = 100;
    ref.b = 200;
    return ref;
  }
}
// 정수값이 아닌 새로운 class 지정으로 레퍼런스를 넘겨준다면 다른 메서드에서도 사용가능하다.
