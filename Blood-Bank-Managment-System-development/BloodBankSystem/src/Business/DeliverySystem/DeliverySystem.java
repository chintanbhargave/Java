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
public class DeliverySystem {
    
    private DeliveryPersonDirectory deliveryPersonDirectory;
    private SupervisorDirectory supervisorDirectory;
    
    public DeliverySystem() {
        this.deliveryPersonDirectory = new DeliveryPersonDirectory();
        this.supervisorDirectory = new SupervisorDirectory();
    }
    
    public DeliveryPersonDirectory getDeliveryPersonDirectory() {
        return deliveryPersonDirectory;
    }
    
    public SupervisorDirectory getSupervisorDirectory() {
        return supervisorDirectory;
    }
    
}
