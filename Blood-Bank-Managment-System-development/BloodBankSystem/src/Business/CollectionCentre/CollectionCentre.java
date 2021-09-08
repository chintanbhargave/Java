/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CollectionCentre;

/**
 *
 * @author chintanbhargave
 */
public class CollectionCentre {
    private int ccId;
    private int bbId;
    private String name;
    private String zipcode;
    private CollectorDirectory collectorDirectory;
    
    
    private static int count = 0;

    public CollectionCentre(int bbId, String name, String zipcode) {
        this.ccId = count++;
        this.bbId = bbId;
        this.name = name;
        this.zipcode=zipcode;
        this.collectorDirectory = new CollectorDirectory();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    public CollectorDirectory getCollectorDirectory() {
        return collectorDirectory;
    }

    public int getCcId() {
        return ccId;
    }

    public void setCcId(int ccId) {
        this.ccId = ccId;
    }

    public int getBbId() {
        return bbId;
    }

    public void setBbId(int bbId) {
        this.bbId = bbId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
