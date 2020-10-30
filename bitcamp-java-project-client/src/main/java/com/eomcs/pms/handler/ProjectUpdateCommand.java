package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.eomcs.util.Prompt;

public class ProjectUpdateCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[프로젝트 변경]");
    int no = Prompt.inputInt("번호? ");

    String title = null;
    String content = null;
    Date sdt = null;
    Date edt = null;
    String owner = null;
    String members = null;

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select no, title, content, sdt, edt, owner, members"
                + " from pms_member where no=" + no);
        java.sql.ResultSet rs = stmt.executeQuery();) {

      if (rs.next()) {
        no = rs.getInt("no");
        title = rs.getString("title");
        content = rs.getString("content");
        sdt = rs.getDate("sdt");
        edt = rs.getDate("edt");
        owner = rs.getString("owner");
        members = rs.getString("members");

      } else {
        System.out.println("해당번호의 게시물이 존재하지 않습니다.");
        return;
      }
    } catch (Exception e) {
      System.out.println("게시글 조회중 오류발생");
      e.printStackTrace();
      return;
    }

    name = Prompt.inputString(String.format("이름(%s)? ", name));
    email = Prompt.inputString(String.format("이메일(%s)? ", email));
    password = Prompt.inputString(String.format("암호(%s)? ", password));
    photo = Prompt.inputString(String.format("사진(%s)? ", photo));
    tel = Prompt.inputString(String.format("전화(%s)? ", tel));

    String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("게시글 변경을 취소하였습니다.");
      return;
    }

    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "update pms_member set name=?, email=?, password=?, photo=?, tel=? where no=?");) {

      stmt.setString(1, name);
      stmt.setString(2, email);
      stmt.setString(3, password);
      stmt.setString(4, photo);
      stmt.setString(5, tel);
      stmt.setInt(6, no);

      int count = stmt.executeUpdate();
      if (count == 0) {
        System.out.println("해당번호의 게시글이 없습니다.");
      } else {
        System.out.println("변경이 완료되었습니다.");
      }
    } catch (Exception e) {
      System.out.println("게시글 변경중 오류발생");
    }
  }
}

/*Project project = findByNo(no);

    if (project == null) {
      System.out.println("해당 번호의 프로젝트가 없습니다.");
      return;
    }

    String title = Prompt.inputString(
        String.format("프로젝트명(%s)? ", project.getTitle()));
    String content = Prompt.inputString(
        String.format("내용(%s)? ", project.getContent()));
    Date startDate = Prompt.inputDate(
        String.format("시작일(%s)? ", project.getStartDate()));
    Date endDate = Prompt.inputDate(
        String.format("종료일(%s)? ", project.getEndDate()));

    String owner = null;
    while (true) {
      String name = Prompt.inputString(
          String.format("만든이(%s)?(취소: 빈 문자열) ", project.getOwner()));
      if (name.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return;
      } else if (memberListCommand.findByName(name) != null) {
        owner = name;
        break;
      }
      System.out.println("등록된 회원이 아닙니다.");
    }

    StringBuilder members = new StringBuilder();
    while (true) {
      String name = Prompt.inputString(
          String.format("팀원(%s)?(완료: 빈 문자열) ", project.getMembers()));
      if (name.length() == 0) {
        break;
      } else if (memberListCommand.findByName(name) != null) {
        if (members.length() > 0) {
          members.append(",");
        }
        members.append(name);
      } else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }

    String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("프로젝트 변경을 취소하였습니다.");
      return;
    }

    project.setTitle(title);
    project.setContent(content);
    project.setStartDate(startDate);
    project.setEndDate(endDate);
    project.setOwner(owner);
    project.setMembers(members.toString());

    System.out.println("프로젝트를 변경하였습니다.");
  }

  private Project findByNo(int no) {
    for (int i = 0; i < projectList.size(); i++) {
      Project project = projectList.get(i);
      if (project.getNo() == no) {
        return project;
      }
    }
    return null;
  }
}
 */