<%-- 
    Document   : CreateNewProduct
    Created on : Nov 8, 2022, 6:58:43 PM
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
        <h3 style="margin: 0 auto; text-align:center; margin-bottom: 10px; color: chocolate; font-size: 20px">Create New Product</h3>
        <form action="mainController" method="post">
            <table class="order" style="margin: 0 auto; text-align:center" border="1" width="1000px"  style="margin-top: 10px;">
                <tr>
                    <td>PName</td>
                    <td><input type="text" placeholder="" name="PName" value="${param.PName != null ? param.PName : ""}" required=""></td>
                </tr>
                <tr>
                    <td>price</td>
                    <td><input type="text" placeholder="" name="price" value="${param.price != null ? param.price : ""}" required=""></td>
                </tr>
                <tr>
                    <td>imgPath</td>
                    <td><input type="text" placeholder="" name="imgPath" value="${param.imgPath != null ? param.imgPath : ""}" required></td>
                </tr>
                <tr>
                    <td>description</td>
                    <td><input type="text" placeholder="" name="description" value="${param.description != null ? param.description : ""}" required></td>
                </tr>
                <tr>
                    <td>CateID</td>
                    <td><input type="text" placeholder="" name="CateID" value="${param.CateID != null ? param.CateID : ""}" required=""></td>
                </tr>
            </table>  
            <div style="text-align: center"><input type="submit" name="action" value="createNewProduct"></div>
        </form>
        <h3 style="margin: 0 auto; text-align:center; color: red; font-size: 20px">${requestScope.ERROR != null ? requestScope.ERROR : ""}</h3>
    </body>
</html>
