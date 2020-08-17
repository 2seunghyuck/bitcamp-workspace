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

public class MyLinkedList08 {

  // 값을 찾을 때는 첫번째 노드부터 따라간다.
  Node first;
  // 값을 추가할 때는 마지막 노드에 연결한다.
  Node last;
  // 목록 크기를 보관한다.
  int size;


  // Node 클래스의 용도
  // - 목록에서 각 항목의 값을 보관하는 객체로 역할을 수행한다.

  // 여러개의 MyLinkedList 객체가 공유하는 클래스 이기 때문에 static 으로 Node 클래스를 설계한다.
  static class Node {
    Object value;
    Node next;

    public Node() {}

    public Node(Object value) {
      this.value = value;
    }
  }

  public boolean add(Object e) {
    Node node = new Node();
    node.value = e;
    if (first == null) {
      first = node;
    } else {
      last.next = node; // 이전 명령부터 차례차례 수식해서 진행됨.
    }
    last = node;
    size++;
    return true;

  }

  public void add(int index, Object element) {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Node node = new Node(element);

    size++;
    if (index == 0) {
      node.next = first;
      first = node;
      return;
    }
    Node cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
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
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    size--;

    if (index == 0) {// 가비지 관리를 위한 메서드;
      Node old = first;
      first = old.next;
      old.next = null; // 가비지가 다른 인스턴스를 가리키지 않게 하기위함.
      return old.value;
    }

    Node cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
      cursor = cursor.next;
    }

    Node old = cursor.next;
    cursor.next = old.next;
    old.next = null;  // 가비지가 다른 인스턴스를 가리키지 않게 하기위함.

    if (cursor.next == null) {
      last = cursor;
    }
    return old.value;
  }

  public Object set(int index, Object element) {

    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    Object old = cursor.value;
    cursor.value = element;

    return old;
  }

  public Object get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Node cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }
}
