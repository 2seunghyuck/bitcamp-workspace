// 상수 - 변하지 않는 값.

package com.eomcs.basic.ex04;


public class Exam0610 {
  public static void main(String[] args) {

    // 변수
    int a;
    a = 100;
    a = 200;
    a = 300;

    // 변수의 값을한번 설정하면 바꾸지 못하게 막는 문법
    final int b;
    b = 100;
    // b = 200; 이미 b의 값이 100으로 지정되어있으므로 더이상 바꿀수 없다, 컴파일오류

    // 상수변수는 보통 선언과 동시에 값을 저장한다.
    final int c = 100;

    // 일반 변수가 아님을 표시하기 위해 보통 대문자로 이름을 짓는다.
    final int LENGTH = 100;
    
    // 상수의 이름을 대문자로 작성할 때 단어 사이에 _ 를 삽입한다.
    int firstUserName;
    final int FINAL_USER_NAME; 
  }
}


