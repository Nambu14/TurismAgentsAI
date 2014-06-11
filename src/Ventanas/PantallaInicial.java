/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

import Agents.*;
import Things.Paquete;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Torre
 */
public class PantallaInicial extends javax.swing.JFrame {
    private VentanaTurista ventanaTurista;
    private VentanaAgencia ventanaAgencia;
    private VentanaLugar ventanaLugar;
    private VentanaTransporte ventanaTransporte;
    private final ContainerController mainContainer;
    private AgentController ac;
    private jade.core.Runtime rt;
    private int turista=0;
    /**
     * Creates new form PantallaInicial
     */
    public PantallaInicial() {
        initComponents();
        rt = jade.core.Runtime.instance(); 
        Profile p = new ProfileImpl();
        mainContainer = rt.createMainContainer(p);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crearTurista = new javax.swing.JButton();
        crearAgencia = new javax.swing.JButton();
        crearLugar = new javax.swing.JButton();
        crearTransporte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombreServicio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        crearTurista.setText("Comprar Paquete Turístico");
        crearTurista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTuristaActionPerformed(evt);
            }
        });

        crearAgencia.setText("Agencia de Viajes");
        crearAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearAgenciaActionPerformed(evt);
            }
        });

        crearLugar.setText(" Alojamiento");
        crearLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearLugarActionPerformed(evt);
            }
        });

        crearTransporte.setText(" Empresa de Transporte");
        crearTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTransporteActionPerformed(evt);
            }
        });

        jLabel1.setText("Crear un nuevo servicio");

        nombreServicio.setText("Nombre del servicio");
        nombreServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreServicioActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese el nombre del servicio, y luego seleccione el tipo");

        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(nombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearAgencia)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(crearLugar)
                                .addGap(10, 10, 10)
                                .addComponent(crearTransporte))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(cerrar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(crearTurista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(crearTurista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(nombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearAgencia)
                    .addComponent(crearLugar)
                    .addComponent(crearTransporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(cerrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearTuristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTuristaActionPerformed
        // TODO add your handling code here:
        try {
           ac= mainContainer.createNewAgent("Turista"+turista, "Agents.AgenteTurista", null);
           ac.start();
        } catch (StaleProxyException ex) {
	   JOptionPane.showMessageDialog(this, "Debe elegir otro nombre de servicio", "Error", JOptionPane.ERROR_MESSAGE);
        }
        turista= turista+1;
                
    }//GEN-LAST:event_crearTuristaActionPerformed

    private void crearAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearAgenciaActionPerformed
        // TODO add your handling code here:
      if("".equals(nombreServicio.getText())){
        JOptionPane.showMessageDialog(this, "Debe ingresar un nombre de servicio", "Error", JOptionPane.ERROR_MESSAGE);
      }else{  
        try {
           ac= mainContainer.createNewAgent(nombreServicio.getText(), "Agents.AgenteAgenciaTurismo", null);
           ac.start();
        } catch (StaleProxyException ex) {
	   JOptionPane.showMessageDialog(this, "Debe elegir otro nombre de servicio", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }  
    }//GEN-LAST:event_crearAgenciaActionPerformed

    private void crearLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearLugarActionPerformed
        // TODO add your handling code here:
      if("".equals(nombreServicio.getText())){
        JOptionPane.showMessageDialog(this, "Debe ingresar un nombre de servicio", "Error", JOptionPane.ERROR_MESSAGE);
      }else{
        try {
           ac= mainContainer.createNewAgent(nombreServicio.getText(), "Agents.AgenteLugar", null);
           ac.start();
        } catch (StaleProxyException ex) {
	   JOptionPane.showMessageDialog(this, "Debe elegir otro nombre de servicio", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }

    }//GEN-LAST:event_crearLugarActionPerformed

    private void crearTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTransporteActionPerformed
        // TODO add your handling code here:
      if("".equals(nombreServicio.getText())){
        JOptionPane.showMessageDialog(this, "Debe ingresar un nombre de servicio", "Error", JOptionPane.ERROR_MESSAGE);
      }else{
        try {
           ac= mainContainer.createNewAgent(nombreServicio.getText(), "Agents.AgenteTransporte", null);
           ac.start();
        } catch (StaleProxyException ex) {
	   JOptionPane.showMessageDialog(this, "Debe elegir otro nombre de servicio", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }  
    }//GEN-LAST:event_crearTransporteActionPerformed

    private void nombreServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreServicioActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        rt.shutDown();
        dispose();
    }//GEN-LAST:event_cerrarActionPerformed

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
                if ("Nimbus".equalsIgnoreCase(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicial().setVisible(true);
            }
        });
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JButton crearAgencia;
    private javax.swing.JButton crearLugar;
    private javax.swing.JButton crearTransporte;
    private javax.swing.JButton crearTurista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nombreServicio;
    // End of variables declaration//GEN-END:variables
    
}
