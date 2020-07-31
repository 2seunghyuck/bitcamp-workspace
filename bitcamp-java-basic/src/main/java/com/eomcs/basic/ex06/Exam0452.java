package com.eomcs.basic.ex06;

import java.util.ArrayList;
// 배열생성문 ArrayList;
// 고정된변수를 생성하는게 아님 여러가지 형식의 변수를 담을 수 있다.
public class Exam0452 {
  public static void main(String[] args) {
    ArrayList score = new ArrayList();// 배열의 크기를 고정시키지않고 배열을 생성
    // ArrayList<변수선언> 을함으로써 , 변수를 정수, 문자열, 부동소수점, 등으로 고정시킬 수 있다.
    score.add(100);
    score.add(3.14);
    score.add("와");
    score.add(70);
    score.add(60);
    score.add(50);


    for (int i = 0; i < score.size(); i++) {
      System.out.println(score.get(i));
    }
    for (Object value : score) {
      System.out.println(value);
    }
  }


}

