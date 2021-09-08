/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBank;

import Business.User.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author chintanbhargave
 */
public class Donor extends User {

    private static int count = 0;
    private String bloodGroup;
    private ArrayList<Date> donationHistory;
    private int id;
    private int bbId;
    
    public Donor(String name, String userName, String password) {
        super(name, userName, password);
        this.id = count++;
        this.donationHistory = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public ArrayList<Date> getDonationHistory() {
        return donationHistory;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setDonationHistory(ArrayList<Date> donationHistory) {
        this.donationHistory = donationHistory;
    }

    public boolean isEligibleForDonation() {

        int size = this.getDonationHistory().size();
        if (size > 0) {

            Date lastDonation = this.getDonationHistory().get(size - 1);
            Date currentDate = Calendar.getInstance().getTime();

            int monthsDiff = currentDate.getMonth() - lastDonation.getMonth();

            if (monthsDiff < 3) {
                return false;
            }else {
                return true;
            }            
        } else {
            return true;
        }
    }

    public void addDonation(Date d){
        this.donationHistory.add(d);
    }
}
