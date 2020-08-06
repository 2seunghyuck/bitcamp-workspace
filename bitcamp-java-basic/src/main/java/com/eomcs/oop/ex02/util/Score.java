package com.eomcs.oop.ex02.util;

public class Score {
  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float avg;

  public void compute() {
      this.sum = this.kor + this.eng + this.math;
      this.avg = this.sum / 3f;

    }
}
