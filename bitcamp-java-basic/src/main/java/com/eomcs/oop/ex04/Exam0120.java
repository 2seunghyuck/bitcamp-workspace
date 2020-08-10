package com.eomcs.oop.ex04;

import java.util.Calendar;
import java.util.Date;

public class Exam0120 {
  public static void main(String[] args) throws Exception {
    Date d1 = new Date(); // 실행하는 시점의 날짜와 시,분,초 로 초기화 시키는것.
    System.out.println(d1.toString()); // d1 인스턴스를 현재 날짜에 맞춘 문자열로 바꿔 출력함.
    System.out.println(d1); // 아규먼트가 primitive, string type 이 아니면 인스턴스에 대해서
                            // toString()을 호출하여 그 리턴값을 호출한다.
    int[] arr = new int[] {100, 200, 300};
    System.out.println(arr.toString());
    System.out.println(arr); // 배열이므로 자동으로 arr.toString() 을 출력

    // 1970년 1월 1일 0시 0분 0초부터 측정된 밀리초를 기준으로
    // 파라미터 값을 밀리초로 추가하여 출력
    Date d2 = new Date(100000);
    System.out.println(d2);

    Date d3 = new Date(120, 8, 10); // 곧 사라질 명령이므로 쓰지말라고 경고중
    System.out.println(d3);
    System.out.println("----------------------------");
    // 클래스 중에서는 생성자를 공개하지 않은 경우가 있다.
    // 이런 클래스의 인스턴스를 만들려면 보통 다음 두가지 방법을 사용한다.
    // 1) 다른 클래스의 도움을 받는다.
    // 2) 해당 클래스에서 제공하는 클래스 메서드(스태틱 메서드)를 사용한다.
    // Calendar c1 = new Calendar(); 클래스에서 생성자를 공개하지 않아 이런식으로 사용불가
    Calendar c1 = Calendar.getInstance();
    System.out.println(c1);

    Car car1 = new Car();
    Car car2 = new Car();
    System.out.println(car1 == car2);
    car1.model = "tico";
    car1.cc = 980;
    car2.model = "sonata";
    car2.cc = 1980;
    System.out.println(car1.model);
    System.out.println(car2.model);

    //Car2 car3 = new Car2();
    Car2 car3 = Car2.getInstance();
    Car2 car4 = Car2.getInstance();
    System.out.println(car3 == car4);
    // 생성자로 하나만 만들었기 떄문에 car3 와 car4 의 주소가 같음을 알수있다.
  }
}


class Car {
  String model;
  int cc;
}


class Car2 {
  String model;
  int cc;
  static Car2 obj;

  private Car2() {}

  static Car2 getInstance() {
    // 보통 생성자를 private 으로 막는경우는 인스턴스를 한개만 생성하도록 제한하고 싶을때 사용
    if (obj == null) {
      obj = new Car2();
    }
    return obj;
  }
}
