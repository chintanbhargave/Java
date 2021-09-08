/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.BloodBank.BloodBankDirectory;

/**
 *
 * @author chintanbhargave
 */
public class Hospital {
   
   private int id;
    private String name;
    
    private BloodBankDirectory bloodBankDirectory;
    private JrDoctorDirectory jrDoctorDirectory;
    private DoctorDirectory doctorDirectory;
    
    private static int count = 0;
    
    public Hospital(String name) {
        this.id = count++;
        this.name = name;
        this.doctorDirectory = new DoctorDirectory();
        this.jrDoctorDirectory = new JrDoctorDirectory();
        this.bloodBankDirectory = new BloodBankDirectory();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setBloodBankDirectory(BloodBankDirectory bloodBankDirectory) {
        this.bloodBankDirectory = bloodBankDirectory;
    }

    public void setJrDoctorDirectory(JrDoctorDirectory jrDoctorDirectory) {
        this.jrDoctorDirectory = jrDoctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public BloodBankDirectory getBloodBankDirectory() {
        return bloodBankDirectory;
    }
    public JrDoctorDirectory getJrDoctorDirectory() {
        return jrDoctorDirectory;
    }
    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    } 
    
}
