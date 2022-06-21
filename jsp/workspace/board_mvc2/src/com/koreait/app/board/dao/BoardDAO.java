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

	// 글쓰기 
	public boolean insertBoard(BoardDTO board) {
		boolean result = false;
		
		if(sqlsession.insert("Board.inserBoard", board) == 1) {
			result = true;
		}
		return result;
	}

	// 글 보기
	public BoardDTO getDetail(int boardnum) {
		return (BoardDTO)sqlsession.selectOne("Board.getDetail", boardnum);
		
	}
	
	// 조회수
	public void updateReadCount(int boardnum) {
		sqlsession.update("Board.updateReadCount", boardnum);
	}
	
	// 글 작성 후 바로 글 보기
	public int getSeq() {
		return sqlsession.selectOne("Board.getSeq");
	}

	// 댓글 저장
	public boolean addReply(ReplyDTO reply) {
		boolean result = false;
		
		if (sqlsession.insert("Board.addReply", reply) != 0) {
			result = true;
		}
		
		return result;
	}
	
	// 댓글 조회
	public List<ReplyDTO> getReplys(int boardnum) {
		List<ReplyDTO> list = sqlsession.selectList("Board.getReplys", boardnum);
		return list;
	}
	
	// 댓글 수정하기
	public boolean updateReply(int replynum, String replycontents) {
		boolean result = false;
		HashMap<String, Object> datas = new HashMap<>();
		datas.put("replynum", replynum);
		datas.put("replycontents", replycontents);
		
		if (sqlsession.update("Board.updateReply", datas) != 0) {
			result = true;
		}
		
		
		return result;
	}
	
	// 댓글 삭제하기
	public boolean deleteReply(int replynum) {
		boolean result = false;
		
		if (sqlsession.delete("Board.deleteReply", replynum) == 1) {
			result = true;
		}
		
		return result;
	}
	
	
	
	
}
