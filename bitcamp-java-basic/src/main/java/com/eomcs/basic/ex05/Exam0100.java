package com.eomcs.basic.ex05;

public class Exam0100 {
  public static void main(String[] args) {
    // 산술연산의 기본 연산단위 int
    // 연산순서 
    // - byte -> short -> int -> long -> float -> double == 연산을 해나갈수록 상위 개념에 포함됨.
    System.out.println(3 / 7 + 5); //기본 연산이int 이므로 앞의 3/7은 0취급;
    byte a = 5, b = 6, c;
    c = a;      // 같은 단위 이므로 저장가능
    c = b;
    // c = a + b; 기본연산이 int 이므로 byte 에 연산을 할 수 없다.
    // boolean type 은 산술연산에 사용할 수 없다.
    int x = 1, y = 2;
    float z = x / y; // = 0; -> 0.5 이지만 float으로 표현 x
    // x,y 는 int 로먼저 연산되므로 float 으로 표시될 수 없다.
    // 이를 해결하기 위해 명시적 형변환 [(float)x / (float)y] 를사용해 데이터값을 float으로 바꿈
    // 이는 데이터를 강제적으로 임시메모리에 저장하는방법으로 , 정확한 값을 출력해내기 어렵다.
    // 저장할 수 없는 부분을 잘라내기 때문에 애초에 정확한값으로 연산되는것이 아니다.
    
    System.out.println(z);
    int m = Integer.MAX_VALUE;
    int n = Integer.MAX_VALUE;
    int o = m + n;
    System.out.println(o);
    // int 값을 더했지만 둘의 합이 데이터 저장범위를 넘어서 int에 저장 불가능한 상황
    long o2 = m + n;
    System.out.println(o2);
    // 데이터 저장 범위를 상위 개념으로 지정해도 우변에서 이미 int값으로 계산을 끝마친상태
    // 명시적 형변환을 통해 변수의 가용범위를 늘려주어야 한다.
    long o3 = (long)m + n; // 이때 long + int의 계산에서 int 가 상위개념인 long으로 암시적형변환됨.
    System.out.println(o3);
    
    float f = 3.14f;
    double d = 2.54;
    long l;
    // l = f + d; 데이터 저장공간은 충분하나 long 으론 부동소수점을 표현할 수 없으므로, 컴파일에러. 
    // long 데이터 저장공간이 크다고 float 계산을 설정할수 있을거라는 착각, 조심.
    float f2 = 3.14f + 5f / 2f;
    System.out.println(f2);
  }
  
}
