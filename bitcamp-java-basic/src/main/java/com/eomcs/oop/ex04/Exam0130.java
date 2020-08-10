package com.eomcs.oop.ex04;

import java.util.Calendar;

public class Exam0130 {
  public static void main(String[] args) {
    // Calendar ==> 생성자가 있지만 접근권한이 없으므로 new 명령을 통해 인스턴스를 생성할 수없다.
    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
    System.out.println(c1 == c2);
    // 같은 값을 가지는 객체를 여러개 만들지 못하게 하도록,
    // 메서드를 호출을 통해 객체를 생성하도록 유도한다.
    // getInstance(); == 하나의 인스턴스를 공유하며 새로운 객체를 만들도록 하는것.
    //  --> '만들어낸' 객체의 정보는 다르지만, 해당 클래스의 기본값을 공유하며 사용된다.
  }
}
