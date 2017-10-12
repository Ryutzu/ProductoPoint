<%-- 
    Document   : resultado
    Created on : 12/10/2017, 08:42:49 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%String res=request.getParameter("res");%>
    </head>
    <body>
        <h1>El Resultado es = <%=res%></h1>
    </body>
</html>
