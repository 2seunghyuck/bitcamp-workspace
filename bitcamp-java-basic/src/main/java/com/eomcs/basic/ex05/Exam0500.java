package com.eomcs.basic.ex05;

public class Exam0500 {
  public static void main(String[] args) {
    //조건 연산자 ( ? : )
    int age = 30;
    String result = age > 20 ? "성인" : "미성년";
    System.out.printf("나이 %d 는(은) %s 이다.", age, result);
    
    // 증감 연산자  ++, --
    int i = 5;
    int j;
    int oper;
    i++; // 현재까지 i에는 5, 다음항이 실행될 때 6이됨...
    System.out.println(i); // 라인이 넘어갔으므로 현재 i는 6.
    System.out.println(i++); // 현재 i는 6, 다음항이 계산될 때 1이 추가됨.
    j = i + 3;              // 이전에 연산을마친 i(7)에 3을더하므로 j엔 10이 할당됨을 알수있다. 
    System.out.println(j);
    // 후위 증감연산자의 응용
    oper = i++ + i-- * i++ / i--; // 현재 7이할당된 i에 
    //     7   + 8   * 7   / 8    이 됨.
    System.out.println(oper);
    // 전위 증감연산자는 생각의 흐름대로 하면됨.
    i = 5;
    ++i; // ++연산을 실행한 후 현재상태로 만듬 ==> 6
    System.out.println(i); // 현재 i는 6.
    System.out.println(++i); // ++연산 실행후 7이 저장됨.
    j = i + 3;              // 이전에 연산을마친 i(7)에 3을더하므로 j엔 10이 할당됨을 알수있다. 
    System.out.println(j);
    
    // 할당 연산자
    // +=  -=  *=  /=  %=  &=  |=  ^=  <<=  >>=  >>>=
    i = 5;
    // i += 10; ==> i = i + 10; 과같다, 문장을 간략하게 나타내기 위해 사용.
    i *= 3;
    System.out.println(i);
    i >>= 2;
    i -= 100;
    i >>>= 2; // 음수였던 i에 비트를 오른쪽으로 2칸 이동하며 양수가 됨;
    System.out.println(i);
    // 증감연산자는 리터럴에는 적용할 수 없다. 변수 only.
    
  }
}
