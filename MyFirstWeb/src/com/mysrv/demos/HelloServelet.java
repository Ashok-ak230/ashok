package com.mysrv.demos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloServelet")
public class HelloServelet extends HttpServlet {
	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
    PrintWriter out=resp.getWriter();
   
    String data=req.getParameter("un");
    resp.setContentType("text/html");
    out.println("<h1> <font color='red'> HELLO"+ data +" </font> </h1>");
   
   
    String arr[]= req.getParameterValues("languagesknown");
   
    for(String a:arr)
    {
   
    out.println(a+"<br>");
    }
   
   
    }
}