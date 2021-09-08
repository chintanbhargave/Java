/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CollectionCentre;

import java.util.ArrayList;

/**
 *
 * @author chintanbhargave
 */
public class CollectionCentreDirectory {
  ArrayList<CollectionCentre> collectionCenterDirectory;
     public CollectionCentreDirectory() {
        this.collectionCenterDirectory = new ArrayList();
    }
    public void addCollectionCentreToDirectory(CollectionCentre collectionCentre){
        collectionCenterDirectory.add(collectionCentre);
    }

    public ArrayList<CollectionCentre> getCollectionCenterDirectory() {
        return collectionCenterDirectory;
    }
    
    
    public CollectionCentre getCCById(int ccid){
        for(CollectionCentre c: collectionCenterDirectory){
            if(c.getCcId() == ccid){
                return c;
            }
        }
        return null;
    }
    
}
