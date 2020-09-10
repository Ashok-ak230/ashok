<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Delete Player</title>
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
body{
background-size:cover;
}
</style>
</head>
<!-- <body bgcolor="yellow"> -->
<body background="resources/images/2.jpg">
<br>
<center>

<div style="background-color: red">
<font face="Trebuchet MS" size="8" color="white">Delete Player</font>
</div>
<br>
<!-- <div style="background-color: white;width: 550px;height: 270px">
 --><br><br>
<form action="deletePlayerByIdPage">
<input type="submit" value="   Delete By ID   ">
</form>
<br>
<form action="deletePlayerByNamePage">
<input type="submit" value="Delete By Name">
</form>
</div>
</center>
</body>
</html>