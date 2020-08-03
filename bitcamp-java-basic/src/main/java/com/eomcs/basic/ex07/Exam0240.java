package com.eomcs.basic.ex07;

// 메서드 parameter, argument를 호출할땐 항상 같은 단위의 변수를 대응시켜야한다.
public class Exam0240 {
  public static void main(String[] args) {
// 메서드를 배열처럼 사용하는법 => 가변 파라미터
// 물론 배열을 직접입력해도 된다.
    m4("홍길동","임꺽정","안중근");
    m4(new String[] {"홍길동","임꺽정","안중근"});
  }
  static void m4(String...names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s 님 안녕하세요\n", names[i]);
    }
  }
}
