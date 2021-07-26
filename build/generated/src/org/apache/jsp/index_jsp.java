package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>English Spoken Admission</title>\n");
      out.write("        <link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"top\">\n");
      out.write("        <div class=\"wrapper col1\">\n");
      out.write("            <div id=\"head\">\n");
      out.write("                <h1><a href=\"#\">English Spoken </a></h1>\n");
      out.write("                <p>Online Admission</p>\n");
      out.write("                <div id=\"topnav\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a class=\"active\" href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">About</a>\n");
      out.write("                            <ul>\n");
      out.write("\n");
      out.write("                                <li class=\"first collapsed\"><a href=\"#\">IELTS</a></li>\n");
      out.write("                                <li class=\"collapsed\"><a href=\"#\">IELTS for UK Visas and Immigration</a></li>\n");
      out.write("                                <li class=\"collapsed\"><a href=\"#\">Cambridge English</a></li>\n");
      out.write("                                <li class=\"collapsed\"><a href=\"#\">Aptis - Assess English Skills</a></li>\n");
      out.write("                                <li class=\"collapsed\"><a href=\"#\">IGCSE/International GCSE, A Level and school exams</a></li>\n");
      out.write("                                <li class=\"collapsed\"><a href=\"#\">Professional and university exams</a></li>\n");
      out.write("                                <li class=\"leaf\"><a href=\"#\">Computer-based (CB) Test</a></li>\n");
      out.write("                                <li class=\"collapsed\"><a href=\"#\">Why take an exam with the Council?</a></li>\n");
      out.write("                                <li class=\"last collapsed\"><a href=\"#\">Information for schools and institutions</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"admissionDetail.jsp\">Admission</a>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"signup.jsp\">SignUp</a></li>\n");
      out.write("                        <li class=\"last\"><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"search\">\n");
      out.write("                    <form action=\"#\" method=\"post\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend>Site Search</legend>\n");
      out.write("                            <input type=\"submit\" name=\"go\" id=\"go\" value=\"GO\" />\n");
      out.write("                            <input type=\"text\" value=\"Search the site&hellip;\"  onfocus=\"this.value = (this.value == 'Search the site&hellip;') ? '' : this.value;\" />\n");
      out.write("                        </fieldset>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wrapper col2\">\n");
      out.write("            <div id=\"gallery\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"placeholder\" style=\"background-image:url(images/gallery_default.jpg);\">Image Holder</li>\n");
      out.write("                    <li><a class=\"swap\" style=\"background-image:url(images/d1.png);\" href=\"#gallery\"><strong>Services</strong><span><img src=\"images/gallery_1.jpg\" alt=\"\" /></span></a></li>\n");
      out.write("                    <li><a class=\"swap\" style=\"background-image:url(images/d1.jpg);\" href=\"#gallery\"><strong>Products</strong><span><img src=\"images/gallery_2.png\" alt=\"\" /></span></a></li>\n");
      out.write("                    <li class=\"last\"><a class=\"swap\" style=\"background-image:url(images/d2.jpg);\" href=\"#gallery\"><strong>Company</strong><span><img src=\"images/gallery_3.jpg\" alt=\"\" /></span></a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <div id=\"contactform\">\n");
      out.write("                    <h2>Opening Hours</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Mon-Thu 9.00-7.00</li>\n");
      out.write("                        <li>Fri-Sun 11.00-9.00</li>\n");
      out.write("                        <li>Company Name Ltd</li>\n");
      out.write("                        <li>Registered in Spoken &amp; IELTS</li>\n");
      out.write("                        <li>Company No. 123456</li>\n");
      out.write("                        <li class=\"last\">VAT No. FRD23456  </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <h2>Stay in The Know !</h2>\n");
      out.write("                    <p><a href=\"#\">Get Our E-Newsletter</a> | <a href=\"#\">Grab The RSS Feed</a></p>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"compdetails\">\n");
      out.write("\n");
      out.write("                    <div id=\"officialdetails\">\n");
      out.write("                        <h2>Company Information !</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Company Name Ltd</li>\n");
      out.write("                            <li>Registered in Spoken &amp; IELTS</li>\n");
      out.write("                            <li>Company No. 123456</li>\n");
      out.write("                            <li class=\"last\">VAT No. FRD23456  </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <h2>Stay in The Know !</h2>\n");
      out.write("                        <p><a href=\"#\">Get Our E-Newsletter</a> | <a href=\"#\">Grab The RSS Feed</a></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"contactdetails\">\n");
      out.write("                        <h2>Our Contact Details !</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Ram English Spoken Center</li>\n");
      out.write("                            <li>Azimpur,Dhaka -1205</li>\n");
      out.write("                            <li>Tel: +8806 12365478</li>\n");
      out.write("                            <li>Fax: 14785 12365478</li>\n");
      out.write("                            <li>Email: spoken@gmail.com</li>\n");
      out.write("                            <li class=\"last\">LinkedIn: <a href=\"#\">Company Profile</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                </div>\n");
      out.write("                <!-- End  Details -->\n");
      out.write("                <div id=\"copyright\">\n");
      out.write("                    <p class=\"fl_left\">Copyright &copy; 2018 - All Rights Reserved - <a href=\"#\">Nasrin Sultana</a></p>\n");
      out.write("                    <p class=\"fl_right\">Powered By <a target=\"_blank\" href=\"#\" >NS Software</a></p>\n");
      out.write("                    <br class=\"clear\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </div>\n");
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
