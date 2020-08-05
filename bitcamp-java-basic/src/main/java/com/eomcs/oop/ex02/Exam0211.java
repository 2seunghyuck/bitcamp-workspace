package com.eomcs.oop.ex02;

import com.eomcs.oop.util.Calculator2;

//                   * class문법 *
// 유지보수 하기 쉽도록 서로 관련된 일을 하는 메서드를 한 블럭으로 묶는다.
// 특정 상황에 맞는 데이터를, 다루기 쉽도록 메모리를 설계한다.
// -> 새로운 데이터 타입을 정의한다(user defined Data Type)

public class Exam0211 {

  public static void main(String[] args) {
    // 1) ((((2 + 3) - 1) * 7) / 3) = ?
    // 2) ((((3 * 2) + 7) / 4) - 5) = ?
    // 두가지 식을 동시에 계산할 수 있는가 ?  불가
    // -why Calculator 에는 result 변수가 하나이기 떄문에
    //  동시에 여러가지의 결과를 따로 관리할 수 없다.
    Calculator2 c1 = new Calculator2();
    Calculator2 c2 = new Calculator2();

    Calculator2.plus(c1, 2);
    Calculator2.plus(c1, 3);
    Calculator2.minus(c1, 1);
    Calculator2.multiple(c1, 7);
    Calculator2.divide(c1, 3);
    printResult(c1.result);

    Calculator2.plus(c2, 3);
    Calculator2.multiple(c2, 2);
    Calculator2.plus(c2, 7);
    Calculator2.divide(c2, 4);
    Calculator2.minus(c2, 5);
    printResult(c2.result);
  }
  static void printResult(int value) {
    System.out.println("**********************");
    System.out.printf("==> 결과 = %d\n", value);
    System.out.println("**********************");
  }
}
