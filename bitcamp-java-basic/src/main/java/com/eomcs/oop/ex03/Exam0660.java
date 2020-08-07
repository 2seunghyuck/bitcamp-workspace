package com.eomcs.oop.ex03;

public class Exam0660 {
 public static class A {
   static float pi;
   static float area(int r) {
     return 2 * pi * r;
   }
   // 클래스 멤버를 사용하기 전에 사용할 값으로 초기화 시키는 것
   static {
     pi = 3.14f;
   }
 }
  public static void main(String[] args) throws Exception {

    System.out.println(A.area(3));
  }
}


