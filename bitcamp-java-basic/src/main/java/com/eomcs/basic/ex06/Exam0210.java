package com.eomcs.basic.ex06;

public class Exam0210 {
  public static void main(String[] args) {
    final int DEVELOPER = 1;
    final int GENERAL_MANAGER = 2;
    final int BUILD_MANAGER = 3; // 다른사람도 코드를 이해하기 쉽도록 상수에 이름을 붙인다.
    int type = 2;

    if (type == DEVELOPER) {
      System.out.println("정보처리 자격증");
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == GENERAL_MANAGER) {
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == BUILD_MANAGER) {
      System.out.println("이력서");
    } else { // 그밖에
      System.out.println("잘못된 지원입니다.");
    }
    System.out.println("--------------------------");

    switch (type) {
      case DEVELOPER:
        System.out.println("정보처리 자격증");
      case GENERAL_MANAGER:
        System.out.println("졸업증명서");
      case BUILD_MANAGER:
        System.out.println("이력서");
        break; // 멈추지 않고 실행됨으로 하위개념을 모두 포함시키고 싶을때 break 설정으로 조정할 수 있다.
      default:
        System.out.println("잘못된 지원입니다.");
    }
    System.out.println("--------------------------");

    int score = 70;

    switch (score) {
      case 100:
      case 90:
        System.out.println("A");
        break;
      case 80:
      case 70:
        System.out.println("B");
        break;
      case 60:
      case 50:
        System.out.println("C");
        break;
      default:
        System.out.println("F");
    }
    System.out.println("----------------------------");

    String value = "developer";
    final String value2 = "hello";

    switch (value) { // 변수로 4byte 이하의 '정수'(byte, short, int, char)타입, 문자열(변수로는 사용불가) 상수로 사용해야한다.
      case "developer":
        break;
      case "hello":
      // case value:
        break;
      default:

    }
    int value3 = 100;
    final int x = 200;
    switch (value3) {
      case 100:
        break;
      case 100 + 3:
        break;
      case x:
        break;
      case x+3:
        break;
    }
    System.out.println("-----------------------------------");

    JOB type2 = JOB.DEV;
    switch (type2) {

    }
    }
  enum JOB {
    DEV, GM, BM
    //
  }
}


