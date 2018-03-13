<%-- 
    Document   : response
    Created on : 08-Mar-2018, 21:59:48
    Author     : A1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Your Temperature Unit is converted</h1>
        <jsp:useBean id="converttemp" scope="session" class="converttemp.ConvertTemp" />
        <jsp:setProperty name="converttemp" property="temp"  />
        <jsp:setProperty name="converttemp" property="fromUnit"  />
        <jsp:setProperty name="converttemp" property="toUnit" />
        <jsp:getProperty name="converttemp" property="temp" />
        <jsp:getProperty name="converttemp" property="toUnit" />
    </body>
</html>


























