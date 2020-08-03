package com.eomcs.basic.ex07.assignment;

// 과제 : 단위 행렬을 출력하시오.
//
public class TEST1 {
  public static void main(String[] args) {
    int[][] arr = new int[6][6];// 5행 5열의 배열을 생성;

    // 배열이 단위행렬이 되도록 배열을 초기화 시키시오.

    /*for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        arr[i][j] = (i / j) * (j / i);
      }
    }
*/
    System.out.println("---------------------------");
    for (int i = 0; i < 6; i++) {
      for (int j = 1; j <= 5; j++) {
        if (i == j) {
        System.out.printf("1", arr[i][j]);
        }
        if (i != j) {
        System.out.printf("0", arr[i][j]);
        }
      }
      System.out.println();
    }

  }
}