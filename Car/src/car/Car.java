/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author ajpGa
 */
public class Car {
    
    private String id;
    private String model;
    private String make;
    private String year;
    private String numberPlate;
    private String status;
    private String category;
    
    public Car(){}
    
    public Car(String id,String model,String make,String year,String numberPlate,String status,String category){
        this.id = id;
        this.model = model;
        this.make = make;
        this.year = year;
        this.numberPlate = numberPlate;
        this.status = status;
        this.category = category;
    }
    
    public String getId() { return id; }
    public String getModel() { return model; }
    public String getMake() { return make; }
    public String getYear() { return year; }
    public String getNumberPlate() { return numberPlate; }
    public String getStatus() { return status; }
    public String getCategory() { return category; }
    
    public void setId(String id) {this.id = id;}
    public void setModel(String model) {this.model = model;}
    public void setMake(String make) {this.make = make;}
    public void setYear(String year) {this.year =year;}
    public void setNumberPlate(String numberPlate) {this.numberPlate = numberPlate;}
    public void setStatus(String status) {this.status = status;}
    public void setCategory(String category) {this.category = category;}
}
