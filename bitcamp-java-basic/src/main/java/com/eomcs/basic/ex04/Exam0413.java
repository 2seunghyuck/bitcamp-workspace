// 주제 : 변수의 종류

package com.eomcs.basic.ex04;

public class Exam0413 {
  public static void main(String[] args) {
    float f;
    
    f = 9.876545f;
    System.out.println(f);

    f = 987654.5f;
    System.out.println(f);

    
    f = 0.000009876545f; // 소수점을 떼면 숫자가 13개 이지만, 앞의 0을 제외하면 실제 7개이다.
    System.out.println(f); // OK
    
      
    //- 유효자릿수가 7자리를 넘어가면 정상적으로 값을 저장되지 않을 수 있다.
    f = 9.8765456f; 
    System.out.println(f);
    
    f = 9876545.6f;
    System.out.println(f);
  }
}