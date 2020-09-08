package com.eomcs.util;

import java.util.NoSuchElementException;

// 1) Queue 를 구현하기 위해 기존에 작성한 MyLinkedList를 상속 받는다.
// 2) Queue에 값을 추가하는 offer(Object)를 정의한다.
// 3) Queue에서 값을 꺼내는 poll()을 정의한다.
// 4) Queue에서 제일 앞에 있는 값을 조회하는 peek()을 정의한다.
//
// 테스트2: MyQueueTest2
// 5) Queue.clone() 오버라이딩 : deep copy
//
// 테스트3: MyQueueTest3
// 6) 제네릭 적용
//
public class Queue<E> extends LinkedList<E> implements Cloneable {

  public boolean offer(E e) {
    return add(e);
  }

  public E poll() {
    if (size() == 0) {
      return null;
    }
    return remove(0);
  }

  public E peek() {
    if (size() == 0) {
      return null;
    }
    return get(0);
  }

  @SuppressWarnings("unchecked")
  @Override
  public Queue<E> clone() throws CloneNotSupportedException {
    Queue<E> newQueue = new Queue<>();
    //Object[] values = this.toArray();
    for (Object value : this.toArray()) {
      newQueue.offer((E)value);
    }
    return newQueue;
  }
  // 상속받은 메서드가 서브클래스의 역할 에 맞지 않다면
  // 역할에 맞게끔 재정의 하라.
  // AbstractList 로 부터 상속받은 iterator()는 ListIterator 객체를 리턴한다.
  // ListIterator 는 입력 순서대로 조회한다.
  // Queue 도 입력한 순서대로 조회하지만 맨앞의 값을 꺼내서 삭제하는 방법이 다르다.
  // 따라서 Queue 방식에 맞게 동작하는 Iterator을 리턴하도록 메서드를 overriding한다.
  @Override
  public Iterator<E> iterator() {
    class QueueIterator implements Iterator<E>{

      Queue<E> queue;

      public QueueIterator() {
        try {
          this.queue = Queue.this.clone();
        } catch (Exception e) {
          throw new RuntimeException("스택 복제중에 오류 발생");
        }
      }
      @Override
      public boolean hasNext() {
        return queue.size() > 0;
      }
      @Override
      public E next() {
        if (queue.size() == 0)
          throw new NoSuchElementException();
        return queue.poll();
      }
    }
    return new QueueIterator();
  }
}







