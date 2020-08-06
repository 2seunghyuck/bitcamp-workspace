package com.eomcs.oop.ex03;

public class Exam0410 {

  static class Smartphone {

    int volume;
    int bright;
    int contrast;
    void playMusic() {

    }
    // 생성자(constructor) 란
    // - 인스턴스를 만든후 사용하기 전에 적절한 값으로 초기화시킬 필요가 있다.
    // - (제품을 만든 후에 제품이 제품이 구동되는데 문제가 없도록 기본값으로 설정되어야한다.)
    // - 인스턴스를 사용하기 전에 적절한 값으로 초기화 시키는 메서드

    // 생성자 문법
    // - 클래스명(파라미터, ..) {}
    // - 생성자를 선언할 때는 리턴 타입을 지정하지 않는다.
    //
    // 모든 클래스는 반드시 한개 이상의 생성자를 가져야 한다.
    // - 개발자가 생성자를 작성하지 않으면 컴파일러가 기본생성자를 자동으로 추가한다.
    // 기본생성자 (default constructor)
    //  - 파라미터가 없는 생성자
    //  - public으로 공개된다.
    //  ex) public 클래스명() {}
    // 이클래스에 생성자를 정의하지 않으면 다음과 같이 기본생성자가 추가된다.
    //   >> public Smartphone() {}

  }
  public static void main(String[] args) {
    // 인스턴스를 생성할때 호출될 생성자를 지정해야한다.
    // 안하면 문법 오류
    // new A;
    // => new 클래스명(생성자에넘겨줄 값);
    // ex) new A(); <--- 생성자의 파라미터가 없기때문에 값을 넘겨주지 안흔다.
    // ex) new A(100); <--- 생성자의 파라미터가 int이기 때문에 정수값을 넘긴다.

    //Smartphone obj1 = new Smartphone; <- 컴파일 오류 생성자를 지정하지 않았음

    // 다음과같이 존재하지 않는 생성자를 지정하면 문법오류
    // Smartphone onj1 = new Smartphone(100); < == int 파라미터를 가질 생성자가 없다.

    // Smartphone 인스턴스를 만들때 기본생성자가 호출되게 한다.
    Smartphone obj1 = new Smartphone();

    obj1.playMusic();
    System.out.println(obj1.volume);
    System.out.println(obj1.bright);
    System.out.println(obj1.contrast);
  }
}
