/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

import Agents.AgenteLugar;
import Agents.AgenteLugar.Tipo;
import java.util.Arrays;

/**
 *
 * @author Torre
 */
public class VentanaMostrarLugar extends javax.swing.JFrame {
    
    private AgenteLugar miAgente;
    String[] serviciosLugar;
    String arg1;
    int arg2;


    /**
     * Creates new form VentanaMostrar
     * @param a
     * @param args
     */
    public VentanaMostrarLugar(AgenteLugar a) {
        super(a.getLocalName());
	miAgente = a;

        
        if((miAgente.getServicios()) !=null){
                serviciosLugar=miAgente.getServicios();;
        }else{serviciosLugar =new String[1];
                serviciosLugar[0]="";
        }
        
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

        ciudad = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        calidad = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        labelAntic = new javax.swing.JLabel();
        labelPsas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaServicios = new javax.swing.JList();
        cerrar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dtosAnti = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        dtoDias = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        dtosPsas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alojamiento");
        setResizable(false);

        ciudad.setText("Ciudad: "+ miAgente.getCiudad());

        String a = tipoString();
        tipo.setText("Tipo Alojamiento: "+a);

        calidad.setText(""+miAgente.getCalidad()+" Estrellas");

        precio.setText("Precio por Persona: "+miAgente.getPrecioPersona());

        labelAntic.setText("Descuentos según anticipación");

        labelPsas.setText("Descuentos según Cantidad de Personas");

        jLabel8.setText("Descuentos según Cantidad de días");

        listaServicios.setModel(new javax.swing.AbstractListModel() {
            String[] strings = serviciosLugar;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaServicios);

        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("ALOJAMIENTO "+miAgente.getNombre());

        dtosAnti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dtosAnti.setModel(new javax.swing.table.DefaultTableModel(
            obtenerListaDescuentos(miAgente.getDescuentoPorAnticipacion())
            ,
            new String [] {
                "Cantidad de Días", "Descuento (%)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(dtosAnti);
        if (dtosAnti.getColumnModel().getColumnCount() > 0) {
            dtosAnti.getColumnModel().getColumn(0).setResizable(false);
            dtosAnti.getColumnModel().getColumn(1).setResizable(false);
        }

        dtoDias.setModel(new javax.swing.table.DefaultTableModel(
            obtenerListaDescuentos(miAgente.getDescuentoPorCantidadDeDias()),
            new String [] {
                "Cantidad de Días", "Descuento(%)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dtoDias);
        if (dtoDias.getColumnModel().getColumnCount() > 0) {
            dtoDias.getColumnModel().getColumn(0).setResizable(false);
            dtoDias.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setText("Servicios Ofrecidos");

        dtosPsas.setModel(new javax.swing.table.DefaultTableModel(
            obtenerListaDescuentos(miAgente.getDescuentoPorPersonas()),
            new String [] {
                "Cantidad de Personas", "Descuento(%)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(dtosPsas);
        if (dtosPsas.getColumnModel().getColumnCount() > 0) {
            dtosPsas.getColumnModel().getColumn(0).setResizable(false);
            dtosPsas.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ciudad)
                                        .addComponent(precio)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tipo)
                                            .addGap(37, 37, 37)
                                            .addComponent(calidad))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelAntic)
                                            .addGap(79, 79, 79)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(labelPsas))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(273, 273, 273)
                                .addComponent(cerrar)))
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(146, 146, 146))))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(ciudad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo)
                    .addComponent(calidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precio)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAntic)
                    .addComponent(labelPsas))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(cerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel calidad;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel ciudad;
    private javax.swing.JTable dtoDias;
    private javax.swing.JTable dtosAnti;
    private javax.swing.JTable dtosPsas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelAntic;
    private javax.swing.JLabel labelPsas;
    private javax.swing.JList listaServicios;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private String tipoString() {
        Tipo tipoLugar = miAgente.getTipo();
        String stringlugar;
        if (tipoLugar!= null){
        switch(tipoLugar){
            case APART:
                stringlugar= "APART";
                break;
            case HOSTAL:
                stringlugar= "HOSTAL";
                break;
            case HOTEL:
                stringlugar= "HOTEL";
                break;
            default:
                stringlugar= "CABAÑA";
        }
        }else{stringlugar="";}
        return stringlugar;
    }

    private Object[][] obtenerListaDescuentos(float[] descuentos) {
        float dtoMax = -1;
        int contador = 0;
        int[] indices= new int[descuentos.length];
        float[] valores= new float[descuentos.length];
        Object[][] listaDesc;
        
        for(int i=0; i<descuentos.length; i++){
            if(dtoMax!=descuentos[i]){
                valores[contador]= descuentos[i]*100;
                indices[contador]= i;
                dtoMax= descuentos[i];
                contador++;
            }
        }
        if(contador>1){
            listaDesc = new Object[contador-1][2];
            for (int j=0; j<listaDesc.length; j++){
                listaDesc[j][0]= indices[j+1];
                listaDesc[j][1]= valores[j+1];
            }
        }else{
            listaDesc = new Object[contador][2];
            listaDesc[0][0]= null;
            listaDesc[0][1]= null;
        }
        
        
        
        return listaDesc;
    }
}
