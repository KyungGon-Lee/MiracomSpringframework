package com.spring.miracom;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberDAOMyBatis {
	@Autowired
	private SqlSessionTemplate sqlSession;
	public MemberDAOMyBatis() {
	}
	
	public MemberDAOMyBatis(SqlSessionTemplate sqlSession) {
		 this.sqlSession = sqlSession;
	 }

    public List<MemberVO> getMembers() {
    	return  sqlSession.selectList("membermapper.getMembers");
    }	    
    
    public int insert(MemberVO m) {
    	return sqlSession.insert("membermapper.insertMember", m);
    }

    public int update(MemberVO m) {
    	return sqlSession.update("membermapper.updateMember", m);
    }
	
    
    public int delete(String id) {
    	return sqlSession.delete("membermapper.deleteMember", id);
    }
    public int login(String id, String pwd) {
    	HashMap map = new HashMap();
		map.put("id", id);
		map.put("pwd", pwd);    	
    	return sqlSession.selectOne("membermapper.login", map);
    }
    
}