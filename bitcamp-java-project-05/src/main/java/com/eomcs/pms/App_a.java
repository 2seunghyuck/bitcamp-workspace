package com.eomcs.pms;

import java.sql.Date;
//클래스의 패키지 정보를 미리선언하여 컴파일러에게 알려준다.
import java.util.Scanner;
// 1) 회원의 번호, 이름, 이메일, 암호, 사진, 전화번호, 등록일을 담을 수 있는 메모리를 설계한다.
//    - Member 클래스 정의
// 클래스의 시작은 보통 대문자로 시작한다.

public class App_a {

  public static void main(String[] args) {
    // 값을 담을 메모리를 준비할 때. 어떤 종류의 메모리를 준비해야하는지 설계도를 작성한다
    // => 클래스 정의라 한다.
    class Member{
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tell;
      Date now;

    }
    Scanner keyInput = new Scanner(System.in);
    System.out.println("[회원]");

    final int MAX_LENGTH = 5; // 변수 앞에 final을 붙여 수를 변화못시키게 막고 대문자로 강조;
    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] password = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tell = new String[MAX_LENGTH];
    Date[] now = new Date[MAX_LENGTH];
    long currentMillis;
    int count = 0;

    for (int i = 0; i < MAX_LENGTH; i++) {
      count ++;
      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();
      System.out.print("이름? ");
      name[i] = keyInput.nextLine();

      System.out.print("이메일? ");
      email[i] = keyInput.nextLine();

      System.out.print("암호? ");
      password[i] = keyInput.nextLine();

      System.out.print("사진? ");
      photo[i] = keyInput.nextLine();

      System.out.print("전화? ");
      tell[i] = keyInput.nextLine();

      currentMillis = System.currentTimeMillis();
      now[i] = new Date(currentMillis);

      System.out.print("계속 입력하시겠습니까 ?(y/N) ");
      String response = keyInput.nextLine();
      if (response.equalsIgnoreCase("y") == false) {
        break; // 반복문을 멈추는 명령
      }
    }
    keyInput.close();

    System.out.println("---------------------");

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s%n", no[i], name[i], email[i], password[i], photo[i], tell[i], now[i].toString());
      }
  }
}
