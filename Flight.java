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
public class Flight {
    private String flightNumber;
    private String airline;

    public Flight() {
    }

    public Flight(int count) {
        this.count = count;
    }
    private int capacity;
    private int bookedSeat;
    int count;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(int bookedSeat) {
        this.bookedSeat = bookedSeat;
    }
    public String getFlightDetails(){
    return this.flightNumber+" "+this.airline+" "+this.capacity+" "+this.bookedSeat;
    }
    public boolean checkAvlablility(){
    if(this.bookedSeat<this.capacity){
    return true;
    }else{
    return false;
    }
    }
    public void incrementBookingCounter(){
    count++;
    }
}
