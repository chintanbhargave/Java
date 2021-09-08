/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.DeliverySystem.Supervisor;
import java.util.ArrayList;

/**
 *
 * @author chintanbhargave
 */
public class DoctorDirectory {

    ArrayList<Doctor> doctorDirectory;

    public DoctorDirectory() {
        this.doctorDirectory = new ArrayList();
    }

    public void addDoctorToDirectory(Doctor doctor) {
        doctorDirectory.add(doctor);
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public Doctor getDrById(int dId){
        for (Doctor d : doctorDirectory) {
            if (d.getId() == dId) {
                return d;
            }
        }
        return null;
    }
    
    public void removeDrFromDirectoryById(int dId) {
        for (Doctor d : doctorDirectory) {
            if (d.getId() == dId) {
                doctorDirectory.remove(d);
            }
        }
    }

}
