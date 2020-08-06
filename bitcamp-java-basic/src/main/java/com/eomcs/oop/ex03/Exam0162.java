package com.eomcs.oop.ex03;

public class Exam0162 {

  static class Member {

    static final int GUEST = 0;
    static final int MEMBER = 1;
    static final int ADMIN = 2;

    String id;
    String password;
    int type; // 0 : 손님, 1 : 회원, 2 : 관리자
  }
  public static void main(String[] args) {

    Member m1 = new Member();
    Member m2 = new Member();
    Member m3 = new Member();

    m1.id = "aaa";
    m1.password = "1111";
    m1.type = Member.GUEST; // 클래스 변수 대신 레퍼런스를 사용할 순 있지만.하지마라
                            // 레퍼런스 변수를 사용하면, 인스턴스 변수로 착각할 수도있으니...

    m2.id = "bbbb";
    m2.password = "2222";
    m2.type = Member.MEMBER;

    m3.id = "cccc";
    m3.password = "3333";
    m3.type = Member.ADMIN;


  }
}
