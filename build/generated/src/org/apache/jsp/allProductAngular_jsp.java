package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class allProductAngular_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html  ng-app=\"turtleFacts\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <!--All CSS Link-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.css\" />\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap-theme.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("        <style>\n");
      out.write("            .well-image{\n");
      out.write("                width: 100%;\n");
      out.write("                max-height:  162px;\n");
      out.write("            }\n");
      out.write("            .dd{\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--=======--------=============body code start --=============================================================--> \n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("                <h1>See All Of Our Medicine Product's</h1>\n");
      out.write("                <P>Beacon Pharmaceuticals Limited is the number one oncology company and one of the leading and fastest growing pharmaceutical companies of Bangladesh. \n");
      out.write("                    The Company started its operation in 2006. Now Beacon is one of the top oncology pharmaceutical companies of Bangladesh.</P>\n");
      out.write("            </div>\n");
      out.write("            <div ng-controller=\"listCtrl as list\"\n");
      out.write("                 ng-hide=\"list.quizeActive\"\n");
      out.write("                 >\n");
      out.write("                <form class=\"form-inline well well-sm clearfix\">\n");
      out.write("\n");
      out.write("                    <input type=\"text\"\n");
      out.write("                           placeholder=\"Search ..\" \n");
      out.write("                           class=\"form-control col-sm-6 pull-right\" \n");
      out.write("                           Style=\"width: 50%\"\n");
      out.write("                           ng-model=\"list.search\">\n");
      out.write("                    <button \n");
      out.write("                        ng-click=\"list.activateQuize()\"\n");
      out.write("                        class=\"btn btn-danger pull-left\">\n");
      out.write("                        <strong>Strat Quize</strong>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6\" ng-repeat=\"turtle in list.data| filter:list.search \">\n");
      out.write("                        <div class=\"well well-sm\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <img ng-src=\"{{turtle.Image_url}}\" alt=\"img\" class=\"img-rounded img-responsive well-image pull-left\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-8 pull-right\">\n");
      out.write("                                    <h4>{{turtle.type}}\n");
      out.write("                                    </h4>\n");
      out.write("                                    <p><strong>Generic Name : </strong>{{turtle.Generic_Name}}</p>\n");
      out.write("                                    <p><strong>Size: </strong>{{turtle.size}}</p>\n");
      out.write("                                    <p><strong>Strength : </strong>{{turtle.Strength}}</p>\n");
      out.write("                                    <p><strong>Registrations : </strong>{{turtle.Registrations}}</p>\n");
      out.write("                                    <p><strong>Categories: </strong>{{turtle.Categories}}</p>\n");
      out.write("                                    <button class=\"btn btn-warning pull-right\"\n");
      out.write("                                            data-target=\"#myModal\"\n");
      out.write("                                            data-toggle=\"modal\"\n");
      out.write("                                            ng-click=\"list.changeActiovTurtle(turtle)\">Learn More</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h2>Modal Example</h2>\n");
      out.write("                    <!-- Trigger the modal with a button -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- Modal -->\n");
      out.write("                    <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("                        <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                            <!-- Modal content-->\n");
      out.write("                            <div class=\"modal-content\">\n");
      out.write("                                <div class=\"modal-header\">\n");
      out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                    <h2 class=\"modal-title\">{{list.activeTurtle.type}}</h2>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-body dd\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-xs-8 col-xs-offset-2\">\n");
      out.write("                                            <img ng-src=\"{{list.activeTurtle.Image_url}}\" \n");
      out.write("                                                 class=\"img-rounded img-responsive\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row top-buffer\">\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                          \n");
      out.write("                                                <p><strong>Generic Name : </strong>{{list.activeTurtle.Generic_Name}}</p>\n");
      out.write("                                                <p><strong>Size: </strong>{{list.activeTurtle.size}}</p>\n");
      out.write("                                                <p><strong>Strength: </strong>{{list.activeTurtle.Strength}}</p>\n");
      out.write("                                                <p><strong>Registrations : </strong>{{list.activeTurtle.Registrations}}</p>\n");
      out.write("                                                <p><strong>Categories : </strong>{{list.activeTurtle.Categories}}</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-xs-12 top-buffer\">\n");
      out.write("                                            \n");
      out.write("                                                <p><strong>Description : </strong>{{list.activeTurtle.description}}</p> \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-footer\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--=======--------=============body code END --=============================================================--> \n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/angular.js\"></script>\n");
      out.write("        <!--our custom JS-->\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/app.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/controller/listCtrl.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/controller/Quize.js\"></script>\n");
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
