package com.eomcs.basic.ex03;

//# 정수 리터럴 - 다양한 기수법으로 정수를 표현하기
//

public class Exam0210 {
  public static void main(String[] args) {
    //10진수 리터럴 
    System.out.println(78);
    
    //8진수 리터럴
    System.out.println(0116);
    
    //2진수 리터럴
    System.out.println(0b1001110);
    System.out.println(0B1001110);
    
    //- 숫자 앞에 0이 있어도 된다.
    System.out.println(0b01001110);
    System.out.println(0B01001110);
    
    //16진수 리터럴
    System.out.println(0x4e);
    System.out.println(0X4e);
    
    //- 숫자 앞에 0이 있어도 된다.
    System.out.println(0x04e);
    System.out.println(0X04e);
  }
}