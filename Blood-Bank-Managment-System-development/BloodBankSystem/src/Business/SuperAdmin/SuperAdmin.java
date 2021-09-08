/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SuperAdmin;

import Business.BloodBank.BBAdmin;
import Business.CollectionCentre.CCAdmin;
import Business.DeliverySystem.DSAdmin;
import Business.Hospital.HAdmin;
import Business.User.User;

/**
 *
 * @author kalyanijohare
 */
public class SuperAdmin extends User{
    
    private BBAdmin bbAdmin;
    private CCAdmin ccAdmin;
    private DSAdmin dsAdmin;
    private HAdmin hAdmin;

    public SuperAdmin(String name, String userName, String password) {
        super(name, userName, password);
        this.bbAdmin = new BBAdmin();
        this.ccAdmin = new CCAdmin();
        this.dsAdmin = new DSAdmin();
        this.hAdmin = new HAdmin();
    }
   
    public BBAdmin getBbAdmin() {
        return bbAdmin;
    }
    
    public CCAdmin getCcAdmin() {
        return ccAdmin;
    }
    
    public DSAdmin getDsAdmin() {
        return dsAdmin;
    }
    
    public HAdmin gethAdmin() {
        return hAdmin;
    }
    
}
