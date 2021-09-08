/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

import Business.BloodBank.BloodBank;
import Business.DeliverySystem.DeliveryPerson;
import Business.Hospital.Doctor;
import Business.Hospital.JrDoctor;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author chintanbhargave
 */
public class Request {
    
    private static int count = 0;
    private int id;
    
    private String bloodType;
    private int unit;
    
    private Status status;
    private String timePlaced;
    private String timeCompleted;
    private int doctorId = -1;
    private int jrDoctorId = -1;
    private int bloodBankId = -1;
    private int deliveryPersonId = -1;
    private int bbAssistantId = -1;
    private int supervisorId = -1;
    private int hId = -1;
    
    

    public Request() {
        
        this.id = count++;
        this.status = Status.Raised;
        this.timePlaced = new SimpleDateFormat("MM/dd HH:mm:ss").format(new Date());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int gethId() {
        return hId;
    }

    public void sethId(int hId) {
        this.hId = hId;
    }

    
    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    
    public int getBbAssistantId() {
        return bbAssistantId;
    }

    
    public void setBbAssistantId(int bbAssistantId) {
        this.bbAssistantId = bbAssistantId;
    }

    public int getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(int supervisorId) {
        this.supervisorId = supervisorId;
    }
    
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTimePlaced() {
        return timePlaced;
    }

    public void setTimePlaced(String timePlaced) {
        this.timePlaced = timePlaced;
    }

    public String getTimeCompleted() {
        return timeCompleted;
    }

    public void setTimeCompleted() {
        this.timeCompleted = new SimpleDateFormat("MM/dd HH:mm:ss").format(new Date());
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getJrDoctorId() {
        return jrDoctorId;
    }

    public void setJrDoctorId(int jrDoctorId) {
        this.jrDoctorId = jrDoctorId;
    }

    public int getBloodBankId() {
        return bloodBankId;
    }

    public void setBloodBankId(int bloodBankId) {
        this.bloodBankId = bloodBankId;
    }

    public int getDeliveryPersonId() {
        return deliveryPersonId;
    }

    public void setDeliveryPersonId(int deliveryPersonId) {
        this.deliveryPersonId = deliveryPersonId;
    }

    
    public enum Status{
        Raised("Raised"),//dr
        Forwarded("Forwarded"), //jr dr
        Assigned("Assigned"),// jr dr
        Pending("Pending"),
       
        Active("Active"),
        Accepted("Accepted"),
        Completed("Completed");
        
        private String value;
        private Status(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }        
}
