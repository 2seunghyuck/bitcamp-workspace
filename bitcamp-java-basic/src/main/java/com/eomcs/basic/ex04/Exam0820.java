// 로컬 변수 선언
package com.eomcs.basic.ex04;

public class Exam0820 {
  public static void main(String[] args) {
    int a = 100;
    {
      // int a = 200; 같은 메서드의 상위블럭에 이미 변수선언을해서 변수를 선언할 수 없다.
      a = 160; // 변수를 사용하는것은 가
      int b = 200;
      
    }
    //System.out.println(b); 블럭을 벗어나며 int b 가 초기화 되서 없는값임.
    
  }
}
