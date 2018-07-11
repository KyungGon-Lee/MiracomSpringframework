package com.spring.miracom;
public class MemberService {
	
	private MemberDAO dao;
	public void setMemberDAO(MemberDAO dao) {
		this.dao = dao;
	}
	public int insert(MemberVO member) throws Exception{
		return dao.insert(member);
	}
	public MemberVO read(String id) throws Exception{
		return dao.read(id);
	}
	public boolean getUser(String id, String pwd) throws Exception{
		MemberVO member = dao.read(id);
		if(member.getPwd().equals(pwd)) return true;
		return false;
	}
}
