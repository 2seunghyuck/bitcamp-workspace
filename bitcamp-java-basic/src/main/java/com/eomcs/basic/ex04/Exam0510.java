package com.eomcs.basic.ex04;

public class Exam0510 {
  public static void main(String[] args) {

    int[] p = new int[3]; // c 언어 => (int*)malloc(sizeof(int) * 3);과 같다
    // p - int 배열의 주소를 담는 변수이다.
    // 자바에서 '레퍼런스라' 부른다.
    //
    // new int[3]
    // - int 변수를 연속해서 3개 확보한다.
    // - 메모리를 확보한 후 리턴값은 그 메모리의 시작주소이다.

    // 배열의 갯수 알아내기 [배열이름.length]
    System.out.println(p.length);
    // 배열의 주소가 없는상태에서 사용하지 말아라
    // int[] x;
    // System.out.println(x.length); 컴파일 오류

    // 배열에 값 저장
    p[0] = 100;
    p[1] = 200;
    p[2] = 300;

    System.out.printf("%d, %d, %d\n", p[0], p[1], p[2]);

    // p[3] = 400; // 자바에서는 배열에 지정되지 않은 값을 실행할 수 없다.
    // p[-1] = 500; // 실행 예외 발생. (runtime exception)

    int sum = 0;
    for (int i = 0; i < p.length; i++) {
      sum = sum + p[i];
    }
    System.out.println(sum);

    // 배열 레퍼런스를 선언하는 방법
    int[] p2; // 자바에서주로 사용하는 방식

    int p3[]; // C 언어에서 주로사용하는 방식이지만 자바에서도 사용 가능
              // 단 갯수를 지정해서는 안된다.
    p2 = p; // p레퍼런스에 저장된 주소를 p2에 복사한다.

    p2[1] = 1000;
    System.out.println(p[1]);

    p = new int[4];
    p[1] = 2000;
    System.out.printf("%d, %d\n", p[1], p2[1]);
    // System.out.println(p3[1]); 메모리 주소를 지정하지 않았으므로 컴파일 오류.

    // new 명령으로 확보한 메모리 -> 인스턴스(instance)
    // instance의 주소를 저장하는 변수 -> 레퍼런스(reference)

    // 레퍼런스 변수의 주소값을 0으로 초기화하기
    // p2 = 0; // 직접적으로 0이라는 숫자를 넣어 초기화할 수 없다.
    p2 = null; // 레퍼런스를 0으로 초기화 시키려면 null 을 사용해야한다;

    int k1;
    // System.out.println(k1); // 변수를 초기화 시키지 않고 사용하면 컴파일 오류남;

    int[] k2 = new int[3];
    // new명령으로 메모리를 준비할 때, 모든 메모리는 0으로 자동 초기화 된다.
    // 따라서 따로 초기화 할필요없이, 바로 사용할 수 있다.
    System.out.println(k2[0]);
    System.out.println(k2[1]);
    System.out.println(k2[2]);

    // 배열생성 후 즉시 초기화 하기
    int[] k3 = new int[] {100, 200, 300};
    // 자동으로 3개의 배열을 지정하여 {}안의 값, 100,200,300으로 지정.
    // 이때 new int[]안에 개수를 지정하면 오류.
    int[] k4;
    k4 = new int[] {10, 20}; // <- 이런식으로도 지정 가능.
    
    int[] k5 = {11, 12, 13}; //<- new int[]명령어 생략 가능. 컴파일 과정에서 new int[] 자동으로 처리됨
    int[] k6;
    //k6 = {111, 222, 333}; <- 이건 안됨, 변수선언과 한줄에서 처리할때만 가능한생략법.
    
    
    int[] x1 = new int[3];
    int[] x2 = new int[4];
    int[] x3 = x1;
    x2 = x1;
    // 결론적으로 x2에 할당된 메모리 가 사용 못하게 되므로 이를 garbage라고함. (c언어에선 dangling object 라고함)
    // garbage 는 JVM이 자동으로해제시킨다. 
    // 1) 메모리가 부족할때.
    // 2) 시스템이 한참동안 한가할때.
    // => 결론 가비지를 언제 해지시키는지는 알수가 없다.
    System.gc();
    // 가능한 빠른시일내에 가비지 관리를하라는 명령, 이 명령을 실행한다고 가비지를 한번에 지우는것은 아님.
    // 좀더 효율적으로 관리하는방법일 뿐 바로 실행되는것은 아님.
    
  }
}
