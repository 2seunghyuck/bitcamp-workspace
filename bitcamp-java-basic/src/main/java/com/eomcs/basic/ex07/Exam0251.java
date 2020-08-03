package com.eomcs.basic.ex07;

// 메서드 parameter, argument를 호출할땐 항상 같은 단위의 변수를 대응시켜야한다.
public class Exam0251 {
  public static void main(String[] args) {
    // 가변 파라미터는 여러개를 사용할 수 없다.
    // 항상 맨뒤의 변수에만 지정할 수 있다.
    // 배열을 이용하면 여러가지를 파라미터에 담을 수 있다.

    m5(new String[] {"홍길동", "유관순", "임꺽정"}, new int[] {80, 90, 100});
  }

  static void m5(String[] names, int[] result) {
    if (names.length != result.length) {
      System.out.println("입력값이 옳지 않습니다!");
    return;
    }
    for (int i = 0; i < result.length; i++) {
      System.out.printf("%s = %d\n", names[i], result[i]);
    }

  }

}
