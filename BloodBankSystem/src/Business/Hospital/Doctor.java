/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.User.User;

/**
 *
 * @author chintanbhargave
 */
public class Doctor extends User {
    
    private int hId;
    
    public Doctor(String name, String userName, String password) {
        super(name, userName, password);
    }
    
    public int gethId() {
        return hId;
    }
    
    public void sethId(int hId) {
        this.hId = hId;
    }
}
