package com.eomcs.algorithm.data_structure.linkedlist;

public class MyLinkedListTest2 {

  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();

    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    list.add("fff");
    list.add("ggg");
    list.add("hhh");
    print(list);
    list.add(4, "eee");
    print(list);
    System.out.println("-------------------");
    System.out.println(list.remove(0));
    System.out.println(list.remove(6));
    print(list);
    System.out.println("-------------------");
    System.out.println(list.set(3, "xxxx"));
    print(list);
    System.out.println(list.set(0, "11111"));
    print(list);
    System.out.println(list.set(5, "22222"));
    print(list);
    System.out.println("-------------------");
    print2(list.toArray());
  }


  static void print(MyLinkedList list) {

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + ", ");
    }
    System.out.println();
  }
   static void print2(Object[] arr) {

   for (Object obj : arr){
   System.out.print(obj + ", ");
   }
   System.out.println();
   }
}
