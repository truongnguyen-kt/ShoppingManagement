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
        <form action="mainController" method="post" style="margin-left:10px; margin-bottom: 10px">
            <input type="text" name="txtsearch">
            <input type="submit" name="action" value="searchAccount">
        </form>
        <table class="order" style="margin: 0 auto; text-align:center" border="1" width="1000px"  style="margin-top: 10px;">
            <tr>
                <th>ID</th>
                <th>Email</th>
                <th>Full Name</th>
                <th>Status</th>
                <th>Phone</th>
                <th>Role</th>
                <th>Action</th>
            </tr>
            <c:forEach var="acc" items="${requestScope.accountList}">
                <tr>
                    <td>${acc.getAccID()}</td>
                    <td>${acc.getEmail()}</td>
                    <td>${acc.getFullname()}</td>
                    <td>
                        <c:choose>
                            <c:when test="${acc.getStatus() eq 1}"><span style="color: green">Active</span></c:when>
                            <c:otherwise> <span style="color: red">InActive</span></c:otherwise>
                        </c:choose>
                    </td>
                    <td>${acc.getPhone()}</td>
                   
                    <td>
                        <c:choose>
                            <c:when test="${acc.getRole() eq 1}">Admin</c:when>
                            <c:otherwise>User</c:otherwise>
                        </c:choose>
                    </td>
                    <td>
                        <c:if test="${acc.getRole() eq 0}">
                            <c:url  var="mylink" value="mainController">
                                <c:param name="email" value="${acc.getEmail()}"></c:param>
                                <c:param name="status" value="${acc.getStatus()}"></c:param>
                                <c:param name="action" value="updateStatusAccount"></c:param>
                            </c:url>
                            <a href="${mylink}">Block|UnBlock</a>
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
