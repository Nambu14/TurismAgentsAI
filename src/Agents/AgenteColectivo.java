/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Agents;

import Things.CronogramaTransporteColectivo;

/**
 *
 * @author Torre
 */
public class AgenteColectivo extends AgentTransport{
    private CronogramaTransporteColectivo [] rutas;
    
    protected void setup() {
    Object[] args = getArguments();
       if (args != null && args.length >0) {
           rutas = (CronogramaTransporteColectivo []) args;
       }
    }
}
