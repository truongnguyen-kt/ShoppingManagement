<%-- 
    Document   : personalPage
    Created on : Oct 2, 2022, 7:52:11 PM
    Author     : Minh Tran
--%>

<%@page import="sample.dto.Account"%>
<%@page import="sample.dao.AccountDAO"%>
<%@page import="sample.dto.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="sample.dao.OrderDAO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .cart_h3
            {
                color: red;
                margin-left: 60px;
            }
        </style>
    </head>
    <body>
        <header>
            <%@include file="header.jsp"%>
        </header>
        <section>
            <%
                String name = (String) session.getAttribute("name");
                String email = (String) session.getAttribute("email");
                Cookie[] c = request.getCookies();
                boolean login = false;
                if (name == null) {
                    String token = "";
                    for (Cookie cookie : c) {
                        if (cookie.getName().equals("selector")) {
                            token = cookie.getValue();
                            Account acc = AccountDAO.getAccount(token);
                            if (acc != null) {
                                name = acc.getFullname();
                                email = acc.getEmail();
                                login = true;
                            }
                        }
                    }
                } else {
                    login = true;
                }
                //show content if login = true
                if (login == true) {
            %>
            <section>
                <h3 style="text-align: center; color: brown; margin-bottom: 15px">Welcome ${sessionScope.name} come back </h3>
            </section>
            <%
                ArrayList<Order> list = OrderDAO.getOrders(email);
                String[] status = {"", "processing", "completed", "cancelled"};
            %>
            <table style="margin: 0 auto; text-align:center;" border="1" width="1000px" >
                <tr>
                    <th>Order ID</th>
                    <th>Order Date</th>
                    <th>Ship Date</th>  
                    <th>Order Status's</th>
                    <th>action</th>
                </tr>
                <% if (list != null && !list.isEmpty()) {
                        for (Order ord : list) {
                %>
                <tr>
                    <td><%= ord.getOrderID()%></td>
                    <td><%= ord.getOrdDate()%></td>
                    <td><%= ord.getShipdate()%></td>
                    <td>
                        <%= status[ord.getStatus()]%><br>
                        <% if (ord.getStatus() == 1) {
                        %>
                        <a style="color: red" href ="mainController?action=changeStatusOrder&OrderID=<%= ord.getOrderID()%>&status=<%= ord.getStatus()%>">cancel order</a>
                        <% } else if (ord.getStatus() == 3) {
                        %>
                        <a style="color: green" href ="mainController?action=changeStatusOrder&OrderID=<%= ord.getOrderID()%>&status=<%= ord.getStatus()%>">processing order</a>
                        <%}
                        %>

                    </td>    
                    <td>
                        <a  href = "OrderDetail.jsp?OrderID=<%= ord.getOrderID()%>">detail</a>
                    </td>   
                </tr>
                <%
                        }
                    }
                %>
            </table>
            <%
            } else {
            %>
            <h3 style="text-align: center; color: red; margin-top: 20px">You have to login to view Orders</h3> 
            <%      }
                // het if 
            %>
        </section>
        <footer>
            <%@include file="footer.jsp" %>
        </footer>

    </body>
</html>
