package com.eomcs.pms.handler;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.eomcs.util.Prompt;

public class ProjectDetailCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[프로젝트 상세보기]");
    int no = Prompt.inputInt("번호? ");

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select no, title, content, sdt, edt, owner, members"
                + " from pms_project where no=" + no);
        java.sql.ResultSet rs = stmt.executeQuery();) {

      if (rs.next()) {
        System.out.printf("제목 : %s\n",rs.getString("title"));
        System.out.printf("내용 : %s\n",rs.getString("content"));
        System.out.printf("시작일 : %s\n",rs.getDate("sdt"));
        System.out.printf("종료일 : %s\n",rs.getDate("edt"));
        System.out.printf("만든이 : %s\n",rs.getString("owner"));
        System.out.printf("팀원 : %s\n",rs.getDate("members"));
      } else {
        System.out.println("해당번호의 프로젝트 정보가 존재하지 않습니다.");
      }
    } catch (Exception e) {
      System.out.println("프로젝트 조회중 오류발생");
      e.printStackTrace();
    }
  }
}
