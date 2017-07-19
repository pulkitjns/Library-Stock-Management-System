import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Singleitem extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String category = request.getParameter("category");
        String description = request.getParameter("description");
         String itemid = request.getParameter("itemid");
        String itemcount = request.getParameter("itemcount");
        String edition = request.getParameter("edition");
        String language = request.getParameter("language");
        String status = request.getParameter("status");
        try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection  con=DriverManager.getConnection
                     ("jdbc:mysql://localhost:3306/stockm","root","gstar");

        PreparedStatement ps=con.prepareStatement
                  ("insert into item values(?,?,?,?,?,?,?,?,?)");

        
        ps.setString(1, title);
        ps.setString(2, author);
        ps.setString(3, category);
        ps.setString(4, description);
        ps.setString(5, itemid);
        ps.setString(6, itemcount);
        ps.setString(7, edition);
        ps.setString(8, language);
        ps.setString(9, status);

        int i=ps.executeUpdate();
        
          if(i>0)
          {
            response.sendRedirect("Display.jsp");
          }
        
        }
        catch(Exception se)
        {
            se.printStackTrace();
        }
	
      }
  }
