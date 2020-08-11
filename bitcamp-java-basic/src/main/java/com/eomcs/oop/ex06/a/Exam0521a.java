package com.eomcs.oop.ex06.a;

public class Exam0521a {
  public static void print(Vehicle v) {
    System.out.println("[기본정보]");
    System.out.println("모델명 : "+ v.model);
    System.out.println("수용인원 : "+ v.capacity);

    if (v instanceof Bike) {
      Bike b = (Bike) v;
      System.out.println("[바이크 정보]");
      System.out.println("엔진의 존재 : " + b.engine);
    } else if (v instanceof Car) {
      Car c = (Car) v;
      System.out.println("[자동차 기본정보]");
      System.out.println("cc : "+ c.cc);
      System.out.println("밸브 : "+ c.valve);
      if (v instanceof Sedan) {
        Sedan s = (Sedan) v;
        System.out.println("[승용차 기본정보]");
        System.out.println("썬루프 : " + s.sunroof);
        System.out.println("자동변속 : " + s.auto);
      } else if (v instanceof Truck) {
        Truck t = (Truck) v;
        System.out.println("[트럭 정보]");
        System.out.println("덤프가능 : " + t.dump);
        System.out.println("중량 : " + t.ton);
      }
    }
    System.out.println("----------------------");

  }
  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();

    b.model = "비트오토바이 2018";
    b.capacity = 2;
    b.engine = true;

    s.model = "티코";
    s.capacity = 5;
    s.cc = 800;
    s.valve = 16;
    s.sunroof = true;
    s.auto = true;

    t.model = "타이탄II";
    t.capacity = 3;
    t.cc = 10000;
    t.valve = 32;
    t.dump = true;
    t.ton = 15f;

    c.model = "차";
    c.cc = 125;
    c.capacity = 2;

    print(b);
    print(s);
    print(t);
    print(c);

  }
}
