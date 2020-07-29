package com.eomcs.basic.ex05;
public class Exam0400 {
  public static void main(String[] args) {
    // 비트이동 연산자 <<, >>, >>>
    // << x 비트를 왼쪽으로 x 칸 만큼이동
    int i = 7; // 0000 0000 0000 0000 0000 0000 0000 0111
    System.out.println(i << 1);
    // 0000 0000 0000 0000 0000 0000 0000 1110 => 14 출력

    // >> x 비트를 오른쪽으로 x칸 만큼 이동 (왼쪽에 남은 빈공간은 부호에 맞게 채워짐)
    System.out.println(i >> 1);
    // 0000 0000 0000 0000 0000 0000 0000 0011 => 3 출력
    // >>> x 비트를 오른쪽으로 x 칸만큼 이동 (왼쪽에 남은 빈공간을 0으로출력, 음수인경우에도)
    System.out.println(i >>> 1);
    // 0000 0000 0000 0000 0000 0000 0000 0011 => 3 출력
    
    //원하는 비트의 값 출력하기 비트 이동 사용,
    int p = 0xaabbccdd; // 1010 1010 1011 1011 1100 1100 1101 1101
    int a, b, c, d;
    a = (p >>> 24);
    b = (p >> 16 & 0xff);
    c = (p >> 8 & 0xff);
    d = (p & 0xff);
    System.out.println(Integer.toHexString(a));
    System.out.println(Integer.toHexString(b));
    System.out.println(Integer.toHexString(c));
    System.out.println(Integer.toHexString(d));
    // 원하는 위치에 true false 지정하기
    boolean C, cpp, java, js, python, php, html, css;
    C = true;
    cpp = false;
    java = true;
    js = false;
    python = true;
    php = false;
    html = true;
    css = false;
    boolean[] lang = new boolean[8];
    lang[0] = true;
    lang[1] = false;
    lang[2] = true;
    lang[3] = false;
    lang[4] = true;
    lang[5] = false;
    lang[6] = true;
    lang[7] = false;
    
  }
  
}
