<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="protest.do" method="post">
<pre>
	Organization:<input type="text" name="organization">
	Reason:<input type="text" name="reason" rows="2" coloms="3">
	Date:<input type="text" name="date">
	Location:<select type="location">
		<option>select</option>
		<option>Mall</option>
		<option>Park</option>
		<option>Vidhansoudha</option>
		<option value="temple">Temple</option>
	</select>
	<input type="submit" value="click me">
	<a href="Sucess.jsp">newlink</a>

	</pre>
</form>	
</body>
</html>