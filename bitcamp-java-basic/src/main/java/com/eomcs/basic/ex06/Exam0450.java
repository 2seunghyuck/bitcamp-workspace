package com.eomcs.basic.ex06;

public class Exam0450 {
  public static void main(String[] args) {

    int[] score = new int[5];

    score[0] = 100;
    score[1] = 90;
    score[2] = 80;
    score[3] = 70;
    score[4] = 60;

    for (int i = 0; i < score.length; i++) {// score.length 크기를 알아내는 값.
      System.out.println(score[i]);
    }
  }
}

