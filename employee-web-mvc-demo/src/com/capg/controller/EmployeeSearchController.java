package com.capg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capg.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeSearchController
 */
@WebServlet("/EmployeeSearchController")
public class EmployeeSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       EmployeeServiceImpl service;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeSearchController() {
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
//		int empId=Integer.parseInt(request.getParameter("tbEmpId"));
//		Employee emp=service.findEmployee(empId);
//		RequestDispatcher rd= request.getRequestDispatcher("viewemp.jsp");
//		request.setAttribute("employee", emp);
//		rd.forward(request, response);
	}

}
