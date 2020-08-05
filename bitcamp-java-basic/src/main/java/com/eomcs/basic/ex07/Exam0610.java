package com.eomcs.basic.ex07;

public class Exam0610 {


  public static void main(String[] args) {

    // JVM 아규먼트를 사용하기 위해선 프롬프터를 실행해서 클래스파일을 실행해야 한다.
    // 명령어 -D이름=값 -D이름=값 .... => 실행순서대로 저장된다.
    String value1 = System.getProperty("a");
    String value2 = System.getProperty("b");
    String value3 = System.getProperty("c");
    // java -cp bin/main -Da=10 -Db=20 -Dc=30 com.eomcs.basic.ex07.Exam0610
    System.out.println(value1);
    System.out.println(value2);
    System.out.println(value3);
  }
}
