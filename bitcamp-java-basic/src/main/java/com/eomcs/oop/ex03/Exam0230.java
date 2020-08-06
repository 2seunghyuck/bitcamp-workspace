package com.eomcs.oop.ex03;

public class Exam0230 {

  static class Calculator {
    int result;

    public void plus(int value) {
      this.result += value;
    }

    public void minus(int value) {
      this.result -= value;
    }


  }

  public static void main(String[] args) {

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(123);
    c1.plus(13);
    c1.plus(123);
    c2.minus(456);

  }
}
