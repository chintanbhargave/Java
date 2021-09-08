/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

/**
 *
 * @author chintanbhargave
 */
public class HAdmin {
    
    public HAdmin() {
    }
    
    public Hospital createHospital(String name){
        return new Hospital(name);
    }
    
    public Doctor createDoctor(String name, String userName, String password){
        return new Doctor(name, userName, password);
    }
    
    public JrDoctor createJrDoctor(String name, String userName, String password){
        return new JrDoctor(name, userName, password);
    }
    
}
