package com.eomcs.basic.ex06;

public class Exam0240 {
  public static void main(String[] args) {
    int x = 1, y = 300;
    final int z = 200;

    switch (x) {
      case 1 * 300:
      case 2:
      case 1 * z: // z를 상수로 선언했기 때문에 사용가능함.
        // case 300; 이미 case 1 * 300에 할당된 값이므로 중복사용 불가.
        break;
    }
    // 위와같이 case 선언을 마구잡이로 하게된다면, 가독성이 떨어지기 때문에
    // 선언되는 변수들을 알아보기 쉽게 변수로 지정되는 문자를 상수로 저장하여, 코드 가독성을 늘인다.
    int level = 0;
    final int GUEST = 0, MEMBER = 1, ADMIN = 2;

    switch (level) {
      case ADMIN:
        System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
      case MEMBER:
        System.out.println("글작성 가능합니다.");
      case GUEST:
        System.out.println("조회 가능합니다.");
        break;
    }
  }
}
