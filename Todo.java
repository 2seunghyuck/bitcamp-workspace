package com.mini.project.domain;

import java.sql.Date;

public class Todo {

  private int no;
  private Date date;
  private String title;
  private String content;
  private boolean isDone = false;
  private int category;
  private Date registeredDate;


  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getRegisteredDate() {
    return registeredDate;
  }

  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean isDone) {
    this.isDone = isDone;
  }

  public int getCategory() {
    return category;
  }

  public void setCategory(int category) {
    this.category = category;
  }
  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }



  //  @Override
  //  public String toString() {
  //    return  (isDone ? "● " : "○ ") + date + " | "+ category.toString() + " | " + title  ;
  //  }

  //
  //
  //  // 테스트
  //  public static void main(String[] args) {
  //    Todo test = new Todo();
  //    test.title = "스레드풀 공부";
  //    test.date = Date.valueOf("2020-10-20");
  //    test.content = "자바";
  //    test.category = Category.coding;
  //
  //    System.out.println(test);
  //  }

}
