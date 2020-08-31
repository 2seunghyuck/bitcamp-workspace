package com.eomcs.corelib.arrlist;

public class MyArrayListTest6 {

  public static void main(String[] args) {
    // aaa,bbb,ccc,ddd,eee
    MyArrayList<String> list = new MyArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    list.add("eee");
    list.add("fff");
    list.add("ggg");

    print(list);
    System.out.println("---------------");
    print2(list);
    System.out.println("---------------");
    print3(list);
    System.out.println("---------------");

  }

  static void print(MyArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
      String str = list.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
  static void print2(MyArrayList<String> list) {
    Object[] arr = list.toArray();
    for (int i = 0; i < list.size(); i++) {
      String str = (String) arr[i];
      System.out.print(str + ",");
    }
    System.out.println();
  }
  static void print3(MyArrayList<String> list) {
    String[] arr = new String[list.size()];
    String[] arr2 = list.toArray(arr);
    System.out.println(arr == arr2);
    for (int i = 0; i < list.size(); i++) {
      String str = arr[i];
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
