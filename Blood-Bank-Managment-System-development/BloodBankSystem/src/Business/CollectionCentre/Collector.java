/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CollectionCentre;

import Business.User.User;

/**
 *
 * @author chintanbhargave
 */
public class Collector extends User{
    private int ccId;
    
    public Collector(String name, String userName, String password) {
        super(name, userName, password);
    }
    
    public int getCcId() {
        return ccId;
    }
    
    public void setCcId(int ccId) {
        this.ccId = ccId;
    }
    
    
}
