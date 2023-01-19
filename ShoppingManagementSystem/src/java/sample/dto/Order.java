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
public class Order {
    private int OrderID;
    private String OrdDate;
    private String shipdate;
    private int status;
    private int AccID;

    public Order() {
    }

    public Order(int OrderID, String OrdDate, String shipdate, int status, int AccID) {
        this.OrderID = OrderID;
        this.OrdDate = OrdDate;
        this.shipdate = shipdate;
        this.status = status;
        this.AccID = AccID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public String getOrdDate() {
        return OrdDate;
    }

    public void setOrdDate(String OrdDate) {
        this.OrdDate = OrdDate;
    }

    public String getShipdate() {
        return shipdate;
    }

    public void setShipdate(String shipdate) {
        this.shipdate = shipdate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAccID() {
        return AccID;
    }

    public void setAccID(int AccID) {
        this.AccID = AccID;
    }

    @Override
    public String toString() {
        return "Order{" + "OrderID=" + OrderID + ", OrdDate=" + OrdDate + ", shipdate=" + shipdate + ", status=" + status + ", AccID=" + AccID + '}';
    }

   
    
}
