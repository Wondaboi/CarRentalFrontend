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
public class Customer {
     
    private String id;
    private String name;
    private String surname;
    private String email;
    private String address;
    
    public Customer(){}
    
    public Customer(String id,String name,String surname,String email,String address){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
    }
    
    public String getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }

    public void setId(String id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setEmail(String email) {this.email = email;}
    public void setAddress(String address) {this.address = address;}
}
