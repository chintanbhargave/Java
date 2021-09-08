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
public class CCAdmin {
    
    private CollectionCentreDirectory collectionCentreDierctory;
    
    public CCAdmin() {
        this.collectionCentreDierctory = new CollectionCentreDirectory();
    }
    
    public CollectionCentre createCollectionCentre(int bbid, String name, String zipcode){
        return new CollectionCentre(bbid,name,zipcode);    
    }
    
    public Collector createCollector(String name, String userName, String password){     
        return new Collector(name, userName, password);
    }
    
    public CollectionCentreDirectory getCollectionCentreDirectory() {
        return collectionCentreDierctory;
    }
    
}
