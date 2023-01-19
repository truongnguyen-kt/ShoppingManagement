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
public class OrderDetail {
    private int orderDetailID;
    private int OrderID;
    private int plantID;
    private String PlantName;
    private int price;
    private String ImgPath;
    private int quantity;

    public OrderDetail(int orderDetailID, int OrderID, int plantID, String PlantName, int price, String ImgPath, int quantity) {
        this.orderDetailID = orderDetailID;
        this.OrderID = OrderID;
        this.plantID = plantID;
        this.PlantName = PlantName;
        this.price = price;
        this.ImgPath = ImgPath;
        this.quantity = quantity;
    }

    public OrderDetail(int OrderID, int plantID, String PlantName, int price, String ImgPath, int quantity) {
        this.OrderID = OrderID;
        this.plantID = plantID;
        this.PlantName = PlantName;
        this.price = price;
        this.ImgPath = ImgPath;
        this.quantity = quantity;
    }
    
    
    public int getOrderDetailID() {
        return orderDetailID;
    }

    public void setOrderDetailID(int orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public int getPlantID() {
        return plantID;
    }

    public void setPlantID(int plantID) {
        this.plantID = plantID;
    }

    public String getPlantName() {
        return PlantName;
    }

    public void setPlantName(String PlantName) {
        this.PlantName = PlantName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImgPath() {
        return ImgPath;
    }

    public void setImgPath(String ImgPath) {
        this.ImgPath = ImgPath;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    
    
    
}
