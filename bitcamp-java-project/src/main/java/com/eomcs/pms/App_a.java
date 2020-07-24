package com.eomcs.pms;

//클래스의 패키지 정보를 미리선언하여 컴파일러에게 알려준다.
import java.util.Scanner;
import java.sql.Date;
// 1)낱개의 변수를 사용하여 여러 회원 정보 처리하기
public class App_a {

  public static void main(String[] args) {
    
    java.util.Scanner keyInput = new Scanner(System.in);
    System.out.println("[회원]");
    
    // 최대 5명의 회원 정보를 입력받을 변수를 선언한다.
    int no1, no2, no3, no4, no5;
    String name1, name2, name3, name4, name5;
    String email1, email2, email3, email4, email5;
    String password1, password2, password3, password4, password5;
    String photo1, photo2, photo3, photo4, photo5;
    String tell1, tell2, tell3, tell4, tell5;
    Date now1, now2, now3, now4, now5;
    long currentMillis;
    
    System.out.print("번호? ");
    no1 = keyInput.nextInt();
    keyInput.nextLine();
    System.out.print("이름? ");
    name1 = keyInput.nextLine(); 
    
    System.out.print("이메일? ");
    email1 = keyInput.nextLine();
    
    System.out.print("암호? ");
    password1 = keyInput.nextLine();
    
    System.out.print("사진? ");
    photo1 = keyInput.nextLine();

    System.out.print("전화? ");
    tell1 = keyInput.nextLine();
    
    //가입일은 현재시간을 기준하기 때문에 기입하는 명령
    currentMillis = System.currentTimeMillis();
    now1 = new Date(currentMillis);
    // String reg = keyInput.nextLine(); 현재시간을 나타내므로 직접 입력받을 필요가 없다.
//    System.out.print("계속 입력하시겠습니까 ?(y/N) ");
//    String response = keyInput.nextLine();
//    
//    if (response.equals("y")) {
//      //추가로 회원정보를 입력받는다.
//    }
    System.out.println("");
    // 2번 회원 입력
    System.out.print("번호? ");
    no2 = keyInput.nextInt();
    keyInput.nextLine();
    System.out.print("이름? ");
    name2 = keyInput.nextLine(); 
    
    System.out.print("이메일? ");
    email2 = keyInput.nextLine();
    
    System.out.print("암호? ");
    password2 = keyInput.nextLine();
    
    System.out.print("사진? ");
    photo2 = keyInput.nextLine();

    System.out.print("전화? ");
    tell2 = keyInput.nextLine();
    currentMillis = System.currentTimeMillis();
    now2 = new Date(currentMillis);
    System.out.println("");
    // 3번 회원 입력
    System.out.print("번호? ");
    no3 = keyInput.nextInt();
    keyInput.nextLine();
    System.out.print("이름? ");
    name3 = keyInput.nextLine(); 
    
    System.out.print("이메일? ");
    email3 = keyInput.nextLine();
    
    System.out.print("암호? ");
    password3 = keyInput.nextLine();
    
    System.out.print("사진? ");
    photo3 = keyInput.nextLine();

    System.out.print("전화? ");
    tell3 = keyInput.nextLine();
    currentMillis = System.currentTimeMillis();
    now3 = new Date(currentMillis);
    System.out.println("");
    // 4번 회원 입력
    System.out.print("번호? ");
    no4 = keyInput.nextInt();
    keyInput.nextLine();
    System.out.print("이름? ");
    name4 = keyInput.nextLine(); 
    
    System.out.print("이메일? ");
    email4 = keyInput.nextLine();
    
    System.out.print("암호? ");
    password4 = keyInput.nextLine();
    
    System.out.print("사진? ");
    photo4 = keyInput.nextLine();

    System.out.print("전화? ");
    tell4 = keyInput.nextLine();
    currentMillis = System.currentTimeMillis();
    now4 = new Date(currentMillis);
    System.out.println("");
    // 5번 회원 입력
    System.out.print("번호? ");
    no5 = keyInput.nextInt();
    keyInput.nextLine();
    System.out.print("이름? ");
    name5 = keyInput.nextLine(); 
    
    System.out.print("이메일? ");
    email5 = keyInput.nextLine();
    
    System.out.print("암호? ");
    password5 = keyInput.nextLine();
    
    System.out.print("사진? ");
    photo5 = keyInput.nextLine();

    System.out.print("전화? ");
    tell5 = keyInput.nextLine();
    currentMillis = System.currentTimeMillis();
    now5 = new Date(currentMillis);
    
    keyInput.close();
    
    System.out.println("---------------------");
    System.out.printf("%d, %s, %s, %s, %s, %s%n", no1, name1, email1, password1, tell1, now1.toString());
    System.out.printf("%d, %s, %s, %s, %s, %s%n", no2, name2, email2, password2, tell2, now2.toString());
    System.out.printf("%d, %s, %s, %s, %s, %s%n", no3, name3, email3, password3, tell3, now3.toString());
    System.out.printf("%d, %s, %s, %s, %s, %s%n", no4, name4, email4, password4, tell4, now4.toString());
    System.out.printf("%d, %s, %s, %s, %s, %s%n", no5, name5, email5, password5, tell5, now5.toString());
    }
}
