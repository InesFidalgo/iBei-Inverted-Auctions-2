<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Leilões SD</title>
  <link type="text/css" href="index.css" rel="stylesheet">
</head>
<body>
  <c:if test="${session.loggedIn == true}">
    <c:redirect url="menu.jsp" />
  </c:if>
 
  
  <div align="center" 	style="height: 200px;
    width: 400px;
    position: fixed;
    top: 50%;
    left: 50%;
    margin-top: -100px;
    margin-left: -200px;"
    bgcolor="#E6E6FA">
    
     <p class="center">Leilões SD</p>
    <table border="3" cellpadding="10" cellspacing="10" class="searchLeilaoDetalhe" >
            <td>
              <table>
				 <input type="button" value="Login" onclick="window.location = 'login.jsp'" class="center">
				 <br />
				
 				 <input type="button" value="Registar" onclick="window.location = 'register.jsp'" class="center">
 				  <br />
 				
	  		</table>
			 </td>
	 </table>
  </div>
</body>
</html>
