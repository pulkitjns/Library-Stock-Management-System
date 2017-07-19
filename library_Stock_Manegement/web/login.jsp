<%-- 
    Document   : login
    Created on : 20 Jun, 2016, 10:20:58 AM
    Author     : PULKIT JAIN
--%>
<html>
<body>




<%@ page import ="java.sql.*" %>

<%
    try{
        String user=request.getParameter("id");
        String passwd=request.getParameter("pwd");
        System.out.println("Inside");
        System.out.println(user);
        System.out.println(passwd);
        System.out.println("UserDeTAIL");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/stockm","root","gstar");
        Statement st= con.createStatement();
        String sql = "select password from login where user_id='"+user+"'";
        System.out.println(sql);
        ResultSet rs=st.executeQuery(sql);
         System.out.println("sop");
        if(rs.next())
        {System.out.println(rs.getString("password"));
        if(passwd.equals("admin"))
        {
        session.setAttribute("user_id", user);
        response.sendRedirect("FirstPage.jsp");
        }
        else if(rs.getString("password").equals(passwd))
        {
        session.setAttribute("user_id", user);
        response.sendRedirect("user.html");
        }
        else
        {
            
        out.println("Invalid ID/Password <a href='index.html'>try again</a>");
        }

        }
    else
        {
        out.println("Invalid ID/Password <a href='index.html'>try again</a>");
        }
    }
    catch(Exception e)
    {
       System.out.println(e);
       
    }
%>
