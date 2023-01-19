<%-- 
    Document   : change_profile
    Created on : Oct 30, 2022, 8:53:12 PM
    Author     : Minh Tran
--%>

<%@page import="sample.dto.Account"%>
<%@page import="sample.dao.AccountDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <%@include file="header.jsp"%>
        </header>
        <section>
            <c:if test="${sessionScope.email == null}">
                <h3 style="text-align: center; color: red; margin-top: 20px">You have to login to change profile</h3> 
            </c:if>
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
                <h3 style="text-align: center; color: brown; margin-bottom: 15px">Old profile ${sessionScope.name} </h3>
            </section>
            <table style="margin: 0 auto; text-align:center; margin-bottom: 10px" border="1" width="1000px" >
                <tr>
                    <th>ID</th>
                    <th>Email</th>
                    <th>Full Name</th>
                    <th>Status</th>
                    <th>Phone</th>
                    <th>Role</th>
                </tr>
                <%
                    ArrayList<Account> list = AccountDAO.getAccountBasedOnEmail((String) session.getAttribute("email"));
                    if (list != null || !list.isEmpty()) {
                        for (Account acc : list) {
                %>
                <tr>
                    <td><%= acc.getAccID()%></td>
                    <td><%= acc.getEmail()%></td>
                    <td><%= acc.getFullname()%></td>
                    <td><%= acc.getStatus()%></td>
                    <td><%= acc.getPhone()%></td>
                    <td><%= acc.getRole()%></td>
                </tr>
                <%  }
                    }
                %>
            </table>

            <form action = "mainController" method="post">
                <table  style="margin: 0 auto; text-align:center; margin-bottom: 10px; border-radius: 20px"  >
                    <tr>
                        <td> 
                            <input type ="text" name = "txtfullname" placeholder ="please enter fullname " value ="${param.txtfullname != null ? param.txtfullname : ""}" style = "border-radius: 20px">
                        </td>
                    </tr>
                    <tr>
                        <td> 
                            <input type ="text" name = "txtphonenumber" placeholder ="please enter phonenumber " value ="${param.txtphonenumber != null ? param.txtphonenumber : ""}" style = "border-radius: 20px; margin:10px 0px">
                        </td>
                    </tr>
                    <tr>
                        <td> 
                            <input type ="submit" name ="action" value="update_profile">
                        </td>
                    </tr>
                </table>
            </form>
            <% }%>
        </section>

        <footer>
            <%@include file="footer.jsp" %>
        </footer>         
    </body>
</html>
