/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.System;

import Business.BloodBank.Assistant;
import Business.BloodBank.BBAdmin;
import Business.BloodBank.BloodBank;
import Business.BloodBank.BloodBankDirectory;
import Business.BloodBank.Donor;
import Business.CollectionCentre.CCAdmin;
import Business.CollectionCentre.CollectionCentre;
import Business.CollectionCentre.Collector;
import Business.DeliverySystem.DSAdmin;
import Business.DeliverySystem.DeliveryPerson;
import Business.DeliverySystem.DeliveryPersonDirectory;
import Business.DeliverySystem.DeliverySystem;
import Business.DeliverySystem.Supervisor;
import Business.DeliverySystem.SupervisorDirectory;
import Business.Hospital.Doctor;
import Business.Hospital.HAdmin;
import Business.Hospital.Hospital;
import Business.Hospital.JrDoctor;
import Business.Request.Request;
import Business.Request.RequestDirectory;
import Business.User.User;
import Business.SuperAdmin.SuperAdmin;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author chintanbhargave
 */
public class ConfigureASystem {
    
    private static SuperAdmin superAdmin = new SuperAdmin("Sysadmin","Sysadmin","Sysadmin1$");
    private static ArrayList<User> userDirectory;
    
    public static void configure(Ecosystem ecoSystem){
        
        userDirectory = ecoSystem.getUserDirectory();
        
        userDirectory.add(superAdmin);
        
        BBAdmin bbAdmin = superAdmin.getBbAdmin();
        CCAdmin ccAdmin = superAdmin.getCcAdmin();
        DSAdmin dsAdmin = superAdmin.getDsAdmin();
        HAdmin hAdmin = superAdmin.gethAdmin();
        
        addBloodBankToBBDirectory(ecoSystem,bbAdmin, ccAdmin);
        
        addDeliverySystem(ecoSystem,dsAdmin);
        addSupervisorToDeliverySystem(ecoSystem, dsAdmin);
        addDeliveryPersonToDeliverySystem(ecoSystem, dsAdmin);
        
        Hospital hospital = hAdmin.createHospital("Brigham"); 
        addDoctorsToHospital(ecoSystem, hAdmin, hospital);
        addJrDoctorsToHospital(ecoSystem, hAdmin, hospital);
        ecoSystem.setHospital(hospital);
        
        ecoSystem.setUserDirectory(userDirectory);
    }
    
    private static void addRequests(Ecosystem ecosystem){
        RequestDirectory requestDirectory = ecosystem.getRequestDirectory();
        
        Request r = new Request();
        r.sethId(0);
        r.setBloodType("O+");
        r.setUnit(5);
        r.setDoctorId(0);
        r.setJrDoctorId(0);
        r.setBloodBankId(0);
        r.setBbAssistantId(0);
        r.setSupervisorId(0);
        r.setDeliveryPersonId(0);
        requestDirectory.addRequest(r);
        
        Request r1 = new Request();
        r1.sethId(0);
        r1.setBloodType("AB+");
        r1.setUnit(2);
        r1.setDoctorId(1);
        r1.setJrDoctorId(1);
        r1.setBloodBankId(1);
        r1.setBbAssistantId(1);
        r1.setSupervisorId(1);
        r1.setDeliveryPersonId(1);
        requestDirectory.addRequest(r1);
        
        
    }
    
    private static void addJrDoctorsToHospital(Ecosystem ecoSystem, HAdmin hAdmin, Hospital hospital) {
        
        JrDoctor jessie  = hAdmin.createJrDoctor("jessie","jessie","Jessie1$");
        hospital.getJrDoctorDirectory().addJrDoctorToDirectory(jessie);
        userDirectory.add(jessie);
        
        JrDoctor sam  = hAdmin.createJrDoctor("sam","sam","Sam1$");
        hospital.getJrDoctorDirectory().addJrDoctorToDirectory(sam);
        userDirectory.add(sam);
        
        ecoSystem.setJrDoctorDirectory(hospital.getJrDoctorDirectory());
    }
    
    private static void addDoctorsToHospital(Ecosystem ecoSystem, HAdmin hAdmin, Hospital hospital) {
        
        Doctor hank = hAdmin.createDoctor("hank","hank","Hank1$");
        hospital.getDoctorDirectory().addDoctorToDirectory(hank);
        userDirectory.add(hank);
        
        Doctor walt = hAdmin.createDoctor("walt","walt","Walt1$");
        hospital.getDoctorDirectory().addDoctorToDirectory(walt);
        userDirectory.add(walt);
        
        ecoSystem.setDoctorDirectory(hospital.getDoctorDirectory());
    }
    
