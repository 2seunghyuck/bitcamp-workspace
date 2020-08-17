package com.eomcs.algorithm.data_structure.linkedlist;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 Node클래스를 설계한다.

public class MyLinkedList02 {
  // Node 클래스의 용도
  // - 목록에서 각 항목의 값을 보관하는 객체로 역할을 수행한다.

  // 여러개의 MyLinkedList 객체가 공유하는 클래스 이기 때문에 static 으로 Node 클래스를 설계한다.
  static class Node {
    Object value;
    Node next;

  }
}
