/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Agents;

import Ventanas.VentanaLugar;
import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;

/**
 *
 * @author Lucas
 */
public class AgenteLugar extends Agent{

    private String ciudad;
    private int precioPersona;
    private String[] servicios;
    private float[] descuentoPorPersonas;
    private float[] descuentoPorAnticipacion;
    private float[] descuentoPorCantidadDeDias;
    public enum Tipo{HOTEL, APART, CABAÑA, HOSTAL};
    private String nombre;
    private int calidad;
    private Tipo tipo;
    private VentanaLugar myGui;
    
    @Override
    protected void setup() {
        //myGui= new VentanaLugar(this);
        //myGui.showGui();
          
        //Registro en paginas amarillas
        DFAgentDescription dfd = new DFAgentDescription();
        dfd.setName(getAID());
        ServiceDescription sd = new ServiceDescription();
        sd.setType("Lugar");
        sd.setName(nombre);
        dfd.addServices(sd);
        try{
            DFService.register(this, dfd);
        }
        catch (FIPAException fe){
            fe.printStackTrace();
        }
    }
    
    // Métodos llamados desde la interfaz, donde ya se crean los arreglos
    public void definirLugar(String ciudad, int precio, String nombre, int calidad, Tipo tipo){
       this.ciudad = ciudad;
       precioPersona = precio;
       this.nombre = nombre;
       this.calidad = calidad;
       this.tipo = tipo;
   }
   public void asignarServicios(String[] servicios){
       this.servicios = servicios;
   }
   public void asignarDescuentoPersonas(float[] dtoPsas) {
       descuentoPorPersonas = dtoPsas;
   }
   public void asignarDescuentoDias(float[] dtoDias) {
       descuentoPorCantidadDeDias = dtoDias;
   }
   public void asignarDescuentoAnticipación(float[] dtoAnticipacion) {
       descuentoPorAnticipacion = dtoAnticipacion;
   }
   
   protected void takeDown(){
                try{
            DFService.deregister(this);
        }
        catch (FIPAException fe){
            fe.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "AgenteLugar{" + "ciudad=" + ciudad + ", servicios=" + servicios + ", nombre=" + nombre + ", calidad=" + calidad + ", tipo=" + tipo + '}';
    }
   

}