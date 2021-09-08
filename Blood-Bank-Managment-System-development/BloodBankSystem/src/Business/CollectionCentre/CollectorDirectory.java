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
public class CollectorDirectory {
    
    ArrayList<Collector> collectorDirectory;
    public CollectorDirectory() {
        this.collectorDirectory = new ArrayList();
    }
    public void addCollectorToDirectory(Collector collector){
        collectorDirectory.add(collector);
    }

    public ArrayList<Collector> getCollectorDirectory() {
        return collectorDirectory;
    }

    public Collector getCollectorById(int id) {
        for(Collector c: collectorDirectory){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }

    public void removeCollectorFromDirectoryById(int id) {
        for(Collector c: collectorDirectory){
            if(c.getId() == id){
                collectorDirectory.remove(c);
            }
        }
    }
    
    
}
