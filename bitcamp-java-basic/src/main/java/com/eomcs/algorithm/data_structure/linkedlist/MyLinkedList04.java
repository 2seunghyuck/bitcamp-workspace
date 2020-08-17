package com.eomcs.algorithm.data_structure.linkedlist;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 Node클래스를 설계한다.
// 3) 첫번째 Node와 마지막 Node의 주소를 담을 field 를 추가한다.
// 목록 크기를 저장할 필드를 추가한다.
// 4) 목록에 값을 추가하는 add() 메서드를 정의한다.

public class MyLinkedList04 {

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
  }

  public boolean add (Object e) {
    Node node = new Node();
    node.value = e;
    if(first == null) {
      first = node;
    } else {
      last.next = node;     // 이전 명령부터 차례차례 수식해서 진행됨.
      }
    last = node;
    size++;
    return true;
  }
}
