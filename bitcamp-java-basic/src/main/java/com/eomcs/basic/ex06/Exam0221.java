package com.eomcs.basic.ex06;

public class Exam0221 {
  public static void main(String[] args) {

    int no = 1;
    System.out.println("제출하실 서류는 다음과 같습니다.");
    switch (no) {
      case 1:
        System.out.println("정보처리기사 자격증");
      case 2:
        System.out.println("졸업증명서");
      case 3:
        System.out.println("이력서");
        break;
        // break 문이 실행될때 까지 멈추지 않기 떄문에
        // 중복된 자료들을 나열할 때 , break의 위치를 조정하여 수식을 단순화 한다.
      default:
        System.out.println("잘못 입력하였습니다.");
    }
  }
}
