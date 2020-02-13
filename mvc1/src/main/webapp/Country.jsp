<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="country.do" method="post">
<pre>
	Name:<input type="text" name="c_name">
	NoOfStates:<input type="text" name="c_noOfStates">
	population:<input type="text" name="c_population">
	Religion:<select type="c_religion">
		<option>select</option>
		<option>indhu</option>
		<option>muslim</option>
		<option>krischian</option>
	
		<!-- -- --<option value="temple">Temple</option>---->
	</select>
	<input type="submit" value="click me">
	<a href="Loading.jsp">newlink</a>

	</pre>
</form>	

</body>
</html>