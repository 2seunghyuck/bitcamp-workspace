package com.eomcs.pms.domain;

import java.sql.Date;

//Task 클래스는 더이상 CsvObject를 구현할 필요가 없다.
//
public class Task {
  private int no;
  private String content;
  private Date deadline;
  private int status;
  private Member owner;
  private int projectNo;
  private String projectTitle;

  public String getProjectTitle() {
    return projectTitle;
  }
  public void setProjectTitle(String projectTitle) {
    this.projectTitle = projectTitle;
  }
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Date getDeadline() {
    return deadline;
  }
  public void setDeadline(Date deadline) {
    this.deadline = deadline;
  }
  public int getProjectNo() {
    return projectNo;
  }
  public void setProjectNo(int projectNo) {
    this.projectNo = projectNo;
  }
  public int getStatus() {
    return status;
  }
  public void setStatus(int status) {
    this.status = status;
  }
  public Member getOwner() {
    return owner;
  }
  public void setOwner(Member owner) {
    this.owner = owner;
  }
}
