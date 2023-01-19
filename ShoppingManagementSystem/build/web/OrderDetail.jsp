<%-- 
    Document   : personalPage
    Created on : Oct 2, 2022, 7:52:11 PM
    Author     : Minh Tran
--%>

<%@page import="sample.dto.OrderDetail"%>
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
    </head>
    <body>
        <header>
            <%@include file="header.jsp" %>
        </header>

        <section>
            <h3 style="text-align: center; color: brown; margin-bottom: 15px">Welcome ${sessionScope.name} come back </h3>
        </section>

        <section>
            <%
                String OrderID = request.getParameter("OrderID");
                if (OrderID != null) {
                    int orderID = Integer.parseInt(OrderID.trim());
                    ArrayList<OrderDetail> list = OrderDAO.getOrderDetail(orderID);
                    if (list != null && !list.isEmpty()) {
                        int money = 0;
            %>
            <table style="margin: 0 auto; text-align:center;" border="1" width="1000px">
                <tr>
                    <th>Order ID</th>
                    <th>Plant ID</th>
                    <th>Plant Name</th>
                    <th>Image</th>
                    <th>Price</th>
                    <th>quantity</th>
                </tr>
                <%
                    for (OrderDetail detail : list) {
                %>
                <tr>
                    <td><%= detail.getOrderID()%></td>
                    <td><%= detail.getPlantID()%></td>
                    <td><%= detail.getPlantName()%></td>
                    <td><img src = '<%= detail.getImgPath()%>' class = 'plantimg' width='100px'/></td>
                    <td><%= detail.getPrice()%></td>
                    <td><%= detail.getQuantity()%></td>
                    <% money += detail.getPrice() * detail.getQuantity(); %>
                </tr>
                <% }%>
            </table>
            <h3 style="text-align:center; margin-top: 10px">Total money: <%=  money%></h3>
            <%
            }// end if
            else {
            %>
            <h3 style="text-align: center; color: red; margin-top: 20px">You have to login to view Orders</h3> 
            <%
                    }// end else if
                } //end if
            %>
        </section>
        <footer>
            <%@include file="footer.jsp" %>
        </footer>
    </body>
</html>
