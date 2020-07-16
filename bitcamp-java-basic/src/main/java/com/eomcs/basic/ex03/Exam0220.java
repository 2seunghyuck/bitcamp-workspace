package com.eomcs.basic.ex03;

//# 정수 리터럴 - 다양한 기수법으로 정수를 표현하기

//- 정수를 읽기쉽게 (_) 기호를 삽입해 구분가능

public class Exam0220 {
  public static void main(String[] args) {
    //10진수 리터럴 
    System.out.println(85412385);
    System.out.println(8_541_238_5);
    System.out.println(85_41_23_85);
    System.out.println(8541_2385);
    
    //8진수 리터럴 : (0) 으로 시작함 
    System.out.println(0116);
    System.out.println(0_116);
    System.out.println(01_1_6);
    
    //2진수 리터럴 : (0b) 로 시작
    System.out.println(0b1001110);
    System.out.println(0b1_001_110);
    System.out.println(0b1_00_11_10);
    
    //- 숫자 앞에 0이 있어도 된다.
    System.out.println(0b01001110);
    System.out.println(0B01001110);
    
    //16진수 리터럴 : (0x) 로 시작
    System.out.println(0x4_e_1_2);
    System.out.println(0x4e_12);
    
    //- 숫자 앞에 0이 있어도 된다.
    System.out.println(0x04e);
    System.out.println(0X04e);
  }
}

// 숫자 맨 앞 이나 맨 뒤 에 삽입할 수 없다.
// System.out.println(0b_1001110);  X
// System.out.println(0b1001110_);  X
// System.out.println(0x_4e12);     X
// System.out.println(0x4e12_);     X

