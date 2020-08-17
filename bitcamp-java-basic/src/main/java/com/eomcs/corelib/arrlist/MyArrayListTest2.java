package com.eomcs.corelib.arrlist;

public class MyArrayListTest2 {

  public static void main(String[] args) {
    MyArrayList.add("aaa");
    MyArrayList.add("bbb");
    MyArrayList.add("ccc");
    MyArrayList.add("ddd");
    MyArrayList.add("eee");
    MyArrayList.add("fff");
    MyArrayList.add("ggg");
    MyArrayList.add("hhh");
    print();

    MyArrayList.add(8, "iii");
    MyArrayList.add("jjj");

    print();
    System.out.println("---------------");

    Object old = MyArrayList.remove(2);
    print();
    System.out.println(old);

    old = MyArrayList.set(8, "xxx");
    print();

    System.out.println(MyArrayList.get(0));
    System.out.println(MyArrayList.get(8));

  }

  static void print() {
    for (int i = 0; i < MyArrayList.size; i++) {
      String str = (String) MyArrayList.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
