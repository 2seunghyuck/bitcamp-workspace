package com.eomcs.basic.ex04;

public class Exam0570 {
  public static void main(String[] args) {

    int[] arr1 = new int[5];
    int[] arr2 = new int[] {100, 200, 300, 400, 500}; // 직접 배열 지정.
    int[] arr3 = {111, 222, 333, 444, 555}; // new int를 생략하고 직접 지정 가능.
    int[] arr4;
    // arr4 = {100, 200, 300, 400, 500}; 직접 지정하는 경우 한줄에서만 설정가능.
    int[] arr5;
    arr5 = new int[] {100, 200, 300, 400, 500};


    System.out.println(arr1[0]);
    System.out.println(arr2[0]);
    System.out.println(arr3[0]);
    // System.out.println(arr4[0]); 배열을 초기화 시키지않아 컴파일 오류발
    System.out.println(arr5[0]);
  }
}


