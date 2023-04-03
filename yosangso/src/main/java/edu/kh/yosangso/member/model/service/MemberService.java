package edu.kh.yosangso.member.model.service;

import java.sql.Connection;

import static edu.kh.yosangso.common.JDBCTemplate.*;
import edu.kh.yosangso.member.model.dao.MemberDAO;
import edu.kh.yosangso.member.model.vo.Member;

public class MemberService {

	private MemberDAO dao = new MemberDAO();

	
	public Member login(Member mem) throws Exception{
		Connection conn = getConnection();
		
		Member loginMember = dao.login(conn, mem);
		
		close(conn);
		
		return loginMember;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
