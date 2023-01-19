/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sample.dao.AccountDAO;
import sample.dto.Account;

/**
 *
 * @author Minh Tran
 */
public class loginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            //String url = ERROR;
            String email = request.getParameter("txtemail");
            String password = request.getParameter("txtpassword");
            String savelogin = request.getParameter("savelogin");
            Account acc = null;
            try {
                if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
                    Cookie[] c = request.getCookies();
                    String token = "";
                    if (c != null) {
                        for (Cookie cookie : c) {
                            if (cookie.getName().equals("selector")) {
                                token = cookie.getValue();
                            }
                        }
                        if (!token.isEmpty()) {
                            response.sendRedirect("index.jsp");
                        } else {
                            response.sendRedirect("errorpage.html");
                        }
                    }
                } else {
                    acc = AccountDAO.getAccount(email, password);
                    if (acc != null) {
                        //admin
                        HttpSession S = request.getSession();
                        S.setAttribute("LoginUser", acc);
                        if (acc.getRole() == 1) {
                            HttpSession session = request.getSession(true);
                            if (session != null) {
                                session.setAttribute("name", acc.getFullname());
                                session.setAttribute("email", acc.getEmail());
                                if (savelogin != null) {
                                    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                            + "0123456789"
                                            + "abcdefghijklmnopqrstuvxyz";
                                    StringBuilder sb = new StringBuilder(6);

                                    for (int i = 0; i < 6; i++) {
                                        // generate a random number between 
                                        // 0 to AlphaNumericString variable length 
                                        int index
                                                = (int) (AlphaNumericString.length()
                                                * Math.random());
                                        sb.append(AlphaNumericString
                                                .charAt(index));
                                    }
                                    String token = sb.toString();
                                    AccountDAO.updateToken(token, email);
                                    Cookie cookie = new Cookie("selector", token);
                                    cookie.setMaxAge(60 * 3);
                                    response.addCookie(cookie);
                                }
                                response.sendRedirect("AdminPage.jsp");
                            }
                        } //user 
                        else if (acc.getRole() == 0) {
                            // chuyen qua welcome page
                            HttpSession session = request.getSession(true);
                            if (session != null) {
                                session.setAttribute("name", acc.getFullname());
                                session.setAttribute("email", acc.getEmail());
                                //create a cookie and attach it to response object
                                if (savelogin != null) {
                                    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                            + "0123456789"
                                            + "abcdefghijklmnopqrstuvxyz";
                                    StringBuilder sb = new StringBuilder(6);

                                    for (int i = 0; i < 6; i++) {
                                        // generate a random number between 
                                        // 0 to AlphaNumericString variable length 
                                        int index
                                                = (int) (AlphaNumericString.length()
                                                * Math.random());
                                        sb.append(AlphaNumericString
                                                .charAt(index));
                                    }
                                    String token = sb.toString();
                                    AccountDAO.updateToken(token, email);
                                    Cookie cookie = new Cookie("selector", token);
                                    cookie.setMaxAge(60 * 3);
                                    response.addCookie(cookie);
                                }
                                response.sendRedirect("index.jsp");
                            }
                        } else {
                            response.sendRedirect("login.html");
                        }
                    }
                    else 
                    {
                        request.setAttribute("ERROR", "Invalid email or password. Please enter again!!!!");
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                //  response.sendRedirect(url);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