    private static void addSupervisorToDeliverySystem(Ecosystem ecoSystem, DSAdmin dsAdmin) {
        
        SupervisorDirectory supervisorDirectory = ecoSystem.getDeliverySystem().getSupervisorDirectory();
        
        Supervisor jack = dsAdmin.createSuperVisor("jack","jack","Jack1$");
        supervisorDirectory.addSupervisorToDirectory(jack);
        userDirectory.add(jack);
        
        Supervisor vishal = dsAdmin.createSuperVisor("vishal","vishal","Vishal1$");
        supervisorDirectory.addSupervisorToDirectory(vishal);
        userDirectory.add(vishal);
        
        ecoSystem.setSupervisorDirectory(supervisorDirectory);
    }
    
    private static void addDeliverySystem(Ecosystem ecoSystem,DSAdmin dsAdmin) {
        
        DeliverySystem deliverySystem = dsAdmin.createDeliverySystem();
        
        DeliveryPerson tom = dsAdmin.createDeliveryPerson("tom","tom","Tom1$");
        deliverySystem.getDeliveryPersonDirectory().addDeliveryPersonToDirectory(tom);
        userDirectory.add(tom);
        
        DeliveryPerson james = dsAdmin.createDeliveryPerson("james","james","James1$");
        deliverySystem.getDeliveryPersonDirectory().addDeliveryPersonToDirectory(james);
        userDirectory.add(james);
        
        DeliveryPerson jerry = dsAdmin.createDeliveryPerson("jerry","jerry","Jerry1$");
        deliverySystem.getDeliveryPersonDirectory().addDeliveryPersonToDirectory(jerry);
        userDirectory.add(jerry);
        
        ecoSystem.setDeliverySystem(deliverySystem);
    }
    
    private static void addBloodBankToBBDirectory(Ecosystem ecoSystem, BBAdmin bbAdmin, CCAdmin ccAdmin) {
        
        BloodBankDirectory bloodBankDirectory = bbAdmin.getBloodBankDierctory();
        
        BloodBank bb1 = bbAdmin.createBloodBank("BB1","21223");
        addAssistantsToBloodBank(ecoSystem,bbAdmin, bb1);
        addDonorsToBloodBank(ecoSystem, bbAdmin, bb1);
        addCollectionCentreToBloodBank(ecoSystem,bb1, ccAdmin);
        bloodBankDirectory.addBloodBank(bb1);
        
        BloodBank bb2 = bbAdmin.createBloodBank("BB2","23423");
        addAssistantsToBloodBank2(ecoSystem, bbAdmin, bb2);
        addDonorsToBloodBank2(ecoSystem, bbAdmin, bb2);
        addCollectionCentreToBloodBank2(ecoSystem,bb2, ccAdmin);
        bloodBankDirectory.addBloodBank(bb2);
        
        ecoSystem.setBloodBankDirectory(bloodBankDirectory);
    }
    
    private static void addCollectionCentreToBloodBank(Ecosystem ecoSystem, BloodBank bb, CCAdmin ccAdmin) {
        
        int bbId = bb.getId();
        
        
        CollectionCentre cc1 =  ccAdmin.createCollectionCentre(bbId,"Heins","02120");
        int cc1Id = cc1.getCcId();
        Collector chintan = ccAdmin.createCollector("chintan", "chintan", "Chintan1$");
        chintan.setCcId(cc1Id);
        cc1.getCollectorDirectory().addCollectorToDirectory(chintan);
        ecoSystem.getCollectorDirectory().addCollectorToDirectory(chintan);
        
        userDirectory.add(chintan);
        bb.getCollectionCentreDirectory().addCollectionCentreToDirectory(cc1);
  
        
        CollectionCentre cc2 =  ccAdmin.createCollectionCentre(bbId,"Regis","02125");
        int cc2Id = cc2.getCcId();
        Collector kalyani = ccAdmin.createCollector("kalyani", "kalyani", "Kalyani1$");
        kalyani.setCcId(cc2Id);
        cc2.getCollectorDirectory().addCollectorToDirectory(kalyani);
        userDirectory.add(kalyani);
        bb.getCollectionCentreDirectory().addCollectionCentreToDirectory(cc2);
        ecoSystem.getCollectorDirectory().addCollectorToDirectory(kalyani);
        
        CollectionCentre cc3 =  ccAdmin.createCollectionCentre(bbId,"Boston Medical","02126");
        int cc3Id = cc3.getCcId();
        Collector shreya = ccAdmin.createCollector("shreya", "shreya", "Shreya1$");
        shreya.setCcId(cc3Id);
        cc3.getCollectorDirectory().addCollectorToDirectory(shreya);
        userDirectory.add(shreya);
        bb.getCollectionCentreDirectory().addCollectionCentreToDirectory(cc3);
        ecoSystem.getCollectorDirectory().addCollectorToDirectory(shreya);
        
        ecoSystem.setCollectionCentreDirectory(bb.getCollectionCentreDirectory());
        
    }
    
