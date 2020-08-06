package com.eomcs.oop.util;

public class Calculator2 {

  public int result = 0;


  public static void plus(Calculator2 that, int value) {
    that.result += value;
  }
  public static void minus(Calculator2 that, int value) {
    that.result -= value;
  }
  public static void multiple(Calculator2 that, int value) {
    that.result *= value;
  }
  public static void divide(Calculator2 that, int value) {
    that.result /= value;
  }
 }
