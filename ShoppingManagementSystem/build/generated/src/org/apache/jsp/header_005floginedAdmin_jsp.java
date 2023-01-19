package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_005floginedAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\" integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\" crossorigin=\"anonymous\" />\n");
      out.write("        <link rel=\"stylesheet\" href =\"mycss.css\" type =\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"topbar\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <h2>Admin Home Page</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"search\">\n");
      out.write("                    <input type=\"text\" name=\"search\" placeholder=\"search here\">\n");
      out.write("                    <label for=\"search\"><i class=\"fas fa-search\"></i></label>\n");
      out.write("                </div>\n");
      out.write("                <i class=\"fas fa-bell\"></i>\n");
      out.write("                <div class=\"user\">\n");
      out.write("                    <img src=\"img/user.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"mainController?action=manageAccounts\">\n");
      out.write("                            <i class=\"fa fa-folder\"></i>\n");
      out.write("                            <div>Manage Accounts</div>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"mainController?action=manageOrders\">\n");
      out.write("                            <i class=\"fa fa-folder\"></i>\n");
      out.write("                            <div>Manage Orders</div>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"mainController?action=manageProducts\">\n");
      out.write("                            <i class=\"fa fa-folder\"></i>\n");
      out.write("                            <div>Manage Products</div>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"mainController?action=manageCategories\">\n");
      out.write("                            <i class=\"fa fa-folder\"></i>\n");
      out.write("                            <div>Manage categories</div>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main\">\n");
      out.write("                <div class=\"cards\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                            <div class=\"number\">1217</div>\n");
      out.write("                            <div class=\"card-name\">Students</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"icon-box\">\n");
      out.write("                            <i class=\"fas fa-user-graduate\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                            <div class=\"number\">42</div>\n");
      out.write("                            <div class=\"card-name\">Teachers</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"icon-box\">\n");
      out.write("                            <i class=\"fas fa-chalkboard-teacher\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                            <div class=\"number\">68</div>\n");
      out.write("                            <div class=\"card-name\">Employees</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"icon-box\">\n");
      out.write("                            <i class=\"fas fa-users\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"card\">\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                            <div class=\"number\">68</div>\n");
      out.write("                            <div class=\"card-name\">Employees</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"icon-box\">\n");
      out.write("                            <i class=\"fas fa-users\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
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
