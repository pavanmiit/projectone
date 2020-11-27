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
public class Passenger {
    public int id;

    public Passenger() {
    }

    public Passenger(int id, Address address, Contact contact) {
        this.id = id;
        this.address = address;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Address address;
    public Contact contact;
    public  Contact getContact(){
    return contact;
    }
    public Address getAddress(){
    return address;
    }
}
