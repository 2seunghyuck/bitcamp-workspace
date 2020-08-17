package com.eomcs.corelib.arrlist;

public class MyArrayListTest3 {

  public static void main(String[] args) {
    // aaa,bbb,ccc,ddd,eee
    MyArrayList list = new MyArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    list.add("eee");
    list.add("fff");
    list.add("ggg");

    list.remove(2);
    list.remove(0);
    list.remove(4);
    print2(list);
    System.out.println("---------------");

    // fff,ggg,hhh,iii
    MyArrayList list2 = new MyArrayList(10);
    list2.add("fff");
    list2.add("ggg");
    list2.add("hhh");
    list2.add("iii");
    list2.add("jjjj");
    list2.add("kkk");
    list2.add("lll");

    print2(list2);


  }

  static void print(MyArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }

  static void print2(MyArrayList list) {
    Object[] arr;
    arr = list.toArray();
    for (Object obj : arr) {
      String str = (String) obj;
      System.out.print(str + ",");
    }
    System.out.println();
  }

}
