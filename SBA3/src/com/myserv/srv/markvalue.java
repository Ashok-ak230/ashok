package com.myserv.srv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myserv.dao.Studentdao;
import com.myserv.model.Attendance;


@WebServlet("/markvalue")
public class markvalue extends HttpServlet {
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
    	   response.setContentType("text/html");
    	   Studentdao dao = new Studentdao();
    	   String[] data=request.getParameterValues("status");
    	   for(String datum:data) {
    		   int studId=Integer.parseInt(datum);
    		   
    		   Attendance attend=new Attendance(studId);
    		   dao.updateAttendance(attend);
    	   }
    	   RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
    	   rd.forward(request, response);
    	   }
    	   	
	}


