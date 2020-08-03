package com.eomcs.basic.ex07;

// 메서드 parameter, argument를 호출할땐 항상 같은 단위의 변수를 대응시켜야한다.
public class Exam0230 {
  public static void main(String[] args) {
  System.out.println(m3("홍길동", 88));
  }
// 메인메서드에서 입력받은 아규먼트를 파라미터에 적용하여 출력
  static String m3(String name, int age) {

    return String.format("%d살 %s님을 환영합니다!", age, name);
  }
}
