/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBank;

import java.util.ArrayList;

/**
 *
 * @author chintanbhargave
 */
public class BloodBankDirectory {
    
    ArrayList<BloodBank> bloodBankList;

    public BloodBankDirectory() {
        this.bloodBankList = new ArrayList();
    }
    
    public void addBloodBank(BloodBank bloodBank){
        bloodBankList.add(bloodBank);
    }
    
    public ArrayList<BloodBank> getBloodBankList(){
        return this.bloodBankList;
    }
    
    public String getBBNameById(int bId){
        for(BloodBank b: bloodBankList){
            if(bId == b.getId()){
                return b.getName();
            }
        }
        return "";
    }
    
    public BloodBank getBBById(int bId){
        for(BloodBank b: bloodBankList){
            if(bId == b.getId()){
                return b;
            }
        }
        return null;
    }
}
