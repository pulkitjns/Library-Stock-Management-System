import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class Search extends HttpServlet {
       public void doGet(HttpServletRequest request, HttpServletResponse response)
                     throws ServletException, IOException {
              response.setContentType("text/html");
              PrintWriter out = response.getWriter();        
              String author=request.getParameter("uname"); 
               String title = request.getParameter("title");
        String category = request.getParameter("category");
        String edition = request.getParameter("edition");
        String language = request.getParameter("language");
        String status = request.getParameter("status");
              try{
                     Class.forName("com.mysql.jdbc.Driver"); 
                     Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/stockm","root","gstar");
                     PreparedStatement ps=con.prepareStatement("select * from item where author=? || title=? || category=? ||edition=?|| language=? ||status=?");
                     ps.setString(1,author); 
                     ps.setString(2,title); 
                     ps.setString(3,category); 
                     ps.setString(4,edition); 
                     ps.setString(5,language); 
                     ps.setString(6,status); 
                     out.print("<table width=25% border=1>");
                     out.print("<center><h1>Result:</h1></center>");
                     ResultSet rs=ps.executeQuery();                
                     /* Printing column names */
                     ResultSetMetaData rsmd=rs.getMetaData();
                     
                     out.print("<tr>");
                     out.print("<td>"+rsmd.getColumnName(1)+"</td>");
                        out.print("<td>"+rsmd.getColumnName(2)+"</td>");
                        out.print("<td>"+rsmd.getColumnName(3)+"</td>");
                        out.print("<td>"+rsmd.getColumnName(4)+"</td>");
                        out.print("<td>"+rsmd.getColumnName(5)+"</td>");
                        out.print("<td>"+rsmd.getColumnName(6)+"</td>");
                        out.print("<td>"+rsmd.getColumnName(7)+"</td>");
                        out.print("<td>"+rsmd.getColumnName(8)+"</td>");
                        out.print("<td>"+rsmd.getColumnName(9)+"</td></tr>");
                        out.print("<tr>");
                        while(rs.next())
                        {
                                               out.print("<td>"+rs.getString(1)+"</td>"); 
                                               out.print("<td>"+rs.getString(2)+"</td>");
                                               out.print("<td>"+rs.getString(3)+"</td>");
                                               out.print("<td>"+rs.getString(4)+"</td>");
                                                out.print("<td>"+rs.getString(5)+"</td>");
                                               out.print("<td>"+rs.getString(6)+"</td>");
                                               out.print("<td>"+rs.getString(7)+"</td>");
                                               out.print("<td>"+rs.getString(8)+"</td>");
                                                out.print("<td>"+rs.getString(9)+"</td></tr>");
                                               

                     }
                     out.print("</table>");
                     out.print("<br><br><br>");
                    out.println("<a href='user.html'>click here to go back </a><a href='Bookfilter.html'>for search</a>");
 
              }catch (Exception e2)
                {
                    e2.printStackTrace();
                }
 
              finally{out.close();
                }
       }
 
} 