package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

// a) 명령 프롬프트를 출력한다.
// b) 명령어를 입력받아 출력한다.
// c) 명령어를 입력 받는것을 반복한다. -> quit,exit 명령이 실행되기전까지 반복한다.
// d) 입력된 값에 대응하는 조건을 출력한다.
// e) 명령에 맞는 명령문을 출력한다.
// f) project 명령문, 을 출력
// 세개로 나눴던 프로젝트를 한곳에서 명령에 맞는 입력으로 각각 출력
public class App {

  public static void main(String[] args) {

    Scanner keyInput = new Scanner(System.in);

    // 회원 정보 변수
    final int LENGTH = 5; // 변수 앞에 final을 붙여 수를 변화못시키게 막고 대문자로 강조;
    int[] no = new int[LENGTH];
    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tell = new String[LENGTH];
    Date[] now = new Date[LENGTH];
    long currentMillis;
    int count = 0;
    // 프로젝트 변수
    final int PLENGTH = 100;
    int[] pno = new int[PLENGTH];
    String[] pname = new String[PLENGTH];
    String[] pmain = new String[PLENGTH];
    Date[] pstart = new Date[PLENGTH];
    Date[] pend = new Date[PLENGTH];
    String[] pprod = new String[PLENGTH];
    String[] pcoop = new String[PLENGTH];
    int pcount = 0;
    // Task 변수
    final int TLENGTH = 100;
    String[] tproj = new String[TLENGTH];
    int[] tno = new int[TLENGTH];
    String[] ttext = new String[TLENGTH];
    Date[] tend = new Date[TLENGTH];
    String[] tstat = new String[TLENGTH];
    String[] tengi = new String[TLENGTH];
    int tcount = 0;

    loop: while (true) {
      System.out.print("명령> ");
      String command = keyInput.nextLine();
      switch (command.toLowerCase()) {

        case "/member/add":
          System.out.println("[회원 등록]");
          System.out.print("번호? ");
          no[count] = keyInput.nextInt();
          keyInput.nextLine();
          System.out.print("이름? ");
          name[count] = keyInput.nextLine();
          System.out.print("이메일? ");
          email[count] = keyInput.nextLine();
          System.out.print("암호? ");
          password[count] = keyInput.nextLine();
          System.out.print("사진? ");
          photo[count] = keyInput.nextLine();
          System.out.print("전화? ");
          tell[count] = keyInput.nextLine();
          currentMillis = System.currentTimeMillis();
          now[count] = new Date(currentMillis);

          count++;
          break;

        case "/member/list":
          System.out.println("[회원 목록]");
          for (int i = 0; i < count; i++) {
            System.out.printf("%d, %s, %s, %s, %s, %s, %s%n", no[i], name[i], email[i], password[i],
                photo[i], tell[i], now[i].toString());
          }
          break;

        case "/project/add":
          System.out.println("[프로젝트 등록]");
          System.out.print("번호? ");
          pno[pcount] = keyInput.nextInt();
          keyInput.nextLine();
          System.out.print("프로젝트명? ");
          pname[pcount] = keyInput.nextLine();
          System.out.print("내용? ");
          pmain[pcount] = keyInput.nextLine();
          System.out.print("시작일? ");
          pstart[pcount] = java.sql.Date.valueOf(keyInput.nextLine());
          // 입력받은 날을 표준화 시키기위해 도구를 사용한다.
          System.out.print("종료일? ");
          pend[pcount] = java.sql.Date.valueOf(keyInput.nextLine());
          System.out.print("만든이? ");
          pprod[pcount] = keyInput.nextLine();
          System.out.print("팀원? ");
          pcoop[pcount] = keyInput.nextLine();
          System.out.println();

          pcount++;
          break;
        case "/project/list":
          System.out.println("[프로젝트 목록]");
          for (int i = 0; i < pcount; i++) {
            System.out.printf("%d, %s, %s, %s, %s\n", pno[i], pname[i], pstart[i], pend[i],
                pprod[i]);
          }
          break;
        case "/task/add":
          System.out.println("[작업 등록]");
          System.out.print("프로젝트? ");
          tproj[tcount] = keyInput.nextLine();
          System.out.print("번호? ");
          String str = keyInput.nextLine();
          tno[tcount] = Integer.parseInt(str); // 입력값을 문자로 받아서 숫자로 리턴해줌
          System.out.print("내용? ");
          ttext[tcount] = keyInput.nextLine();
          System.out.print("완료일? ");
          tend[tcount] = java.sql.Date.valueOf(keyInput.nextLine());
          System.out.println("상태 => 0: 신규, 1: 진행중, 2: 완료 ");
          System.out.print("> ");
          tstat[tcount] = keyInput.nextLine();
          System.out.print("담당자? ");
          tengi[tcount] = keyInput.nextLine();
          System.out.println();
          tcount++;

          break;
        case "/task/list":
          System.out.println("[작업 목록]");
          for (int i = 0; i < tcount; i++) {
            String statTi;
            switch (tstat[i]) {
              case "0":
                statTi = "신규";
                break;
              case "1":
                statTi = "진행중";
                break;
              default:
                statTi = "완료";
            }
            System.out.printf("%d, %s ,%s, %s, %s%n", tno[i], ttext[i], tend[i], statTi, tengi[i]);
          }
          break;


        case "exit":
        case "quit":
          System.out.println("안녕!");
          break loop;

        default:
          System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println();
    }
    System.out.println("종료!");
    keyInput.close();

  }
}
