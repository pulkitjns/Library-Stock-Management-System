<%-- 
    Document   : disp
    Created on : 28 Jun, 2016, 1:49:29 PM
    Author     : PULKIT JAIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.sql.*" %>

<%  Class.forName("com.mysql.jdbc.Driver"); %>
<!DOCTYPE html>
<html>
<head>
<style>
header {
    background-color:black;
    color:white;
    text-align:center;
    padding:5px;	 
}
section {
    width:900px;
    float:left;
    padding:10px;	 	 
}
nav {
    line-height:60px;
    background-color:#eeeeee;
    height:400px;
    width:200px;
    float:left;
    padding:5px;	      
}

footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
    padding:5px;	 	 
}


</style>
</head>
<body>

<header>
<h1>LIBRARY STOCK MANAGEMENT</h1>
</header>

<nav>
<b>
<h2>DETAIL SHOWN</h2><br>
<ul>
<li><a href="Filter.html">Home</a></li>

</nav>

<section>
<h1>ITEM DETAIL</h1>
<table style="width:100%">
     <% 
            Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/stockm","root","gstar");

            Statement statement = connection.createStatement() ;
            ResultSet resultset = 
                statement.executeQuery("select * from magazine") ; 
        %>

        <TABLE BORDER="1">
            <TR><B>
                <TH>ITEMID</TH>
                <TH>TITLE</TH>
                <TH>EDITION</TH>
                <TH>NO. OF PAGES</TH>
                <TH>LANGUAGE</TH>
                <TH>CATEGORY</TH>
                <TH>STATUS</TH>
            </B>
            </TR>
            <% while(resultset.next()){ %>
            <TR>
                <TD> <%= resultset.getString(1) %></td>
                <TD> <%= resultset.getString(2) %></TD>
                <TD> <%= resultset.getString(3) %></TD>
                <TD> <%= resultset.getString(4) %></TD>
                 <TD> <%= resultset.getString(5) %></TD>
                <TD> <%= resultset.getString(6) %></TD>
                <TD> <%= resultset.getString(7) %></TD>
            </TR>
            <% } %>
        </TABLE>

</body>
</html>

