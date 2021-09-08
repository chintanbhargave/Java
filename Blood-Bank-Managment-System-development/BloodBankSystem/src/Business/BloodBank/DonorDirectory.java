/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBank;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author chintanbhargave
 */
public class DonorDirectory {
    ArrayList<Donor> donorList;
    
    public DonorDirectory(){
    this.donorList = new ArrayList();
    }
    
    public void addDonorToDirectory(Donor donor){
    donorList.add(donor);
    }
    
    public ArrayList<Donor> getDonorList(){
        return this.donorList;
    }
    
    public void changeHistory(int dId, Date date){
        for(Donor d: donorList){
            if(d.getId() == dId){
                d.addDonation(date);
            }
        }
    }    

    public Donor getDonorById(int id) {
        for(Donor d: donorList){
            if(d.getId() == id){
                return d;
            }
        }
        return null;
    }
    
    public void removeDonorFromDirectoryById(int dId){
        for(Donor d: donorList){
            if(d.getId() == dId){
                donorList.remove(d);
            }
        }
    }
    
}
