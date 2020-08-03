package com.eomcs.basic.ex07;

// 메서드 parameter, argument를 호출할땐 항상 같은 단위의 변수를 대응시켜야한다.
public class Exam0210 {
  public static void main(String[] args) {
    m1("홍길동", 88);
    m1("임꺽정", 55);// 메서드는 실행이 끝난후 리턴하기 때문에 언제든 재사용 가능하다.
    System.out.println("---------------------------");

  }

  static void m1(String name, int age) {
    System.out.printf("%s 의 나이는 %d 입니다.\n", name, age);
    // 기본적인 메서드에서 문자열과 나이를 출력하는 방법
  }

}
