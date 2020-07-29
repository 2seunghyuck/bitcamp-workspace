package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제 : 
// - 다음 int 변수에 들어있는 값을
//   각 자리수에 10진수 값을 역순으로 출력하라
// 실행 예) 
// 입력? 23459876
// 6
// 7
// 8
// 9
// 5
// 4
// 3
// 2
public class Test04 {

  public static void main(String[] args) {
    int value = 23459876;
    System.out.println(value % 10);
    value = value / 10;
    System.out.println(value % 10);
    value = value / 10;
    System.out.println(value % 10);
    value = value / 10;
    System.out.println(value % 10);
    value = value / 10;
    System.out.println(value % 10);
    value = value / 10;
    System.out.println(value % 10);
    value = value / 10;
    System.out.println(value % 10);
    value = value / 10;
    System.out.println(value % 10);
    
    System.out.println("---------------------------");
    
    /*
    int[] a = new int[9];
    
    a[0] = (value % 10);
    a[1] = (value % 100 - a[0]) / 10;
    a[2] = (value % 1000 - a[1] - a[0]) / 100;
    a[3] = (value % 10000 - a[2] - a[1] - a[0]) / 1000;
    a[4] = (value % 100000 - a[3] - a[2] - a[1] - a[0]) / 10000;
    a[5] = (value % 1000000 - a[4] - a[3] - a[2] - a[1] - a[0]) / 100000;
    a[6] = (value % 10000000 - a[5] - a[4] - a[3] - a[2] - a[1] - a[0]) / 1000000;
    a[7] = (value % 100000000 - a[6] - a[5] - a[4] - a[3] - a[2] - a[1] - a[0]) / 10000000;
    a[8] = (value % 1000000000 - a[7] - a[6] - a[5] - a[4] - a[3] - a[2] - a[1] - a[0]) / 100000000;
    
    System.out.printf("%d%n%d%n%d%n%d%n%d%n%d%n%d%n%d%n%d\n", a[0], a[1], a[2], a[3], a[4], a[5], a[6], a[7], a[8]);
    */
    /*Scanner input = new Scanner(System.in);
    System.out.println("숫자를 입력하세요");
    value = input.nextInt();
    int[] a = new int[9];
    a[0] = (value % 10);
    a[1] = (value % 100 - a[0]) / 10;
    a[2] = (value % 1000 - a[1] - a[0]) / 100;
    a[3] = (value % 10000 - a[2] - a[1] - a[0]) / 1000;
    a[4] = (value % 100000 - a[3] - a[2] - a[1] - a[0]) / 10000;
    a[5] = (value % 1000000 - a[4] - a[3] - a[2] - a[1] - a[0]) / 100000;
    a[6] = (value % 10000000 - a[5] - a[4] - a[3] - a[2] - a[1] - a[0]) / 1000000;
    a[7] = (value % 100000000 - a[6] - a[5] - a[4] - a[3] - a[2] - a[1] - a[0]) / 10000000;
    a[8] = (value % 1000000000 - a[7] - a[6] - a[5] - a[4] - a[3] - a[2] - a[1] - a[0]) / 100000000;
    
    System.out.printf("%d\n, %d\n, %d\n, %d\n, %d\n, %d\n, %d\n, %d\n, %d\n", a[0], a[1], a[2], a[3], a[4], a[5], a[6], a[7], a[8]);
    */
  }
}








