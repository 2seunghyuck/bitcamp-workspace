package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제1 : 
// - 다음 int 변수에 들어있는 값을
//   다음과 같이 첫바이트부터 끝바이트까지 나오게 순서대로 출력하라.
// 실행 예) 
// 입력? 2864 4343 97
// aa
// bb
// cc
// dd
public class Test03 {

  public static void main(String[] args) {
    int value = 0xaabbccdd;
    int a, b, c, d;
    a = (value >> 24 & 0xff);
    b = (value >> 16 & 0xff);
    c = (value >> 8 & 0xff);
    d = (value & 0xff);
    System.out.println(Integer.toHexString(a));
    System.out.println(Integer.toHexString(b));
    System.out.println(Integer.toHexString(c));
    System.out.println(Integer.toHexString(d));
    
    /*
    Scanner input = new Scanner(System.in);
    System.out.println("숫자를 입력하세요");
    value = input.nextInt();
    int a, b, c, d;
    a = (value >>> 24);
    b = (value >> 16 & 0xff);
    c = (value >> 8 & 0xff);
    d = (value & 0xff);
    System.out.println(Integer.toHexString(a));
    System.out.println(Integer.toHexString(b));
    System.out.println(Integer.toHexString(c));
    System.out.println(Integer.toHexString(d));
    input.close();
    */
  }
}








