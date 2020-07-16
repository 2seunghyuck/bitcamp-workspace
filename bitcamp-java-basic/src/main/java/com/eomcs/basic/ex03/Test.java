// 주제: 메모리 크기에 따른 표기법

package com.eomcs.basic.ex03;

class Test {
    public static void main(String[] args) {
        // 자바 기본 정수값을 저장하는 메모리 크기 : 4byte
        System.out.println(21_4748_3647);
        System.out.println(-21_4748_3648);
       
        // 8바이트 메모리를 사용하는 정수 리터럴
        // 숫자 마지막에 L,l을 붙임
        System.out.println(2147483648L);
        System.out.println(-2147483649L);
        
        System.out.println(1);  // 4바이트 메모리를 사용하는 '1'
        System.out.println(1L); // 8바이트 메모리를 사용하는 '1'

        System.out.println(21_4748_364+5);

        // 최대,최소값 알아보는 명령어
        System.out.println(Integer.MAX_VALUE); // 4바이트로 표현할 수 있는 정수 최대값
        System.out.println(Integer.MIN_VALUE); // 4바이트로 표현할 수 있는 정수 최소값
        System.out.println(Long.MAX_VALUE); // 8바이트로 표현할 수 있는 정수 최대값 
        System.out.println(Long.MIN_VALUE); // 8바이트로 표현할 수 있는 정수 최소값
        System.out.println(Short.MIN_VALUE);

    }

}
