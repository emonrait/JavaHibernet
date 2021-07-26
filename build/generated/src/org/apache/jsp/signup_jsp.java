package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>SignUp</title>\n");
      out.write("        <link href=\"resources/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"resources/js/jquery2.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"resources/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"resources/js/angular.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"resources/js/myangular.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body ng-app=\"simpleApp\" ng-controller=\"simpleCtrl\">\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"panel panel-success\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h4 style=\"text-align: center\">Student Registration</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form class=\"form-horizontal\" ng-submit=\"submitSimple()\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-2\">Name</label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"name\" placeholder= \"name is required\" required=\"true\" ng-model=\"simpleForm.name\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <label class=\"col-sm-2\">Date of Birth</label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"dob\" placeholder=\"dd-MM-yyyy\" ng-model=\"simpleForm.dob\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-2\">Email</label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"xyz@gmail.com\" ng-model=\"simpleForm.email\"/>\n");
      out.write("                                </div>\n");
      out.write("                                 <label class=\"col-sm-2\">Password</label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"password must be 6 character\" required=\"true\" ng-model=\"simpleForm.password\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-2\">Address </label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"address\" placeholder=\"Enter your address\" ng-model=\"simpleForm.address\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <label class=\"col-sm-2\">Gender</label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <input type=\"radio\" value=\"male\" ng-model=\"simpleForm.gender\"/>Male &nbsp;&nbsp;\n");
      out.write("                                    <input type=\"radio\" value=\"female\" ng-model=\"simpleForm.gender\"/>Female\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-2\">Contact </label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"contact\" placeholder=\"Enter your contact\" ng-model=\"simpleForm.contact\"/>\n");
      out.write("                                </div>\n");
      out.write("                                 <label class=\"col-sm-2\">City </label>\n");
      out.write("                                 <div class=\"col-sm-4\" >\n");
      out.write("                                     <select ng-model=\"simpleForm.city\">\n");
      out.write("                                        <option value=\"\">select one</option>\n");
      out.write("                                        <option value=\"Dhaka\">Dhaka</option>\n");
      out.write("                                        <option value=\"Khulna\">Khulna</option>\n");
      out.write("                                        <option value=\"Chittagong\">Chittagong</option>\n");
      out.write("                                        <option value=\"Rajshahi\">Rajshahi</option>\n");
      out.write("                                        <option value=\"Barisal\">Barisal</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-2\">Course </label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <select ng-model=\"simpleForm.course\">\n");
      out.write("                                        <option value=\"\">select one</option>\n");
      out.write("                                        <option value=\"IELTS\">IELTS</option>\n");
      out.write("                                        <option value=\"GRE\">GRE</option>\n");
      out.write("                                        <option value=\"Spoken\">Spoken</option>\n");
      out.write("                                        <option value=\"ACCA\">ACCA</option>\n");
      out.write("                                        <option value=\"CAT\">CAT</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <label class=\"col-sm-2\"></label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <button class=\"btn btn-success\">Submit</button>\n");
      out.write("                                    <button type=\"reset\" class=\"btn btn-danger\">Reset</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"panel panel-success\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h4 style=\"text-align: center\">Student Details</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <table class=\"table table-bordered\">\n");
      out.write("                            <thead>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>Date of Birth</th>\n");
      out.write("                            <th>Email</th>\n");
      out.write("                            <th>Password</th>\n");
      out.write("                            <th>Address</th>\n");
      out.write("                            <th>Gender</th>\n");
      out.write("                            <th>Contact</th>\n");
      out.write("                            <th>City</th>\n");
      out.write("                            <th>Course</th>\n");
      out.write("                            <th>Action</th>\n");
      out.write("                            </thead>\n");
      out.write("                            <tr ng-repeat=\"simple in simples\">\n");
      out.write("                                <td> {{ simple.id}}</td>\n");
      out.write("                                <td> {{ simple.name}}</td>\n");
      out.write("                                <td> {{ simple.dob}}</td>\n");
      out.write("                                <td >{{ simple.email}}</td> \n");
      out.write("                                <td >{{ simple.password}}</td> \n");
      out.write("                                <td >{{ simple.address}}</td>  \n");
      out.write("                                <td >{{ simple.gender}}</td>  \n");
      out.write("                                <td >{{ simple.contact}}</td>  \n");
      out.write("                                <td >{{ simple.city}}</td>  \n");
      out.write("                                <td >{{ simple.course}}</td>   \n");
      out.write("                                <td>\n");
      out.write("                                    <a ng-click=\"editSimple(simple)\" class=\"btn btn-warning\">\n");
      out.write("                                        <span >Edit</span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a ng-click=\"deleteSimple(simple)\" class=\"btn btn-danger\">\n");
      out.write("                                        <span >Delete</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table> \n");
      out.write("                    </div>  \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
