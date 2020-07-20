package com.eomcs.basic;
class Hello2 {
    public static void main(String[] args) {
        System.out.println("com/eomcs/basic/Hello2.java");
        System.out.println("Hello, World!");
    }
}

// 주제: 폴더를 구분하여 소스파일 관리하기
// - 소스파일을 단순히 폴더를 구분하여 분리한다고해서 
//   관리할 수 있는게 아니다.
// - 컴파일하면 단순히 한 폴더에 놓여진다.
// - package 명령을 사용하여 클래스의 소속(폴더생성)을 지정해야 한다.