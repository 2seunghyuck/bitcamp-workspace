package com.eomcs.basic.ex06;

public class Exam0140 {
  public static void main(String[] args) {
    int a = 17;
    if (a <= 19)
      System.out.println("미성년!");
    else
      System.out.println("성년!");
 // 여러 문장을 실행할 때 블록으로 묶어야 한다.
    if (a >= 20) {
      System.out.println("--------------");
      System.out.println("성입니다.");
    }
    else {
      System.out.println("--------------");
      System.out.println("미성년입니다.");
    }

    // if, else 둘 중 하나만 블록으로 묶을 수 있다.
    if (a >= 19) { // OK!
      System.out.println("성년입니다.");
      System.out.println("--------------------------");
    }
    else
      System.out.println("미성년입니다.");

    // if, else 둘 중 하나만 블록으로 묶을 수 있다.
    if (a >= 19)
      System.out.println("성년입니다.");
    else {
      System.out.println("미성년입니다.");
      System.out.println("--------------------------");
    }

    // if와 else사이에 다른문장은 올수 없다.
    /*if (a <= 19)
      System.out.println("성년입니다.");
    System.out.println("-----------------");
    else ("미성년 입니다.")// 중간에 문장이 끼어들어서 else 문장이 단독실행되는 결과가됨, 컴파일에러.
    */
  }
}
