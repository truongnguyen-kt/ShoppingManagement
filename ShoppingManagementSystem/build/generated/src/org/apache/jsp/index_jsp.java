package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sample.dto.Product;
import java.util.ArrayList;
import sample.dao.ProductDAO;
import java.util.ArrayList;
import sample.dao.CategoriesDAO;
import sample.dto.Categories;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
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
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
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
      out.write("                                <div class=\"nav-item dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Personal Page <i class=\"fa fa-angle-down mt-1\"></i></a>\n");
      out.write("                                    <div class=\"dropdown-menu bg-primary rounded-0 border-0 m-0\">\n");
      out.write("                                        <a href=\"personalPage.jsp\" class=\"dropdown-item\">All Orders</a>\n");
      out.write("                                        <a href=\"change_profile.jsp\" class=\"dropdown-item\">Change Profile</a>\n");
      out.write("                                        <a href=\"mainController?action=view_completed_orders&option=2&email=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"dropdown-item\">Completed Order</a>\n");
      out.write("                                        <a href=\"mainController?action=view_canceled_orders&option=3&email=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"dropdown-item\">Canceled Orders</a>\n");
      out.write("                                        <a href=\"mainController?action=view_processing_orders&option=1&email=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"dropdown-item\">Processing Orders</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"viewcart.jsp\" class=\"nav-item nav-link active\">Shopping cart</a>\n");
      out.write("                                <div class=\"nav-item dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Order By <i class=\"fa fa-angle-down mt-1\"></i></a>\n");
      out.write("                                    <div class=\"dropdown-menu bg-primary rounded-0 border-0 m-0\">\n");
      out.write("                                        <a href=\"index.jsp?opt=1\" class=\"dropdown-item\">Alphabetically, A-Z</a>\n");
      out.write("                                        <a href=\"index.jsp?opt=2\" class=\"dropdown-item\">Alphabetically, Z-A</a>\n");
      out.write("                                        <a href=\"index.jsp?opt=3\" class=\"dropdown-item\">Price, low to high</a>\n");
      out.write("                                        <a href=\"index.jsp?opt=4\" class=\"dropdown-item\">Price, high to low</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"navbar-nav ml-auto py-0 d-none d-lg-block\">\n");
      out.write("                                <a href=\"FavoriteItem.jsp\" class=\"btn px-0\">\n");
      out.write("                                    <i class=\"fas fa-heart text-primary\"></i>\n");
      out.write("                                    <span class=\"badge text-secondary border border-secondary rounded-circle\" style=\"padding-bottom: 2px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.list != null ? sessionScope.list.size() : 0}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"viewcart.jsp\" class=\"btn px-0 ml-3\">\n");
      out.write("                                    <i class=\"fas fa-shopping-cart text-primary\"></i>\n");
      out.write("                                    <span class=\"badge text-secondary border border-secondary rounded-circle\" style=\"padding-bottom: 2px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cart != null ? sessionScope.cart.size() : 0}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
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
      out.write("        <div class=\"container-fluid mb-3\">\n");
      out.write("            <div class=\"row px-xl-5\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div id=\"header-carousel\" class=\"carousel slide carousel-fade mb-30 mb-lg-0\" data-ride=\"carousel\">\n");
      out.write("                        <ol class=\"carousel-indicators\">\n");
      out.write("                            <li data-target=\"#header-carousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                            <li data-target=\"#header-carousel\" data-slide-to=\"1\"></li>\n");
      out.write("                            <li data-target=\"#header-carousel\" data-slide-to=\"2\"></li>\n");
      out.write("                        </ol>\n");
      out.write("                        <div class=\"carousel-inner\">\n");
      out.write("                            <div class=\"carousel-item position-relative active\" style=\"height: 430px;\">\n");
      out.write("                                <img class=\"position-absolute w-100 h-100\" src=\"img/banner_1.jpg\" style=\"object-fit: cover;\">\n");
      out.write("                                <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                                    <div class=\"p-3\" style=\"max-width: 100%\">\n");
      out.write("                                        <h1 class=\"display-4 text-white mb-3 animate__animated animate__fadeInDown\">Golden Retreat</h1>\n");
      out.write("                                        <p class=\"mx-md-5 px-5 animate__animated animate__bounceIn\">Autumnal evenings call for soothing solutions. Warm the soul with rich, earthy tones and nature’s comforting shades of the season</p>\n");
      out.write("                                        <a class=\"btn btn-outline-light py-2 px-4 mt-3 animate__animated animate__fadeInUp\" href=\"#\">Shop Now</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"carousel-item position-relative\" style=\"height: 430px;\">\n");
      out.write("                                <img class=\"position-absolute w-100 h-100\" src=\"img/banner_2.jpg\" style=\"object-fit: cover;\">\n");
      out.write("                                <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                                    <div class=\"p-3\" style=\"max-width: 100%;\">\n");
      out.write("                                        <h1 class=\"display-4 text-white mb-3 animate__animated animate__fadeInDown\">The Autumn Collection</h1>\n");
      out.write("                                        <p class=\"mx-md-5 px-5 animate__animated animate__bounceIn\">The autumn sun it rises, illuminating new beginnings and a new season. In our latest film we illustrate autumnal poetry with our latest collection.</p>\n");
      out.write("                                        <a class=\"btn btn-outline-light py-2 px-4 mt-3 animate__animated animate__fadeInUp\" href=\"#\">Shop Now</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"carousel-item position-relative\" style=\"height: 430px;\">\n");
      out.write("                                <img class=\"position-absolute w-100 h-100\" src=\"img/banner_3.jpg\" style=\"object-fit: cover;\">\n");
      out.write("                                <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                                    <div class=\"p-3\" style=\"max-width: 100%;\">\n");
      out.write("                                        <h1 class=\"display-4 text-white mb-3 animate__animated animate__fadeInDown\">Aurora's Call</h1>\n");
      out.write("                                        <p class=\"mx-md-5 px-5 animate__animated animate__bounceIn\">Inspired by the dawn,Aurora's Call is an ode to the early hours, its orange skies, its hopes and its promise </p>\n");
      out.write("                                        <a class=\"btn btn-outline-light py-2 px-4 mt-3 animate__animated animate__fadeInUp\" href=\"#\">Shop Now</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"carousel-item position-relative\" style=\"height: 430px;\">\n");
      out.write("                                <img class=\"position-absolute w-100 h-100\" src=\"img/banner_4.jpg\" style=\"object-fit: cover;\">\n");
      out.write("                                <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                                    <div class=\"p-3\" style=\"max-width: 700px;\">\n");
      out.write("                                        <h1 class=\"display-4 text-white mb-3 animate__animated animate__fadeInDown\">Autumn Dawn PlayList</h1>\n");
      out.write("                                        <p class=\"mx-md-5 px-5 animate__animated animate__bounceIn\">The sounds of the seasons: our favorite uplifting tracks to take you from golden hour to the watching hour</p>\n");
      out.write("                                        <a class=\"btn btn-outline-light py-2 px-4 mt-3 animate__animated animate__fadeInUp\" href=\"#\">Shop Now</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <!-- Products Start --> <!-- Display Image Product -->\n");
      out.write("        <div class=\"container-fluid pt-5 pb-3\">\n");
      out.write("            <h2 class=\"section-title position-relative text-uppercase mx-xl-5 mb-4\"><span class=\"bg-secondary pr-3\">Featured Products</span></h2>\n");
      out.write("            <div class=\"row px-xl-5\">\n");
      out.write("                ");

                    String key = request.getParameter("txtsearch");
                    String searchby = request.getParameter("searchby");
                    String opt = request.getParameter("opt");
                    ArrayList<Product> list;
                    String tmp[] = {"out of stock", "available"};
                    if (key == null && searchby == null) {
                        list = ProductDAO.getProducts("", "");
                    } else {
                        list = ProductDAO.getProducts(key, searchby);
                    }
                    if (opt != null) {
                        if (Integer.parseInt(opt) >= 3) {
                            list = ProductDAO.OrderAllPlantByPrice(opt);
                        } else if (Integer.parseInt(opt) >= 1) {
                            list = ProductDAO.OrderAllPlantByAlphabetic(opt);
                        }
                    }
                    if (list != null && list.size() > 0) {
                        for (Product p : list) {
                
      out.write("    \n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 pb-1\">\n");
      out.write("                    <div class=\"product-item bg-light mb-4\">\n");
      out.write("                        <div class=\"product-img position-relative overflow-hidden\">\n");
      out.write("                            <img class=\"img-fluid w-100\" src=\"");
      out.print( p.getImgpath());
      out.write("\" alt=\"\">\n");
      out.write("                            <div class=\"product-action\">\n");
      out.write("                                <a class=\"btn btn-outline-dark btn-square\" href=\"mainController?action=addtocart&pid=");
      out.print( p.getId());
      out.write("&check=0\"><i class=\"fa fa-shopping-cart\"></i></a>\n");
      out.write("                                <a class=\"btn btn-outline-dark btn-square\" href=\"mainController?action=Favorite&pid=");
      out.print( p.getId());
      out.write("\"><i class=\"far fa-heart\"></i></a>\n");
      out.write("                                <a class=\"btn btn-outline-dark btn-square\" href=\"getPlantServlet?pid=");
      out.print( p.getId());
      out.write("\"><i class=\"fa fa-search\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"text-center py-4\">\n");
      out.write("                            <a class=\"h6 text-decoration-none text-truncate\" href=\"\">");
      out.print( p.getName());
      out.write("</a>\n");
      out.write("                            <div class=\"d-flex align-items-center justify-content-center mt-2\">\n");
      out.write("                                <h5>$");
      out.print( p.getPrice() - 10);
      out.write("</h5><h6 class=\"text-muted ml-2\"><del>$");
      out.print( p.getPrice());
      out.write("</del></h6>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex align-items-center justify-content-center mb-1\">\n");
      out.write("                                <small class=\"fa fa-star text-primary mr-1\"></small>\n");
      out.write("                                <small class=\"fa fa-star text-primary mr-1\"></small>\n");
      out.write("                                <small class=\"fa fa-star text-primary mr-1\"></small>\n");
      out.write("                                <small class=\"fa fa-star text-primary mr-1\"></small>\n");
      out.write("                                <small class=\"fa fa-star text-primary mr-1\"></small>\n");
      out.write("                                <small>(99)</small>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
 }
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Products End -->\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer>\n");
      out.write("            ");
      out.write("\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid py-5\" id = \"2\">\n");
      out.write("            <div class=\"row px-xl-5\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"owl-carousel vendor-carousel\">\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/vendor-1.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/uniqlo.png\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/vendor-3.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/vendor-4.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/vendor-5.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/vendor-6.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/vendor-7.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bg-light p-4\">\n");
      out.write("                            <img src=\"img/vendor-8.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Vendor End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Footer Start -->\n");
      out.write("        <div class=\"container-fluid bg-dark text-secondary mt-5 pt-5\" class = \"hm\">\n");
      out.write("            <div class=\"row px-xl-5 pt-5\">\n");
      out.write("                <div class=\"col-lg-4 col-md-12 mb-5 pr-3 pr-xl-5\">\n");
      out.write("                    <h5 class=\"text-secondary text-uppercase mb-4\">Get In Touch</h5>\n");
      out.write("                    <p class=\"mb-4\">No dolore ipsum accusam no lorem. Invidunt sed clita kasd clita et et dolor sed dolor. Rebum tempor no vero est magna amet no</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt text-primary mr-3\"></i>123 Street, New York, USA</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-envelope text-primary mr-3\"></i>info@example.com</p>\n");
      out.write("                    <p class=\"mb-0\"><i class=\"fa fa-phone-alt text-primary mr-3\"></i>+012 345 67890</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-8 col-md-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h5 class=\"text-secondary text-uppercase mb-4\">Quick Shop</h5>\n");
      out.write("                            <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Shopping Cart</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Checkout</a>\n");
      out.write("                                <a class=\"text-secondary\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h5 class=\"text-secondary text-uppercase mb-4\">My Account</h5>\n");
      out.write("                            <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Shopping Cart</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Checkout</a>\n");
      out.write("                                <a class=\"text-secondary\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h5 class=\"text-secondary text-uppercase mb-4\">Newsletter</h5>\n");
      out.write("                            <p>Duo stet tempor ipsum sit amet magna ipsum tempor est</p>\n");
      out.write("                            <form action=\"\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Your Email Address\">\n");
      out.write("                                    <div class=\"input-group-append\">\n");
      out.write("                                        <button class=\"btn btn-primary\">Sign Up</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                            <h6 class=\"text-secondary text-uppercase mt-4 mb-3\">Follow Us</h6>\n");
      out.write("                            <div class=\"d-flex\">\n");
      out.write("                                <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                                <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                                <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                                <a class=\"btn btn-primary btn-square\" href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row border-top mx-xl-5 py-4\" style=\"border-color: rgba(256, 256, 256, .1) !important;\">\n");
      out.write("                <div class=\"col-md-6 px-xl-0\">\n");
      out.write("                    <p class=\"mb-md-0 text-center text-md-left text-secondary\">\n");
      out.write("                        &copy; <a class=\"text-primary\" href=\"#\">Domain</a>. All Rights Reserved. Designed\n");
      out.write("                        by\n");
      out.write("                        <a class=\"text-primary\" href=\"https://htmlcodex.com\">HTML Codex</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 px-xl-0 text-center text-md-right\">\n");
      out.write("                    <img class=\"img-fluid\" src=\"img/payments.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Footer End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Back to Top -->\n");
      out.write("        <a href=\"#\" class=\"btn btn-primary back-to-top\"><i class=\"fa fa-angle-double-up\"></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- JavaScript Libraries -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("        <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Contact Javascript File -->\n");
      out.write("        <script src=\"mail/jqBootstrapValidation.min.js\"></script>\n");
      out.write("        <script src=\"mail/contact.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Template Javascript -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        </footer>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <button class=\"dropdown-item\" type=\"button\"><a href =\"mainController?action=logout\">Log out</a></button>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("cate");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CategoriesDAO.getAllCategorieses()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                                <div class=\"nav-item dropdown dropright\">\n");
          out.write("                                    <a href=\"index.jsp?txtsearch=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cate.getCateName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&searchby=bycate\" class=\"nav-link dropdown-toggle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cate.getCateName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <h3 style=\"text-align: center; color: chocolate; margin-top: 20px\">Welcome ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email != null ? sessionScope.email : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" come back</h3> \n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
