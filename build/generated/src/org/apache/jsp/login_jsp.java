package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link href=\"resources/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"resources/js/jquery2.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"resources/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wait overlay\">\n");
      out.write("            <div class=\"loader\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container-fluid\">\t\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#collapse\" aria-expanded=\"false\">\n");
      out.write("                        <span class=\"sr-only\">navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\t\n");
      out.write("        <p><br/></p>\n");
      out.write("        <p><br/></p>\n");
      out.write("        <p><br/></p>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"col-md-3 col-xs-12\"></div>\n");
      out.write("            <div class=\"col-md-6 col-xs-12\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12 col-xs-12\" id=\"product_msg\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel panel-info\">\n");
      out.write("                    <div class=\"panel-heading\" style=\"text-align: center\"><strong>Login</strong></div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form  class=\"form-horizontal\" method=\"POST\" action=\"query.jsp\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label  for=\"nameField\" class=\"col-xs-2\">ID</label>\n");
      out.write("                                <div class=\"col-xs-10\">\n");
      out.write("                                    <input  type=\"text\" name=\"id\"  class=\"form-control\" id=\"nameField\" placeholder=\"Enter Your id\" required=\"true\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label  for=\"passField\" class=\"col-xs-2\">Password</label>\n");
      out.write("                                <div class=\"col-xs-10\">\n");
      out.write("                                    <input  type=\"password\" name=\"password\" class=\"form-control\" id=\"passField\" placeholder=\"Enter Your Password\" required=\"true\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-10 col-xs-offset-2\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary glyphicon glyphicon-log-in\">&nbsp;Login </button> \n");
      out.write("                                <button type=\"reset\" class=\"btn btn-primary glyphicon glyphicon-remove-sign\">&nbsp;Reset</button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-footer\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 col-xs-12\"></div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
