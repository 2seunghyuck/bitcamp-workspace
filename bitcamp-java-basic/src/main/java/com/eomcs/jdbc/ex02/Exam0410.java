package com.eomcs.jdbc.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0410 {
  public static void main(String[] args) throws Exception {

    String title = null;
    String contents = null;
    ArrayList<String> files = new ArrayList<>();

    try (Scanner keyScan = new Scanner(System.in)) {

      System.out.print("제목 ?");
      title = keyScan.nextLine();

      System.out.print("내용 ?");
      contents = keyScan.nextLine();

      // 사용자로부터 첨부파일 입력받기
      while (true) {

        System.out.print("첨부파일: (완료는 그냥 엔터입력)");
        String filename = keyScan.nextLine();
        if(filename.length() == 0) {
          break;
        } else {
          files.add(filename);
        }
      }

      try (Connection con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
          // 게시글 입력  처리 객체
          PreparedStatement boardstmt =con.prepareStatement(
              "insert into x_board(title,contents) values(?,?)");
          // 첨부파일 입력 처리 객체
          PreparedStatement filestmt = con.prepareStatement(
              "insert into x_board_file(file_path,board_id) values(?,?)");) {

        boardstmt.setString(1, title);
        boardstmt.setString(2, contents);
        int count = boardstmt.executeUpdate();
        System.out.printf("%d개 의 게시글 입력성공", count);

        int filecount = 0;
        for (String filename : files) {
          filestmt.setString(1, filename);
          filestmt.setString(2, filename);
          // 첨부파일 테이블에 데이터를 입력하려면 위에서 입력한 게시글의 번호를 알아야하는데
          // PK 로지정되어 자동으로 생성되는 게시글의 번호를 알수가 없는 문제가 생김
          // 그래서 첨부파일 테이블에 데이터를 입력할수가 없다.
          // -> 데이터를 입력할때 자동 생성된 PK값을 알아내어 문제를 해결한다.
          //

          filestmt.executeUpdate();
          filecount++;
        }
        System.out.printf("%d개 의 첨부파일 입력성공", filecount);
      }
    }
  }
}