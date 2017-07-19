<%-- 
    Document   : FirstPage
    Created on : 20 Jun, 2016, 10:24:30 AM
    Author     : PULKIT JAIN
--%>

<%
    out.println("first page");
    if((session.getAttribute("user_id")== null ) || (session.getAttribute("userid")== "")){
              out.println("You are not logged in <a href='login.html'>please login</a>");
      } 
    
    else {
        response.sendRedirect("Filter.html");
       
        }
    %>
