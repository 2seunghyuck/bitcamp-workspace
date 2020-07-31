package com.eomcs.pms;

//클래스의 패키지 정보를 미리선언하여 컴파일러에게 알려준다.
import java.util.Scanner;
import java.sql.Date;
// a)낱개의 변수를 사용하여 여러 회원 정보 처리하기
// b) 조건문을 사용하여 입출력 제어하기
// - 필요한 만큼만 입력 받고 출력하기.
// c) 배열을 사용하여 여러개의 값을 다루기
// - 배열을 사용하면 간단하게 여러개의 변수를 선언할 수 있다.
// d) 반복문을 사용하여 여러개의 값을 다루기
// - 반복문을 사용하면 같은 코드를 중복해서 작성할 필요가 없다.
// e) 배열 갯수를 변수에서 관리하기.
// - 변수의 값만 바꾸면 배열 개수를 바로 변경할 수 있어 편하다. 
// f) 상수를 사용하여 초기값을 변경하지 못하게 막기.
// - 변수는 중간에 값을 바꿀수 있기 때문에 값을 바꾸지 말아야하는경우
//   실수를 막기위해 상수를 설정하여 변경을 금지한다.
// g) 메서드를 사용하여 코드를 분리하기
// - 메서드를 사용하면 기능별로 코드를 별도의 블럭으로 분리할 수 있다.
//   작은 단위로 코드가 분리되면 관리하기 쉽다.

public class App_g {

  static int count = 0; // input,output 에서 공유하는 변수라 메인 클래스 위에 선언해야함
  static final int MAX_LENGTH = 5;
  static int[] no = new int[MAX_LENGTH];
  static String[] name = new String[MAX_LENGTH];
  static String[] email = new String[MAX_LENGTH];
  static String[] password = new String[MAX_LENGTH];
  static String[] photo = new String[MAX_LENGTH];
  static String[] tell = new String[MAX_LENGTH];
  static Date[] now = new Date[MAX_LENGTH];
  
  public static void main(String[] args) { //직관적으로 보기좋게 class 설
    
    
    System.out.println("[회원]");
    
    inputMembers(); // 별도의 블록으로 분리한 코드를 실행하기
    
    System.out.println("---------------------");
    
    printMembers();
}
  
  static void inputMembers() {
    Scanner keyInput = new Scanner(System.in);
    long currentMillis;
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
  }
  
  static void printMembers() {
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s%n", no[i], name[i], email[i], password[i], photo[i], tell[i], now[i].toString());
      }

  }

}
