// 로컬 변수 선언
package com.eomcs.basic.ex04;

public class Exam0822 {
  public static void main(String[] args) {
    int a = 100;
    
    switch (a) {
      case 1:
        int b;
        {
          int c;
        }
        break;
      case 2:
        //int b; 스위치 문법은 한블럭으로 취급 되므로 case1 에서사용한 int b 를 쓸수 없다.
        int c; // 블럭이 끝나며 삭제되었으므로 int c 는 다시 사용할 수 있다.
        break;
      case 3:
        for (int i =0; i <10; i++) {
         //int b; b가 선언되었으므로 ,컴파일 오류
        }
        break;
        default:
        
    }
  }
}
