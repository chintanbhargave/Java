/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliverySystem;

/**
 *
 * @author chintanbhargave
 */
public class DSAdmin {
    
   public DSAdmin() {
    }
   
    public DeliverySystem createDeliverySystem(){
        return new DeliverySystem();
    }
    
    public DeliveryPerson createDeliveryPerson(String name, String userName, String password){
        return new DeliveryPerson(name, userName, password);
    }
    
    public Supervisor createSuperVisor(String name, String userName, String password){
        return new Supervisor(name, userName, password);
    }
}


