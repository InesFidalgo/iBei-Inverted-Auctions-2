  <%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Associar Facebook</title>
</head>
<body>
	
	<div align="center"> 	
	
		<s:form action="FacebookLoginInside" method = "POST">
		<s:submit value="Facebook Login"/> 		 
		</s:form>
		 <input type="button" value="Voltar ao menu" onclick="window.location='menu.jsp'">

	
	</div>
</body>
</html>