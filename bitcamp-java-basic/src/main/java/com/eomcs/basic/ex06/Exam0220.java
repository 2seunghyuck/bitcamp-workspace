package com.eomcs.basic.ex06;

public class Exam0220 {
  public static void main(String[] args) {
    int no = 1;
    System.out.println("제출하실 서류는 다음과 같습니다.");
    switch (no) {
      case 1:
        System.out.println("정보처리기사 자격증");
        System.out.println("졸업증명서");
        System.out.println("이력서");
        break;
      case 2:
        System.out.println("졸업증명서");
        System.out.println("이력서");
        break;
      case 3:
        System.out.println("이력서");
        break;
      default:
        System.out.println("잘못 입력하였습니다.");
    }
  }
}
