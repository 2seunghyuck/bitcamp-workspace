package com.eomcs.pms;

public class App {

  public static void main(String[] args) {
    
    // 콘솔에서 사용자의 입력을 처리하 도구를 준비한다.
    // => 키보드 input stream : System.in
    // => input stream 으로부터 data값을 읽어 적절한 타입으로 리턴하는도구  : Scanner
    // Scanner가 존재하는 클래스에서 불러오기 위해 java.util을 지정해준다.
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    //스캐너 클래스를 사용하기 위해 조종장치 를 설치명령을 한다.
    System.out.println("[회원]");
    
    System.out.print("번호? ");//nextLine 은 문자열을 리턴하므로 nextInt 사용.
    int no = keyInput.nextInt();//nextInt 는 숫자만 인식하고 나머지를 다음명령으로 넘김.
    keyInput.nextLine();        //남아있는 CR/LF를 처리하기 위해 명령어를 입력
    System.out.print("이름? ");
    String name = keyInput.nextLine(); 
    
    System.out.print("이메일? ");
    String mail = keyInput.nextLine();
    
    System.out.print("암호? ");
    String pwd = keyInput.nextLine();
    
    System.out.print("사진? ");
    String pic = keyInput.nextLine();

    System.out.print("전화? ");
    String tell = keyInput.nextLine();
    
    //가입일은 현재시간을 기준하기 때문에 기입하는 명령
    long currentMillis = System.currentTimeMillis(); //1970-1-1 00:00:00 부터 지나온 시간기
    java.sql.Date now = new java.sql.Date(currentMillis);
    // String reg = keyInput.nextLine(); 현재시간을 나타내므로 직접 입력받을 필요가 없다.
    
    keyInput.close();
    
    System.out.println("---------------------");
    System.out.printf("번호: %d\n", no);
    System.out.printf("이름: %s\n" , name);
    System.out.printf("이메일: %s\n" , mail);
    System.out.printf("암호: %s\n" , pwd);
    System.out.printf("사진: %s\n" , pic);
    System.out.printf("전화: %s\n" , tell);
    System.out.printf("가입일: %s\n", now.toString());
    }
}
