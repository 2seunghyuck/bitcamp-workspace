package com.eomcs.basic.ex06;

public class Exam0250 {

  // 문자열을 상수로 표현해주는 명령어 enum
  enum Level {
    GUEST, MEMBER, ADMIN
  }
  // 문자열을 상수처럼 표현하여 case 문의 사용을 직관적으로 표현할 수 있다.
  // enum으로 지정한 상수 이외의 수를 사용할 수 없어서, 오류를 막기 좋다.

  public static void main(String[] args) {
    Level level = Level.MEMBER;

    switch (level) {
      case ADMIN:
        System.out.println("다른 회원의 글을 수정, 삭제할 수 있습니다.");
      case MEMBER:
        System.out.println("글작성 가능합니다.");
      case GUEST:
        System.out.println("조회 가능합니다.");
      // case 1: 변수를 enum 안의 level 로 지정하였으므로 enum 이외의 상수를 지정할 수 없다.
        break;
    }
  }
}
