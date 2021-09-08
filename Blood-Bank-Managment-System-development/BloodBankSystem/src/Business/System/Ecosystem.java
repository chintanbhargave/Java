/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.System;

import Business.BloodBank.AssistantDirectory;
import Business.BloodBank.BloodBank;
import Business.BloodBank.BloodBankDirectory;
import Business.BloodBank.DonorDirectory;
import Business.CollectionCentre.CollectionCentre;
import Business.CollectionCentre.CollectionCentreDirectory;
import Business.CollectionCentre.CollectorDirectory;
import Business.DeliverySystem.DeliveryPersonDirectory;
import Business.DeliverySystem.DeliverySystem;
import Business.DeliverySystem.SupervisorDirectory;
import Business.Hospital.DoctorDirectory;
import Business.Hospital.Hospital;
import Business.Hospital.JrDoctorDirectory;
import Business.Request.RequestDirectory;
import Business.User.User;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author kalyanijohare
 */
public class Ecosystem {
    
    private static Ecosystem model;
    
    private AssistantDirectory assistantDirectory;
    private BloodBankDirectory bloodBankDirectory;
    private DonorDirectory donorDirectory;
    private CollectionCentreDirectory collectionCentreDirectory;
    private CollectorDirectory collectorDirectory = new CollectorDirectory();
    private DeliveryPersonDirectory deliveryPersonDirectory;
    private SupervisorDirectory supervisorDirectory;
    private DoctorDirectory doctorDirectory;
    private JrDoctorDirectory jrDoctorDirectory;
    private Hospital hospital;
    private DeliverySystem deliverySystem;
    
    private RequestDirectory requestDirectory = new RequestDirectory();
    private ArrayList<User> userDirectory = new ArrayList();
    
    
    public ArrayList<User> getUserDirectory() {
        return userDirectory;
    }
    
    public void setUserDirectory(ArrayList<User> userDirectory) {
        this.userDirectory = userDirectory;
    }

    public RequestDirectory getRequestDirectory() {
        return requestDirectory;
    }
    
    public Hospital getHospital() {
        return hospital;
    }
    
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    public DeliverySystem getDeliverySystem() {
        return deliverySystem;
    }
    
    public void setDeliverySystem(DeliverySystem deliverySystem) {
        this.deliverySystem = deliverySystem;
    }
    
    public JrDoctorDirectory getJrDoctorDirectory() {
        return jrDoctorDirectory;
    }
    
    public void setJrDoctorDirectory(JrDoctorDirectory jrDoctorDirectory) {
        this.jrDoctorDirectory = jrDoctorDirectory;
    }
    
    public AssistantDirectory getAssistantDirectory() {
        return assistantDirectory;
    }
    
    public void setAssistantDirectory(AssistantDirectory assistantDirectory) {
        this.assistantDirectory = assistantDirectory;
    }
    
    public BloodBankDirectory getBloodBankDirectory() {
        return bloodBankDirectory;
    }
    
    public void setBloodBankDirectory(BloodBankDirectory bloodBankDirectory) {
        this.bloodBankDirectory = bloodBankDirectory;
    }
    
    public DonorDirectory getDonorDirectory() {
        return donorDirectory;
    }
    
    public void setDonorDirectory(DonorDirectory donorDirectory) {
        this.donorDirectory = donorDirectory;
    }
    
    public CollectionCentreDirectory getCollectionCentreDirectory() {
        return collectionCentreDirectory;
    }
    
    public void setCollectionCentreDirectory(CollectionCentreDirectory collectionCentreDirectory) {
        this.collectionCentreDirectory = collectionCentreDirectory;
    }
    
    public CollectorDirectory getCollectorDirectory() {
        return collectorDirectory;
    }
    
    public void setCollectorDirectory(CollectorDirectory collectorDirectory) {
        this.collectorDirectory = collectorDirectory;
    }
    
    public DeliveryPersonDirectory getDeliveryPersonDirectory() {
        return deliveryPersonDirectory;
    }
    
    public void setDeliveryPersonDirectory(DeliveryPersonDirectory deliveryPersonDirectory) {
        this.deliveryPersonDirectory = deliveryPersonDirectory;
    }
    
    public SupervisorDirectory getSupervisorDirectory() {
        return supervisorDirectory;
    }
    
    public void setSupervisorDirectory(SupervisorDirectory supervisorDirectory) {
        this.supervisorDirectory = supervisorDirectory;
    }
    
    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }
    
    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public void updateUserDirectory(int id, String name, String uName, String pass){
        ArrayList<User> dupUser = this.getUserDirectory();
        
        for(int i=0; i < dupUser.size(); i++){
            User u = userDirectory.get(i);
            if(u.getId() == id){
                
                u.setUserName(uName);
                u.setPassword(pass);
                userDirectory.remove(i);
                userDirectory.add(i,u);
            }
        }
    }
}
        

