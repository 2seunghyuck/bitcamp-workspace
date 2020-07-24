package com.eomcs.pms;

public class App2 {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    System.out.println("[프로젝트]");
    System.out.print("번호? ");
    int no = keyInput.nextInt();
    keyInput.nextLine();
    
    System.out.print("프로젝트명? ");
    String name = keyInput.nextLine();
    
    System.out.print("내용? ");
    String main = keyInput.nextLine();
    
    System.out.print("시작일? ");
    java.sql.Date start = java.sql.Date.valueOf(keyInput.nextLine());
    //입력받은 날을 표준화 시키기위해 도구를 사용한다.
    System.out.print("종료일? ");
    java.sql.Date end = java.sql.Date.valueOf(keyInput.nextLine());
    
    System.out.print("만든이? ");
    String prod = keyInput.nextLine();
    
    System.out.print("팀원? ");
    String coop = keyInput.nextLine();
    keyInput.close();
    System.out.println("-------------");
    
    System.out.printf("번호: %d\n", no);
    System.out.printf("프로젝트: %s\n", name );
    System.out.printf("내용: %s\n", main);
    System.out.printf("시작일: %s\n", start.toString());
    System.out.printf("종료일: %s\n", end.toString());
    System.out.printf("만든이: %s\n", prod);
    System.out.printf("팀원: %s\n", coop);
    
  }
}
