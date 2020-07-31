package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class test2 {
  public static void main(String[] args) {
    
    Scanner keyInput = new Scanner(System.in);
    final int MAX_LENGTH = 100;
    int[] num = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] pwd = new String[MAX_LENGTH];
    String[] pic = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] now = new Date[MAX_LENGTH];
    long currentMillis;
    int count = 0;
    
    System.out.println("[회원가입]");
    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      System.out.print("회원번호? ");
      num[i] = keyInput.nextInt();
      keyInput.nextLine();
      System.out.print("이름? ");
      name[i] = keyInput.nextLine();
      System.out.print("이메일? ");
      email[i] = keyInput.nextLine();
      System.out.print("비밀번호? ");
      pwd[i] = keyInput.nextLine();
      System.out.print("사진? ");
      pic[i] = keyInput.nextLine();
      System.out.print("전화번호? ");
      tel[i] = keyInput.nextLine();
      currentMillis = System.currentTimeMillis(); // 안외어진다.
      now[i] = new Date(currentMillis);
      
      System.out.println("계속 입력하시겠습니까? (y/N)");
      String response = keyInput.nextLine();
      if (response.equalsIgnoreCase("y") == false) {
        break;
      }
    }
      System.out.println("----------------------------------------");
      
      for(int i = 0; i < count; i++) {
        System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", num[i], name[i], email[i], pwd[i], pic[i], tel[i], now[i]);
        }

  }
}
