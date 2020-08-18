package com.eomcs.algorithm.data_structure.linkedlist;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 Node클래스를 설계한다.
// 3) 첫번째 Node와 마지막 Node의 주소를 담을 field 를 추가한다.
// 목록 크기를 저장할 필드를 추가한다.
// 4) 목록에 값을 추가하는 add() 메서드를 정의한다.
// 5) 목록에서 값을 조회하는 get() 메서드를 정의한다.
// 6) 목록에서 특정 인덱스 위치의 값을 삽입하는 add(int ,Object) 메서드를 정의한다.
// -Node 의 생성자를 추가한다.
// 7) 목록에서 특정 인덱스의 값을 제거하는 remove(int) 메서드를 정의한다.
// 8) 목록에서 특정 인덱스의 값을 바꾸는 set(int, Object) 메서드를 정의한다.
// 9) 목록의 데이터를 새 배열에 담아 리턴하는 toArray() 메서드를 정의한다.
// 10) 인스턴스필드에 대해 캡슐화를 적용한다.
//  - 목록 크기를 리턴하는 size()를 추가로 정의한다.

public class MyLinkedList10 {
  private Node first;
  private Node last;
  private int size;

  static class Node {
    Object value;
    Node next;

    Node() {}

    Node(Object value) {
      this.value = value;
    }
  }

  public boolean add(Object e) {

    Node node = new Node();
    node.value = e;
    if (first == null) {
      first = node;
    } else {
      last.next = node;
    }
    last = node;
    size++;
    return true;
  }

  public Object get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다");
    }
    Node cursor = this.first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;

  }

  public void add(int index, Object element) {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다");
    }

    Node node = new Node(element);
    size++;
    if (index == 0) {
      node.next = this.first;
      first = node;
      return;
    }
    Node cursor = this.first;
    for (int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }
    node.next = cursor.next;
    cursor.next = node;

    if (node.next == null) {
      last = node;
    }
  }

  public Object remove(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다");
    }
    size--;

    if (index == 0) {
      Node old = first;
      first = old.next;
      old.next = null;
      return old.value;
    }
    Node cursor = this.first;
    for (int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }

    Node old = cursor.next;
    cursor.next = old.next;
    old.next = null;

    if (cursor.next == null) {
      last = cursor;
    }
    return old.value;
  }

  public Object set(int index, Object element) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다");
    }

    Node cursor = this.first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }

    Object old = cursor.value;
    cursor.value = element;

    return old;
  }

  public Object[] toArray() {
    Object[] arr = new Object[size];

//    Node cursor = this.first;
//    for(int i = 0; i < size; i++) {
//      arr[i] = cursor.value;
//      cursor = cursor.next;
//    }
    return arr;
  }

  public int size() {
    return this.size;
  }
}
