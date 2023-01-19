<%-- 
    Document   : ManageCategories
    Created on : Oct 30, 2022, 7:41:25 PM
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
        <style>
            input{
                margin: 10px;
                border-radius: 4px;
            }
        </style>
    </head>
    <body>
        <c:import url="AdminPage.jsp"/>
        <table class="order" style="margin: 0 auto; text-align:center" border="1" width="1000px"  style="margin-top: 10px;">
            <tr>
                <th>CateID</th>
                <th>CateName</th>
                <th>Update Category</th>
            </tr>
            <c:forEach var="cate" items="${sessionScope.CategoriesList}">
                <tr>
                    <td>${cate.getCateID()}</td>
                    <td>${cate.getCateName()}</td>
                    <td><a href = "UpdateCate.jsp?CateID=${cate.getCateID()}">Update Category</a></td>
                </tr>
            </c:forEach>
        </table>
        <div style="margin: 0 auto; text-align:center; margin-top: 10px;" border="1" width="1000px">
            <a href = "CreateCategory.jsp">Create Category</a>
        </div>
    </body>
</html>
