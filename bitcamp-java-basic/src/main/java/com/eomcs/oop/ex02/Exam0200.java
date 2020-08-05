package com.eomcs.oop.ex02;

import com.eomcs.oop.util.Calculator;

//                   * class문법 *
// 유지보수 하기 쉽도록 서로 관련된 일을 하는 메서드를 한 블럭으로 묶는다.
// 특정 상황에 맞는 데이터를, 다루기 쉽도록 메모리를 설계한다.
// -> 새로운 데이터 타입을 정의한다(user defined Data Type)

public class Exam0200 {

  public static void main(String[] args) {
    // 1) ((((2 + 3) - 1) * 7) / 3) = ?
    // 2) ((((3 * 2) + 7) / 4) - 5) = ?
    // 두가지 식을 동시에 계산하려면 result 변수를 두개 준비해야 한다.
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);
    printResult(c1.result);
    // 식 2를 계산하기 위해서는 미리 정의된 스택을 초기화 시켜줘야하므로 ,
    // result 를 초기화 해줘야한다.
    c2.plus(3);
    c2.plus(7);
    c2.divide(4);
    c2.minus(5);
    printResult(c2.result);
  }
  static void printResult(int value) {
    System.out.println("**********************");
    System.out.printf("==> 결과 = %d\n", value);
    System.out.println("**********************");
  }
}
