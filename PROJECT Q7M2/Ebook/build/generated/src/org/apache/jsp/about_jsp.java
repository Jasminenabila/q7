package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("     <head>\n");
      out.write("     <title>About</title>\n");
      out.write("     <meta charset=\"utf-8\">\n");
      out.write("     <link rel=\"icon\" href=\"images/favicon.ico\">\n");
      out.write("     <link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\n");
      out.write("     <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("     <script src=\"js/jquery.js\"></script>\n");
      out.write("     <script src=\"js/jquery-migrate-1.1.1.js\"></script>\n");
      out.write("     <script src=\"js/superfish.js\"></script>\n");
      out.write("     <script src=\"js/jquery.equalheights.js\"></script>\n");
      out.write("     <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("\n");
      out.write("     <script>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("    <h1><a href=\"index.html\"><img src=\"images/logo.png\" alt=\"Boo House\"></a> </h1>\n");
      out.write("    <div class=\"menu_block\">\n");
      out.write("\n");
      out.write("     <nav  class=\"\" >\n");
      out.write("      <ul class=\"sf-menu\">\n");
      out.write("         <li><a href=\"index.html\">Home</a></li>\n");
      out.write("         <li class=\"current\"><a href=\"index-1.html\">about</a></li>\n");
      out.write("         <li><a href=\"index-2.html\">Ebooks</a></li>\n");
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
      out.write("    <div class=\"grid_5\">\n");
      out.write("      <h3 class=\"head1\">Our Principles</h3>\n");
      out.write("      <ul class=\"list\">\n");
      out.write("        <li>\n");
      out.write("          <div class=\"count\">1</div>\n");
      out.write("          <div class=\"extra_wrapper\">\n");
      out.write("            <div class=\"col3\"><a href=\"#\">Fusce quis fermentum nisl tempus comelo. </a></div>Rerna is sed feugiat. Cras pulvinar lorem sagi isallvestibulumnisi nec gravida. \n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <div class=\"count\">2</div>\n");
      out.write("          <div class=\"extra_wrapper\">\n");
      out.write("            <div class=\"col3\"><a href=\"#\">Fusce quis fermentum nisl tempus ctumylo. </a></div>Rerna is sed feugiat. Cras pulvinar lorem sagi isallvestibulumnisi nec gravida. \n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <div class=\"count\">3</div>\n");
      out.write("          <div class=\"extra_wrapper\">\n");
      out.write("            <div class=\"col3\"><a href=\"#\">Fusce quis fermentum nisl tempus coetumyl. </a></div>Rerna is sed feugiat. Cras pulvinar lorem sagi isallvestibulumnisi nec gravida. \n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("     \n");
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
