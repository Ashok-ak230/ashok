package com.myserv.srv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myserv.dao.Studentdao;
import com.myserv.model.Attendance;
import com.myserv.model.Students;


@WebServlet("/mark")
public class mark extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Studentdao dao=new Studentdao();
		int sem=Integer.parseInt(request.getParameter("sem"));
		ArrayList<Students> studentsList=dao.getStudentsBysem(sem);
		
		for(Students s:studentsList) {
			int studId = s.getStudId();
			String studName = s.getStudName();
			Date ADate = new Date();
			int semester = sem;
			String attendance = "Absent";
			
			Attendance attend = new Attendance(studId, studName,ADate, semester,attendance);
			dao.insertIntoAttendance(attend);
		}
		HttpSession session=request.getSession();
		session.setAttribute("studentsList", studentsList);
		
		RequestDispatcher rd=request.getRequestDispatcher("displayStudentsBySem.jsp");
		rd.forward(request, response);
	}
	
		
	}
			
	