package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App {
  static Scanner keyInput = new Scanner(System.in);
  static final int LENGTH = 100, PLENGTH = 100, TLENGTH = 100;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tell = new String[LENGTH];
  static Date[] createdDate = new Date[LENGTH];

  static int[] pno = new int[PLENGTH];
  static String[] pname = new String[PLENGTH];
  static String[] ptext = new String[PLENGTH];
  static Date[] pstartDate = new Date[PLENGTH];
  static Date[] pendDate = new Date[PLENGTH];
  static String[] pproducer = new String[PLENGTH];
  static String[] pcooperator = new String[PLENGTH];

  static String[] tproject = new String[TLENGTH];
  static int[] tno = new int[TLENGTH];
  static String[] tcontent = new String[TLENGTH];
  static Date[] tendDate = new Date[TLENGTH];
  static String[] tstate = new String[TLENGTH];
  static String[] tmodifier = new String[TLENGTH];
  static int count = 0, pcount = 0, tcount = 0;


  public static void main(String[] args) {

    loop: while (true) {
      switch (promptString("명령 >").toLowerCase()) {
        case "/member/add":
          addMember();
          break;
        case "/member/list":
          listMember();
          break;
        case "/project/add":
          addProject();
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
          break loop;
        default:
          System.out.println("출력할수 없는 내용입니다.");
      }
    }
    keyInput.close();

  }

  static void addMember() {
    System.out.println("[회원 등록]");
    no[count] = promptInt("번호? ");
    name[count] = promptString("이름? ");
    email[count] = promptString("이메일? ");
    password[count] = promptString("암호? ");
    photo[count] = promptString("사진? ");
    tell[count] = promptString("전화번호? ");
    createdDate[count] = new Date(System.currentTimeMillis());
    System.out.println();
    count++;
  }

  static void listMember() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", no[i], name[i], email[i], tell[i], createdDate[i]);
      System.out.println();
    }
  }

  static void addProject() {
    System.out.println("[프로젝트 등록]");
    pno[pcount] = promptInt("번호? ");
    pname[pcount] = promptString("이름? ");
    ptext[pcount] = promptString("내용? ");
    pstartDate[pcount] = promptDate("시작일? ");
    pendDate[pcount] = promptDate("종료일? ");
    pproducer[pcount] = promptString("만든이? ");
    pcooperator[pcount] = promptString("팀원? ");
    System.out.println();
    pcount++;
  }

  static void listProject() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < pcount; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", pno[i], pname[i], pstartDate[i], pendDate[i],
          pproducer[i]);
      System.out.println();
    }
  }

  static void addTask() {
    System.out.println("[작업 등록]");
    tproject[tcount] = promptString("프로젝트? ");
    tno[tcount] = promptInt("번호? ");
    tcontent[tcount] = promptString("내용? ");
    tendDate[tcount] = promptDate("종료일? ");
    tstate[tcount] = promptString("상태? \n0 =신규 \n1 = 진행중\n2 = 완료\n =>");
    tmodifier[tcount] = promptString("만든이? ");
    System.out.println();
    tcount++;
  }

  static void listTask() {
    System.out.println("[작업 목록]");
    for (int i = 0; i < tcount; i++) {
      String state;
      switch (tstate[i]) {
        case "0":
          state = "신규";
          break;
        case "1":
          state = "진행중 ";
          break;
        default:
          state = "완료";
      }
      System.out.printf("%d, %s, %s, %s, %s\n", tno[i], tcontent[i], tendDate[i], state,
          tmodifier[i]);
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
