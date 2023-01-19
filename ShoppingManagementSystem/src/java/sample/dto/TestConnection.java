/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dto;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import sample.dao.AccountDAO;
import sample.dao.CategoriesDAO;
import sample.dao.OrderDAO;
import sample.dao.ProductDAO;

/**
 *
 * @author Minh Tran
 */
public class TestConnection {

    public static void main(String[] args) throws Exception {
        /*Account acc = AccountDAO.getAccount("user@gmail.com", "12345");
        if(acc != null)
        {
            if(acc.getRole() == 1)
            {
                System.out.println("I am an admin");
            }
            else System.out.println("I am a user");
        }
        System.out.println(acc);*/
 /*ArrayList<Product> list = ProductDAO.getProducts("JEANS", "byname");
        for (Product product : list) {
            System.out.println(product);
        }*/
 /*ArrayList<Product> list = ProductDAO.displayAllProducts();
        for (Product product : list) {
            System.out.println(product);
        }*/
 /*Product p = ProductDAO.getProduct(1);
        System.out.println(p);*/
        /*ArrayList<Order> list = OrderDAO.getAllOrders_BasedonStatus("test@gmail.com", 2);
        for (Order order : list) {
            System.out.println(order);
        }*/
        /*ArrayList<OrderDetail>list = OrderDAO.getOrderDetail(1);
        for (OrderDetail orderDetail : list) {
            System.out.println(orderDetail);
        }*/
        /*ArrayList<Categories>lists = CategoriesDAO.getAllCategorieses();
        for (Categories list : lists) {
            System.out.println(list);
        }*/
        /*ArrayList<Account> list = AccountDAO.getAccountBasedOnEmail("admin@gmail.com");
        for (Account account : list) {
            System.out.println(account);
        }*/
        
        
        if(ProductDAO.createNewProduct("JAVA", "11", ".jpg", "hello", "3"))
        {
            System.out.println("true");
        }
        else System.out.println("fail");
    }
}
