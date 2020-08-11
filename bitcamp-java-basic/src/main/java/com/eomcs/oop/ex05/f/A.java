package com.eomcs.oop.ex05.f;

public class A /*extends Object*/ {
  int v1;

  A() {
    // 수퍼 클래스의 어떤 생성자를 호출할지 지정하지 않으면 컴파일러는
    // 다음과 같이 수퍼 클래스의 기본 생성자를 호출하라는 명령을 붙인다.
    //super(); 가 생략된것.


    System.out.println("A() 생성자!");
  }
}


