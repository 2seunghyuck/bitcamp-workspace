package com.eomcs.jdbc.ex02;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam0330 {
  public static void main(String[] args) throws Exception {

    int no = 0;
    try (Scanner keyScan = new Scanner(System.in)) {
      System.out.println("번호 ?");
      no = Integer.parseInt(keyScan.nextLine());
    }

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement("select * from x_board where board_id=?");
        ) {
      stmt.setInt(1, no);

      try (java.sql.ResultSet rs = stmt.executeQuery();){
        if (rs.next()) {
          System.out.printf("제목 : %s\n",rs.getString("title"));
          System.out.printf("내용 : %s\n",rs.getString("contents"));
          System.out.printf("등록일 : %s\n",rs.getDate("created_date"));
          System.out.printf("조회수 : %s\n",rs.getInt("view_count"));
        } else {
          System.out.println("해당번호의 게시물이 존재하지 않습니다.");
        }
      }
    }
  }
}