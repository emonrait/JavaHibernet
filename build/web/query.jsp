<%-- 
    Document   : query
    Created on : Mar 4, 2018, 4:18:56 PM
    Author     : l2pc203e
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int Id = Integer.parseInt(request.getParameter("id"));
            String Password = request.getParameter("password").toString();
            String a = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "apcl123456");
                PreparedStatement pstm = con.prepareStatement("select * from login where id=? and password=?");
                pstm.setInt(1, Id);
                pstm.setString(2, Password);
                ResultSet rs = pstm.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Login Succesful");
                    response.sendRedirect("http://localhost:8080/AngularJSFinalProject/signup.jsp");
                   
                } else {
                    JOptionPane.showMessageDialog(null, "Not match please Registration First");
                    response.sendRedirect("http://localhost:8080/AngularJSFinalProject/registration.jsp");

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </body>
</html>
