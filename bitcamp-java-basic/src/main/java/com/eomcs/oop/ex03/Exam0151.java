package com.eomcs.oop.ex03;

public class Exam0151 {

  static class Student {
    // 학생정보가 아닌 클래스를 이용한 숫자를 세는것.
    // 따라서 공통으로 저장되는(모든 인스턴스 변수와 공유하는) 클래스 필드에 count 를배정한다.
    static int count;

    String name;
    int age;
  }

  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();

    s1.name = "홍길동";
    s1.age = 54;
    Student.count++;

    s2.name = "임꺽정";
    s2.age = 66;
    Student.count++;




    System.out.printf("%s, %d\n", s1.name, s1.age);
    System.out.printf("%s, %d\n", s1.name, s2.age);
    System.out.println(Student.count);

  }
}
