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
public class Contact {
   private String name;
   private String phone;
   private String email;
   private String contact=name+" "+phone+" "+email;
   public String getContactDetails(){
   return this.contact;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public Contact() {
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
   public void updateContactDetails(String contactDetails){
   this.contact=contactDetails;
   }
}
