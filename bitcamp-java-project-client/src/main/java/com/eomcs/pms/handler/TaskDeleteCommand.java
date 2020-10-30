package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.eomcs.util.Prompt;

public class TaskDeleteCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[작업 삭제]");
    int no = Prompt.inputInt("번호? ");

    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "delete from pms_task where no=?");) {
      stmt.setInt(1, no);

      int count = stmt.executeUpdate();
      if (count == 0) {
        System.out.println("해당번호의 작업목록이 없습니다.");
      } else {
        System.out.println("삭제가 완료되었습니다.");
      }
    } catch (Exception e) {
      System.out.println("삭제과정에서 오류가 발생했습니다.");
      e.printStackTrace();
    }
    String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("작업목록 삭제를 취소하였습니다.");
      return;
    }

  }
}
