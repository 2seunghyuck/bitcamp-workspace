package com.eomcs.corelib.ex01;

import java.util.HashMap;

public class Exam0154a {
  public static void main(String[] args) {
    HashMap<String, Student>map = new HashMap<>();
    String k1 = new String("a");
    String k2 = new String("b");
    String k3 = new String("c");

    System.out.println(k1 == k2);
    System.out.println(k2 == k3);

    map.put(k1, new Student("홍길동", 20, false));
    map.put(k2, new Student("임꺽정", 30, true));
    map.put(k3, new Student("유관순", 17, true));

    map.put("e", new Student("안중근", 24, true));
    map.put("d", new Student("윤봉길", 22, false));

    System.out.println(map.get(k1));
    System.out.println(map.get(k2));
    System.out.println(map.get(k3));
    System.out.println(map.get("d"));
    System.out.println(map.get("e"));
  }
}
