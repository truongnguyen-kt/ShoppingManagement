/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dao;

import Utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import sample.dto.Product;

public class ProductDAO {

    public static ArrayList<Product> getProducts(String keyword, String searchby) {
        ArrayList<Product> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null && searchby != null) {
                String sql = "SELECT PID, PName, price, imgPath, description, status, Product.CateID as 'CateID', CateName\n"
                        + "FROM Product INNER JOIN Categories ON Product.CateID = Categories.CateID\n";
                if (searchby.equalsIgnoreCase("byname")) {
                    sql = sql + "WHERE Product.PName LIKE ?";
                } else {
                    sql = sql + "WHERE CateName LIKE ?";
                }
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, "%" + keyword + "%");
                ResultSet rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int id = rs.getInt("PID");
                        String name = rs.getString("PName");
                        int price = rs.getInt("price");
                        String imgpath = rs.getString("imgPath");
                        String description = rs.getString("description");
                        int status = rs.getInt("status");
                        int cateid = rs.getInt("CateID");
                        String catename = rs.getString("CateName");
                        Product product = new Product(id, name, price, imgpath, description, status, cateid, catename);
                        list.add(product);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
    
    public static Product getProduct(int pid) {
        Product p = null;
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "SELECT PID, PName, price, imgPath, description, status, Product.CateID as 'cateID', CateName\n"
                        + "FROM Product INNER JOIN Categories ON Product.CateID = Categories.CateID\n"
                        + "where PID =? ";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setInt(1, pid);
                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    int id = rs.getInt("PID");
                    String name = rs.getString("PName");
                    int price = rs.getInt("price");
                    String imgpath = rs.getString("imgPath");
                    String description = rs.getString("description");
                    int status = rs.getInt("status");
                    int cateid = rs.getInt("cateID");
                    String catename = rs.getString("CateName");
                    p = new Product(pid, name, price, imgpath, description, status, cateid, catename);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return p;
    }
    
    public static ArrayList<Product> displayAllProducts() {
        ArrayList<Product> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "SELECT PID, PName, price, imgPath, description, status, Product.CateID as 'CateID', CateName\n"
                        + "FROM Product INNER JOIN Categories ON Product.CateID = Categories.CateID\n";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int id = rs.getInt("PID");
                        String name = rs.getString("PName");
                        int price = rs.getInt("price");
                        String imgpath = rs.getString("imgPath");
                        String description = rs.getString("description");
                        int status = rs.getInt("status");
                        int cateid = rs.getInt("CateID");
                        String catename = rs.getString("CateName");
                        Product product = new Product(id, name, price, imgpath, description, status, cateid, catename);
                        list.add(product);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
    public static ArrayList<Product> getAllPlant() throws Exception {
        Connection cn = null;
        ArrayList<Product> list = new ArrayList<>();
        //make connection
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "select * from Product inner join Categories on Product.CateID = Categories.CateID";
                PreparedStatement pstm = cn.prepareStatement(sql);
                ResultSet table = pstm.executeQuery();
                if (table != null) {
                    while (table.next()) {
                        int pid = table.getInt("PID");
                        int price = table.getInt("price");
                        String pname = table.getString("PName");
                        String pimgPath = table.getString("imgPath");
                        String pdescription = table.getString("description");
                        String pcatename = table.getString("CateName");
                        int status = table.getInt("status");
                        int pCateID = table.getInt("CateID");
                        list.add(new Product(pid, pname, price, pimgPath, pdescription, status, pCateID, pcatename));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    //dong connection
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
    
    public static ArrayList<Product> OrderAllPlantByPrice(String opt) throws Exception {
        Connection cn = null;
        ArrayList<Product> list = new ArrayList<>();
        //make connection
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                switch(opt)
                {
                    case "4":
                        opt= "DESC";
                        break;
                    case "3":
                        opt= "ASC";
                        break;
                }
                String sql = "select * from Product inner join Categories on Product.CateID = Categories.CateID Order by Price " + opt;
                PreparedStatement pstm = cn.prepareStatement(sql);
                ResultSet table = pstm.executeQuery();
                if (table != null) {
                    while (table.next()) {
                        int pid = table.getInt("PID");
                        int price = table.getInt("price");
                        String pname = table.getString("PName");
                        String pimgPath = table.getString("imgPath");
                        String pdescription = table.getString("description");
                        String pcatename = table.getString("CateName");
                        int status = table.getInt("status");
                        int pCateID = table.getInt("CateID");
                        list.add(new Product(pid, pname, price, pimgPath, pdescription, status, pCateID, pcatename));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    //dong connection
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
    
    public static ArrayList<Product> OrderAllPlantByAlphabetic(String opt) throws Exception {
        Connection cn = null;
        ArrayList<Product> list = new ArrayList<>();
        //make connection
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                switch(opt)
                {
                    case "2":
                        opt= "DESC";
                        break;
                    case "1":
                        opt= "ASC";
                        break;
                }
                String sql = "select * from Product inner join Categories on Product.CateID = Categories.CateID Order by PName " + opt;
                PreparedStatement pstm = cn.prepareStatement(sql);
                ResultSet table = pstm.executeQuery();
                if (table != null) {
                    while (table.next()) {
                        int pid = table.getInt("PID");
                        int price = table.getInt("price");
                        String pname = table.getString("PName");
                        String pimgPath = table.getString("imgPath");
                        String pdescription = table.getString("description");
                        String pcatename = table.getString("CateName");
                        int status = table.getInt("status");
                        int pCateID = table.getInt("CateID");
                        list.add(new Product(pid, pname, price, pimgPath, pdescription, status, pCateID, pcatename));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    //dong connection
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
    
    public static boolean updateProduct(int PID, String PName, int price, String description, int status, int CateID)
    {
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "update Product set PName = ?, price = ?, description = ?, CateID = ?, status = ? where PID = ?";
                PreparedStatement st = cn.prepareStatement(sql);
                st.setString(1, PName);
                st.setInt(2, price);
                st.setString(3, description);
                st.setInt(4, CateID);
                st.setInt(5, status);
                st.setInt(6, PID);
                int row = st.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean createNewProduct(String PName, String price, String imgPath, String description, String CateID)
    {
        Connection cn = null;
        try {
            Product cateName = getProduct(Integer.parseInt(CateID));
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "insert into Product(PName, price, imgPath, description, status, CateID) values(?,?,?,?,?,?)";
                PreparedStatement st = cn.prepareStatement(sql);
                st.setString(1, PName);
                st.setInt(2, Integer.parseInt(price));
                st.setString(3, imgPath);
                st.setString(4, description);
                st.setInt(5, 1);
                st.setInt(6, Integer.parseInt(CateID));
                int row = st.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
