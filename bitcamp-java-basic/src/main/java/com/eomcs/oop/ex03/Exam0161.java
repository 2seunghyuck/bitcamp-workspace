package com.eomcs.oop.ex03;

public class Exam0161 {

  static class Member {

    final int GUEST = 0;
    final int MEMBER = 1;
    final int ADMIN = 2;

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
    m1.type = m1.GUEST;

    m2.id = "bbbb";
    m2.password = "2222";
    m2.type = m2.MEMBER;

    m3.id = "cccc";
    m3.password = "3333";
    m3.type = m3.ADMIN;


  }
}
