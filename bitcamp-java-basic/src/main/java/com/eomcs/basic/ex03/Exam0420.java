// 주제: 문자 리터럴 II

package com.eomcs.basic.ex03;

class Exam0420 {
  public static void main(String[] args) {
    // 자바는 문자를 메모리에 저장할때 Unicode 규칙에 따라 2byte 코드로 저장한다.
    System.out.println(0x41);
    System.out.println(65);
    
    // println() 에게 문자 코드임을 알려줘라 
    System.out.println((char)0x41);
    System.out.println((char)65);
    System.out.println((char)0xd5d0);
    
    // single quatation 연산자  '' 의 역할 - 문자의 코드값을 return해주는 일을한다.

  }
}
