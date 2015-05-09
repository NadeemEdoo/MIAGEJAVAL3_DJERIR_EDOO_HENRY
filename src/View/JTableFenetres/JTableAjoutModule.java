/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.JTableFenetres;
import Modele.ForMod.*;
import Modele.Initialisation.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author NadeemShia
 */
public class JTableAjoutModule extends javax.swing.JFrame {

    /**
     * Creates new form JTableBis
     */
    public JTableAjoutModule() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitreFenetre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b_ajout = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        b_update = new javax.swing.JButton();
        b_save = new javax.swing.JButton();
        comboNomModule = new javax.swing.JComboBox();
        comboFormation = new javax.swing.JComboBox();
        comboH = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableauSemaine = new javax.swing.JTable();
        date = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        msgErreur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitreFenetre.setText("Fenêtre d'Ajout des Modules ");

        jLabel1.setText("Nom Module");

        jLabel2.setText("Jour");

        jLabel5.setText("Matin / apès-midi");

        b_ajout.setText("Ajouter");
        b_ajout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_ajoutMouseClicked(evt);
            }
        });
        b_ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ajoutActionPerformed(evt);
            }
        });

        b_delete.setText("Supprimer");
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteActionPerformed(evt);
            }
        });

        b_update.setText("Mettre à jour");
        b_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_updateActionPerformed(evt);
            }
        });

        b_save.setText("Sauvegarder");
        b_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_saveActionPerformed(evt);
            }
        });

        comboNomModule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboNomModuleMouseClicked(evt);
            }
        });

        comboFormation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aucune", "Licence 3" }));
        comboFormation.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFormationItemStateChanged(evt);
            }
        });

        comboH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matin", "Apres Midi" }));
        comboH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHActionPerformed(evt);
            }
        });

        tableauSemaine.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tableauSemaine.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        tableauSemaine.setForeground(new java.awt.Color(0, 0, 255));
        tableauSemaine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "LUNDI", "MARDI", "MERCREDI", "JEUDI", "VENDREDI", "SAMEDI", "DIMANCHE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableauSemaine.setColumnSelectionAllowed(true);
        tableauSemaine.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        tableauSemaine.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableauSemaine);

        jLabel3.setText("Formation");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("Matin");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("Après Midi");

        msgErreur.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        msgErreur.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(60, 60, 60)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b_ajout)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                .addComponent(b_delete)
                                .addGap(95, 95, 95)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboH, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b_update)
                                .addGap(52, 52, 52)
                                .addComponent(b_save)
                                .addGap(86, 86, 86))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36)
                        .addComponent(comboFormation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(comboNomModule, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(139, 139, 139))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(msgErreur, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(TitreFenetre)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(TitreFenetre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboNomModule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFormation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(comboH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_ajout)
                            .addComponent(b_delete)
                            .addComponent(b_update)
                            .addComponent(b_save))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel6)))
                        .addGap(30, 30, 30)
                        .addComponent(msgErreur, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_saveActionPerformed

    private void b_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_updateActionPerformed

    private void b_ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ajoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_ajoutActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_deleteActionPerformed

    private void comboNomModuleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboNomModuleMouseClicked
        
    }//GEN-LAST:event_comboNomModuleMouseClicked

    private void comboFormationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFormationItemStateChanged
        msgErreur.setText("");
        comboNomModule.removeAllItems();
        if(comboFormation.getSelectedItem().toString().equals("Licence 3")){
        Formation licence3 = Insert.Inserer();
         for (int i = 0;i< licence3.getTabModule().size();i++){ 
         Module module = licence3.getTabModule().get(i).getModule();
         comboNomModule.addItem(module.getNom());
         
         }
         
        }
        else
            msgErreur.setText("Veuillez choisir une formation");
    }//GEN-LAST:event_comboFormationItemStateChanged

    private void comboHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHActionPerformed
       
    }//GEN-LAST:event_comboHActionPerformed

    private void b_ajoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_ajoutMouseClicked
          DefaultTableModel model = (DefaultTableModel) tableauSemaine.getModel();
          GregorianCalendar calendar = new GregorianCalendar();
              calendar.setTime(date.getDate());
              int jour;
              jour = calendar.get(Calendar.DAY_OF_WEEK);
          
         if(comboH.getSelectedItem().equals("Matin")){
           
             switch (jour)
            {
            case 1: model.setValueAt(comboNomModule.getSelectedItem(), 0,6);break; 
            case 2: model.setValueAt(comboNomModule.getSelectedItem(), 0,0);break;
            case 3: model.setValueAt(comboNomModule.getSelectedItem(), 0,1);break;
            case 4: model.setValueAt(comboNomModule.getSelectedItem(), 0,2);break;
            case 5: model.setValueAt(comboNomModule.getSelectedItem(), 0,3);break;
            case 6: model.setValueAt(comboNomModule.getSelectedItem(), 0,4);break;
            case 7: model.setValueAt(comboNomModule.getSelectedItem(), 0,5);break;           
            }
            
         }else{
             switch (jour)
            {
            case 1: model.setValueAt(comboNomModule.getSelectedItem(), 1,6);break; 
            case 2: model.setValueAt(comboNomModule.getSelectedItem(), 1,0);break;
            case 3: model.setValueAt(comboNomModule.getSelectedItem(), 1,1);break;
            case 4: model.setValueAt(comboNomModule.getSelectedItem(), 1,2);break;
            case 5: model.setValueAt(comboNomModule.getSelectedItem(), 1,3);break;
            case 6: model.setValueAt(comboNomModule.getSelectedItem(), 1,4);break;
            case 7: model.setValueAt(comboNomModule.getSelectedItem(), 1,5);break;           
            }
             
         }
    }//GEN-LAST:event_b_ajoutMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JTableAjoutModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTableAjoutModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTableAjoutModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTableAjoutModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new JTableAjoutModule().setVisible(true);
                JTableAjoutModule jtable = new JTableAjoutModule();
                
                jtable.tableauSemaine.setRowHeight(96);
                jtable.setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitreFenetre;
    private javax.swing.JButton b_ajout;
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_save;
    private javax.swing.JButton b_update;
    private javax.swing.JComboBox comboFormation;
    private javax.swing.JComboBox comboH;
    private javax.swing.JComboBox comboNomModule;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msgErreur;
    private javax.swing.JTable tableauSemaine;
    // End of variables declaration//GEN-END:variables
}