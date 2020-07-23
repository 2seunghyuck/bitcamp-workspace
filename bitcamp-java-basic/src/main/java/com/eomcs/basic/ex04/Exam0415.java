package com.eomcs.basic.ex04;

//# 부동소수점 변수 - 변수와 리터럴의 크기 II
//
public class Exam0415 {
  public static void main(String[] args) {
    
    float f;
    double d;

    // - 잘못된 리터럴 값을 변수에 저장해봐야 소용없다!
    
    f = 99999.8888877777f;
    System.out.println(f);
    
    d = 99999.8888877777f;
    System.out.println(d); // 변수 저장공간이 남지만 이미f 상태로 저장한 후라 d 로 표현하지 못한다.
    
    f = 99999.88f;
    System.out.println(f);
    
    d = 99999.8888877777;
    System.out.println(d);
  }
}

