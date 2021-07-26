<%-- 
    Document   : add
    Created on : Mar 4, 2018, 4:16:20 PM
    Author     : l2pc203e
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="com.login.LoginDAO"%>
<%@page import="com.login.Login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <%
            int Id = Integer.parseInt(request.getParameter("id"));
            String Name = request.getParameter("name");
            String Email = request.getParameter("email");
            String Password = request.getParameter("password");
            
        %>

        <%
            Login l = new Login(Id, Name,Email, Password );
            LoginDAO lc = new LoginDAO();
            boolean b = lc.doSave(l);
            if (b) {
                    response.sendRedirect("http://localhost:8080/AngularJSFinalProject/login.jsp");
                } else {
                response.sendRedirect("http://localhost:8080/AngularJSFinalProject/registration.jsp");
                }
        %>
    </body>
</html>
