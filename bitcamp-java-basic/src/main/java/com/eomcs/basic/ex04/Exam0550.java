package com.eomcs.basic.ex04;

public class Exam0550 {
  public static void main(String[] args) {
    
    int[] arr1 = new int[5];
    
    arr1[0] = 100;
    arr1[1] = 200;
    
    System.out.println (arr1[0]);
    System.out.println (arr1[1]);
    
    int[] arr2;
    arr2 = arr1;
    
    System.out.println(arr2[1]);
    System.out.println(arr2.length);
    }
  }
// 다른 인스턴스에도 같은 레퍼런스를 담을 수 있다.
