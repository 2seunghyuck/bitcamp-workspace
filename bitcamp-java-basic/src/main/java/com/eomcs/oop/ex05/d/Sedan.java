package com.eomcs.oop.ex05.d;

public class Sedan extends Car {
  // model, maker, capacity 는 변수 초기화 하지 않앗지만
  // extends로 = > 상속 받았으므로 this. 명령으로 사용 가능해졌다.
  boolean sunroof;
  boolean auto;

  public Sedan(String model, String maker, int capacity, boolean sunroof, boolean auto) {
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;
    this.sunroof = sunroof;
    this.auto = auto;
  }

}
