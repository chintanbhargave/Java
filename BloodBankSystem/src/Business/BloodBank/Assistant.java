/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBank;

import Business.User.User;

/**
 *
 * @author chintanbhargave
 */
public class Assistant extends User {

    private int bloodBankId;

    public Assistant(String name, String userName, String password) {
        super(name, userName, password);
    }

    public int getBloodBankId() {
        return bloodBankId;
    }

    public void setBloodBankId(int bloodBankId) {
        this.bloodBankId = bloodBankId;
    }

}