    private static void addCollectionCentreToBloodBank2(Ecosystem ecoSystem, BloodBank bb, CCAdmin ccAdmin) {
        
        int bbId = bb.getId();
        
        CollectionCentre cc1 =  ccAdmin.createCollectionCentre(bbId,"Fenway Blood Collection Center","02123");
        int cc1Id = cc1.getCcId();
        Collector gayatri = ccAdmin.createCollector("gayatri", "gayatri", "Gayatri1$");
        gayatri.setCcId(cc1Id);
        cc1.getCollectorDirectory().addCollectorToDirectory(gayatri);
        userDirectory.add(gayatri);
        bb.getCollectionCentreDirectory().addCollectionCentreToDirectory(cc1);
        ecoSystem.getCollectorDirectory().addCollectorToDirectory(gayatri);
  
        
        CollectionCentre cc2 =  ccAdmin.createCollectionCentre(bbId,"Medical Care Blood Collection Center","02129");
        int cc2Id = cc2.getCcId();
        Collector chinmayi = ccAdmin.createCollector("chinmayi", "chinmayi", "Chinmayi1$");
        chinmayi.setCcId(cc2Id);
        cc2.getCollectorDirectory().addCollectorToDirectory(chinmayi);
        userDirectory.add(chinmayi);
        bb.getCollectionCentreDirectory().addCollectionCentreToDirectory(cc2);
        ecoSystem.getCollectorDirectory().addCollectorToDirectory(chinmayi);
  
        
        CollectionCentre cc3 =  ccAdmin.createCollectionCentre(bbId,"Longwood Blood Collection Center","02128");
         int cc3Id = cc3.getCcId();
        Collector trupti = ccAdmin.createCollector("trupti", "trupti", "Trupti1$");
        trupti.setCcId(cc3Id);
        cc3.getCollectorDirectory().addCollectorToDirectory(trupti);
        userDirectory.add(trupti);
        bb.getCollectionCentreDirectory().addCollectionCentreToDirectory(cc3);
        ecoSystem.getCollectorDirectory().addCollectorToDirectory(trupti);
  
        
        ecoSystem.setCollectionCentreDirectory(bb.getCollectionCentreDirectory());
        
    }
    
    
    private static void addDonorsToBloodBank(Ecosystem ecoSystem, BBAdmin bbAdmin, BloodBank bb) {
        
        Donor adam = bbAdmin.createDonor("adam","adam","Adam1$");
        bb.getDonorDirectory().addDonorToDirectory(adam);
        adam.setBloodGroup("A+");
        ArrayList<Date> donationHistory = new ArrayList();
        //donationHistory.add();
        //adam.setDonationHistory();
        userDirectory.add(adam);
        
        Donor ross = bbAdmin.createDonor("ross","ross","Ross1$");
        bb.getDonorDirectory().addDonorToDirectory(ross);
        ross.setBloodGroup("A-");
        userDirectory.add(ross);
        
        Donor dan = bbAdmin.createDonor("dan","dan","Dan1$");
        bb.getDonorDirectory().addDonorToDirectory(dan);
        dan.setBloodGroup("B+");
        userDirectory.add(dan);
        
        Donor joe = bbAdmin.createDonor("joe","joe","Joe1$");
        bb.getDonorDirectory().addDonorToDirectory(joe);
        joe.setBloodGroup("B-");
        userDirectory.add(joe);
        
        Donor gunther = bbAdmin.createDonor("gunther","gunther","Gunther1$");
        bb.getDonorDirectory().addDonorToDirectory(gunther);
        gunther.setBloodGroup("AB+");
        userDirectory.add(gunther);
        
        Donor henry = bbAdmin.createDonor("henry","henry","Henry1$");
        bb.getDonorDirectory().addDonorToDirectory(henry);
        henry.setBloodGroup("AB-");
        userDirectory.add(henry);
        
        Donor josh = bbAdmin.createDonor("josh","josh","Josh1$");
        bb.getDonorDirectory().addDonorToDirectory(josh);
        josh.setBloodGroup("O+");
        userDirectory.add(josh);
        
        
        Donor danny = bbAdmin.createDonor("danny","danny","Danny1$");
        bb.getDonorDirectory().addDonorToDirectory(danny);
        danny.setBloodGroup("O-");
        userDirectory.add(danny);
        
        ecoSystem.setDonorDirectory(bb.getDonorDirectory());
    }
    
