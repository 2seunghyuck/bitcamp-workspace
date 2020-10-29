package com.eomcs.jdbc.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Exam0150 {
  public static void main(String[] args) throws Exception {
    String no = null;

    try (Scanner keyScan = new Scanner(System.in)) {

      System.out.print("번호 ?");
      no = keyScan.nextLine();

      System.out.print("정말 변경하시겠습니까 ? (Y/n)");
      String input = keyScan.nextLine();

      if (!input.equalsIgnoreCase("y") && input.length() != 0) {
        System.out.println("등록을 취소했습니다.");
        return;
      }
      try (Connection con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
          java.sql.Statement stmt = con.createStatement();) {

        stmt.executeUpdate("delete from x_board_file where board_id=" + no);
        int count = stmt.executeUpdate("delete from x_board where board_id=" + no);
        if (count == 0) {
          System.out.println("해당번호의 게시글이 없습니다.");
        } else {
          System.out.println("삭제가 완료되었습니다.");
        }
      }
    }
  }
}