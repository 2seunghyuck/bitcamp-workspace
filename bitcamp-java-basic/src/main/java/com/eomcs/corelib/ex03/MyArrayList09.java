package com.eomcs.corelib.ex03;
// MyArrayListTest
// 1) 인스턴스를 담을 레퍼런스 배열[갯수] 를 준비한다. dafault = 10개;
// 2) 인스턴스를 추가하는 add(Object) 메서드 정의
// 3) 특정 인덱스의 인스턴스를 리턴하는 get(int) 메서드를 정의한다.
// 4) 인스턴스를 삽입하는 add(int, Object) 메서드 정의
// 5) 특정 위치의 항목을 다른 인스턴스로 바꾸는 set(int, object) 메서드 정의
// 6) 특정 위치의 항목을 제거하는 remove(int) 메서드 정의
//
// MyArrayListTest 2
// 7) add() 할때 배열의 크기를 넘는경우 배열의 크기를 증가시킨다.
// 8) add(int, object) 로 임의에 위치에 삽입할 때
//    배열의 크기가 작으면 늘리고 인덱스의 유효성을 검증한다.
// 9) get(int) 으로 유효하지 않은 인덱스를 실행할 때
//      -유효하지 않은 index에 예외를 발생시킨다.

public class MyArrayList09 {

  static Object[] elementData = new Object[5];
  static int size;

  static public boolean add(Object e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
    return true;
  }
  static private void grow() {
    System.out.println("배열이 늘어났다");
    Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
    for(int i =0; i < elementData.length; i++) {
      newArray[i] = elementData[i];
    }
    elementData = newArray;

  }

  static public void add(int index, Object element) {
    if (size == elementData.length) {
      grow();
    }
    if (index <0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("index가 유효하지 않습니다.");
    }
    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i - 1];
    }
    elementData[index] = element;
    size++;
  }

  static public Object set(int index, Object element) {
    Object old = elementData[index];
    elementData[index] = element;
    return old;
  }

  static public Object remove(int index) {
    Object old = elementData[index];
    for (int i = index; i < size - 1; i++) {
      elementData[i] = elementData[i + 1];
    }

    size--;
    return old;
  }

  static public Object get(int index) {
    if(index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("index가 유효하지 않습니다.");
    }
    return elementData[index];
  }
}
