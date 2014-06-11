/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Agents.AgenteAgenciaTurismo;
import jade.core.AID;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Torre
 */
public class VentanaAgencia extends javax.swing.JFrame {

    private AgenteAgenciaTurismo miAgente;

    /**
     * Creates new form ventanaAgencia
     */
    public VentanaAgencia(AgenteAgenciaTurismo a) {
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

        accederDF = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dtoTransporte = new javax.swing.JSpinner();
        comisionAgencia = new javax.swing.JSpinner();
        dtoLugar = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        accederDF.setText("Asignar Transportes y Alojamientos");
        accederDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederDFActionPerformed(evt);
            }
        });

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

        jLabel2.setText("Comisón de la agencia sobre el precio total");

        jLabel3.setText("Transportes");

        jLabel6.setText("Alojamientos");

        jLabel7.setText("Descuentos mínimo esperado por servicios:");

        jLabel8.setText("%");

        jLabel10.setText("%");

        jLabel11.setText("%");

        jLabel12.setText("Agencia de Viajes "+miAgente.getLocalName());

        dtoTransporte.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        comisionAgencia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        dtoLugar.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comisionAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dtoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dtoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel10)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accederDF)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(aceptar)
                                .addGap(23, 23, 23)
                                .addComponent(cancelar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(comisionAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(dtoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(dtoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(accederDF)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aceptar)
                    .addComponent(cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        miAgente.doDelete();
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void accederDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederDFActionPerformed
        // TODO add your handling code here:
        VentanaAgencia.VentanaDFServicios servicios = this.new VentanaDFServicios();
        servicios.setVisible(true);

    }//GEN-LAST:event_accederDFActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        try {
            float descuentoTransporte = Float.parseFloat(dtoTransporte.getValue().toString());
            float descuentoLugar = Float.parseFloat(dtoLugar.getValue().toString());
            float comision = Float.parseFloat(comisionAgencia.getValue().toString());
            miAgente.definirAgencia(descuentoTransporte, descuentoLugar, comision);
            miAgente.agregarComportamiento();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(VentanaAgencia.this, "Valores inválidos" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        dispose();

    }//GEN-LAST:event_aceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accederDF;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancelar;
    private javax.swing.JSpinner comisionAgencia;
    private javax.swing.JSpinner dtoLugar;
    private javax.swing.JSpinner dtoTransporte;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    // Asignar transportes y alojamientos asociados
    public class VentanaDFServicios extends javax.swing.JFrame {

        private String[] lugares;
        private String[] transportes;
        DFAgentDescription[] resultadosTransporte;
        DFAgentDescription[] resultadosLugar;

        /**
         * Creates new form VentanaDFServicios
         */
        public VentanaDFServicios() {
            getTransportes();
            getLugares();

            initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jScrollPane1 = new javax.swing.JScrollPane();
            alojamientos = new javax.swing.JList();
            jScrollPane2 = new javax.swing.JScrollPane();
            empresasTransporte = new javax.swing.JList();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            aceptar = new javax.swing.JButton();
            cancelar = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

            alojamientos.setModel(new javax.swing.AbstractListModel() {
                public int getSize() {
                    return lugares.length;
                }

                public Object getElementAt(int i) {
                    return lugares[i];
                }
            });
            jScrollPane1.setViewportView(alojamientos);

            empresasTransporte.setModel(new javax.swing.AbstractListModel() {
                public int getSize() {
                    return transportes.length;
                }

                public Object getElementAt(int i) {
                    return transportes[i];
                }
            });
            jScrollPane2.setViewportView(empresasTransporte);

            jLabel1.setText("Asignar Servicios");

            jLabel2.setText("Alojamientos");

            jLabel3.setText("Empresas de Tranportes");

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

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                            .addGap(55, 55, 55)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                            .addGap(39, 39, 39)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addComponent(aceptar)
                            .addGap(30, 30, 30)
                            .addComponent(cancelar)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(aceptar)
                                    .addComponent(cancelar))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>                        

        private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
            int[] seleccionLugar = alojamientos.getSelectedIndices();
            int[] seleccionTransporte = empresasTransporte.getSelectedIndices();
            ArrayList<AID> lugaresAID = new ArrayList<>();
            ArrayList<AID> transportesAID = new ArrayList<>();
            for (int index: seleccionLugar) {
                lugaresAID.add(getResultadosLugar()[index].getName());
            }
            for (int index: seleccionTransporte) {
                transportesAID.add(getResultadosTransporte()[index].getName());
            }
            VentanaAgencia.this.miAgente.asignarServicios(transportesAID, lugaresAID);
            dispose();
            
            
        
    }                                       

        public DFAgentDescription[] getResultadosTransporte() {
            return resultadosTransporte;
        }

        public DFAgentDescription[] getResultadosLugar() {
            return resultadosLugar;
        }

        private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
            dispose();
        }

        /**
         * @param args the command line arguments
         */
        private void getTransportes() {
            ServiceDescription servicio = new ServiceDescription();
            servicio.setType("Transporte");
            DFAgentDescription descripcion = new DFAgentDescription();
            descripcion.addServices(servicio);
            try {
                resultadosTransporte = DFService.search(VentanaAgencia.this.miAgente, descripcion);
                transportes = new String[resultadosTransporte.length];
                for (int i = 0; i < resultadosTransporte.length; i++) {
                    transportes[i] = resultadosTransporte[i].getName().getLocalName();
                }
            } catch (FIPAException ex) {
                Logger.getLogger(VentanaDFServicios.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        private void getLugares() {
            ServiceDescription servicio = new ServiceDescription();
            servicio.setType("Lugar");
            DFAgentDescription descripcion = new DFAgentDescription();
            descripcion.addServices(servicio);
            try {
                resultadosLugar = DFService.search(VentanaAgencia.this.miAgente, descripcion);
                lugares = new String[resultadosLugar.length];
                for (int i = 0; i < resultadosLugar.length; i++) {
                    lugares[i] = resultadosLugar[i].getName().getLocalName();
                }
            } catch (FIPAException ex) {
                Logger.getLogger(VentanaDFServicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Variables declaration - do not modify                     
        private javax.swing.JButton aceptar;
        private javax.swing.JList alojamientos;
        private javax.swing.JButton cancelar;
        private javax.swing.JList empresasTransporte;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        // End of variables declaration                   
    }

}
