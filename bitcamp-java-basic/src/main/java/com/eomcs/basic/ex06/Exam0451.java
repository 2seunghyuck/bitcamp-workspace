package com.eomcs.basic.ex06;

public class Exam0451 {
  public static void main(String[] args) {
    int i = 5;
    int j = 0;
    int[] arr = new int[i];
    // 배열의 처음부터 끝까지 값을 꺼내는 것이라면
    // 다음의 for 문법을 사용하라! 아주 편하다!
    // for (배열에서 꺼낸 값을 저장할 변수 선언 : 배열주소) 문장;
    arr[i] = j++;
    for (int a : arr)

      System.out.println(a);
  }
}

