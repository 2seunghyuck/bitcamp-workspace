package com.eomcs.oop.ex04;

public class Exam0210 {
  public static void main(String[] args) throws Exception {

    String s1 = new String("Hello!");
    String s2 = new String("ABC가각");
    // 인스턴스 메서드
    // - non-static method
    // - instance 주소를 가지고 호출해야한다.
    // - this 라는 내장 변수를 가지고있다.
    // - 특정 인스턴스의 변수를 다루는 메서드 ..

    char c1 = s1.charAt(1); // s1 의 1번째 문자를 출력.
    System.out.println(c1);
    char c2 = s2.charAt(1);
    System.out.println(c2);


    System.out.println(s1.compareTo(s2)); // 해당 문자열과 비교한 차이를 숫자로 출력 -> 보통 숫자보다는 크기비교.

    System.out.println(s1.contains("ll")); // 파라미터로 입력받은 문자열이 s1에 포함되어있는지를 검사함.
    System.out.println(s2.contains("ll"));
    System.out.println(s1.equals(s2)); // 두 문자열을 비교해서 true false 로 출력
    System.out.println("----------------------------");
    byte[] bytes = s1.getBytes();
    for (byte b : bytes) {
      System.out.println(Integer.toHexString(b)); //
    }

    byte[] bytes2 = s2.getBytes(); // JVM(UTF-16) 으로 저장 ==> OS기본 문자표 (linus/unix == UTF-8 ,
                                   // Windows == MS949)
    // "ABC가각"
    // linux/unix == 41 42 43 [ea b0 80] [ea b0 81]
    // Windows == 41 42 43 [b0 a1] [b0 a2]
    for (byte b2 : bytes2) {
      System.out.println(Integer.toHexString(b2 & 0xff)); // byte를 4byte 로 출력해서 부호비트에 따라 앞의 3바이트를
                                                          // 채우므로 , 없애줌 &
    }

    byte[] bytes3 = s2.getBytes("MS949"); // 파라미터에 인코딩할 문자표를 지정해줌
    for (byte b3 : bytes3) {
      System.out.println(Integer.toHexString(b3 & 0xff));
    }

    String s3 = String.format("%s님 방가!", "홍길동");
    System.out.println(s3);
    String s4 = String.join(",", "홍길동", "임꺽정", "유관순");
    System.out.println(s4);

    //값을 문자열로 리턴함 ==> 주소값을 리턴하는거지만,
    String s5 = String.valueOf(true);
    String s6 = String.valueOf(100);
    String s7 = String.valueOf(3.14f);
    System.out.printf("%s, %s, %s\n", s5, s6, s7);

  }
}
