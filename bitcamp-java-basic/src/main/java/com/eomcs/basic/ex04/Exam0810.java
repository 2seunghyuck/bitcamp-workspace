// 로컬 변수 선언
package com.eomcs.basic.ex04;

public class Exam0810 // <- 클래스 선언
{ // <- 클래스 블록 = 클래스 정의
  static int x;

  public static void main(String[] args) // <- 메서드 선언
  { // <- 메서드 블록 = 메서드 정의
    int a;
    int x; // 로컬 변수가 아니라면 같은 이름으로 변수를 선언할 수 있다.

    // int a; // 같은 메서드 블럭에 같은 이름의 로컬변수가 있으므로 중복선언 할 수 없다.
    { // 로컬 블럭
      // int a; // 바깥블럭에 선언된 변수와 같은 이름을 가질 수 없다.
      int b; // ok!
      {
        // int b; //no 블럭 바깥에 int b 가선언되었으므로.
        int c;
        // 블럭 안에 선언된 변수는 블럭을 나가는 순간 삭제된다.
        int d;
      }
      // c = 100; 컴파일 오류 // 위에있는 c선언은 블럭안에 있으므로 삭제되어 변수가 사라짐.
      int c; // 이변수는 위에서 선언한 하위블럭의c 변수와 다르다.
      {
        int d; // 이전블록에 있던 d 변수는 이미 삭제되었기때문에 변수는 다시 사용할 수 있다.
      }
      b = 100;
      c = 100;
      // d = 100; // 하위블럭에 변수가 이미 삭제 되어서 선언되있는 d 가 없다.
    }
    int i;
    for (i = 0; i < 10; i++) {
      System.out.println(i);
    }
    System.out.println(i);
    
    
    for (int k = 0; k < 10; k++) {
      System.out.println(k);
    }
    // System.out.println(k); <- for문이 끝나면서 k가 삭제되었으므로 k를 출력할 수 없다.
    
    int age = 20;
    int m; // 아래 System.out.println(m);을출력하기 위해서는 상수 선언을 해야한다.
    
    if (age > 19) {
       m = 200;
       int n = 300;
    }
    //System.out.println(m); // m이 조건문안에서 확정되지 않아서 변수 선언이 확정되지 않을수 있어서 컴파일 오류
    //System.out.println(n); // n 이 if 블럭 안에서 삭제되어 출력할 수 없다.
  }
}
