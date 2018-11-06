/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeemp;

/**
 *
 * @author cm0850068
 */
public abstract class People {
    String fName;
    String lName;
    String street;
    String zip;
    String phone;
   
    public People(String fName, String lName, String street,String zip,String phone){
       this.fName=fName;
       this.lName=lName;
       this.street=street;
       this.zip=zip;
       this.phone=phone;
       display();
       
   }
   public void display(){
       System.out.printf("My name is %s %s. I live on %s , %s. And my phone number is %s.",fName, lName, street, zip, street);
   }
    
    
}
