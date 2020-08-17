package com.eomcs.corelib.arrlist;

public class MyArrayListTest {

  public static void main(String[] args) {
    MyArrayList.add("aaa");
    MyArrayList.add("bbb");
    MyArrayList.add("ccc");
    print();

    MyArrayList.add(1, "xxx");
    print();

    Object old = MyArrayList.set(2, "yyy");
    print();
    System.out.println(old);

    System.out.println("--------------------");

    old = MyArrayList.remove(2);
    print();
    System.out.println(MyArrayList.get(3));
  }

  static void print() {
    for (int i = 0; i < MyArrayList.size; i++) {
      String str = (String) MyArrayList.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
