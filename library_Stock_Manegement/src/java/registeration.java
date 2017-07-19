import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class registeration extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
            
String user_id=request.getParameter("user_id");  
String password=request.getParameter("password");  

          
try{  
Class.forName("com.mysql.jdbc.Driver");
Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/stockm","root","gstar");
  
PreparedStatement ps=con.prepareStatement(  
"insert into login values(?,?)");  
  
ps.setString(1,user_id);  
ps.setString(2,password);  
int i=ps.executeUpdate();  
if(i>0)  
response.sendRedirect("login.html");
      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  
}  