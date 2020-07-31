package com.eomcs.pms;

public class App3_a {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    System.out.println("[작업]");
    
    System.out.print("프로젝트? ");
    String proj = keyInput.nextLine();
    
    System.out.print("번호? ");
    String str = keyInput.nextLine();
    int no = Integer.parseInt(str);   //입력값을 문자로 받아서 숫자로 리턴해줌

    System.out.print("내용? ");
    String text = keyInput.nextLine();
    
    System.out.print("완료일? ");
    java.sql.Date end = java.sql.Date.valueOf(keyInput.nextLine());
    
    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    String stat = keyInput.nextLine();
    
    System.out.print("담당자? ");
    String engi = keyInput.nextLine();
    keyInput.close();
    
    System.out.println("-------------");
    System.out.printf("프로젝트: %s%n", proj);
    System.out.printf("번호: %d%n", no);
    System.out.printf("내용: %s%n", text);
    System.out.printf("완료일: %s%n", end);
    System.out.printf("상태: ");

    //    if (stat.equals("0")) {
    //      System.out.println("신규");
    //    } else if (stat.equals("1")) {
    //      System.out.println("진행중");
    //    } else {
    //      System.out.println("완료");
    //    }

    switch (stat) {
      case "0":
        System.out.println("신규");
        break;
      case "1":
        System.out.println("진행중");
        break;
      default:
        System.out.println("종료");
    }
    
    System.out.printf("담당자: %s%n", engi);
  }
}
//String 문자열입력을 받을 리터럴을 비교할때 [a == b] 말고 [a.equals("b")] 해야함.

