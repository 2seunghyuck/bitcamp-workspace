package com.eomcs.util;


// 추상 클래스로 선언하므로써 직접 인스턴스를 생성하지 못하게 막는다
// 서브클래스에 상속해주는 용도로만 사용하게 해주는 방법이다.
// 서브클래스에서 반드시 재정의(override)해야하는 메서드를 추상 메서드로 만든다.
public abstract class AbstractList<E> {

  protected int size;

  public int size() {
    return this.size;
  }

  //추상메서드
  // -> 서브클래스에서 구체적인 실행을 하라는 얘기
  // -> 서브클래스 마다 구현하는 방법이 다르면 추상메서드로 선언한다.
  // -> 서브클래스에게 구현하도록 강제하는 방법
  public abstract boolean add(E e);

  public abstract void add (int index, E element);

  public abstract E get (int index);

  public abstract E set (int index, E element);

  public abstract E remove (int index);

  public abstract Object[] toArray();

  public abstract E[] toArray(E[] arr);
}
