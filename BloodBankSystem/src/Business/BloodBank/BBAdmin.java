/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBank;

import Business.CollectionCentre.CollectionCentre;
import java.util.HashMap;

/**
 *
 * @author chintanbhargave
 */
public class BBAdmin {

    private BloodBankDirectory bloodBankDierctory;

    public BBAdmin() {
        this.bloodBankDierctory = new BloodBankDirectory();
    }

    public BloodBank createBloodBank(String name, String zip) {
        BloodBank bloodBank = new BloodBank(name, zip);
        return bloodBank;
    }

    public BloodBankDirectory getBloodBankDierctory() {
        return bloodBankDierctory;
    }

    public Assistant createAssistant(String name, String userName, String password) {
        return new Assistant(name, userName, password);
    }

    public Donor createDonor(String name, String userName, String password) {
        return new Donor(name, userName, password);
    }

    

}
