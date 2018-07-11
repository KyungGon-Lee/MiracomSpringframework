package com.spring.miracom;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

public class MemberDAO {
	DataSource ds;
	public MemberDAO(DataSource ds) {
		this.ds = ds;
	}
	public int insert(MemberVO member) throws Exception{

		String sql;
		PreparedStatement pstmt;
		sql = "INSERT INTO member (id, name, pwd, gender, hobby)"
			+ "VALUES(?, ?, ?, ?, ?)";
		pstmt = ds.getConnection().prepareStatement(sql);
		pstmt.setString(1, member.getId() );
		pstmt.setString(2, member.getName());
		pstmt.setString(3, member.getPwd());
		pstmt.setString(4, member.getGender());
		pstmt.setString(5, member.getHobby());
		return pstmt.executeUpdate();
		
	}
	public MemberVO read(String id) throws Exception {
		String sql = "select * from member where id = '" + id + "'";
		Statement stmt = ds.getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		MemberVO member = null;
		if(rs.next()) {
			member = new MemberVO();
			member.setId(id);
			member.setPwd(rs.getString("pwd"));
			member.setName(rs.getString("name"));
			member.setGender(rs.getString("gender"));
			member.setHobby(rs.getString("hobby"));
		}
		return member;
	}
	public int update(MemberVO member) throws Exception{
		String sql = "update membere set name = ?, pwd = ?, gender = ?, hobby = ?";
		
		PreparedStatement pstmt = ds.getConnection().prepareStatement(sql);
		pstmt.setString(1, member.getName());
		pstmt.setString(2, member.getPwd());
		pstmt.setString(3, member.getGender());
		pstmt.setString(4, member.getHobby());
		return pstmt.executeUpdate();
	}
	public void delete(String id) {
		
	}
	public ArrayList<MemberVO> selectAll() throws Exception{
		ArrayList<MemberVO> lists = new ArrayList<MemberVO>();
		String sql = "select * from member";
		Statement stmt = ds.getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			lists.add(new MemberVO(
					rs.getString("id"),
					rs.getString("pwd"),
					rs.getString("name"),
					rs.getString("gender"),
					rs.getString("hobby")	
					));
		}
		return lists;
	}
	

}
