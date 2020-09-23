/*
 * 	Subject: Spring MVC with Hikari 4.3 and Oracle 19 연동하기
 * 	Filename: AddressBookDao.java
 * 	Create Date: 2020-09-23
 * 	Description: 
 * 	1. 
 * 	2
 * 
 */
package com.springMVC.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springMVC.web.persistance.DataSource;

public class AddressBookDao {

	private static final Logger logger = LoggerFactory.getLogger(AddressBookDao.class);

	public void allSelect() {
		
		
		try {
			DataSource ds = new DataSource();
			Connection conn = ds.getConnection();
			String query = "select * from addressbook";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {

				String msg = "번호:" + rs.getString("num") + "/이름:" + rs.getString("name") + "/주소:" + rs.getString("address");
				logger.info("Msg: {}.", msg);
			}
			
			rs.close();
			
			conn.close();
			
		} catch (SQLException e) {
			logger.info("msg:{}",  e.getMessage());
		}
		
	}
	
}
