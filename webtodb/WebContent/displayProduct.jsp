<%@page import="com.myserv.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
td
{
background-colour:aqua;
font-family: comic sans ms;
font-size: 20px;
 }
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="90%">
<tr> <td>Product Id </td><td>Product Name </td><td>Product price </td><td>Mfd</td><td>Colour</td><td>Exp Date</td></tr>

<%
ArrayList<Product> productList=(ArrayList<Product>)session.getAttribute("productList");

for(Product product:productList)
{
	out.print("<tr>");
	
	out.print("<td>"+product.getProdId()+"</td>");
	out.print("<td>"+product.getProdName()+"</td>");
	out.print("<td>"+product.getProdPrice()+"</td>");
	out.print("<td>"+product.getMfd()+"</td>");
	out.print("<td>"+product.getColour()+"</td>");
	out.print("<td>"+product.getExpDate()+"</td>");
	
	out.print("</tr>");
	
}

%>
</table>
<input type="text">

<input type="submit" value="enter Product Id">

</body>
</html>