package com.eomcs.basic.ex06;

// 주사위 두 눈 합 6이하인것만 출력
public class prob {
  public static void main(String[] args) {
    int i = 0;
    int j = 0;
    while (i < 6) {
      j = 0;
      while (j < 6) {
        if (i + j == 6)
          System.out.printf("%d + %d = %d\n", i, j, i + j);
        j++;
      }
      i++;
    }
  }
}
