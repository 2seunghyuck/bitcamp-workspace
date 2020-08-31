package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Member;
import com.eomcs.util.ArrayList;
import com.eomcs.util.Prompt;

public class MemberHandler {

  ArrayList<Member> memberList = new ArrayList<>();

  public void add() {
    System.out.println("[회원 등록]");

    Member m = new Member();
    m.setNo(Prompt.inputInt("번호? "));
    m.setName(Prompt.inputString("이름? "));
    m.setEmail(Prompt.inputString("이메일? "));
    m.setPassword(Prompt.inputString("암호? "));
    m.setPhoto(Prompt.inputString("사진? "));
    m.setTel(Prompt.inputString("전화? "));
    m.setRegisteredDate(new java.sql.Date(System.currentTimeMillis()));

    memberList.add(m);
  }

  public void list() {
    System.out.println("[회원 목록]");
    Member[] members = memberList.toArray(new Member[] {});

    for ( Member m : members) {
      // 번호, 이름, 이메일, 전화, 가입일
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          m.getNo(), m.getName(), m.getEmail(), m.getTel(), m.getRegisteredDate());
    }
  }

  public Member findByName(String name) {
    Member[] members = memberList.toArray(new Member[] {});
    for (Member m : members) {
      if (m.getName().equals(name)) {
        return m;
      }
    }
    return null;
  }
  public void detail () {
    System.out.println("[회원정보 상세조회]");
    int no = Prompt.inputInt("번호?");
    Member member = findByNo(no);
    if (member == null) {
      System.out.println("해당번호의 회원이 없습니다.");
    } else {
      System.out.printf("이름 : %s\n", member.getName());
      System.out.printf("이메일 : %s\n", member.getEmail());
      System.out.printf("전화 : %s\n", member.getTel());
      System.out.printf("가입일 : %s\n", member.getRegisteredDate());
    }
  }
  private Member findByNo(int no) {
    for(int i = 0; i < memberList.size(); i++) {
      Member member = memberList.get(i);
      if (member.getNo() == no) {
        return member;
      }
    }
    return null;
  }
}
