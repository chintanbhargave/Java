/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliverySystem;

import Business.User.User;

/**
 *
 * @author chintanbhargave
 */
public class DeliveryPerson extends User {
    
    private static int count = 0;
    private int id;
    private int sourceId;
    private int destId;
    private boolean isAvaliable = true;
    
    public DeliveryPerson(String name, String userName, String password) {
        super(name, userName, password);
        this.id = count++;
    }

    public int getId() {
        return id;
    }
    
    public int getSourceId() {
        return sourceId;
    }
    
    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }
    
    public int getDestId() {
        return destId;
    }
    
    public void setDestId(int destId) {
        this.destId = destId;
    }
    
    public boolean isIsAvaliable() {
        return isAvaliable;
    }
    
    public void setIsAvaliable(boolean isAvaliable) {
        this.isAvaliable = isAvaliable;
    }
}
