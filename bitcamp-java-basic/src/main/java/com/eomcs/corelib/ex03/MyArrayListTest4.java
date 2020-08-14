package com.eomcs.corelib.ex03;

import java.util.ArrayList;

public class MyArrayListTest4 {

  public static void main(String[] args) {
    // aaa,bbb,ccc,ddd,eee
    ArrayList list = new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    list.add("eee");
    print(list);
    System.out.println("---------------");

    // fff,ggg,hhh,iii
    ArrayList list2 = new ArrayList();
    list2.add("fff");
    list2.add("ggg");
    list2.add("hhh");
    list2.add("iii");


    print(list2);


  }

  static void print(ArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
