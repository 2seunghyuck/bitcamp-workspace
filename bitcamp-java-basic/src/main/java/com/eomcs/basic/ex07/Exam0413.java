package com.eomcs.basic.ex07;

import java.util.ArrayList;

// Stack 과 Heap 메모리 영역
public class Exam0413 {

  public static void main(String[] args) throws Exception{
    ArrayList list = new ArrayList();
    while (true) {
      list.add(createArr());
      Thread.currentThread().sleep(2000);
    }
  }

  static int[] createArr() {
    System.out.print(".");
    return new int[50_000_000];
  }
}
