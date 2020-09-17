// Byte Stream - 바이트 단위로 출력하기
package com.eomcs.io.ex02;

import java.io.FileOutputStream;

public class Exam0111 {

  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/test1.data");
    out.write(0x7a6b5c4d);
    out.close();
    System.out.println(",,");

  }
}