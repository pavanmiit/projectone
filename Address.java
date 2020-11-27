/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flight.reservation.system;

/**
 *
 * @author HP
 */
public class Address {
     private String street;
     private String city;

    public String getStreet() {
        return street;
    }

    public Address() {
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
     private String state;
     private String address=street+" "+city+" "+state;
     public String getAddressDetails(){
     return this.address;
     }
     public void updateAddressDetails(String addressDetails){
     this.address=addressDetails;
     }
}
