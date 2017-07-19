package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Display_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
  Class.forName("com.mysql.jdbc.Driver"); 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("header {\n");
      out.write("    background-color:black;\n");
      out.write("    color:white;\n");
      out.write("    text-align:center;\n");
      out.write("    padding:5px;\t \n");
      out.write("}\n");
      out.write("section {\n");
      out.write("    width:900px;\n");
      out.write("    float:left;\n");
      out.write("    padding:10px;\t \t \n");
      out.write("}\n");
      out.write("nav {\n");
      out.write("    line-height:60px;\n");
      out.write("    background-color:#eeeeee;\n");
      out.write("    height:400px;\n");
      out.write("    width:200px;\n");
      out.write("    float:left;\n");
      out.write("    padding:5px;\t      \n");
      out.write("}\n");
      out.write("\n");
      out.write("footer {\n");
      out.write("    background-color:black;\n");
      out.write("    color:white;\n");
      out.write("    clear:both;\n");
      out.write("    text-align:center;\n");
      out.write("    padding:5px;\t \t \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("<h1>STOCK MANAGEMENT</h1>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<nav>\n");
      out.write("<b>\n");
      out.write("<h2>DETAIL SHOWN</h2><br>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"Bookfilter.html\">Home</a></li>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("<h1>ITEM DETAIL</h1>\n");
      out.write("<table style=\"width:100%\">\n");
      out.write("     ");
 
            Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/stockm","root","gstar");

            Statement statement = connection.createStatement() ;
            ResultSet resultset = 
                statement.executeQuery("select * from item") ; 
        
      out.write("\n");
      out.write("\n");
      out.write("        <TABLE BORDER=\"1\">\n");
      out.write("            <TR><B>\n");
      out.write("                <TH>TITLE</TH>\n");
      out.write("                <TH>AUTHOR</TH>\n");
      out.write("                <TH>CATEGORY</TH>\n");
      out.write("                <TH>DESCRIPTION</TH>\n");
      out.write("                <TH>ITEM ID</TH>\n");
      out.write("                <TH>ITEM COUNT</TH>\n");
      out.write("                <TH>EDITION</TH>\n");
      out.write("            </B>\n");
      out.write("            </TR>\n");
      out.write("            ");
 while(resultset.next()){ 
      out.write("\n");
      out.write("            <TR>\n");
      out.write("                <TD> ");
      out.print( resultset.getString(1) );
      out.write("</td>\n");
      out.write("                <TD> ");
      out.print( resultset.getString(2) );
      out.write("</TD>\n");
      out.write("                <TD> ");
      out.print( resultset.getString(3) );
      out.write("</TD>\n");
      out.write("                <TD> ");
      out.print( resultset.getString(4) );
      out.write("</TD>\n");
      out.write("                 <TD> ");
      out.print( resultset.getString(5) );
      out.write("</TD>\n");
      out.write("                <TD> ");
      out.print( resultset.getString(6) );
      out.write("</TD>\n");
      out.write("                <TD> ");
      out.print( resultset.getString(7) );
      out.write("</TD>\n");
      out.write("            </TR>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </TABLE>\n");
      out.write("<footer>\n");
      out.write("DATA\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
