// 주제 : 변수의 종류

package com.eomcs.basic.ex04;

public class Exam0400 {
  public static void main(String[] args) {
    
    // 정수
    byte b;
    short s;
    int i;
    long l;
    //부동소수점
    float f;
    double d;
    //문자
    char c;
    //논리
    boolean bool;
    //레퍼런스
    String str;
    
    //변수의 메모리 크기
    //정수 리터럴은 기본이 4바이트라 byte, short로는 음수를 출력할수없다;
    b = 127;
    b = -128;
    // b = 120 + 8; 바이트에담을 수 없으므로 컴파일 불가.
    byte b2 = 20;
    // 리터럴의 연산 결과는 리터럴로 취급한다.
    //b = 100 + b2; 리터럴과 변수 연산이므로 컴파일 불가.
    
    s = -32768;
    s = 32767;
    // s = -32769; 메모리 초과로 저장 불가.
    
    i = -21_0000_0000;
    i = 21_0000_0000;
    //i = -22_0000_0000; 메모리 초과.
    
    l = -922_0000_0000_0000_0000L;
    l = 922_0000_0000_0000_0000L;
    //l = -922_0000_0000_0000_0000; 기본이 int 이므로 뒤에 L을 붙여 8byte리터럴을 확인 시켜줌.
    
    b = 100;
    s = 100;
    i = 100;
    //b = 100L;
    //s = 100L;
    //i = 100L;
    
    
    byte b3;
    b3 = b;
    //b3 = s;
    //b3 = i;
    //b3 = l; 하위 개념이 더 작기 때문에 더 큰 data type 을 저장할 수 없다.
    
    long l2;
    l2 = b;
    l2 = s;
    l2 = i;
    l2 = l;
    
    s = -32768;
    s = 32767;
    char c2;
    // c2 = -32768; 음수를 담을 수 없다.
    c2 = 0;
    c2 = 65535;
    // c2 = s; , s = c2; 저장할수 있는 범위가 달라 서로를 저장할 수 없다.
    
    f = 999.9999f;
    f = 9.999999f;
    f = 999999.9f;
    f = 999.99993f; // 부동소수점f 7개의 유효숫자만 표현하므로 그 이하값은 유효하지 않다.
    System.out.println(f); // 999.99994로 나오긴 하지만 8번째 유효자릿수는 무시하라.
    
    float f1 = 1.234567f;
    float f2 = 12345.22f;
    System.out.println(f1);
    System.out.println(f2);
    float f3 = f1 + f2;
    System.out.println(f3);
    
    d = 29999999.999999989;
    System.out.println(d); // 유효자릿수가 16자리이므로 그 이상의 값을 정상적으로 출력하지 못함.
    
    f = 999.9999f;
    // f = 999999999.9999999; java의 부동소숫점기본이 double(byte) 이므로 뒤에 f 꼭 붙여야함.
    d = 234.5678;
    System.out.println(d);
    d = 234.5678f;
    System.out.println(d);
    f =234.5677947998047f;
    System.out.println(f);
    
    // 두 부송소수점을 연산한 결과가 7자리를 넘어갈 것 같으면 그냥 double 을 사용하라.
    double d1 = 1.234567;
    double d2 = 92345.22;
    double d3 = d1 + d2;
    
    System.out.println("==>");
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
    // 부동소숫점은 포함하는 메모리 초과의 숫자를 사용하더라도 컴파일에 오류는없지만
    // 정확하게 믿을수 있는 값을 출력하지는 못한다.
    // 부정확하니 섞어쓰지말아ㅏ.
    
    
    
    
    
    
  }
}