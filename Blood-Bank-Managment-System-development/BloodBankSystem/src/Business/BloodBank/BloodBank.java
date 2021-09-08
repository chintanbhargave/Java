/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBank;

import Business.CollectionCentre.CollectionCentreDirectory;
import Business.DeliverySystem.DeliverySystem;
import java.util.HashMap;

/**
 *
 * @author chintanbhargave
 */
public class BloodBank {

    private static int count = 0;
    private int id;
    private String name;
    private String zip;

    private AssistantDirectory assistantDirectory;
    private DonorDirectory donorDirectory;
    private CollectionCentreDirectory collectionCentreDirectory;
    private DeliverySystem deliverySystem;

    private HashMap<String, Integer> bloodStorage;

    public BloodBank(String name, String zip) {
        this.id = count++;
        this.name = name;
        this.zip = zip;
        this.assistantDirectory = new AssistantDirectory();
        this.donorDirectory = new DonorDirectory();
        this.collectionCentreDirectory = new CollectionCentreDirectory();
        this.deliverySystem = new DeliverySystem();
        this.bloodStorage = new HashMap<>();
        bloodStorage.put("A+", 5);
        bloodStorage.put("A-", 10);
        bloodStorage.put("B+", 15);
        bloodStorage.put("B-", 20);
        bloodStorage.put("AB+", 5);
        bloodStorage.put("AB-", 6);
        bloodStorage.put("O+", 9);
        bloodStorage.put("O-", 13);
    }

    public HashMap<String, Integer> getBloodStorage() {
        return bloodStorage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getZip() {
        return zip;
    }

    public AssistantDirectory getAssistantDirectory() {
        return assistantDirectory;
    }

    public DonorDirectory getDonorDirectory() {
        return donorDirectory;
    }

    public CollectionCentreDirectory getCollectionCentreDirectory() {
        return collectionCentreDirectory;
    }

    public DeliverySystem getDeliverySystem() {
        return deliverySystem;
    }
    
    public void addBloodSample( String bloodType, int unit) {

        HashMap<String, Integer> storage = this.getBloodStorage();
        int availableQuantity = storage.get(bloodType);
        int finalQuantity = availableQuantity + unit;
        storage.put(bloodType, finalQuantity);
    }

    public boolean getBloodSample(String bloodType, int unit) {

        HashMap<String, Integer> storage = this.getBloodStorage();
        int availableQuantity = storage.get(bloodType);

        if (unit < availableQuantity) {

            int finalQuantity = availableQuantity - unit;
            storage.put(bloodType, finalQuantity);
            return true;
        } else {
            return false;
        }

    }

}
