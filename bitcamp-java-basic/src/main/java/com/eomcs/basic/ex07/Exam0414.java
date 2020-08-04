package com.eomcs.basic.ex07;

// Stack 과 Heap 메모리 영역
public class Exam0414 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    int avg;

  }

  public static void main(String[] args) throws Exception{
    Score s = new Score();

    Score s2;
    s2 = createObject();
  }

  // Score class 에 따라 Heap 에 생성한 인스턴스 주소를 리턴    |
  // Score class 의 인스턴스를 생성한 후 그 주소를 리턴         |
  // Score class 의 인스턴스를 리턴                             |
  // Score의 인스턴스를 리턴                                    |
  // Score 객체를 리턴                                          | 다 같은말임

  static Score createObject() {
    Score s = new Score();
    return s;
  }
}
