package com.eomcs.corelib.ex03;

// 1) 인스턴스를 담을 레퍼런스 배열[갯수] 를 준비한다. dafault = 10개;
// 2) 인스턴스를 추가하는 add() 메서드 정의
// 3) 특정 인덱스의 인스턴스를 리턴하는 get() 메서드를 정의한다.
// 4) 인스턴스를 삽입하는 add() 메서드 정의
public class MyArrayList04 {

  static Object[] elementData = new Object[5];
  static int size;

  static public boolean add(Object e) {
    elementData[size++] = e;
    return true;
  }

  static public void add(int index, Object element) {
    for(int i = size; i > index ; i--) {
      elementData[i] = elementData[i - 1];
    }
    elementData[index] = element;
    size++;
  }

  static public Object get(int index) {

    return elementData[index];
  }
}
