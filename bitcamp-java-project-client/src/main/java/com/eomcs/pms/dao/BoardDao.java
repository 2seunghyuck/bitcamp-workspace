package com.eomcs.pms.dao;

import java.util.List;
import com.eomcs.pms.domain.Board;

// 역할
// - 게시글 데이터를 등록,조회,목록조회,변경,삭제 처리하는 일을 한다.
//
public interface BoardDao {
  public int insert(Board board) throws Exception;
  public int delete(int no) throws Exception ;
  public Board findByNo(int no) throws Exception ;
  public List<Board> findAll() throws Exception ;
  public int update(Board board) throws Exception ;
}






