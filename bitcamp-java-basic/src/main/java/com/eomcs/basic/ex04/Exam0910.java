// 로컬 변수 선언
package com.eomcs.basic.ex04;

public class Exam0910 {
  public static void main(String[] args) {
    byte b = 100;
    short s = 100;
    int i = 100;
    long l = 100;
    float f = 100f;
    double d = 100.0;
    boolean bool = true;
    char c = 'A';
    
    // 변수의 값을 다른 변수에 저장하는 기본 원칙.
    // - 반드시 같은 데이터 타입이어야 한다.
    // - 같은 데이터 타입이라도 저장하는 값이 변수보다 작거나 같아야한다.
    
    // 정수 ==> 부동소수점 변수 
    // - 정수 변수의 값을 부동소수점 변수에 저장하는것을 허용한다.
    // - 이를 위해 값을 저장하기전에 정수 변수에 들어있는 값을 부동소수점으로 자동 변환시킨다.
    // 정확한 값 저장하기 위해선 작은 데이터를 큰데이터에 저장하는것을 원칙으로한다. 
    float f2;
    f2 = b;
    System.out.println(f2);
    f2 = s;
    System.out.println(f2);
    f2 = i;
    System.out.println(f2);
    f2 = l;
    System.out.println(f2);
    f2 = c;
    System.out.println(f2);
    
    System.out.println("-------------------2-------------------");
    s = 32767;
    f2 = s;
    System.out.println(f2);
    i = 17_3456_1234;
    f2 = i;
    System.out.println(f2);// 저장하는것은 허용했으나 정확한 값이 출력되는것은 아니다.
    l = 222_1234_3214L;
    f2 = l;
    System.out.println(f2); // 유효자릿수를 벗어난 수는 잘린다.
    
    f = 112.123f;
    // 부동소수점을 정수 변수에 담는 경우 
    // - 부동소수점은 정수변수에 저장할 수 없다.
    // b = f; 컴파일 오류정수에 부동소수점을 저장할 수 없다.
    // s = f;
    // i = f;
    // l = f;
    System.out.println("--------------------3--------------------");
    // 강제로 부동 소수점을 정수변수에 저장하는 방법
    // - 형변환 명령을 사용한다.
    b = (byte)f; // 소수점 이하는 잘린다.
    System.out.println(b);
    s = (short)f;
    System.out.println(s);
    i = (int)f;
    System.out.println(i);
    l = (long)f;
    System.out.println(l);
    c = (char)f;
    System.out.println(c);
    // 명령어를 통해 강제로 형변환 시키는 것을  "명시적 형변환(explicit type conversion/casting)"이라 한다.

    // 단 논리값은 정수나 부동소수점 으로 변환할 수 없다.
    // b = (byte)bool;
    // s = (short)bool;
    // i = (int)bool;
    // l = (long)bool;
    // f = (float)bool;
    // d = (double)bool;
    // c = (char)bool;
    // bool = (boolean)b;
    // bool = (boolean)s;
    // bool = (boolean)i;
    // bool = (boolean)l;
    // bool = (boolean)f;
    // bool = (boolean)d;
    // bool = (boolean)c;
    
    // 같은 정수끼리의 변환.
    // 작은 메모리는 큰메모리에 포함 ok, 큰 메모리값을 작은메모리에 담으려면 명시적 형변환 해줘야한다.
    // 값이 메모리에 저장하지 못할만큼 크다면 잘린다.
    
    System.out.println("-----------------4------------------");
    b = (byte)s;
    System.out.println(b);
    b = (byte)i;
    System.out.println(b);
    b = (byte)l;
    System.out.println(b);
    l = 130;
    b = (byte)l; // 바이트에 담을수 있는 값을 초과해서 음수값으로 나오게됨.
    System.out.println(b);
  }
}
