package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.mBook;
import model.AutoG;
import config.koneksi;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;

public final class ebooks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("     <head>\n");
      out.write("     <title>Portfolio</title>\n");
      out.write("     <meta charset=\"utf-8\">\n");
      out.write("     <link rel=\"icon\" href=\"images/favicon.ico\">\n");
      out.write("     <link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\n");
      out.write("     <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"css/touchTouch.css\">\n");
      out.write("     <script src=\"js/jquery.js\"></script>\n");
      out.write("     <script src=\"js/jquery-migrate-1.1.1.js\"></script>\n");
      out.write("     <script src=\"js/superfish.js\"></script>\n");
      out.write("     <script src=\"js/touchTouch.jquery.js\"></script>\n");
      out.write("     <script src=\"js/jquery.equalheights.js\"></script>\n");
      out.write("     <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("     <script>\n");
      out.write("      $(function(){\n");
      out.write("        // Initialize the gallery\n");
      out.write("        $('.port a.gal').touchTouch();\n");
      out.write("      });\n");
      out.write("     </script>\n");
      out.write("     <!--[if lt IE 8]>\n");
      out.write("       <div style=' clear: both; text-align:center; position: relative;'>\n");
      out.write("         <a href=\"http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode\">\n");
      out.write("           <img src=\"http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg\" border=\"0\" height=\"42\" width=\"820\" alt=\"You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today.\" />\n");
      out.write("         </a>\n");
      out.write("      </div>\n");
      out.write("    <![endif]-->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"js/html5shiv.js\"></script>\n");
      out.write("      <link rel=\"stylesheet\" media=\"screen\" href=\"css/ie.css\">\n");
      out.write("\n");
      out.write("    <![endif]-->\n");
      out.write("     </head>\n");
      out.write("     <body  class=\"\">\n");
      out.write("<!--==============================header=================================-->\n");
      out.write(" <header> \n");
      out.write("  <div class=\"container_12\">\n");
      out.write("   <div class=\"grid_12\"> \n");
      out.write("    <h1><a href=\"index.html\"><img src=\"#\" alt=\"Boo House\"></a> </h1>\n");
      out.write("    <div class=\"menu_block\">\n");
      out.write("\n");
      out.write("     <nav  class=\"\" >\n");
      out.write("      <ul class=\"sf-menu\">\n");
      out.write("         <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("         <li><a href=\"about.jsp\">about</a></li>\n");
      out.write("         <li class=\"current\"><a href=\"ebooks.jsp\">Ebooks</a></li>      \n");
      out.write("       </ul>\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write(" <div class=\"clear\"></div>\n");
      out.write("</div>\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!--==============================Content=================================-->\n");
      out.write("\n");
      out.write("<div class=\"content\"><div class=\"ic\">More Website Templates @ TemplateMonster.com - September 14, 2013!</div>\n");
      out.write("  <div class=\"container_12\">\n");
      out.write("    <div class=\"grid_12\">\n");
      out.write("      <h3><span>Our Portfolio</span></h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("    <div class=\"port\">\n");
      out.write("       \n");
      out.write("        ");

                      try{
                        mBook stk = new mBook();
                        ArrayList data = stk.display();
                        for(int i = 0;i < data.size()-1;i+=4)
                        {
                            //fac_code, fac_name, fac_email, fac_phone
                                //String idEbook = (String)data.get(i);
                                String judul = (String)data.get(i+1);
                                String deskripsi = (String)data.get(i+2);
                                String foto = "/upload/" + (String) data.get(i+3);      
                                 
                                  out.println("<div class='grid_4'>");
                                  out.println("<a href='C' class='gal'><img src='images/html.PNG' alt=''></a>");
                                  out.println("<div class='text1 col1'> "+judul+" </div>");
                                  out.println(deskripsi);
                                  out.println("<br>");
                                  out.println("<a href='htmlcss.jsp'>Detail Book</a>");
                                  out.println("</div>");
                        }
                    }
                    catch(Exception ex) {
                        out.println("Data Gagal Ditampilkan" + ex.toString());
                    }


                      
      out.write(" \n");
      out.write("        ");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--==============================footer=================================-->\n");
      out.write("\n");
      out.write("<footer>    \n");
      out.write("  <div class=\"container_12\">\n");
      out.write("    <div class=\"grid_12\">\n");
      out.write("    <div class=\"socials\">\n");
      out.write("      <a href=\"#\"></a>\n");
      out.write("      <a href=\"#\"></a>\n");
      out.write("      <a href=\"#\"></a>\n");
      out.write("      <a href=\"#\"></a>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"copy\">\n");
      out.write("      WebDesign (C) 2013 | <a href=\"#\">Privacy Policy</a> | Website Template  designed by <a href=\"http://www.templatemonster.com/\" rel=\"nofollow\">TemplateMonster.com</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
