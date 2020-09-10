<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Player Portal Page</title>
</head>
<body>

</body>
</htm<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<style>
input[type=submit] {
font-family: Trebuchet MS;
background-color: red;
border-color: red;
border-width: 2px red;
text-decoration: none;
color: white;
padding: 10px 60px;
margin: 20px 20px;
cursor: pointer;
}
input[type=submit]:hover {
background-color: white;
color: black;
}
body{
background-size:cover;
}
</style>
</head>
<!--<body bgcolor="yellow">  -->
<body background="resources/images/sba.jpg">
<br>
<center>
<!--<div style="background-color: red">  -->
<font face="Trebuchet MS" size="8" color="white">Player Portal</font>
</div>
<!-- <div style="background-color: white;width: 550px;height: 430px">  -->
<br><br>

<form action="createPlayerPage">
<input type="submit" value="   Create New Player   ">
</form>

<form action="updatePlayerPage">
<input type="submit" value="Update Existing Player">
</form>

<form action="searchDirectoryPage">
<input type="submit" value="    Search Module   ">
</form>

<form action="deleteEntryPage">
<input type="submit" value="   Delete Entry   ">
</form>

</div>
</center>
</body>
</html>>
