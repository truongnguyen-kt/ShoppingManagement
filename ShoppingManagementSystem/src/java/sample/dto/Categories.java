/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dto;

/**
 *
 * @author Minh Tran
 */
public class Categories {
    private int CateID;
    private String CateName;

    public Categories(int CateID, String CateName) {
        this.CateID = CateID;
        this.CateName = CateName;
    }

    public Categories() {
    }

    public int getCateID() {
        return CateID;
    }

    public void setCateID(int CateID) {
        this.CateID = CateID;
    }

    public String getCateName() {
        return CateName;
    }

    public void setCateName(String CateName) {
        this.CateName = CateName;
    }

    @Override
    public String toString() {
        return "Categories{" + "CateID=" + CateID + ", CateName=" + CateName + '}';
    }
    
    
}
