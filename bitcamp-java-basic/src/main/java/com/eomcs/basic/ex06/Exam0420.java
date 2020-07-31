// 반복문 for

package com.eomcs.basic.ex06;

public class Exam0420 {
  public static void main(String[] args) {
    int i = 0;
    for (; i < 5; i++) { // 변수를 밖에 사용할경우 for문이 끝난뒤에도 변수 i를 사용가능하다.
      System.out.println(i);
    }
    System.out.println("-------------------------");
    System.out.println(i);
    // 그러나 for문안에서 증감된 i는 for문이 끝난시점으로 설정되므로
    // 초기화 시켜 줘야하는 문제점 발생
    // 그냥 for문 안에서 변수를 해결하는것이 좋음.
  }
}

