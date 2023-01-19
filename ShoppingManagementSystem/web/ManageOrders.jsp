<%-- 
    Document   : ManageAccounts
    Created on : Oct 18, 2022, 10:23:30 PM
    Author     : Minh Tran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href ="mycss.css" type ="text/css">
    </head>
    <body>
        <c:import url="AdminPage.jsp"/>
        <form action="mainController" method="post" style="margin-left:15px">
            <input type="text" name="txtid" placeholder="Enter the OrderID" value = "${param.txtid != null ? param.txtid : ""}">
            <input type="submit" name="action" value="searchOrder">
        </form>
        <div style="text-align: center; color: brown;  margin-bottom: 15px">
                <form action="mainController" method ="post">
                    <input type="date" name="from" value="${param.from != null ? param.from : ""}"> 
                    <input type="date" name="to" value="${param.to != null ? param.to : ""}"><br>
                    <input type="submit" name="action" value="searchOrderDate">
                </form>
            </div>
        <table class="order" style="text-align: center" border="1">
            <tr>
                <th>OrderID</th>
                <th>OrdDate</th>
                <th>shipdate</th>
                <th>status</th>
                <th>AccID</th>
            </tr>
            <c:forEach var="ord" items="${requestScope.orderList}">
                <tr>
                    <td>${ord.getOrderID()}</td>
                    <td>${ord.getOrdDate()}</td>
                    <td>
                        <c:choose>
                            <c:when test="${ord.getShipdate() ==  null}">NULL</c:when>
                            <c:otherwise>${ord.getShipdate()}</c:otherwise>
                        </c:choose>
                    </td>
                    <td>
                        <c:choose>
                            <c:when test="${ord.getStatus() eq 1}"><span style="color: green">Active</span></c:when>
                            <c:otherwise> <span style="color: red">InActive</span></c:otherwise>
                        </c:choose>
                    </td>
                    <td>${ord.getAccID()}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
