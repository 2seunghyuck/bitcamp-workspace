package com.eomcs.basic.ex06;

public class Exam0231 {
  public static void main(String[] args) {
    int x = 1, y = 300;
    final int z = 200;

    switch (x) {
      case 1 * 300:
      case 2:
      case 1 * z: // z를 상수로 선언했기 때문에 사용가능함.
      // case 300; 이미 case 1 * 300에 할당된 값이므로 중복사용 불가.
        break;
    }
  }
}
