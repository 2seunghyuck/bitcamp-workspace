package com.eomcs.basic.ex06;

// 반복문의 사용.
// do - while 문
// 1 ~ 10 까지를 출력한다.
public class Exam0350 {
  public static void main(String[] args) {
    int count = 0;

    do {
      count++;
      System.out.println(count);
    } while (count < 10);

  }

}

// while 문은 참거짓에따라 실행되지 않을수도 있지만.
// do 문은 적어도 한번은 실행되기 때문에 , 사용한다.
