<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
  String company="";
  if(request.getCookies()!=null) {
	  for(Cookie cookie : request.getCookies()) {
		  if(cookie.getName().equals("compamy")){
			  company=cookie.getValue();
		  }
	  }
  }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
Çerez alındı <%=company %>
</body>
</html>