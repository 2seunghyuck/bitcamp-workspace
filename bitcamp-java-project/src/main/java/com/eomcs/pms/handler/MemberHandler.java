package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberHandler {

  MemberList memberList = new MemberList();

  public void add() {
    System.out.println("[회원 등록]");

    Member m = new Member();
    m.no = Prompt.inputInt("번호? ");
    m.name = Prompt.inputString("이름? ");
    m.email = Prompt.inputString("이메일? ");
    m.password = Prompt.inputString("암호? ");
    m.photo = Prompt.inputString("사진? ");
    m.tel = Prompt.inputString("전화? ");
    m.registeredDate = new java.sql.Date(System.currentTimeMillis());

    memberList.add(m);
  }

  public void list() {
    System.out.println("[회원 목록]");
    Member[] members = memberList.toArray();

    for (Member m : members) {
      // 번호, 이름, 이메일, 전화, 가입일
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          m.no, m.name, m.email, m.tel, m.registeredDate);
    }
  }

  public Member findByName(String name) {
    Member[] members = memberList.toArray();
    for (Member m : members) {
      if (m.name.equals(name)) {
        return m;
      }
    }
    return null;
  }
}
