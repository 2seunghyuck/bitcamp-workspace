package com.eomcs.basic.ex07;

import java.util.Properties;
import java.util.Set;

public class Exam0511 {

  // 실행하는 클래스는 다음과 같이 main() 메서드의 시그니처(signature)를 가져야 한다.
  // => method signature == function prototype == 메서드 선언
  // => parameter의 이름은 상관없다.
  // args 라는 파라미터는 프롬프터에서 값을 받는다.
  public static void main(String[] args) {
    System.out.println(args.length);
    System.out.println("-----------------------");
    for (String str : args) {
      System.out.println(str);
    }
    // JVM 아규먼트
    // > java -D이름=값 -D이름=값 Exam0511
    String s1 = System.getProperty("name");
    String s2 = System.getProperty("age");
    System.out.println(s1);
    System.out.println(s2);

    System.out.println("---------------------");
    // JVM의 전체 프로퍼티 목록
    // -JVM의 기본 환경변수
    Properties props = System.getProperties();
    Set keyList =  props.keySet();
    for (Object key : keyList) {
      System.out.printf("%s --> %s\n", key, System.getProperty((String)key));
    }

  }

}
