package com.eomcs.basic.ex04;

public class Exam0451 {
  public static void main(String[] args) {
    java.util.Date d1 = new java.util.Date();
    java.util.Date d2 = d1;
    
    System.out.printf("%d, %d\n", d1.getDate(), d2.getDate());
    
    d1.setDate(25);
    
    System.out.printf("%d, %d\n", d1.getDate(), d2.getDate());
    //%d 정수로 값을 출력
    //%n 출력 후 줄바꿈 println은 자동으로 줄을바꾸지만 printf는 자동으로 못바꿔서 명령어 입력
    
  }
}
