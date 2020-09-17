// Byte Stream - 바이트 단위로 읽기
package com.eomcs.io.ex02;

import java.io.FileInputStream;

public class Exam0121 {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/test1.data");
    int b = in.read();
    in.close();
    System.out.printf("%x\n", b);
  }
}