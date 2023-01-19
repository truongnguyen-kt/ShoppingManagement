<%-- 
    Document   : AdminPage
    Created on : Oct 19, 2022, 12:16:39 PM
    Author     : Minh Tran
--%>
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
                    <img src="img/user.png" alt="">
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
                        <a href="mainController?action=manageProducts">
                            <i class="fa fa-folder"></i>
                            <div>Manage Products</div>
                        </a>
                    </li>
                    <li>
                        <a href="mainController?action=manageCategories">
                            <i class="fa fa-folder"></i>
                            <div>Manage categories</div>
                        </a>
                    </li>
                </ul>
            </div>
            <div class="main">
                <div class="cards">
                    <div class="card">
                        <div class="card-content">
                            <div class="number">1217</div>
                            <div class="card-name">Students</div>
                        </div>
                        <div class="icon-box">
                            <i class="fas fa-user-graduate"></i>
                        </div>
                    </div>
                    <div class="card">
                        <div class="card-content">
                            <div class="number">42</div>
                            <div class="card-name">Teachers</div>
                        </div>
                        <div class="icon-box">
                            <i class="fas fa-chalkboard-teacher"></i>
                        </div>
                    </div>
                    <div class="card">
                        <div class="card-content">
                            <div class="number">68</div>
                            <div class="card-name">Employees</div>
                        </div>
                        <div class="icon-box">
                            <i class="fas fa-users"></i>
                        </div>
                    </div>
                     <div class="card">
                        <div class="card-content">
                            <div class="number">68</div>
                            <div class="card-name">Employees</div>
                        </div>
                        <div class="icon-box">
                            <i class="fas fa-users"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
