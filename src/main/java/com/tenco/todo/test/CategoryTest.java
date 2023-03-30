package com.tenco.todo.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.todo.repository.CategoryDAO;
import com.tenco.todo.utils.DBHelper;

/**
 * Servlet implementation class CategoryTest
 */
@WebServlet("/CategoryTest")
public class CategoryTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CategoryDAO categoryDAO;
	
	// 서블릿 라이프 싸이클 
	// 단 한번만 로드 되는 부분 
	@Override
	public void init() throws ServletException {
		
	}
    
    public CategoryTest() {
        categoryDAO = new CategoryDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@Override
	public void destroy() {
		super.destroy();
		categoryDAO.closedConnection();
	}

}
