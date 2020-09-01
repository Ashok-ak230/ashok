package com.myserv.srv;

import java.io.IOException;


import java.io.PrintWriter;
import java.text.SimpleDateFormat;
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


@WebServlet("/SemSrv")
public class SemSrv extends HttpServlet {
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	Studentdao dao= new Studentdao();
    	int sem=Integer.parseInt(request.getParameter("sem"));
    	String dt=request.getParameter("date");
    	Date date=null;
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    	try {
    		date=sdf.parse(dt);
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
    		System.out.println("date not given");
    	}
    	
    	
    	if(dao.searchResult(sem, date)==null) {
    		HttpSession session=request.getSession();
    		session.setAttribute("Norec", dao.searchResult(sem, date));
    		
    		RequestDispatcher red=request.getRequestDispatcher("ResultPageNotFound.jsp");
    		red.forward(request, response);
    	}
    	else {
    		ArrayList<Attendance> attendanceList=dao.searchResult(sem, date)
    		HttpSession session=request.getSession();
    		session.setAttribute("attendanceList", attendanceList);
    		
    		RequestDispatcher rd=request.getRequestDispatcher("ResultPage.jsp");
    		rd.forward(request, response);
    	}
		}
    	}

