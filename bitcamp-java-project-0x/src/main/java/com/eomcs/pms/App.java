package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;
// 1) 회원의 번호, 이름, 이메일, 암호, 사진, 전화번호, 등록일을 담을 수 있는 메모리를 설계한다.
// - Member 클래스 정의
// 클래스의 시작은 보통 대문자로 시작한다.
// 2) Member 클래스의 레버펀스 배열을 만들어 Member의 인스턴스 배열을 보관한다.
// 3) 레퍼런스 배열을 사용하여 인스턴스를 다루기 보다는 ,
//    낱개의 레퍼런스를 만들어 인스턴스를 다루는 것이 더 간결하다.


public class App {

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
    Scanner keyInput = new Scanner(System.in);
    long currentMillis;

    final int LENGTH = 100;
    Member[] members = new Member[LENGTH]; // Member 클래스를 담을 배열 준비.
    System.out.println("[회원]");
    int count = 0;

    for (int i = 0; i < LENGTH; i++) {
      Member m = new Member();
      count++;
      System.out.print("번호? ");
      m.no = keyInput.nextInt();
      keyInput.nextLine();
      System.out.print("이름? ");
      m.name = keyInput.nextLine();
      System.out.print("이메일? ");
      m.email = keyInput.nextLine();
      System.out.print("암호? ");
      m.password = keyInput.nextLine();
      System.out.print("사진? ");
      m.photo = keyInput.nextLine();
      System.out.print("전화? ");
      m.tell = keyInput.nextLine();
      currentMillis = System.currentTimeMillis();
      m.createdDate = new Date(currentMillis);
      System.out.println();
      System.out.println(m);

      members[i] = m;
      System.out.print("계속 입력하시겠습니까 ?(y/N) ");
      String response = keyInput.nextLine();
      if (response.equalsIgnoreCase("y") == false) {
        break; // 반복문을 멈추는 명령
      }
    }
    keyInput.close();

     System.out.println("---------------------");

     for (int i = 0; i < count; i++) {
       Member m = members[i];
     System.out.printf("%d, %s, %s, %s, %s%n",m.no, m.name, m.email, m.tell, m.createdDate.toString());

     }
  }
}
