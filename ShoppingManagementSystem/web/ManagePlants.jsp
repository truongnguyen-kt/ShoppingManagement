<%-- 
    Document   : ManageAccounts
    Created on : Oct 18, 2022, 10:23:30 PM
    Author     : Minh Tran
--%>

<%@page import="sample.dao.ProductDAO"%>
<%@page import="sample.dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="AdminPage.jsp"/>
        <% String tmp[] = {"out of stock", "available"};
        %>
        <table class="order" style="text-align: center" border="1px">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>price</th>
                <th>description</th>
                <th>status</th>
                <th>cateid</th>
                <th>Update Flower</th>
            </tr>
            <c:forEach var="plant" items="${sessionScope.plantList}">
                <tr>
                    <td>${plant.getId()}</td>
                    <td>${plant.getName()}</td>
                    <td>${plant.getPrice()}</td>
                    <td>${plant.getDescription()}</td>
                    <td>
                        <c:choose>
                            <c:when test="${plant.getStatus() eq 1}"><span style="color: green">In stock</span></c:when>
                            <c:otherwise> <span style="color: red">Out of stock</span></c:otherwise>
                        </c:choose>
                    </td>
                    <td>${plant.getCateid()}</td>
                    <td><a href = "UpdateFlower.jsp?PID=${plant.getId()}">Update Flower</a></td>
                </tr>
            </c:forEach>
        </table>
        <div style="margin: 0 auto; text-align:center; margin-top: 10px;" border="1" width="1000px">
            <a href = "CreateNewProduct.jsp">Create New Product</a>
        </div>
    </body>
</html>
