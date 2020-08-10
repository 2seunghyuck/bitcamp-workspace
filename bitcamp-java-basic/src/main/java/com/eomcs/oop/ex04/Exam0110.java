package com.eomcs.oop.ex04;


public class Exam0110 {
  public static void main(String[] args) throws Exception {

    String s1 = new String();
    System.out.println("=>" + s1);

    String s2 = new String("Hello!"); // => char type의 'H''e''l''l''o''!'로 주소에 저장
    System.out.println("=>" + s2);

    char[] chars = new char[] {'H', 'e', 'l', 'l', 'o', '!', '!'};
    String s3 = new String(chars); // char배열도 문자열으로 받을 수 있다.
    System.out.println("=>" + s3);

    byte[] bytes = new byte[] {0x41, 0x42, (byte) 0xEA, (byte) 0xB0, (byte) 0x80, (byte) 0xEA,
        (byte) 0xB0, (byte) 0x81};
    String s4 = new String(bytes, "UTF-8");
    System.out.println("=>" + s4);
    byte[] bytes2 = new byte[] {0x41, 0x42, (byte) 0xB0, (byte) 0xA1, (byte) 0xB0, (byte) 0xA2,
        (byte)0xB6, (byte) 0xCA,(byte)0x8C, (byte)0x63, (byte) 0xB6, (byte) 0xCB};
    String s5 = new String(bytes2, "EUC-KR"); // 뒤에 명시된 규칙에 맞게 인코딩 됨.
    System.out.println("=>" + s5);
    String s6 = new String(bytes2, "MS949"); // 뒤에 명시된 규칙에 맞게 인코딩 됨.
    System.out.println("=>" + s6);
    // MS949(11172자) = EUC-KR(2350자) + x(추가) ==> EUC-KR 로 표시할 수 없는 문자를 추가한것.
  }
}

// data type 이 byte로 넘어오는 경우가 많으므로, 어떤 방식으로 인코딩했는지 파악하는것도 중요하다.
