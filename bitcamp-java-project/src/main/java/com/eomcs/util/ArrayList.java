package com.eomcs.util;

import java.util.Arrays;

public class ArrayList<E> {
  private static final int DEFAULT_CAPACITY = 5;
  private Object[] elementData;
  private int size;

  public ArrayList() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(int initialCapacity) {
    if (initialCapacity < DEFAULT_CAPACITY) {
      elementData = new Object[DEFAULT_CAPACITY];
    } else {
      elementData = new Object[initialCapacity];
    }
  }


  public boolean add(E e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
    return true;
  }

  private void grow() {
    // System.out.println("배열이 늘어났다");
    int newCapacity = elementData.length + (elementData.length >> 1);
    elementData = Arrays.copyOf(elementData, newCapacity);
    // Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
    // for (int i = 0; i < elementData.length; i++) {
    // newArray[i] = elementData[i];
    // }
    // elementData = newArray;

  }

  public void add(int index, E element) {
    if (size == elementData.length) {
      grow();
    }
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("index가 유효하지 않습니다.");
    }
    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i - 1];
    }
    elementData[index] = element;
    size++;
  }

  @SuppressWarnings("unchecked")
  public E set(int index, E element) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("index가 유효하지 않습니다.");
    }
    Object old = elementData[index];
    elementData[index] = element;
    return (E)old;
  }

  @SuppressWarnings("unchecked")
  public E remove(int index) {
    Object old = elementData[index];

    // 19) 사용방법
    System.arraycopy(elementData, // 복사대상
        index + 1, // 복사할 항목의 시작 인덱스
        elementData, // 목적지
        index, // 복사 목적지 인덱스
        this.size - (index + 1) // 복사할 항목의 갯수
        );
    // for (int i = index; i < size - 1; i++) {
    // elementData[i] = elementData[i + 1];
    // }

    size--;
    elementData[size] = null;

    return (E)old;
  }

  @SuppressWarnings("unchecked")
  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("index가 유효하지 않습니다.");
    }
    return (E)elementData[index];
  }

  public int size() {// private 으로 막힌 변수를 다른 클래스에서 리턴해주기 위해 메서드를 만들어준다.
    return this.size;
  }

  public Object[] toArray() {
    Object[] arr = Arrays.copyOf(elementData, this.size);
    // System.out.println(elementData == arr);
    return arr;
    // Object[] arr = new Object[this.size];
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = elementData[i];
    // }
    // return arr;
  }
  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if(arr.length < this.size) {
      return (E[]) Arrays.copyOf(this.elementData, this.size, arr.getClass());
    }
    System.arraycopy(this.elementData, 0, arr, 0, this.size);
    return arr;
  }
}
