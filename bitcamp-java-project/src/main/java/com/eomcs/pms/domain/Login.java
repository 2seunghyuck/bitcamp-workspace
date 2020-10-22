package com.eomcs.pms.domain;

public class Login {
  private String Id;
  private String Password;
  private String PasswordCheck;
  public String getId() {
    return Id;
  }
  public void setId(String id) {
    Id = id;
  }
  public String getPassword() {
    return Password;
  }
  public void setPassword(String password) {
    Password = password;
  }
  public String getPasswordCheck() {
    return PasswordCheck;
  }
  public void setPasswordCheck(String passwordCheck) {
    PasswordCheck = passwordCheck;
  }

}
