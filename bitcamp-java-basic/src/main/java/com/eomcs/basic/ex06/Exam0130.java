package com.eomcs.basic.ex06;

public class Exam0130 {
  public static void main(String[] args) {
    // if 문의 내용은 반드시 boolean 타입 이어야한다.
    if (true) System.out.println("1111");
    if (false) System.out.println("2222");
    if (8 + 3 < 10) System.out.println("3333");
    // 그 boolean 타입이 아닌 데이터는 담을수 없다.
    //if (1) System.out.println("4444"); // 컴파일 오류!
    //if (3.14f) System.out.println("4444"); // 컴파일 오류!
    //if (0b0110 & 0b0011) System.out.println("4444"); // 컴파일 오류!
    int a = 100;
    // if (a = 100) System.out.println("5555"); boolean type이 아니기 떄문에 ,컴파일오류
    if (a == 100) System.out.println("5555");

    boolean b;
    if (b = true) System.out.println("6666");
    if (b = false) System.out.println("6666");

  }

}
