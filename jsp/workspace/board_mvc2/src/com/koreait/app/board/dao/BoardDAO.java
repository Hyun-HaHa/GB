package com.koreait.app.board.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.koreait.app.board.mybatis.SqlMapConfig;

public class BoardDAO {
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlsession;
	
	// autocommit
	public BoardDAO() {
		sqlsession = factory.openSession(true);
	}
	
	// 전체 글 목록 조회
	public List<BoardDTO> getBoardList(int startRow, int endRow) {
		System.out.println("getBoardList 도착");
		HashMap<String, Integer> datas = new HashMap<>();
		datas.put("startRow", startRow);
		datas.put("endRow", endRow);
		
		List<BoardDTO> boardList = sqlsession.selectList("Board.getBoardList", datas);
		
		System.out.println("getBoardList 조회");
		
		return boardList;
	}

	// 글 전체 개수 조회
	public int getBoardCnt() {
		
		return sqlsession.selectOne("Board.getBoardCnt");
	}
	
	
	
}
