package com.myserv.search;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myserv.dao.ProductDao;
import com.myserv.model.Product;


@WebServlet("/Search")
public class Search extends HttpServlet {
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String prodName1 = request.getParameter("prodName");

			PrintWriter out= response.getWriter();
			response.setContentType("text/html");

			ProductDao dao=new ProductDao();
			ArrayList<Product> productList1=dao.getProductByName(prodName1);


			  for(Product product:productList1) {
			out.print(product.getProdId());
			out.print(product.getProdName());
			out.print(product.getProdPrice());
			out.print(product.getMfd());
			out.print(product.getColour());
			out.print(product.getExpDate()); }
	}

}
