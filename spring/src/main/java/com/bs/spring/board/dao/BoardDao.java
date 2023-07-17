package com.bs.spring.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.bs.spring.board.model.dto.Board;

public interface BoardDao {
	List<Board> selectBoardAll(SqlSession session,Map<String,Object> param);
	int selectBoardAllCount(SqlSession session);
	int insertBoard(SqlSession session, Board b);
	Board selectBoardByNo(SqlSession session, int no);
}