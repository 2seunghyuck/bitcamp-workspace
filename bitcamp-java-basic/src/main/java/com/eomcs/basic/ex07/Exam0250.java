package com.eomcs.basic.ex07;

// 메서드 parameter, argument를 호출할땐 항상 같은 단위의 변수를 대응시켜야한다.
public class Exam0250 {
  public static void main(String[] args) {
// 가변 파라미터는 여러개를 사용할 수 없다.
// 항상 맨뒤의 변수에만 지정할 수 있다.
    m5("홍길동", 100, 90, 80, 70);
  }
  static void m5(String name, int...result) {
    for (int i = 0; i < result.length; i++) {
      System.out.printf("%s = %d\n", name, result[i]);
    }
  }
  // static void m6(String...names , int result) {}
  // 가변파라미터가 앞에 사용될 수 없음, 대응되는 변수의 마지막지점이 어딘지 판단할 수 없기 때문.
  // 당연히 두개이상 사용할 수 없음.
}
