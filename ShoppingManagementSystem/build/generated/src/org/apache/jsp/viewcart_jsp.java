package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sample.dao.ProductDAO;
import sample.dto.Product;
import java.util.Set;
import java.util.HashMap;

public final class viewcart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_import_url_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>MultiShop - Online Shop Website Template</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"keywords\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Web Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap\" rel=\"stylesheet\">  \n");
      out.write("\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Libraries Stylesheet -->\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Web Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap\" rel=\"stylesheet\">  \n");
      out.write("\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Libraries Stylesheet -->\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function warning()\n");
      out.write("            {\n");
      out.write("                var ans = window.confirm('Do you want to remove the product?');\n");
      out.write("                if (ans == true)\n");
      out.write("                    return true;\n");
      out.write("                else\n");
      out.write("                    return false;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            .cart_h3\n");
      out.write("            {\n");
      out.write("                margin-left: 53px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>MultiShop - Online Shop Website Template</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"keywords\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Web Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap\" rel=\"stylesheet\">  \n");
      out.write("\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Libraries Stylesheet -->\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            #search1 input\n");
      out.write("            {\n");
      out.write("                border-radius: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Topbar Start -->\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row bg-secondary py-1 px-xl-5\">\n");
      out.write("                <div class=\"col-lg-6 d-none d-lg-block\">\n");
      out.write("                    <div class=\"d-inline-flex align-items-center h-100\">\n");
      out.write("                        <a class=\"text-body mr-3\" href=\"\">About</a>\n");
      out.write("                        <a class=\"text-body mr-3\" href=\"\">Contact</a>\n");
      out.write("                        <a class=\"text-body mr-3\" href=\"\">Help</a>\n");
      out.write("                        <a class=\"text-body mr-3\" href=\"\">FAQs</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 text-center text-lg-right\">\n");
      out.write("                    <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                        <div class=\"btn-group\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\">My Account</button>\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                <button class=\"dropdown-item\" type=\"button\"><a href =\"login.jsp\">Login</a></button>\n");
      out.write("                                <button class=\"dropdown-item\" type=\"button\"><a href =\"registration.jsp\">Register</a></button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-inline-flex align-items-center d-block d-lg-none\">\n");
      out.write("                        <a href=\"\" class=\"btn px-0 ml-2\">\n");
      out.write("                            <i class=\"fas fa-heart text-dark\"></i>\n");
      out.write("                            <span class=\"badge text-dark border border-dark rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"\" class=\"btn px-0 ml-2\">\n");
      out.write("                            <i class=\"fas fa-shopping-cart text-dark\"></i>\n");
      out.write("                            <span class=\"badge text-dark border border-dark rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row align-items-center bg-light py-3 px-xl-5 d-none d-lg-flex\">\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <img src= \"img/floral_logo.png\" class =\"img-fluid\" width = \"35%\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-6 text-left\">\n");
      out.write("                    <form action = \"mainController\" method = \"post\" class=\"formsearch\">\n");
      out.write("                        <div class = \"input-group-append\" id = \"search1\">\n");
      out.write("                            <input type=\"text\" name =\"txtsearch\" placeholder=\"Search for flowers\" class=\"form-control\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(param.txtsearch != null ? param.txtsearch : \"\")}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"searchby\" value =\"byname\">\n");
      out.write("                            <input type =\"submit\" value =\"search\" name = \"action\">\n");
      out.write("                        </div>\n");
      out.write("                    </form> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-6 text-right\">\n");
      out.write("                    <p class=\"m-0\">Customer Service</p>\n");
      out.write("                    <h5 class=\"m-0\">+0987 654 321</h5>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Topbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Navbar Start -->\n");
      out.write("        <div class=\"container-fluid bg-dark mb-30\">\n");
      out.write("            <div class=\"row px-xl-5\">\n");
      out.write("                <div class=\"col-lg-3 d-none d-lg-block\">\n");
      out.write("                    <a class=\"btn d-flex align-items-center justify-content-between bg-primary w-100\" data-toggle=\"collapse\" href=\"#navbar-vertical\" style=\"height: 65px; padding: 0 30px;\">\n");
      out.write("                        <h6 class=\"text-dark m-0\"><i class=\"fa fa-bars mr-2\"></i>Categories</h6>\n");
      out.write("                        <i class=\"fa fa-angle-down text-dark\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <nav class=\"collapse position-absolute navbar navbar-vertical navbar-light align-items-start p-0 bg-light\" id=\"navbar-vertical\" style=\"width: calc(100% - 30px); z-index: 999;\">\n");
      out.write("                        <div class=\"navbar-nav w-100\">\n");
      out.write("                            <div class=\"nav-item dropdown dropright\">\n");
      out.write("                                <a href=\"index.jsp?txtsearch=Orchid&searchby=bycate\" class=\"nav-link dropdown-toggle\">Orchid</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"nav-item dropdown dropright\">\n");
      out.write("                                <a href=\"index.jsp?txtsearch=Lily&searchby=bycate\" class=\"nav-link dropdown-toggle\">Lily</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"nav-item dropdown dropright\">\n");
      out.write("                                <a href=\"index.jsp?txtsearch=Rose&searchby=bycate\" class=\"nav-link dropdown-toggle\">Rose</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"nav-item dropdown dropright\">\n");
      out.write("                                <a href=\"index.jsp?txtsearch=Tulips&searchby=bycate\" class=\"nav-link dropdown-toggle\">Tulips</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"nav-item dropdown dropright\">\n");
      out.write("                                <a href=\"index.jsp?txtsearch=Hydrangea&searchby=bycate\" class=\"nav-link dropdown-toggle\">Hydrangea</a>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"nav-item dropdown dropright\">\n");
      out.write("                                <a href=\"index.jsp?txtsearch=Orange Blossom&searchby=bycate\" class=\"nav-link dropdown-toggle\">Orange Blossom</a>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"nav-item dropdown dropright\">\n");
      out.write("                                <a href=\"index.jsp?txtsearch=Sunflower&searchby=bycate\" class=\"nav-link dropdown-toggle\">Sunflower</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-9\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg bg-dark navbar-dark py-3 py-lg-0 px-0\">\n");
      out.write("                        <a href=\"\" class=\"text-decoration-none d-block d-lg-none\">\n");
      out.write("                            <span class=\"h1 text-uppercase text-dark bg-light px-2\">Multi</span>\n");
      out.write("                            <span class=\"h1 text-uppercase text-light bg-primary px-2 ml-n1\">Shop</span>\n");
      out.write("                        </a>\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\n");
      out.write("                            <div class=\"navbar-nav mr-auto py-0\">\n");
      out.write("                                <a href=\"index.jsp\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("                                <a href=\"shop.html\" class=\"nav-item nav-link\">Shop</a>\n");
      out.write("                                <a href=\"detail.html\" class=\"nav-item nav-link\">Shop Detail</a>\n");
      out.write("                                <div class=\"nav-item dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Pages <i class=\"fa fa-angle-down mt-1\"></i></a>\n");
      out.write("                                    <div class=\"dropdown-menu bg-primary rounded-0 border-0 m-0\">\n");
      out.write("                                        <a href=\"viewcart.jsp\" class=\"dropdown-item\">Shopping Cart</a>\n");
      out.write("                                        <a href=\"checkout.html\" class=\"dropdown-item\">Checkout</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"contact.html\" class=\"nav-item nav-link\">Contact</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"navbar-nav ml-auto py-0 d-none d-lg-block\">\n");
      out.write("                                <a href=\"\" class=\"btn px-0\">\n");
      out.write("                                    <i class=\"fas fa-heart text-primary\"></i>\n");
      out.write("                                    <span class=\"badge text-secondary border border-secondary rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"viewcart.jsp\" class=\"btn px-0 ml-3\">\n");
      out.write("                                    <i class=\"fas fa-shopping-cart text-primary\"></i>\n");
      out.write("                                    <span class=\"badge text-secondary border border-secondary rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <section>\n");
      out.write("            <!-- Breadcrumb Start -->\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row px-xl-5\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <nav class=\"breadcrumb bg-light mb-30\">\n");
      out.write("                            <a class=\"breadcrumb-item text-dark\" href=\"index.jsp\">Home</a>\n");
      out.write("                            <a class=\"breadcrumb-item text-dark\" href=\"#\">Shop</a>\n");
      out.write("                            <span class=\"breadcrumb-item active\">Shopping Cart</span>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Breadcrumb End -->\n");
      out.write("            <h3 style='color:red;' class = \"cart_h3\">\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.WARNING == null ? \"\" : requestScope.WARNING}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </h3>\n");
      out.write("            <!-- Cart Start -->\n");
      out.write("            ");

                int total = 0;
                String name = (String) session.getAttribute("name");
            
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row px-xl-5\">\n");
      out.write("                    <div class=\"col-lg-8 table-responsive mb-5\">\n");
      out.write("                        <table class=\"table table-light table-borderless table-hover text-center mb-0\">\n");
      out.write("                            <thead class=\"thead-dark\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Products ID</th>\n");
      out.write("                                    <th>Products Name</th>\n");
      out.write("                                    <th>Price</th>\n");
      out.write("                                    <th>Quantity</th>\n");
      out.write("                                    <th>Update</th>\n");
      out.write("                                    <th>Remove</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("\n");
      out.write("                            ");

                                HashMap<String, Integer> cart = (HashMap< String, Integer>) session.getAttribute("cart");
                                if (cart != null) {
                                    Set<String> pids = cart.keySet();
                                    for (String pid : pids) {
                                        int quantity = cart.get(pid);
                                        Product p = ProductDAO.getProduct(Integer.parseInt(pid));
                                        total = total + quantity * p.getPrice();
                            
      out.write("\n");
      out.write("                            <form action=\"mainController\" method=\"post\">\n");
      out.write("                                <tbody class=\"align-middle\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"hidden\" value =\"");
      out.print( pid);
      out.write("\" name=\"pid\"><a href=\"getProductServlet?pid=");
      out.print( pid);
      out.write('"');
      out.write('>');
      out.print( pid);
      out.write("</a>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"align-middle\"><img src=\"");
      out.print( p.getImgpath());
      out.write("\" alt=\"\" style=\"width: 50px;\">");
      out.print( p.getName());
      out.write("</td>\n");
      out.write("                                        <td class=\"align-middle\">");
      out.print( p.getPrice());
      out.write("</td>\n");
      out.write("                                        <td class=\"align-middle\" width = \"50px\">  \n");
      out.write("                                            <input type =\"number\" value = \"");
      out.print( quantity);
      out.write("\" name = \"quantity\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"align-middle\">\n");
      out.write("                                            <input type =\"submit\" value =\"update\" name = \"action\"> \n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"align-middle\">\n");
      out.write("                                            <input class=\"btn btn-sm btn-danger\" type =\"submit\" value =\"delete\" name = \"action\" onclick = \"return warning()\">\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </form>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <h5 class=\"section-title position-relative text-uppercase mb-3\"><span class=\"bg-secondary pr-3\">Cart Summary</span></h5>\n");
      out.write("                        <div class=\"bg-light p-30 mb-5\">\n");
      out.write("                            <div class=\"border-bottom pb-2\">\n");
      out.write("                                <div class=\"d-flex justify-content-between mb-3\">\n");
      out.write("                                    <h6>Subtotal</h6>\n");
      out.write("                                    <h6>");
      out.print( total);
      out.write("</h6>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"d-flex justify-content-between\">\n");
      out.write("                                    <h6 class=\"font-weight-medium\">Shipping </h6>\n");
      out.write("                                    <h6 class=\"font-weight-medium\">$10</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"pt-2\">\n");
      out.write("                                <div class=\"d-flex justify-content-between mt-2\">\n");
      out.write("                                    <h5>Total money</h5>\n");
      out.write("                                    <h5>");
      out.print( total + 10);
      out.write("</h5>\n");
      out.write("                                </div>\n");
      out.write("                                <form action =\"mainController\" method = \"post\">\n");
      out.write("                                    <input class=\"btn btn-block btn-primary font-weight-bold my-3 py-3\" type =\"submit\" value =\"saveOrder\" name=\"action\" class =\"submitorder\">\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                } else {
                
      out.write("\n");
      out.write("                <h3 style=\"color:red\" class = \"cart_h3\">Your cart is empty</h3>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- Cart End -->\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("footer.jsp");
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_0);
    }
    return false;
  }
}
