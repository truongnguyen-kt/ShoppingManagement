<%-- 
    Document   : CreateCategory
    Created on : Nov 6, 2022, 7:37:13 PM
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
                height: 30px;
                border-radius: 4px;
            }
        </style>
    </head>
    <body>
        <c:import url="AdminPage.jsp"/>
        <h3 style="margin: 0 auto; text-align:center; margin-bottom: 10px; color: chocolate; font-size: 20px">Create New Categories</h3>
         <form action="mainController" method="post">
            <table class="order" style="margin: 0 auto; text-align:center" border="1" width="1000px"  style="margin-top: 10px;">
                <tr>
                    <th>CateName</th>
                    <td><input type="text" name="CateName" required="" placeholder="" value="${param.CateName != null ? param.CateName : ""}"></td>
                    <td><input type="submit" name="action" value="createCategory"></td>
                </tr>
            </table>  
        </form>
    </body>
</html>
