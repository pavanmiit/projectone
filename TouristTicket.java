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
import java.util.*;
public class TouristTicket extends Ticket{
   public String hotelAddress;
   public String[] selectedTouristLocation=new String[5];

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

   

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

   
 public TouristTicket(String pnr) {
     super(pnr);
 }
    
    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }
   public void removeTouristLocation(String location){
   for(int i=0;i<5;i++){
   if(this.selectedTouristLocation[i]==location){
   this.selectedTouristLocation[i]=null;
   }
   }
   }
   public void addTouristLocation(String location){
   for(int i=0;i<5;i++){
   if(this.selectedTouristLocation[i]==null && this.selectedTouristLocation[i]==" "){
   this.selectedTouristLocation[i]=location;
   }
   }
   }
}
