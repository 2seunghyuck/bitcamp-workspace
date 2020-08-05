package com.eomcs.basic.ex07;

import java.util.Arrays;
import java.util.Scanner;

public class prob {
  public static void main(String[] args) {
    String[] words = {"television", "computer", "mouse", "phone"};
    Scanner input = new Scanner(System.in);
 //   for (int i = 0; i < words.length; i++) {
      char[] question = words[0].toCharArray();
      for (int j = 0; j < question.length; j++) {
        int n = (int) (Math.random() * question.length);
        char tmp = 0;
        tmp = question[0];
        question[0] = question[n];
        question[n] = tmp;
        System.out.println(Arrays.toString(question[n]));
      }
      System.out.println(question[0]);
    }
 // }
}
