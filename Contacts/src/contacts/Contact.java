/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *
 * @author CCannon
 */
public class Contact {
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String emailAddress;

    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    public String getfirstName(){    
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public String toString(){
        return firstName + " " + lastName + " " + phoneNumber + " " + emailAddress;
    }
}