    private static void addDonorsToBloodBank2(Ecosystem ecoSystem, BBAdmin bbAdmin, BloodBank bb) {
        
        Donor messy = bbAdmin.createDonor("messy","messy","Messy1$");
        bb.getDonorDirectory().addDonorToDirectory(messy);
        messy.setBloodGroup("A+");
        userDirectory.add(messy);
        
        Donor peter = bbAdmin.createDonor("peter","peter","Peter1$");
        bb.getDonorDirectory().addDonorToDirectory(peter);
        peter.setBloodGroup("A-");
        userDirectory.add(peter);
        
        Donor abby = bbAdmin.createDonor("abby","abby","Abby1$");
        bb.getDonorDirectory().addDonorToDirectory(abby);
        abby.setBloodGroup("B+");
        userDirectory.add(abby);
        
        Donor ray = bbAdmin.createDonor("ray","ray","Ray1$");
        bb.getDonorDirectory().addDonorToDirectory(ray);
        ray.setBloodGroup("B-");
        userDirectory.add(ray);
        
        Donor logan = bbAdmin.createDonor("logan","logan","Logan1$");
        bb.getDonorDirectory().addDonorToDirectory(logan);
        logan.setBloodGroup("AB+");
        userDirectory.add(logan);
        
        Donor lucas = bbAdmin.createDonor("lucas","lucas","Lucas1$");
        bb.getDonorDirectory().addDonorToDirectory(lucas);
        lucas.setBloodGroup("AB-");
        userDirectory.add(lucas);
        
        Donor mason = bbAdmin.createDonor("mason","mason","Mason1$");
        bb.getDonorDirectory().addDonorToDirectory(mason);
        mason.setBloodGroup("O+");
        userDirectory.add(mason);
        
        Donor zayn = bbAdmin.createDonor("zayn","zayn","Zayn1$");
        bb.getDonorDirectory().addDonorToDirectory(zayn);
        zayn.setBloodGroup("O-");
        userDirectory.add(zayn);
    
        ecoSystem.setDonorDirectory(bb.getDonorDirectory());
    }

    
    private static void addAssistantsToBloodBank(Ecosystem ecoSystem, BBAdmin bbAdmin, BloodBank bb) {
        
        Assistant john = bbAdmin.createAssistant("john","john","John1$");
        bb.getAssistantDirectory().addAssistantToDirectory(john);
        userDirectory.add(john);
        
        Assistant matt = bbAdmin.createAssistant("matt","matt","Matt1$");
        bb.getAssistantDirectory().addAssistantToDirectory(matt);
        userDirectory.add(matt);
        
        Assistant bob = bbAdmin.createAssistant("Bob","Bob","Bob1$");
        bb.getAssistantDirectory().addAssistantToDirectory(bob);
        userDirectory.add(bob);
        
        ecoSystem.setAssistantDirectory(bb.getAssistantDirectory());
    }
    
    private static void addAssistantsToBloodBank2(Ecosystem ecoSystem, BBAdmin bbAdmin, BloodBank bb) {
        
        Assistant hary = bbAdmin.createAssistant("hary","hary","Har1$");
        bb.getAssistantDirectory().addAssistantToDirectory(hary);
        userDirectory.add(hary);
        
        Assistant george = bbAdmin.createAssistant("george","george","George1$");
        bb.getAssistantDirectory().addAssistantToDirectory(george);
        userDirectory.add(george);
        
        Assistant leo = bbAdmin.createAssistant("leo","leo","Leo1$");
        bb.getAssistantDirectory().addAssistantToDirectory(leo);
        userDirectory.add(leo);
        
        ecoSystem.setAssistantDirectory(bb.getAssistantDirectory());
    }

    private static void addDeliveryPersonToDeliverySystem(Ecosystem ecoSystem, DSAdmin dsAdmin) {
        
        DeliveryPersonDirectory deliveryPersonDirectory = ecoSystem.getDeliverySystem().getDeliveryPersonDirectory();
        
        DeliveryPerson saul = new DeliveryPerson("saul", "saul", "Saul1$");
        deliveryPersonDirectory.addDeliveryPersonToDirectory(saul);
        userDirectory.add(saul);
        
        DeliveryPerson gus = new DeliveryPerson("gus", "gus", "Gus1$");
        deliveryPersonDirectory.addDeliveryPersonToDirectory(gus);
        userDirectory.add(gus);
        
        DeliveryPerson tuco = new DeliveryPerson("tuco", "tuco", "Tuco1$");
        deliveryPersonDirectory.addDeliveryPersonToDirectory(tuco);
        userDirectory.add(tuco);
        
        ecoSystem.setDeliveryPersonDirectory(deliveryPersonDirectory);
        
    }
    
}
