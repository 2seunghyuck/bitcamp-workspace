package com.eomcs.basic.ex04;

public class Exam0580 {
  public static void main(String[] args) {

    int[] x1 = new int[3];
    int[] x2 = new int[4];
    int[] x3;
    
    x3 = x1;   // 레퍼런스 배열에 다른 인스턴스를 담을수 있음
    x2 = x1;
  
    // 최초의 x2인스턴스는 x1이되어 사용 불가상태가 됨, 이상태를 garbage라 부름.
    
  }
}


