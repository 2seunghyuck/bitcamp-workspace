package com.eomcs.basic.ex07;

// call by value vs call by reference
public class Exam0300 {
  static class Persion {
    String name;
    int age;
    boolean working;
  }

  public static void main(String[] args) {

    int a = 200;
    m1(a); // call by value

    System.out.println(a);
    a = 300;
    m1(a);
    System.out.println(a);

    int[] arr = new int[] {100, 200, 400};

    m2(100, 200, 300);// call by reference
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println("-------------------------------------");

    Persion p;
    p = new Persion();
    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);
    m3(p);
    System.out.printf("%s의나이는 %d살이고 현재 %b중\n", p.name, p.age, p.working);

  }

  static void m1(int a) {
    a = 100;
  }

  static void m2(int... arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      System.out.println(sum);
    }
  }

  static void m3(Persion p) {
    p.name = "홍길동";
    p.age = 88;
    p.working = true;
  }

}


// 시험지 :
// 1. 다음 계산을 수행하라.
// a 변수에 100을 넣어라.
// b 변수에 200을 넣어라.
// a와 b를 더해 그 결과를 출력하라.
