/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

import Agents.AgenteTurista;

/**
 *
 * @author Torre
 */
public class VentanaTurista extends javax.swing.JFrame {

    private AgenteTurista miAgente;
    /**
     * Creates new form VentanaTurista
     */
    public VentanaTurista(AgenteTurista a) {
        super(a.getLocalName());
	miAgente = a;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        origen = new javax.swing.JTextField();
        destino = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        duracion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cantPsas = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        presupuesto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pondPrecio = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tipoTransporte = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        calidadTransporte = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tipoLugar = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        calidadLugar = new javax.swing.JComboBox();
        fechaMin = new com.toedter.calendar.JDateChooser();
        fechaMax = new com.toedter.calendar.JDateChooser();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        pondServicio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Solicitar un Paquete");

        jLabel2.setText("Origen(*)");

        jLabel3.setText("Destino (*)");

        origen.setText(" ");

        destino.setText(" ");

        jLabel4.setText("Fechas de Salida posibles: dd/mm/aaaa (*)");

        jLabel5.setText("Mínima");

        jLabel6.setText("Máxima");

        jLabel7.setText("Duración (*)");

        duracion.setText("1");

        jLabel8.setText("Cantidad de Personas (*)");

        jLabel9.setText("Presupuesto máximo ($)");

        jLabel10.setText("Preferencias del usuario");

        jLabel11.setText("Ponderaciones servicios/precio");

        pondPrecio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pondPrecioStateChanged(evt);
            }
        });

        jLabel12.setText("Precio (%)");

        jLabel13.setText("Servicios (%)");

        jLabel14.setText("Transporte");

        jLabel15.setText("Tipo");

        tipoTransporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Terrestre", "Aereo" }));
        tipoTransporte.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoTransporteItemStateChanged(evt);
            }
        });
        tipoTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTransporteActionPerformed(evt);
            }
        });

        jLabel16.setText("Comodidad");

        calidadTransporte.setEnabled(false);
        calidadTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calidadTransporteActionPerformed(evt);
            }
        });

        jLabel17.setText("Alojamiento");

        jLabel18.setText("Tipo");

        tipoLugar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "HOTEL", "APART", "HOSTAL", "CABAÑA" }));
        tipoLugar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoLugarItemStateChanged(evt);
            }
        });
        tipoLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoLugarActionPerformed(evt);
            }
        });

        jLabel19.setText("Calidad");

        calidadLugar.setEnabled(false);
        calidadLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calidadLugarActionPerformed(evt);
            }
        });

        fechaMin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaMinPropertyChange(evt);
            }
        });

        fechaMax.setEnabled(false);

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel20.setText("(*) Campos Obligatorios");

        pondServicio.setText(" ");
        pondServicio.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(30, 30, 30)
                                .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addComponent(cantPsas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel1))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(31, 31, 31)
                                .addComponent(presupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(origen, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(tipoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(18, 18, 18)
                                                .addComponent(pondPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(18, 18, 18)
                                                .addComponent(tipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(pondServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel19))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(calidadLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(calidadTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fechaMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(fechaMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(aceptar)
                        .addGap(33, 33, 33)
                        .addComponent(cancelar)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fechaMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cantPsas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(presupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(pondPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(pondServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(calidadTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tipoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(calidadLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calidadTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calidadTransporteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_calidadTransporteActionPerformed

    private void tipoTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoTransporteActionPerformed

    private void tipoLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoLugarActionPerformed

    private void calidadLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calidadLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calidadLugarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarActionPerformed

    private void fechaMinPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaMinPropertyChange
        // TODO add your handling code here:
        fechaMax.setDate(fechaMin.getDate());
        fechaMax.setEnabled(true);
    }//GEN-LAST:event_fechaMinPropertyChange

    private void tipoTransporteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoTransporteItemStateChanged
        // TODO add your handling code here:
        switch(calidadTransporte.getSelectedIndex()){
            case 0:
                calidadTransporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ""}));
                break;
            case 1:
                calidadTransporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "EJECUTIVO", "CAMA", "SEMICAMA"}));
                break;
            case 2:
                calidadTransporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "PRIMERA CLASE", "BUSSINES", "TURISTA"}));;
                break;
        }
        calidadTransporte.setEnabled(true);
    }//GEN-LAST:event_tipoTransporteItemStateChanged

    private void tipoLugarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoLugarItemStateChanged
        // TODO add your handling code here:
        switch(tipoLugar.getSelectedIndex()){
            case 0: 
                calidadLugar.setModel(new javax.swing.DefaultComboBoxModel(new String[] {""}));
                break;
            case 1: 
                calidadLugar.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5"}));
                break;
            case 2:
                calidadLugar.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5"}));
                break;
            case 3:
                calidadLugar.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "1", "2", "3"}));
                break;
            case 4:
                calidadLugar.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "1", "2", "3"}));
                break;
        }
        calidadLugar.setEnabled(true);
    }//GEN-LAST:event_tipoLugarItemStateChanged

    private void pondPrecioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pondPrecioStateChanged
        // TODO add your handling code here:
        int valor = Integer.parseInt(pondPrecio.getValue().toString());
        pondServicio.setText(Integer.toString(100-valor));
    }//GEN-LAST:event_pondPrecioStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JComboBox calidadLugar;
    private javax.swing.JComboBox calidadTransporte;
    private javax.swing.JButton cancelar;
    private javax.swing.JSpinner cantPsas;
    private javax.swing.JTextField destino;
    private javax.swing.JTextField duracion;
    private com.toedter.calendar.JDateChooser fechaMax;
    private com.toedter.calendar.JDateChooser fechaMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField origen;
    private javax.swing.JSpinner pondPrecio;
    private javax.swing.JTextField pondServicio;
    private javax.swing.JTextField presupuesto;
    private javax.swing.JComboBox tipoLugar;
    private javax.swing.JComboBox tipoTransporte;
    // End of variables declaration//GEN-END:variables
}
