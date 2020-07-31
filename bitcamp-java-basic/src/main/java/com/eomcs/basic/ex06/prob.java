package com.eomcs.basic.ex06;

// 주사위 두 눈 합 6이하인것만 출력
public class prob {
  public static void main(String[] args) {
    int sum = 1;
    for (int i = 1, j = 0; i >= 0; i += 2, j -= 2) {
      sum = sum + i;
      if (sum == 100)
        break;
      sum = sum + j;
      if (sum == 100)
        break;
      System.out.printf("%d, %d, %d\n", i, j, sum);
    }
  }
}


