package com.eomcs.jdbc.ex02;
//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0420 {
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
          // 게시글 입력 할때 자동생성된 PK값을 받을수 있도록 설정한다.
          PreparedStatement boardstmt =con.prepareStatement(
              "insert into x_board(title,contents) values(?,?)",
              Statement.RETURN_GENERATED_KEYS);

          // 첨부파일 입력 처리 객체
          PreparedStatement filestmt = con.prepareStatement(
              "insert into x_board_file(file_path,board_id) values(?,?)");) {

        boardstmt.setString(1, title);
        boardstmt.setString(2, contents);
        int count = boardstmt.executeUpdate();
        System.out.printf("%d개 의 게시글 입력성공", count);
        // 입력한 게시글의 PK값을 추출하기
        ResultSet keyRs = boardstmt.getGeneratedKeys();
        keyRs.next(); // PK가들어있는 레코드를 가져온다.
        int boardId = keyRs.getInt(1); // 레코드에서 컬럼을 꺼낸다.

        int filecount = 0;
        for (String filename : files) {
          filestmt.setString(1, filename);
          // 입력한 게시글의 PK 값을 사용하여 첨부파일에 데이터를 입력할 때 설정한다.
          filestmt.setInt(2, boardId);

          filestmt.executeUpdate();
          filecount++;
        }
        System.out.printf("%d개 의 첨부파일 입력성공", filecount);
      }
    }
  }
}