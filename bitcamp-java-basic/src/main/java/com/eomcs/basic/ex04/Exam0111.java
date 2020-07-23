// 주제 : 변수선언
// - 데이터를 저장할 메모리를 확보하는 명령

package com.eomcs.basic.ex04;

public class Exam0111 {
  public static void main(String[] args) {

    int i; // <- 메모리(int)를 저장할 변수 (i) 설정

    int x, y, z; // 한번에 여러개의 변수를 지정할 수 있다.

    i = 10; 

    int ii = 100; // 변수와 할당값을 한번에도 저장가능.
    
    i = ii ; // i에 할당되어있던 값을 ii 의 할당값으로 덮어 쓰기 (순서대로실행됨)
             // i = 20; j =30; i = j; 일경우 i는 20 이면서 30이 아니라 마지막인 j의 값이 할당됨]
    /* a = 50;
     *          변수가 선언문보다 먼저 지정될 수 없다.
     * int a;
     */ 
    // 같은 {} 안에서 같은 변수를 지정할 수 없다. Ex) int a; char a; <- 불가 a 가 같은변수로 지정;
    
    char a;
    a = '↖';
    char b;
    b = 0x8598;
    byte c;
    c = 0b01111111;
    short d = 0b111111111111111;
    char e = 0b111111111111111;
    int f = 0b11111111111111111111111111111111;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
  }
}