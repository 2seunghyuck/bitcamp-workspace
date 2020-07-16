// Exam0100.java
// 주제: 리터럴(literal)

package com.eomcs.basic.ex03;

class Exam0100 {
    public static void main(String[] args) {
        // 출력 명령문
        // - System.out.println(값);

        // [숫자]
        //  - 정수
        System.out.println(78);
        System.out.println(+78);
        System.out.println(-78);
        System.out.println(0116);         // 8진수
        System.out.println(0x4e);         // 16진수
        System.out.println(0b01001110);   // 2진수
        //  - 부동 소수점
        System.out.println(3.14);
        System.out.println(31.4e-1);    // e-1 = 1/10
        System.out.println(314e-2);     // e-2 = 1/10^2
        System.out.println(0.0314e2);   // ex = 10^x
        
        // [논리]
        //  - true
        System.out.println(true);
        //  - false
        System.out.println(false);
        
        // [문자]
        //  - 문자
        System.out.println('A');        // 하나의 문자를 표현 ''
        System.out.println('가');
        //  - 문자열                     // ('A')=O, ('ABC')=X
        System.out.println("A");      // 여러개의 문자를 표현 ""
        System.out.println("가");
        System.out.println("");
        System.out.println("ABC");
        System.out.println("가나다");
        System.out.println("가 나 다");
        
    }
}
