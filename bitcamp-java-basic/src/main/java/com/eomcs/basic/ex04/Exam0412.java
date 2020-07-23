// 주제 : 변수의 종류

package com.eomcs.basic.ex04;

public class Exam0412 {
  public static void main(String[] args) {

    long l = 100;
    int i = 100;
    short s = 100;
    byte b = 100;
    char c = 100;

    //변수의 값을 다른 변수에 저장할 때,
    //- 값의 크기에 상관없이 같거나 큰 크기의 메모리이어야 한다.

    long l2;
    int i2;
    short s2;
    byte b2;
    char c2;

    //i2 = l; 담을 수 없다.
    //s2 = i;
    //b2 = s;
    
    //c2 =s; 메모리 저장소의 크기는 같지만 값을 저장하는 범위가 달라 포함할 수 없다.
  }
}