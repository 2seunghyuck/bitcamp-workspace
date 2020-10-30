package com.eomcs.jdbc.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam0340 {
  public static void main(String[] args) throws Exception {
    String no = null;
    String title = null;
    String contents = null;

    try (Scanner keyScan = new Scanner(System.in)) {

      System.out.print("번호 ?");
      no = keyScan.nextLine();

      System.out.print("제목 ?");
      title = keyScan.nextLine();

      System.out.print("내용 ?");
      contents = keyScan.nextLine();

      System.out.print("정말 변경하시겠습니까 ? (Y/n)");
      String input = keyScan.nextLine();

      if (!input.equalsIgnoreCase("y") && input.length() != 0) {
        System.out.println("등록을 취소했습니다.");
        return;
      }
      try (Connection con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
          PreparedStatement stmt = con.prepareStatement("update x_board set title=?, contents=? where board_id=?");) {

        stmt.setString(1, title);
        stmt.setString(2, contents);
        stmt.setString(3, no);
        stmt.executeUpdate();

        int count = stmt.executeUpdate();
        if (count == 0) {
          System.out.println("해당번호의 게시글이 없습니다.");
        } else {
          System.out.println("변경이 완료되었습니다.");
        }
      }
    }
  }
}