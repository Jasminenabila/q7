package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.mBook;
import model.AutoG;

public final class view_005fbook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Lumino - Tables</title>\n");
      out.write("\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/datepicker3.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/bootstrap-table.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!--Icons-->\n");
      out.write("<script src=\"js/lumino.glyphs.js\"></script>\n");
      out.write("\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"js/html5shiv.js\"></script>\n");
      out.write("<script src=\"js/respond.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#sidebar-collapse\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\"><span>Dashboard</span>Admin</a>\n");
      out.write("\t\t\t\t<ul class=\"user-menu\">\n");
      out.write("\t\t\t\t\t<li class=\"dropdown pull-right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><svg class=\"glyph stroked male-user\"><use xlink:href=\"#stroked-male-user\"></use></svg> User <span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"Logout\"><svg class=\"glyph stroked cancel\"><use xlink:href=\"#stroked-cancel\"></use></svg> Logout</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t</div><!-- /.container-fluid -->\n");
      out.write("\t</nav>\n");
      out.write("\t\t\n");
      out.write("\t<div id=\"sidebar-collapse\" class=\"col-sm-3 col-lg-2 sidebar\">\n");
      out.write("\t\t<form role=\"\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<ul class=\"nav menu\">\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"index.html\"><svg class=\"glyph stroked dashboard-dial\"><use xlink:href=\"#stroked-dashboard-dial\"></use></svg> Home</a></li>\n");
      out.write("\t\t\t<li class=\"parent \">\n");
      out.write("\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<span data-toggle=\"collapse\" href=\"#sub-item-1\"><svg class=\"glyph stroked chevron-down\"><use xlink:href=\"#stroked-chevron-down\"></use></svg></span> Admin \n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<ul class=\"children collapse\" id=\"sub-item-1\">\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a class=\"\" href=\"input_admin.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<svg class=\"glyph stroked chevron-right\"><use xlink:href=\"#stroked-chevron-right\"></use></svg> Insert\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a class=\"\" href=\"tables_admin.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<svg class=\"glyph stroked chevron-right\"><use xlink:href=\"#stroked-chevron-right\"></use></svg> View\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("                        <li class=\"parent \">\n");
      out.write("\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<span data-toggle=\"collapse\" href=\"#sub-item-3\"><svg class=\"glyph stroked chevron-down\"><use xlink:href=\"#stroked-chevron-right\"></use></svg></span> Ebook \n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<ul class=\"children collapse\" id=\"sub-item-3\">\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a class=\"\" href=\"input_book.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<svg class=\"glyph stroked chevron-down\"><use xlink:href=\"#stroked-chevron-right\"></use></svg> Insert\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a class=\"\" href=\"tables_book.jsp\">\n");
      out.write("\t\t\t\t\t\t\t<svg class=\"glyph stroked chevron-down\"><use xlink:href=\"#stroked-chevron-down\"></use></svg> View\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t\n");
      out.write("\t</div><!--/.sidebar-->\n");
      out.write("\t\t\n");
      out.write("\t<div class=\"col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main\">\t\t\t\n");
      out.write("\t\t<!--/.row-->\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t<h1 class=\"page-header\">Tables</h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/.row-->\n");
      out.write("\t\t\t");

                          String idEbook,judul,deskripsi,file_pdf,gambar;
                         
                          idEbook = request.getParameter("id");
                          mBook book = new mBook();
                          ArrayList data = new ArrayList();
                          book.setIdEBook(idEbook);
                          data = book.getRecord();
                          idEbook = (String) data.get(0);
                          judul = (String) data.get(1);
                          deskripsi = (String) data.get(2);
                          file_pdf = "/upload/" + (String) data.get(3);
                          gambar = "/foto/" + (String) data.get(4);
                      
      out.write("\n");
      out.write("                 \n");
      out.write("                      <form role=\"form\" action=\"#\" method=\"POST\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>ID EBook</label>\n");
      out.write("                                                                        <input class=\"form-control\" name=\"id\"  value=\"");
      out.print(idEbook);
      out.write("\"  readonly=\"read read-only\" >\n");
      out.write("                                                                 <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Nama</label>\n");
      out.write("                                                                        <input class=\"form-control\" name=\"judul\" value=\"");
      out.print(judul);
      out.write("\" readonly=\"read read-only\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        \n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Deskripsi</label>\n");
      out.write("                                                                        <textarea class=\"form-control\" name=\"alamat\" rows=\"3\" required=\"\" readonly=\"read read-only\"> ");
      out.print(deskripsi);
      out.write(" </textarea>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                         <div class=\"form-group\">\n");
      out.write("                                                                    <label>File input</label>\n");
      out.write("                                                                    <input class=\"form-control\" id=\"txt_pdf\" name=\"txt_pdf\" value=\"");
      out.print(file_pdf);
      out.write("\" readonly=\"read read-only\"> \n");
      out.write("                                                         </div>\n");
      out.write("                                                         <div class=\"form-group\">\n");
      out.write("                                                                    <label>Gambar</label>\n");
      out.write("                                                                    <input class=\"form-control\" id=\"txt_foto\" name=\"txt_foto\" value=\"");
      out.print(gambar);
      out.write("\" readonly=\"read read-only\"> \n");
      out.write("                                                         </div>\n");
      out.write("                                                         \n");
      out.write("                                                         \n");
      out.write("                      </form>\n");
      out.write("                                                                   \n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/chart.min.js\"></script>\n");
      out.write("\t<script src=\"js/chart-data.js\"></script>\n");
      out.write("\t<script src=\"js/easypiechart.js\"></script>\n");
      out.write("\t<script src=\"js/easypiechart-data.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap-datepicker.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap-table.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t!function ($) {\n");
      out.write("\t\t\t$(document).on(\"click\",\"ul.nav li.parent > a > span.icon\", function(){\t\t  \n");
      out.write("\t\t\t\t$(this).find('em:first').toggleClass(\"glyphicon-minus\");\t  \n");
      out.write("\t\t\t}); \n");
      out.write("\t\t\t$(\".sidebar span.icon\").find('em:first').addClass(\"glyphicon-plus\");\n");
      out.write("\t\t}(window.jQuery);\n");
      out.write("\n");
      out.write("\t\t$(window).on('resize', function () {\n");
      out.write("\t\t  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')\n");
      out.write("\t\t})\n");
      out.write("\t\t$(window).on('resize', function () {\n");
      out.write("\t\t  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')\n");
      out.write("\t\t})\n");
      out.write("\t</script>\t\n");
      out.write("</body>\n");
      out.write("\n");
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
