package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

// 실행할 메서드를 메인메서드 바깥으로 분리한뒤,
// 메인메서드에서 호출하여 실행하는 작업 수행.
// 실행될 메서드들은, 메인메서드의 바깥에 있으므로, 변수도 바깥에 지정해 줘야한다.
// 이를 사용하기 위해 변수선언문 앞에 static명령을 붙여준다.

public class App {
  static Scanner keyInput = new Scanner(System.in);

  // 회원 정보 변수
  static final int LENGTH = 100, PLENGTH = 100, TLENGTH = 100;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tell = new String[LENGTH];
  static Date[] now = new Date[LENGTH];
  static int count = 0;
  // 프로젝트 변수
  static int[] pno = new int[PLENGTH];
  static String[] pname = new String[PLENGTH];
  static String[] pmain = new String[PLENGTH];
  static Date[] pstart = new Date[PLENGTH];
  static Date[] pend = new Date[PLENGTH];
  static String[] pprod = new String[PLENGTH];
  static String[] pcoop = new String[PLENGTH];
  static int pcount = 0;
  // Task 변수
  static String[] tproj = new String[TLENGTH];
  static int[] tno = new int[TLENGTH];
  static String[] ttext = new String[TLENGTH];
  static Date[] tend = new Date[TLENGTH];
  static String[] tstat = new String[TLENGTH];
  static String[] tengi = new String[TLENGTH];
  static int tcount = 0;

  public static void main(String[] args) {



    loop: while (true) {

      switch (promptString("명령 >").toLowerCase()) {

        case "/member/add":
          addMember();// addMember 에 따로 뺴낸 코드를 실행하라. <- 호출(method call)
          break;
        case "/member/list":
          listMember();
          break;
        case "/project/add":
          addProjcet();
          break;
        case "/project/list":
          listProject();
          break;
        case "/task/add":
          addTask();
          break;
        case "/task/list":
          listTask();
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


  static void addMember() {// 새로운 메서드를 생성하는 명령

    System.out.println("[회원 등록]");
    no[count] = promptInt("번호? ");
    name[count] = promptString("이름? ");
    email[count] = promptString("이메일? ");
    password[count] = promptString("암호? ");
    photo[count] = promptString("사진? ");
    tell[count] = promptString("전화번호? ");
    now[count] = new Date(System.currentTimeMillis());

    count++;
  }

  static void listMember() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s%n", no[i], name[i], email[i], password[i],
          photo[i], tell[i], now[i].toString());
    }
  }

  static void addProjcet() {
    System.out.println("[프로젝트 등록]");
    pno[pcount] = promptInt("번호? ");
    pname[pcount] = promptString("이름? ");
    pmain[pcount] = promptString("내용? ");
    pstart[pcount] = promptDate("시작일? ");
    // 입력받은 날을 표준화 시키기위해 도구를 사용한다.
    pend[pcount] = promptDate("종료일? ");
    pprod[pcount] = promptString("만든이? ");
    pcoop[pcount] = promptString("팀원? ");
    System.out.println();

    pcount++;
  }

  static void listProject() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < pcount; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", pno[i], pname[i], pstart[i], pend[i], pprod[i]);
    }
  }

  static void addTask() {
    System.out.println("[작업 등록]");
    tproj[tcount] = promptString("프로젝트? ");
    tno[tcount] = promptInt("번호? "); // 입력값을 문자로 받아서 숫자로 리턴해줌
    ttext[tcount] = promptString("내용? ");
    tend[tcount] = promptDate("완료일? ");
    tstat[tcount] = promptString("상태 ? \n0: 신규 \n1: 진행중 \n2: 완료\n => ");
    tengi[tcount] = promptString("담당자? ");
    System.out.println();
    tcount++;
  }

  static void listTask() {
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
  }

  static String promptString(String title) {
    System.out.print(title);
    return keyInput.nextLine();
  }

  static int promptInt(String title) {
    return Integer.parseInt(promptString(title));
  }

  static Date promptDate(String title) {
    return Date.valueOf(promptString(title));
  }
}

