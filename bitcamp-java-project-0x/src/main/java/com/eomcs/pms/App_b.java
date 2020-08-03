package com.eomcs.pms;

import java.sql.Date;
// 1) 회원의 번호, 이름, 이메일, 암호, 사진, 전화번호, 등록일을 담을 수 있는 메모리를 설계한다.
// - Member 클래스 정의
// 클래스의 시작은 보통 대문자로 시작한다.
// 2) Member 클래스의 레버펀스 배열을 만들어 Member의 인스턴스 배열을 보관한다.
import java.util.Scanner;

public class App_b {

  public static void main(String[] args) {
    // 값을 담을 메모리를 준비할 때. 어떤 종류의 메모리를 준비해야하는지 설계도를 작성한다
    // => 클래스 정의라 한다.
    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tell;
      Date createdDate;
    }
    final int LENGTH = 100;
    Member[] members = new Member[LENGTH]; // Member 클래스를 담을 배열 준비.
    long currentMillis;
    Scanner keyInput = new Scanner(System.in);
    System.out.println("[회원]");
    int count = 0;

    for (int i = 0; i < LENGTH; i++) {
      members[i] = new Member();
      count++;
      System.out.print("번호? ");
      members[i].no = keyInput.nextInt();
      keyInput.nextLine();
      System.out.print("이름? ");
      members[i].name = keyInput.nextLine();

      System.out.print("이메일? ");
      members[i].email = keyInput.nextLine();

      System.out.print("암호? ");
      members[i].password = keyInput.nextLine();

      System.out.print("사진? ");
      members[i].photo = keyInput.nextLine();

      System.out.print("전화? ");
      members[i].tell = keyInput.nextLine();

      currentMillis = System.currentTimeMillis();
      members[i].createdDate = new Date(currentMillis);

      System.out.print("계속 입력하시겠습니까 ?(y/N) ");
      String response = keyInput.nextLine();
      if (response.equalsIgnoreCase("y") == false) {
        break; // 반복문을 멈추는 명령
      }
    }
    keyInput.close();

     System.out.println("---------------------");

     for (int i = 0; i < count; i++) {
     System.out.printf("%d, %s, %s, %s, %s, %s, %s%n", members[i].no, members[i].name, members[i].email, members[i].tell, members[i].createdDate);

     }
  }
}
