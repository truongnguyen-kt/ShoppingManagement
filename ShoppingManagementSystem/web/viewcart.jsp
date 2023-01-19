<%@page import="sample.dao.ProductDAO"%>
<%@page import="sample.dto.Product"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>MultiShop - Online Shop Website Template</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="Free HTML Templates" name="keywords">
        <meta content="Free HTML Templates" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">  

        <!-- Font Awesome -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">  

        <!-- Font Awesome -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
        <script type="text/javascript">
            function warning()
            {
                var ans = window.confirm('Do you want to remove the product?');
                if (ans == true)
                    return true;
                else
                    return false;
            }
        </script>
 
    </head>

    <body>
        <header>
            <%@include file = "header.jsp"%>
        </header>
        <section>
            <!-- Breadcrumb Start -->
            <div class="container-fluid">
                <div class="row px-xl-5">
                    <div class="col-12">
                        <nav class="breadcrumb bg-light mb-30">
                            <a class="breadcrumb-item text-dark" href="index.jsp">Home</a>
                            <span class="breadcrumb-item active">Shopping Cart</span>
                        </nav>
                    </div>
                </div>
            </div>
            <!-- Breadcrumb End -->
            
            <c:if test="${requestScope.WARNING != null}">
                <h3 style="text-align: center; color: red; margin-bottom: 20px">${requestScope.WARNING}</h3> 
            </c:if>
            <!-- Cart Start -->
            <%
                int total = 0;
                String name = (String) session.getAttribute("name");
            %>
            <div class="container-fluid">
                <div class="row px-xl-5">
                    <div class="col-lg-8 table-responsive mb-5">
                        <table class="table table-light table-borderless table-hover text-center mb-0">
                            <thead class="thead-dark">
                                <tr>
                                    <th>Products ID</th>
                                    <th>Products Name</th>
                                    <th>Price</th>
                                    <th>Quantity</th>
                                    <th>Update</th>
                                    <th>Remove</th>
                                </tr>
                            </thead>

                            <%
                                HashMap<String, Integer> cart = (HashMap< String, Integer>) session.getAttribute("cart");
                                if (cart != null) {
                                    Set<String> pids = cart.keySet();
                                    for (String pid : pids) {
                                        int quantity = cart.get(pid);
                                        Product p = ProductDAO.getProduct(Integer.parseInt(pid));
                                        total = total + quantity * p.getPrice();
                            %>
                            <form action="mainController" method="post">
                                <tbody class="align-middle">
                                    <tr>
                                        <td>
                                            <input type="hidden" value ="<%= pid%>" name="pid"><a href="getPlantServlet?pid=<%= pid%>"><%= pid%></a>
                                        </td>
                                        <td class="align-middle"><img src="<%= p.getImgpath()%>" alt="" style="width: 50px;"><%= p.getName()%></td>
                                        <td class="align-middle"><%= p.getPrice()%></td>
                                        <td class="align-middle" width = "50px">  
                                            <input type ="number" value = "<%= quantity%>" name = "quantity">
                                        </td>
                                        <td class="align-middle">
                                            <input type ="submit" value ="update" name = "action"> 
                                        </td>
                                        <td class="align-middle">
                                            <input class="btn btn-sm btn-danger" type ="submit" value ="delete" name = "action" onclick = "return warning()">
                                        </td>
                                    </tr>
                                </tbody>
                            </form>
                            <%
                                }
                            %>
                        </table>

                    </div>
                    <div class="col-lg-4">
                        <h5 class="section-title position-relative text-uppercase mb-3"><span class="bg-secondary pr-3">Cart Summary</span></h5>
                        <div class="bg-light p-30 mb-5">
                            <div class="border-bottom pb-2">
                                <div class="d-flex justify-content-between mb-3">
                                    <h6>Subtotal</h6>
                                    <h6>$<%= total%></h6>
                                </div>
                                <div class="d-flex justify-content-between">
                                    <h6 class="font-weight-medium">Shipping </h6>
                                    <h6 class="font-weight-medium">$10</h6>
                                </div>
                            </div>
                            <div class="pt-2">
                                <div class="d-flex justify-content-between mt-2">
                                    <h5>Total money</h5>
                                    <h5>$<%= total + 10%></h5>
                                </div>
                                <form action ="mainController" method = "post">
                                    <input class="btn btn-block btn-primary font-weight-bold my-3 py-3" type ="submit" value ="saveOrder" name="action" class ="submitorder">
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <%
                    }%>
            </div>
            <!-- Cart End -->
        </section>

        <footer>
            <%@include file = "footer.jsp"%>
        </footer>
    </body>
</html>