package com.mysrv.demo1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmpDetails")
public class EmpDetails extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String empname=request.getParameter("a");
		String empid=request.getParameter("b");
		String empaddress=request.getParameter("c");
		String password=request.getParameter("d");
		String conpassword=request.getParameter("e");
		String gender=request.getParameter("f");
		String languagesknown=request.getParameter("g");
		String dob=request.getParameter("h");
		String seqques=request.getParameter("i");
		String seqans=request.getParameter("j");

		response.setContentType("text/html");
		out.println("<h1><font> Emp name :"+empname+"</font></h1>");
		out.println("<h1><font> Emp Id :"+empid+"</font></h1>");
		out.println("<h1><font> Emp Address :"+empaddress+"</font></h1>");
		out.println("<h1><font> Password :"+password+"</font></h1>");
		out.println("<h1><font> Confirm Password :"+conpassword+"</font></h1>");
		out.println("<h1><font> Gender :"+gender+"</font></h1>");
		out.println("<h1><font> Language Known :"+languagesknown+"</font></h1>");
		out.println("<h1><font> Dob :"+dob+"</font></h1>");
		out.println("<h1><font> Security Question :"+seqques+"</font></h1>");
		out.println("<h1><font> Security Answer :"+seqans+"</font></h1>");

		

		String arr[]=request.getParameterValues("empdetails");
		
		for(String a:arr) {
			out.print(a+"<br>");
		}
	}

}
