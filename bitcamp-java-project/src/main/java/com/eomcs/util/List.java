package com.eomcs.util;

// 데이터 목록을 다루는 객체의 사용 규칙을 정의한다.
// => '데이터 목록을 다루는 객체라면 다음과 같은 기능이 있어야 한다' 라는 의미다.
public interface List<E> {
  int size();
  boolean add(E e);
  void add(int index, E element);
  E get(int index);
  E set(int index, E element);
  E remove(int index);
  Object[] toArray();
  E[] toArray(E[] arr);

  // 컬렉션의 값을 조회해 주는 Iterator 구현체를 리턴하는 메서드를 생성한다.
  Iterator<E> iterator();
}
