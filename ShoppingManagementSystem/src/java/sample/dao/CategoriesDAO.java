
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import sample.dto.Categories;
import sample.dto.Order;
import Utils.DBUtils;

/**
 *
 * @author Minh Tran
 */
public class CategoriesDAO {
   public static ArrayList<Categories> getAllCategorieses() {
        Connection cn = null;
        ArrayList<Categories> list = new ArrayList<>();
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "select * from Categories";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int CateID = rs.getInt("CateID");
                        String CateName = rs.getString("CateName");
                        list.add(new Categories(CateID, CateName));
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
   
   public static Categories getCategoriesByID(int CateID) {
        Connection cn = null;
        Categories cate = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "select * from Categories where CateID = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setInt(1, CateID);
                ResultSet rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int cateID = rs.getInt("CateID");
                        String CateName = rs.getString("CateName");
                        cate = new Categories(CateID, CateName);
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
        return cate;
    }
   
    public static boolean updateCategory(int CateID, String name)
    {
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "update Categories set CateName = ? where CateID = ?";
                PreparedStatement st = cn.prepareStatement(sql);
                st.setString(1, name);
                st.setInt(2, CateID);
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
    
    public static boolean insertCategory(String name)
    {
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if (cn != null) {
                String sql = "insert into Categories values (?)";
                PreparedStatement st = cn.prepareStatement(sql);
                st.setString(1, name);
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
