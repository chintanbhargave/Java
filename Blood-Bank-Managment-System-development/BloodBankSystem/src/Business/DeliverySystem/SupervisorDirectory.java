/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliverySystem;

import java.util.ArrayList;

/**
 *
 * @author chintanbhargave
 */
public class SupervisorDirectory {
   ArrayList<Supervisor> supervisorDirectory;
    public SupervisorDirectory()
    {
        this.supervisorDirectory= new ArrayList();
    }
    public void addSupervisorToDirectory(Supervisor supervisor){
        supervisorDirectory.add(supervisor);
    }

    public ArrayList<Supervisor> getSupervisorDirectory() {
        return supervisorDirectory;
    }

    public Supervisor getSupervisorById(int id) {
        for(Supervisor s: supervisorDirectory){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

    public void removeSupervisorFromDirectoryById(int id) {
        for(Supervisor s: supervisorDirectory){
            if(s.getId() == id){
                supervisorDirectory.remove(s);
            }
        }
    }
    
    
}
