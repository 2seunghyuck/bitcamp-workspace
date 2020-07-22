// 주제: 부동소수점의 2진수 정규화 (2진수로 변환하기)
// .class file 을 Hexdump 해서 공식이 맞는지 확인
// 2진수로 완벽히 나눠지지 않는경
package com.eomcs.basic.ex03;

class Exam0360 {
  public static void main(String[] args) {
    System.out.println(2.127f);
    System.out.println(2.127);
    System.out.println(-2.127f);
    // 12.375 (부동소수점) 정규화 결과
    // ==> IEEE 754 규정에 따라 부동 소수점을 2진수로 변환한다.
    // ==> 0100 0001 0100 0110 0000 0000 0000 0000 (2진수)
    // ==> 4146 0000 (16진수)
  }
}

