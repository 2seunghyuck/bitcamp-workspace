package com.eomcs.basic.ex05;

public class Exam0300 {
  public static void main(String[] args) {
    // AND = &&연산자 두논리의 값이 모두 true일때.true 출
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && false);
    System.out.println("----------");
    // OR = ||연산자 두논리중 하나라도 true 일때 true 로출력.
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || false);
    System.out.println("----------");
    // NOT = ! 연산자 , true -> false, false -> true 로변환하여 출력
    System.out.println(!true);
    System.out.println(!false);
    System.out.println("----------");
    // exclusive-OR(XOR)연산자 = ^ 두 비트의 값이 다를때 true를 출력
    System.out.println(true ^ true);
    System.out.println(false ^ false);
    System.out.println(true ^ false);
    System.out.println("----------");
    // & 와 &&의 차이
    boolean a = false;
    boolean b = false;
    boolean r = a && (b = true); 
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    // &&는 이미 참 거짓이 판명난 명령은 더이상 뒤의 명령을 실행하지 않는다.
    boolean a1 = false;
    boolean b1 = false;
    boolean r1 = a1 & (b1 = true); 
    System.out.printf("a=%b, b=%b, r=%b\n", a1, b1, r1);
    // b의 값이 변한것으로 알아볼 수 있다.
    // | 도 &와 마찬가지
    
    // 비트 연산자 ( &, |, ~, ^)
    int m = 0b0101_1111;
    int n = 0b1110_0110;
    // &연산 : 서로다른 정수의 2진수로의 변환에서 같은위치 에서 동시에 실행되고 있는 결과를 추출할 수 있다.
    System.out.println(m & n);
    //  0101 1111
    //& 1110 0110
    //-----------
    //  0100 0110 -> 10진수로 70; 이 출력됨.
    // |연산 : 서로다른 정수의 2진수로의 변환에서 둘중 어느 한곳이라도 실행되고 있는곳이 있다면 그자리를 실행.
    System.out.println(m | n);
    //  0101 1111
    //& 1110 0110
    //-----------
    //  1111 1111 -> 255; 이 출력됨.
    // ^연산 : 서로다른 정수의 2진수로의 변환에서 같은 비트의 상태가 다를때 1을출력 (실행)
    //  0101 1111
    //^ 1110 0110
    //-----------
    //  1011 1001 -> 185; 출력.
    System.out.println(m ^ n);
    // ~연산 : 이미 실행되고 있는 비트는, 끄고 실행되지 않은 비트를 실행.
    System.out.println(~m);
    //  0101 1111
    //~
    // ----------
    //  1111 1111 1111 1111 1111 1111 1010 0000 -> -96 (정수값은 4바이트이기 때문에;)
    System.out.println(0b1111_1111_1111_1111_1111_1111_1010_0000);
  }
}
