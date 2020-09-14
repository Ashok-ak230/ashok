<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="js/main.js"></script>

<title>Insert title here</title>
<style>
input[type=submit] {
font-family: Trebuchet MS;
 background-color: white; 
  color: black; 
  border: 2px solid #f44336;
text-decoration: none;
color: black;
padding: 10px 60px;
margin: 20px 20px;
cursor: pointer;
}
input[type=submit]:hover {
background-color: #f44336;
  color: white;
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
<body background="css/2.jpg">
<center>
<div style="background-color: white;width: 550px;height: 430px">

<form action="ChangePassword">

USER ID:<input type="text" name="userId" placeholder="USER ID"><br><br>
SECURITY QUESTION:<select name="security_question">
<option value="-----------------------------">----------------------------------</option>
<option value="Which is your first school?">Which is your first school?</option>
<option value="Which is your birth place?">Which is your birth place?</option>
<option value="Which is your first college?">Which is your first college?</option>
<option value="Which is your first Name?">Which is your first Name?</option>
<option value="Which is your favorite food?">Which is your favorite food?</option>
<option value="Which is your favorite animal?">Which is your favorite animal?</option>

</select><br><br>
SECURITY ANSWER<input type="text" name="security_answer"placeholder="SECURITY ANSWER"><br><br>
<input type="submit"  value="Change Password">
</div>
</form>
</center>
</body>
</html>