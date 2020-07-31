package com.eomcs.basic.ex06;

public class Exam0450 {
  public static void main(String[] args) {
    String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};
    // 배열의 처음부터 끝까지 값을 꺼내는 것이라면
    // 다음의 for 문법을 사용하라! 아주 편하다!
    // for (배열에서 꺼낸 값을 저장할 변수 선언 : 배열주소) 문장;
    for (String name : names)

      System.out.println(name);
  }
}

