/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Things;

import java.util.GregorianCalendar;

/**
 *
 * @author Lucas
 */
public class PaqueteAereo extends Paquete{

   public static enum Comodidad {PRIMERA_CLASE, BUSSINES, TURISTA};
   private Comodidad comodidad;
  
    public PaqueteAereo(String origen, String destino, float presupuestoMax, Comodidad comodidad, int cantidadPersonas, GregorianCalendar fechaInicialInferior, GregorianCalendar fechaInicialSuperior, int duracion, Lugar alojamiento) {
        super(origen, destino, presupuestoMax, cantidadPersonas, fechaInicialInferior, fechaInicialSuperior, duracion, alojamiento);
        this.comodidad=comodidad;
    } 

    public Comodidad getComodidad() {
        return comodidad;
    }

    public void setComodidad(Comodidad comodidad) {
        this.comodidad = comodidad;
    }
    
}
