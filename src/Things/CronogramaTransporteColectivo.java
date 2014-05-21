/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Things;

import java.time.DayOfWeek;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class CronogramaTransporteColectivo extends CronogramaTrasporte {
    
    public static enum Comodidad {Ejecutivo, Cama, Semicama};
    public Comodidad comodidad;
    
    public CronogramaTransporteColectivo(String origen, String destino, float precio, int capacidad, Comodidad comodidad, ArrayList<DayOfWeek> salidas) {
        super(origen, destino, precio, capacidad, salidas);
        this.comodidad=comodidad;
    }
    
    
}