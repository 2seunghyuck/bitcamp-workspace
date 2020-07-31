package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tell;
      Date createdDate;
    }
    final int MAX_LENGTH = 100;
    int count = 0;
    long currentMillis;

    Scanner keyInput = new Scanner(System.in);
    Member[] members = new Member[MAX_LENGTH];

    System.out.println("[회원]");
    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      Member m = new Member();

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
      currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 부터 지나온 시간기
      m.createdDate = new Date(currentMillis);

      members[i] = m;

      System.out.println("계속 입력 하겠습니까 ? (y/N)");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;
    }
    keyInput.close();
    System.out.println("---------------------");
    for (int i = 0; i < count; i++) {
      Member m = members[i];
      System.out.printf("%d, %s, %s, %s, %s\n", m.no, m.name, m.email, m.tell, m.createdDate);
    }
  }
}
