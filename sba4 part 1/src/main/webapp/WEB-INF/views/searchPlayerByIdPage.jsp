<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Search Directory</title>
<style>
input[type=submit] {
font-family: Trebuchet MS;
background-color: red;
border-color: red;
border-width: 2px solid black;
text-decoration: none;
color: white;
padding: 10px 60px;
margin: 20px 20px;
cursor: pointer;
}
input[type=submit]:hover {
background-color: white;
color: red;
}
input[type=text], select {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
body{
background-size:cover;
}
</style>
</head>
<!-- <body bgcolor="yellow"> -->
<body background="resources/images/6.jpg">
<br>
<center>
<div style="background-color: red">
<font face="Trebuchet MS" size="8" color="white">Search By ID</font>
</div>
<!-- <div style="background-color: white;width: 550px;height: 450px"> -->
<br><br><br>
<!-- <font face="Trebuchet MS" size="5">Enter Player ID</font> -->

<form action="searchPlayerById">
<br>
<input type="text" name="playerId" placeholder="Enter PlayerId" >
<br>
<input type="submit" value="Search">
</form>
</div>
</body>
</html>