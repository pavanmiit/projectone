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
public class FlightReservationSystem {
public static void printTicketDetails(Ticket ticket){
System.out.println(ticket.pnr);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TouristTicket ticket1=new TouristTicket("12345");
       RegularTicket ticket2 =new RegularTicket("123321");
       ticket1.setHotelAddress("mumbai");
      FlightReservationSystem.printTicketDetails(ticket2);
      FlightReservationSystem.printTicketDetails(ticket1);
    }    
}
