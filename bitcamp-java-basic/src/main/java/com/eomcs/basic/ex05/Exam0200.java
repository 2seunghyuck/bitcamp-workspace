package com.eomcs.basic.ex05;

public class Exam0200 {
  public static void main(String[] args) {
    double d1 = 987.6543;
    double d2 = 1.111111;
    double d3 = d1 + d2;
    double x1 = 000.765411;
    double x2 = 988;
    System.out.println(x1 + x2);
    System.out.println(d3);
    // 두변수의 결과기대값은 같지만 IEEE 알고리즘의 문제로 인한 의미없는 수의 생성으로,
    // 논리값이 false 가나오는 경우가 생긴다 (부동소수점에서) 
    System.out.println(d3 == (x1 + x2));
    //이를 방지하기 위해 임의의 찌거기 값을 생성해 결과를 비교하는 명령어를 작성해 비교한다.
    
    double Epsilon = 0.000001;
    System.out.println(Math.abs(d3 - (x1 + x2)) < Epsilon);
    //Epsilon 이라는 임의의 찌꺼기 변수를 만들어주어 두수를 비교하는 방법을 사용.
    //부동소수점의 비교에 쓰임.
    System.out.println(Math.abs(d3 - (x1 + x2)) <= Double.POSITIVE_INFINITY);
    //POSITIVE_INFINITY 를 이용하는 방법도 가능.
    
  }
}
