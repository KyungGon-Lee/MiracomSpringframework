package com.spring.miracom;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBatisTest {
	public static void main(String[] args) throws Exception { // 모든 예외 던짐
		GenericXmlApplicationContext ctx = 
		new GenericXmlApplicationContext("mybatis.xml");		
		
//		Connection conn = ds.getConnection();
//		String sql = "select * from member";
//		Statement stmt = conn.createStatement();
//		ResultSet rs = stmt.executeQuery(sql);
//		
//		while(rs.next()) {
//			System.out.println(rs.getString("id") + "/" +
//			rs.getString("name") + "/" + rs.getString("gender"));
//		}
//		rs.close();
//		stmt.close();    
//		conn.close(); // 실제 close가 아니라 리소스 반납
//		
//		System.out.println("ok");		
		
		//만약 분리시켰으면 위에꺼 안쓰고 아래처럼 쓰면 됨
		
//		DataSource ds = (DataSource)ctx.getBean("dataSource");
//		
//		MemberService ms = (MemberService)ctx.getBean("memberservice");
//		MemberDAO dao = new MemberDAO(ds);
//		MemberVO member = dao.read("hong");
//
//		if(member != null) {
//			System.out.println("name : " + member.getName());
//		} else System.out.println("no~~~~");
//		
//		System.out.println(ms.getUser("hong", "hong") ? "ok!" : "no!");
		
		
		MemberDAOMyBatis mdb = (MemberDAOMyBatis)ctx.getBean("batis");
		System.out.println(
				mdb.login("hong", "hong") > 0 ? "ok~!" : "no!~");
		
		mdb.insert(new MemberVO("id1", "id1", "와앙", "woman", "게임"));
		mdb.insert(new MemberVO("id2", "id2", "빵방", "woman", "여행"));
		mdb.insert(new MemberVO("id3", "id3", "김김", "woman", "취미"));
		mdb.delete("id3");
		mdb.update(new MemberVO("id1", "id3", "이순신", "woman", "영화"));
		
		List<MemberVO> members = mdb.getMembers();
		for(int i = 0; i < members.size(); i++) {
			System.out.println("[name] ->> " + members.get(i).getName() +
					", [id] ->> " + members.get(i).getId() +
					", [취미] ->> " + members.get(i).getHobby());
		}
		ctx.close();
		
	}
}
