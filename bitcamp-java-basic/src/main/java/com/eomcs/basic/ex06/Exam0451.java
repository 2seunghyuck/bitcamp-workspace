package com.eomcs.basic.ex06;

public class Exam0451 {
  public static void main(String[] args) {
    int[] score = new int[5];
    // 배열의 처음부터 끝까지 값을 꺼내는 것이라면
    score[0] = 100;
    score[1] = 90;
    score[2] = 80;
    score[3] = 70;
    score[4] = 60;

    for (int value : score) {// 새로운 변수 value 를 for 문 밖에 설정할 수 없다;
      System.out.println(value);
    }
  }
}

