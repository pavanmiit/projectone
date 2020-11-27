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
public class RegularTicket extends Ticket{
    public String spacielService;

    public String getSpacielService() {
        return spacielService;
    }

    public RegularTicket(String pnr){
        super(pnr);
    }
    public void setSpacielService(String spacielService) {
        this.spacielService = spacielService;
    }
    public void updateSpeacielService(String specialService){
    this.spacielService=specialService;
    }
}
