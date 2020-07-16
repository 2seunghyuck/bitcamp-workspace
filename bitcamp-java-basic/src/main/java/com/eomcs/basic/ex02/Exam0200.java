// Exam0200.java
// 주제: javaodc 주석

package com.eomcs.basic.ex02;

/**
클래스에 대한 설명
클래스에 대한 설명
<p>중간에 HTML 태그를 넣을 수 있다</p>
클래스에 대한 설명

@author 홍길동

 */

public class Exam0200 {
    /**
    필드에 대한 설명<br>
    <b>필드에</b> 대한 설명<br>
     */
    int a;

    /** 
    메서드에 대한 설명<br>
    <i>메서드에</i>에 대한 설명 <br>
    메서드에 대한 설명
    @param args 파라미터에 대한 설명
    */
    
     public static void main(String[] args) {


     }

     /**
     메서드 설명
     메서드 설명...ok!
      */
      public void m() {

      }
}

//## 실습
//1) Java Document 만들기
//- javadoc.exe 도구를 사용하여 자바 소스 파일에서 Javadoc 주석을 추출하여 HTML 파일을 생성해 보자.
//     javadoc 
//       -encoding [소스 파일의 문자집합]
//       -charset [생성될 HTML 파일의 문자집합]
//       -d [생성된 파일을 놓아둘 디렉토리] 
//       -sourcepath [자바 소스 경로] [자바 패키지]
//예) $ javadoc -encoding UTF-8 -charset UTF-8 -d javadoc -sourcepath src/main/java com.eomcs.basic.ex02
//
//2) Javadoc으로 생성한 HTML 문서 확인하기
//- /javadoc 디렉토리를 보면 자바 소스 파일에서 추출한 Javadoc 으로 만든 HTML 문서를 확인할 수 있다.

// 클래스에대한 메뉴얼 만들때 이용; 

