// 주제: 문자 리터럴 III

package com.eomcs.basic.ex03;

class Exam0430 {
  public static void main(String[] args) {
    
    System.out.println(0x0041); // 숫자취급
    System.out.println(0x41);   // 00없어도 됨
    System.out.println((char)0x0041); // 2진수를 유니코드 에대응하는 문자열로 변경
    System.out.println('A'); // A에 대응하는 코드를 변환해서 다시 문자로 출력
    System.out.println((int)'A'); // 출력한 문자를 다시 코드의 숫자로 변환
    System.out.println('A' + 1); // 
    System.out.println('A' + '1'); 
    System.out.println((char)('A' + '1'));
    System.out.println("------------------------");
    
    // 'A' 에서부터 'z'사이에있는 유니코드 문자값을 출력한다. 
    for (int i = '\"'; i <= 'A'; i++) {
      System.out.println((char)i);
      
    }
  }
}

// '' 사이의 문자는 코드로 변환되어 출력되기 때문에 사이의 코드문자들을 나타낼 수 있다.