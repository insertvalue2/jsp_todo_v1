package com.tenco.todo.repository;

import java.sql.Connection;
import java.sql.SQLException;

import com.tenco.todo.utils.DBHelper;

public class CategoryDAO  implements ICategoryRepo{
	
	DBHelper dbHelper; 
	Connection conn; 
	public CategoryDAO() {
		dbHelper = new DBHelper(); // 객체 주소값 넣기(초기화)
		conn = dbHelper.getConnection();
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
	}
	
	public void closedConnection() {
		// CategoryDAO에 연결 종료 
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn = null;
	}
}
