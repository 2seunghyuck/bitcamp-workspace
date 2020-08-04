package com.eomcs.basic.ex07;
// argument 와 parameter 단위가 같아야한다.

public class Exam0200 {
  public static void main(String[] args) {

    m1();

    m2("홍길동");

    String message = m3();
    System.out.println(message);

    m3();
    message = m4("홍길동");

    System.out.println(message);

    message = m5("홍길동", 20, false);
    System.out.println(message);

    m6("홍길동", 100, 90, 80);
    m7("홍길동", new int[] {100, 90, 80, 70, 60});
    m7("홍길동", new int[] {});
    System.out.println("-------------------------------");
    m8("홍길동", 100, 90, 80, 70, 60);
    m8("홍길동", 100, 90, 60);
    m8("홍길동", 100);
    m8("홍길동");
    m10(new int[] {100, 90, 80}, new String[] {"국어", "영어", "수학"}, "홍길동");

    int sum = 0;
    sum = plus(2, 3);
    sum = plus(sum, 7);
    sum = plus(sum, 4);
    System.out.println(sum);
    System.out.println(plus(plus(plus(2, 3),7),4));
  }

  static void m1() {
    System.out.println("Hello!");
  }

  static void m2(String name) {
    System.out.println(name + "님 반갑습니다!");
  }

  static String m3() {
    System.out.println("11");
    return "안녕!";

  }

  static String m4(String name) {
    return name + "님 반갑습니다!";
  }

  static String m5(String name, int age, boolean working) {// 여러개의 아규먼트를 받을 수 있다.

    return age + "살" + name + "님의 재직상태는" + working + "입니다.";
  }

  static void m6(String name, int a, int b, int c) {
    int sum = a + b + c;
    int avg = sum / 3;

    System.out.printf("%s : %d(%d)\n", name, sum, avg);
  }

  static void m7(String name, int[] scores) {
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    int avg = 0;
    if (scores.length > 0) {
      avg = sum / scores.length;
    }
    System.out.printf("%s : %d(%d)\n", name, sum, avg);
  }

  static void m8(String name, int... scores) { // 가변 파라미터의 갯수가 변할때.
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    int avg = 0;
    if (scores.length > 0) {
      avg = sum / scores.length;
    }
    System.out.printf("%s : %d(%d)\n", name, sum, avg);
  }

  // static void m9(int... scores, String name) {
  // 가변 파라미터는 무조건 맨 끝에 와야한다.
  // }
  // static void m9(int...scores, int...scores2){
  // 가변 파라미터는 여러개 선언할 수 없다. 범위가 어디인지 구분할수 없기 때문.
  // 가변 파라미터 중간에 다른 변수가 오더라도 범위구분이 불가하므로 작동하지 않는다.
  // }
  static void m10(int[] scores, String[] titles, String name) {
    if (scores.length != titles.length) {
      System.out.println(" 과목수와 점수의 갯수가 다릅니다.");
      return;
    }
    System.out.println(name + " 님의 점수");
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%s = %d \n", titles[i], scores[i]);
    }
  }

  static int plus(int a, int b) {
    return a + b;

  }
}
