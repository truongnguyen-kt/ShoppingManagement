<%-- 
    Document   : AdminPage
    Created on : Oct 19, 2022, 12:16:39 PM
    Author     : Minh Tran
--%>
<%@page import="sample.dto.Categories"%>
<%@page import="sample.dao.CategoriesDAO"%>
<%@page import="sample.dto.Product"%>
<%@page import="sample.dao.ProductDAO"%>
<%@page import="sample.dao.OrderDAO"%>
<%@page import="sample.dto.Order"%>
<%@page import="sample.dao.AccountDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="sample.dto.Account"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous" />
        <link rel="stylesheet" href ="mycss.css" type ="text/css">
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>

        <div class="container">
            <div class="topbar">
                <div class="logo">
                    <h2>Admin Home Page</h2>
                </div>
                <div class="search">
                    <input type="text" name="search" placeholder="search here">
                    <label for="search"><i class="fas fa-search"></i></label>
                </div>
                <i class="fas fa-bell"></i>
                <div class="user">
                    <a href ="mainController?action=logout"><img src="img/user.png" alt=""></a>
                </div>
            </div>
            <div class="sidebar">
                <ul>
                    <li>
                        <a href="mainController?action=manageAccounts">
                            <i class="fa fa-folder"></i>
                            <div>Manage Accounts</div>
                        </a>
                    </li>
                    <li>
                        <a href="mainController?action=manageOrders">
                            <i class="fa fa-folder"></i>
                            <div>Manage Orders</div>
                        </a>
                    </li>
                    <li>
                        <a href="mainController?action=managePlants">
                            <i class="fa fa-folder"></i>
                            <div>Manage Products</div>
                        </a>
                    </li>
                    <li>
                        <a href="mainController?action=manageCategories">
                            <i class="fa fa-folder"></i>
                            <div>Manage Categories</div>
                        </a>
                    </li>
                </ul>
            </div>
            <%
                ArrayList<Account> list = AccountDAO.getAccount();
                ArrayList<Order> ord = OrderDAO.getAllOrder();
                ArrayList<Product> p = ProductDAO.getAllPlant();
                ArrayList<Categories> cate = CategoriesDAO.getAllCategorieses();
            %>
            <div class="main">
                <div class="cards">
                    <div class="card">
                        <div class="card-content">
                            <div class="number"><%= list.size() %></div>
                            <div class="card-name">Accounts</div>
                        </div>
                        <div class="icon-box">
                            <i class="fas fa-user-graduate"></i>
                        </div>
                    </div>
                    <div class="card">
                        <div class="card-content">
                            <div class="number"><%= ord.size() %></div>
                            <div class="card-name">Orders</div>
                        </div>
                        <div class="icon-box">
                            <i class="fas fa-chalkboard-teacher"></i>
                        </div>
                    </div>
                    
                    <div class="card">
                        <div class="card-content">
                            <div class="number"><%= p.size() %></div>
                            <div class="card-name">Product</div>
                        </div>
                        <div class="icon-box">
                            <i class="fas fa-users"></i>
                        </div>
                    </div>
                    <div class="card">
                        <div class="card-content">
                            <div class="number"><%= cate.size() %></div>
                            <div class="card-name">Categories</div>
                        </div>
                        <div class="icon-box">
                            <i class="fas fa-users"></i>
                        </div>
                    </div>
                </div>
    </body>
</html>
