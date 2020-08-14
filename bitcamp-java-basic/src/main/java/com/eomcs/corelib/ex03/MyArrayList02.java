package com.eomcs.corelib.ex03;

// 1) 인스턴스를 담을 레퍼런스 배열[갯수] 를 준비한다. dafault = 10개;
// 2) 인스턴스를 추가하는 add() 메서드 정의
public class MyArrayList02 {

  static Object[] elementData = new Object[5];
  static int size;

  static public boolean add(Object e) {
    elementData[size++] = e;
    return true;
  }

}
