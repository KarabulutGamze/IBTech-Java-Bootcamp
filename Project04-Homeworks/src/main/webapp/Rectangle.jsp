<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
int Area=0;
int Height=0;
int Weight=0;
int Perimeter=0;

if(request.getParameter("calculate")!=null){
	Height = Integer.parseInt(request.getParameter("Height"));
	Weight = Integer.parseInt(request.getParameter("Weight"));
	Area = Height * Weight;
	Perimeter = 2*(Height + Weight);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	Area = <%=Area%>
	<br /> 
	Perimeter = <%=Perimeter%>
<form action = "Rectangle.jsp" method = "POST">
		weight: <input type="text" name="width" value="<%=Weight%>"><br /> <br />
		height: <input type="text" name="length" value="<%=Height%>"><br /> <br />
		<input type="submit" value="Calculate" name="calculate"><br />
		<br />
	<br /> 
</form>
</body>
</html>