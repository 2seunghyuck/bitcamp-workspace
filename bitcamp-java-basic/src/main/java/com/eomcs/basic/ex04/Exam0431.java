package com.eomcs.basic.ex04;

class Exam0431 {  
  public static void main(String[] args) {
    char c1, c2, c3;
    c2 = 65;            // 10진수로 표현한 것.
    c1 = 0x41;          // 16진수로 표현한 것.
    c3 = 0b0100_0001;   // 2진수로 표현한 것.

  // println()을 통해 문자를 출력할 수 있다.
  //- 변수의 종류가 char 이면 출력할 때 코드 값 대신 문자를 출력한다.
  //- 해당 코드의 문자를 폰트 파일에서 찾아 출력한다.
  //
  System.out.println(c1);
  System.out.println(c2);
  System.out.println(c3);

  int sum = 0;
  int k = 1;
  
  while (k <= 10) {
    sum = sum + k;
    k = k + 1;
  }
  System.out.println(sum);  
  
  }
}
