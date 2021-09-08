/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author chintanbhargave
 */
public class JrDoctorDirectory {
    
     ArrayList<JrDoctor> JrDrDirectory;
    
      public JrDoctorDirectory() {
        this.JrDrDirectory = new ArrayList();
    }
    
    public void addJrDoctorToDirectory(JrDoctor jrDoctor){
        JrDrDirectory.add(jrDoctor);
    }

    public ArrayList<JrDoctor> getJrDrDirectory() {
        return JrDrDirectory;
    }
    
    public JrDoctor getJrDrById(int jrId){
        for (JrDoctor d : JrDrDirectory) {
            if (d.getId() == jrId) {
                return d;
            }
        }
        return null;
    }
    public void removeJrDrFromDirectoryById(int jrId) {
        for (JrDoctor d : JrDrDirectory) {
            if (d.getId() == jrId) {
                JrDrDirectory.remove(d);
            }
        }
    }
    
}
