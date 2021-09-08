/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliverySystem;

import Business.CollectionCentre.CollectionCentre;
import java.util.ArrayList;

/**
 *
 * @author chintanbhargave
 */
public class DeliveryPersonDirectory {
    ArrayList<DeliveryPerson> deliveryPersonList;
    
    public DeliveryPersonDirectory() {
        this.deliveryPersonList = new ArrayList();
    }
    
    public void addDeliveryPersonToDirectory(DeliveryPerson deliveryPerson){
        deliveryPersonList.add(deliveryPerson);
    }

    public ArrayList<DeliveryPerson> getDeliveryPersonList() {
        return deliveryPersonList;
    }

    public DeliveryPerson getDeliveryPersonById(int id) {
        for(DeliveryPerson dp: deliveryPersonList){
            if(dp.getId() == id){
                return dp;
            }
        }
        return null;
    }

    public void removeDeliveryPersonFromDirectoryById(int id) {
        for(DeliveryPerson dp: deliveryPersonList){
            if(dp.getId() == id){
                deliveryPersonList.remove(dp);
            }
        }
    }
    
    
}
