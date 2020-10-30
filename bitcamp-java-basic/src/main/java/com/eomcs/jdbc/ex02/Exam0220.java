// PreparedStatement를 이용하여 SQL 삽입 공격 차단하기
package com.eomcs.jdbc.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam0220 {

  public static void main(String[] args) throws Exception {
    String no = null;
    String title = null;
    String contents = null;

    try (Scanner keyboard = new Scanner(System.in)) {
      System.out.print("번호? ");
      no = keyboard.nextLine();

      System.out.print("제목? ");
      title = keyboard.nextLine();

      System.out.print("내용? ");
      contents = keyboard.nextLine();
    }

    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");

        PreparedStatement stmt = con.prepareStatement( //
            "update x_board set title = ?, contents = ? where board_id = ?")) {

      stmt.setString(1, title);
      stmt.setString(2, contents);
      stmt.setString(3, no);

      // PreparedStatement에서는 SQL 문을 서버에 보내기 위해
      // executeUpdate()를 호출할 때 파라미터로 전달하지 않는다.
      int count = stmt.executeUpdate();

      if (count == 0) {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
      } else {
        System.out.println("변경하였습니다.");
      }
      // Statement vs PreparedStatement
      // 1) SQL 문장의 간결함
      // [Statement]
      // - 값을 가지고 문자열로 직접 SQL 문을 만들기 때문에 작성하거나 읽기 힘들다.
      // [PreparedStatement]
      // - SQL 문장과 값이 분리되어 있기 때문에 작성하거나 읽기 쉽다.
      //
      // 2) SQL 삽입 공격
      // [Statement]
      // - 사용자가 입력한 값을 가지고 SQL 문장을 만들기 때문에 해킹되기 쉽다.
      // [PreparedStatement]
      // - SQL 문장과 값이 분리되어 다뤄지기 때문에 해킹할 수 없다.
      //
      // 3) 바이너리 데이터 다루기
      // [Statement]
      // - 문자열로 SQL 문장을 만들기 때문에
      // 바이너리 타입의 컬럼 값을 설정할 수 없다.
      // [PreparedStatement]
      // - setXxx() 메서드를 호출하여 값을 설정하기 때문에
      // 바이너리 타입의 컬럼 값을 설정할 수 있다.
      //
      // 4) 실행 속도
      // [Statement]
      // - executeUpdate()를 실행할 때 SQL 문을 파라미터로 전달한다.
      // - 호출될 때마다 SQL 문법을 분석하기 때문에 반복 실행하는 경우
      // SQL 문법도 반복 분석하므로 실행 속도가 느리다.
      // [PreparedStatement]
      // - 미리 SQL 문을 작성한 다음에 값을 넣은 후
      // executeUpdate() 호출한다.
      // - 따라서 executeUpdate()를 호출할 때 마다 SQL 문법을
      // 분석하기 않으므로 반복 실행할 때 Statement 보다 빠르다.
      //
    }
  }
}
