<%-- 
    Document   : UpdateFlower
    Created on : Nov 6, 2022, 8:06:09 PM
    Author     : Minh Tran
--%>

<%@page import="sample.dto.Product"%>
<%@page import="sample.dao.ProductDAO"%>
<%@page import="sample.dto.Categories"%>
<%@page import="sample.dao.CategoriesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            input{
                margin: 10px;
                height: 30px;
                border-radius: 4px;
            }
        </style>
    </head>
    <body>
        <%
            Product p = ProductDAO.getProduct(Integer.parseInt(request.getParameter("PID")));
        %>
        <c:import url="AdminPage.jsp"/>
        <form action="mainController" method="post">
            <table class="order" style="margin: 0 auto; text-align:center" border="1" width="1000px"  style="margin-top: 10px;">
                <tr>
                    <th>PID</th>
                    <td><input type="hidden" name="PID" value="<%= request.getParameter("PID")%>"><%= request.getParameter("PID")%></td>
                </tr>
                <tr>
                    <th>PName</th>
                    <td><input type="text" placeholder="" required="" name="PName" value="${param.PName != null ? param.PName : ""}"></td>
                </tr>
                <tr>
                    <th>price</th>
                    <td><input type="text" placeholder="" required="" name="price" value="${param.price != null ? param.price : ""}"></td>
                </tr>
                <tr>
                    <th>description</th>
                    <td><input type="text" placeholder="" required="" name="description" value="${param.description != null ? param.description : ""}"></td>
                </tr>
                <tr>
                    <th>status</th>
                    <td><input type="text" placeholder="" required="" name="status" value="${param.status != null ? param.status : ""}"></td>
                </tr>
                <tr>
                    <th>CateID</th>
                    <td><input type="text" placeholder="" required="" name="CateID" value="${param.CateID != null ? param.CateID : ""}"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="action" value="UpdateFlower"></td>
                </tr>
            </table>  
        </form>
        <h3 style="margin: 0 auto; text-align:center; color: red; font-size: 20px">${requestScope.ERROR != null ? requestScope.ERROR : ""}</h3>
    </body>
</html>
