import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class magentry extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        String title = request.getParameter("title");
        String category = request.getParameter("category");
        String noofpages = request.getParameter("noofpages");
         String itemid = request.getParameter("itemid");
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
                  ("insert into magazine values(?,?,?,?,?,?,?)");

        
        ps.setString(1, itemid);
        ps.setString(2, title);
        ps.setString(3, edition);
        ps.setString(4, noofpages);
        ps.setString(5, language);
        ps.setString(6, category);
        ps.setString(7, status);

        int i=ps.executeUpdate();
        
          if(i>0)
          {
            response.sendRedirect("magdisp.jsp");
          }
        
        }
        catch(Exception se)
        {
            se.printStackTrace();
        }
	
      }
  }
