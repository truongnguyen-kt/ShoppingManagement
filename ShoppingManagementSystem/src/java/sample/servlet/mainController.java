/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.ir.BreakableNode;

/**
 *
 * @author Minh Tran
 */
public class mainController extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String action = request.getParameter("action");
            String url = "index.jsp";
            switch (action) {
                case MyConst.SEARCH:
                    url = "index.jsp";
                    break;
                case MyConst.LOGIN:
                    url = MyConst.LOGIN_SERVLET;
                    break;
                case MyConst.REGISTER:
                    url = MyConst.REGISTER_SERVLET;
                    break;
                case MyConst.LOGOUT:
                    url = MyConst.LOGOUT_SERVLET;
                    break;
                case MyConst.ADD_TO_CART:
                    url = MyConst.ADD_TO_CART_SERVLET;
                    break;
                case MyConst.VIEW_CART:
                    url = "viewcart.jsp";
                    break;
                case MyConst.UPDATE:
                    url = MyConst.UPDATE_CART_SERVLET;
                    break;
                case MyConst.DELETE:
                    url = MyConst.DELETE_CART_SERVLET;
                    break;
                case MyConst.SAVE_ORDER:
                    url = MyConst.SAVE_SHOPPING_CART_SERVLET;
                    break;
                case MyConst.MANAGE_ACCOUNTS:
                    url = MyConst.MANAGE_ACCOUNTS_SERVLET;
                    break;
                case MyConst.UPDATE_STATUS_ACCOUNT:
                    url = MyConst.UPDATE_STATUS_ACCOUNT_SERVLET;
                    break;
                case MyConst.CHANGE_STATUS_ORDERS:
                    url = MyConst.CHANGE_STATUS_ORDERS_SERVLET;
                    break;
                case MyConst.VIEW_COMPLETED_ORDERS:
                    url = MyConst.VIEW_ORDERS_SERVLET;
                    break;
                case MyConst.VIEW_CANCELED_ORDERS:
                    url = MyConst.VIEW_ORDERS_SERVLET;
                    break;
                case MyConst.VIEW_PROCESSING_ORDERS:
                    url = MyConst.VIEW_ORDERS_SERVLET;
                    break;
                case MyConst.SEARCH_ACCOUNT_FOR_ADMIN:
                    url = MyConst.SEARCH_ACCOUNT_FOR_ADMIN_SERVLET;
                    break;
                case MyConst.MANAGE_ORDERS:
                    url = MyConst.MANAGE_ORDERS_SERVLET;
                    break;
                case MyConst.MANAGE_PLANTS:
                    url = MyConst.MANAGE_PLANTS_SERVLET;
                    break;
                case MyConst.SEARCH_ORDER_FOR_ADMIN:
                    url = MyConst.SEARCH_ORDER_FOR_ADMIN_SERVLET;
                    break;
                case MyConst.MANAGE_CATEGORIES:
                    url = MyConst.MANAGE_CATEGORIES_SERVLET;
                    break;
                case MyConst.CHANGE_PROFILE:
                    url = MyConst.CHANGE_PROFILE_SERVLET;
                    break;
                case MyConst.FAVORITE:
                    url = MyConst.FAVORITE_SERVLET;
                    break;
                case MyConst.ORDER_BY:
                    url = MyConst.ORDER_BY_SERVLET;
                    break;
                case MyConst.UPDATE_CATEGORY:
                    url = MyConst.UPDATE_CATEGORY_SERVELT;
                    break;
                case MyConst.CREATE_CATEGORY:
                    url = MyConst.CREATE_CATEGORY_SERVLET;
                    break;
                case MyConst.UPDATE_FLOWER:
                    url = MyConst.UPDATE_FLOWER_SERVLET;
                    break;
                case MyConst.SEARCH_ORDER_FROM_DATE_TO_DATE:
                    url = MyConst.SEARCH_ORDER_FROM_DATE_TO_DATE_SERVLET;
                    break;
                case MyConst.CREATE_NEW_PRODUCT:
                    url = MyConst.CREATE_NEW_PRODUCT_SERVLET;
                    break;
            }
            request.getRequestDispatcher(url).forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
