package com.myserv.delete;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myserv.dao.ProductDao;


@WebServlet("/deleteProduct")
public class deleteProduct extends HttpServlet {
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int prodId=Integer.parseInt(request.getParameter("prodId"));
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	ProductDao dao=new ProductDao();
	out.print(dao.DeleteProduct(prodId));
	}

}
