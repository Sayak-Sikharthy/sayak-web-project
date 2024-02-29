package com.sayak.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.sayak.daoimpl.UserDaoImpl;
import com.sayak.vo.ResultVO;
import com.sayak.vo.UserVO;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDaoImpl daoImpl = new UserDaoImpl();
	ResultVO rvo = new ResultVO();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("phone");
			String city = request.getParameter("city");
			String gender = request.getParameter("gender");
			String password = request.getParameter("password");
			
			UserVO uvo = new UserVO();
			uvo.setName(name);
			uvo.setEmail(email);
			uvo.setContact(contact);
			uvo.setCity(city);
			uvo.setGender(gender);
			uvo.setPassword(password);
			
			rvo = daoImpl.dataInsert(uvo);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/newlink.jsp");
			rd.include(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	}


