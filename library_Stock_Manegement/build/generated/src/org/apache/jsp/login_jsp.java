package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
