<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="politics.do" method="post">
<pre>
	Symbol:<input type="text" name="p_symbol">
	NOofCandidates:<input type="text" name="p_noOfCandidates">
	<select type="p_name">
		<option>select</option>
		<option>bjp</option>
		<option>congress</option>
		<option>jds</option>
	
		<!-- -- --<option value="temple">Temple</option>---->
	</select>
	<input type="submit" value="click me">
	<a href="Apply.jsp">newlink</a>

	</pre>
</form>	


</body>
</html>