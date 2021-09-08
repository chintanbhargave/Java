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
public class Supervisor extends User {
    private int dsId;
    
    public Supervisor(String name, String userName, String password) {
        super(name, userName, password);
    }
    
    public int getDsId() {
        return dsId;
    }
    
    public void setDsId(int dsId) {
        this.dsId = dsId;
    }
}
