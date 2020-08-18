// Iterator 의 사용
package com.eomcs.corelib.ex07;

import java.util.Iterator;
import java.util.Stack;

public class Exam0230 {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("eee");

    Stack stack = new Stack();
    stack.push(s1);
    stack.push(s2);
    stack.push(s3);
    stack.push(s4);
    stack.push(s5);
// 스택이라고 LIFO 하는것이 아니라 저장된 순서대로 꺼내줌
    Iterator 컬렉션에서값을꺼내주는객체 = stack.iterator();
    while (컬렉션에서값을꺼내주는객체.hasNext()) {
      System.out.print(컬렉션에서값을꺼내주는객체.next() + ", ");
    }
    System.out.println();

  }
}
