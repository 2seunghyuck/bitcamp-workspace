package com.eomcs.basic.ex04;

public class Exam0430 {
  public static void main(String[] args) {
    char c;
    
    c = 0;
    c = 65535;
    // c = -1;
    // c = 65536;
    
    c = 65;
    c = 0x42;
    c= 0b01000011;
    System.out.println(c);
    
    short s = 65;
    System.out.println(s);
   
    c = '헐'; // '' 연산자는 문자의 유니코드 값을 리턴한다.
    System.out.println(c);
    
    int i; // 헐 의 유니코드 값을 10진수로 표현
    i = c;
    System.out.println(i);
    System.out.println((char)i);
    
    // 문자 코드는 정수값이다. 대응하는 문자로 변환한 것.
    for (int x = 65; x < 91; x++) {
    System.out.println((char)x);
    }
    
    boolean b1, b2;
    b1 = true;
    b2 = false;
    System.out.println(b1);
    System.out.println(b2);
    //논리 값은 정수로 다룰수 없다.
    // i = b1;
    // i = b2;
    // b1 = 1;
    
  }
}