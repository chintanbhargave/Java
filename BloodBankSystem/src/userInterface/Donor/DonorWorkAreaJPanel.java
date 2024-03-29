/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Donor;

import Business.BloodBank.BloodBank;
import Business.BloodBank.Donor;
import Business.CollectionCentre.CollectionCentre;
import Business.System.ConfigureASystem;
import Business.System.Ecosystem;
import Business.User.User;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kalyanijohare
 */
public class DonorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorWorkAreaJPanel
     */
    private Ecosystem ecosystem;
    private Donor donor;
    public DonorWorkAreaJPanel(Ecosystem e, User u) {
        this.ecosystem = e;
        this.donor = (Donor) u;
        initComponents();
        populateCollectionCenters();
        populateHistory();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populateCollectionCenters() {
        DefaultTableModel model = (DefaultTableModel) tblCCinfo.getModel();
        ArrayList<CollectionCentre> ccDirectory = ecosystem.getCollectionCentreDirectory().getCollectionCenterDirectory();
        model.setRowCount(0);
        for (CollectionCentre c : ccDirectory) {
            model.addRow(new Object[]{c.getCcId(),c.getName(),c.getZipcode()});
        }
    }
    
    public void populateHistory(){
        
        DefaultTableModel model = (DefaultTableModel) tblHistory.getModel();
        ArrayList<Donor> dList = ecosystem.getDonorDirectory().getDonorList();
        for (Donor d : dList) {
            int size = d.getDonationHistory().size();
            if(size > 0){
                 model.addRow(new Object[]{d.getId(),d.getDonationHistory().get(size - 1)});
            }
            else{
                System.out.print("Hello");
            }
    
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        lblHistory = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCCinfo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1200, 600));

        tblHistory.setBackground(new java.awt.Color(153, 204, 255));
        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Last Donation Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHistory);

        lblHistory.setFont(new java.awt.Font("Oriya Sangam MN", 1, 14)); // NOI18N
        lblHistory.setText("My History");

        tblCCinfo.setBackground(new java.awt.Color(153, 204, 255));
        tblCCinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Collection Centre ID", "Collection CentreName", "ZipCode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCCinfo);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/images/donor7.jpeg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Oriya Sangam MN", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("You can donate Blood here ");

        jLabel6.setFont(new java.awt.Font("Oriya Sangam MN", 1, 14)); // NOI18N
        jLabel6.setText("You are logged in as : Donor");

        jLabel1.setFont(new java.awt.Font("Oriya Sangam MN", 1, 14)); // NOI18N
        jLabel1.setText("Nearest Collection Centres");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(167, 167, 167)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblHistory)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHistory)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(61, 61, 61)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHistory;
    private javax.swing.JTable tblCCinfo;
    private javax.swing.JTable tblHistory;
    // End of variables declaration//GEN-END:variables
}
