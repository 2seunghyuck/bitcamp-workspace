package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Member;
import com.eomcs.util.AbstractList;
import com.eomcs.util.Prompt;

public class MemberHandler {
  AbstractList<Member> memberList;

  public MemberHandler(AbstractList<Member> list) {
    this.memberList = list;
  }

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
  public void update() {
    System.out.println("[회원정보 변경]");
    int no = Prompt.inputInt("번호?");
    Member member = findByNo(no);
    if (member == null) {
      System.out.println("해당번호의 회원정보가 없습니다.");
    } else {
      String name = Prompt.inputString(
          String.format("이름(%s)? ", member.getName()));
      String email = Prompt.inputString(
          String.format("이메일(%s)? ", member.getEmail()));
      String password = Prompt.inputString("암호? ");
      String tel = Prompt.inputString(
          String.format("전화(%s)? ", member.getTel()));
      String photo = Prompt.inputString(
          String.format("사진(%s)? ", member.getPhoto()));
      String response = Prompt.inputString("정말 변경하시겠습니까 ? (y/N)");
      if (response.equalsIgnoreCase("y")) {
        member.setName(name);
        member.setEmail(email);
        member.setPassword(password);
        member.setTel(tel);
        member.setPhoto(photo);
        System.out.println("회원정보를 변경하였습니다.");
      }else {
        System.out.println("회원정보 변경을 취소하였습니다.");
      }
    }
  }
  public void delete() {
    System.out.println("[회원정보 변경]");
    int no = Prompt.inputInt("번호?");
    int index = indexOf(no);
    if (index == -1) {
      System.out.println("해당번호의 회원정보가 없습니다.");
    } else {
      String response = Prompt.inputString("정말 삭제 하시겠습니까 ? (y/N)");
      if (response.equalsIgnoreCase("y")) {
        memberList.remove(index);
        System.out.println("회원정보를 삭제 하였습니다.");
      } else {
        System.out.println("삭제를 취소하였습니다.");
      }
    }
  }
  private int indexOf(int no) {
    for(int i = 0; i < memberList.size(); i++) {
      Member member = memberList.get(i);
      if (member.getNo() == no) {
        return i;
      }
    }    return -1;
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
