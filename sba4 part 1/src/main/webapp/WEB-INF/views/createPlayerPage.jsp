<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Create Player</title>
<style>
input[type=submit] {
font-family: Trebuchet MS;
background-color: red;
border-color: red;
border-width: 2px solid red;
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
<!-- <body bgcolor="yellow">
 -->
 <body background="resources/images/3.jpg">
 <br>
<center>
<div style="background-color: red">
<font face="Trebuchet MS" size="8" color="white">Create New Player</font>
</div>
<!-- <div style="background-color: white;width: 550px;height: 450px"> -->
 <br>
<!-- <font face="Trebuchet MS" size="5">Give the details to create player</font> -->

<form action="createPlayer">
<br>
<font face="Trebuchet MS"></font><br><input type="text" name="playerId" placeholder="Player ID">
<br><br>
<font face="Trebuchet MS"></font><br><input type="text" name="playerName" placeholder="Player Name">
<br><br>

<font face="Trebuchet MS"></font><br>
<select name="playerTeam">
<option value="India">India</option>
<option value="Pakistan">Pakistan</option>
<option value="Australia">Australia</option>
<option value="New zealand">New zealand</option>
<option value="England">England</option>
<option value="South Africa">South Africa</option>
<option value="Srilanka">Srilanka</option>
</select>
<br><br>
<input type="submit" value="Create">
</form>


</div>
</center>
</body>
</html>