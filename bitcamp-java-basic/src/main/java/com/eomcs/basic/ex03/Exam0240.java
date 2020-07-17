// 주제: 정수값을 메모리에 저장하는 방법

package com.eomcs.basic.ex03;

class Exam0240 {
   
    int a = 0xaaaaaaaa;
    int b = -0xaaaaaaaa;
   
    public static void main(String[] args) {
        
        System.out.println(5 - 3);
        System.out.println(5 + (-3));

        //  0000 0011 <= +3 2진수  
        //  1111 1101 <= -3 2진수(2의보수)
        //  1000 0011 <= -3 Sign-Magnitude
        //  0111 1100 <= -3 Excess-K : K = 2**(비트수 - 1) 값 + K

        //  0111 1011 <= +123 2진수  
        //  1000 0101 <= -123 2진수(2의보수)
        //  1111 1011 <= -123 Sign-Magnitude
        //  0000 0100 <= -123 Excess-K : K = 2**(비트수 - 1) 값 + K

        //  10101010 10101010 <= +aaaaaaaa 2진수  
        //  01010101 01010110 <= -aaaaaaaa 2진수(2의보수)
        //  55 55 55 56 <= -aaaaaaaa 16진수
    
    }

}
