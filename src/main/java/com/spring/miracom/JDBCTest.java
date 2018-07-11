package com.spring.miracom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String[] args) throws Exception { // 모든 예외 던짐
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		conn = DriverManager.getConnection(url, "hr", "hr");
		String sql = "select * from member";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getString("id") + "/" +
							   rs.getString("name") + "/" + rs.getString("gender"));
		}
		rs.close();
		stmt.close();    
		conn.close();
	}

}
