/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.math.BigDecimal;

/**
 *
 * @author ajpGa
 */
public class Rent {
     
    private String id;
    private String model;
    private String category;
    private String rentDate;
    private String customerName;
    private int totalPrice;
    private int rentalDays;
    private String status;
    
    public Rent(){}
    
    public Rent(String id,String model,String category,String rentDate,String customerName,int totalPrice, int rentalDays, String status){
        this.id = id;
        this.model = model;
        this.category = category;
        this.rentDate = rentDate;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
        this.rentalDays = rentalDays;
        this.status = status;
    }
    
    public String getId() { return id; }
    public String getModel() { return model; }
    public String getCategory() { return category; }
    public String getRentDate() { return rentDate; }
    public String getCustomerName() { return customerName; }
    public int getTotalPrice() { return totalPrice; }
    public int getRentalDays() { return rentalDays; }
    public String getStatus() { return status; }
    
    public void setId(String id) {this.id = id;}
    public void setModel(String model) {this.model = model;}
    public void setCategory(String category) {this.category = category;}
    public void setRentDate(String rentDate) {this.rentDate = rentDate;}
    public void setCustomerName(String customerName) {this.customerName = customerName;}
    public void setTotalPrice(int totalPrice) {this.totalPrice = totalPrice;}
    public void setRentalDays(int rentalDays) {this.rentalDays = rentalDays;}
    public void setStatus(String status) {this.status = status;}
    
}
