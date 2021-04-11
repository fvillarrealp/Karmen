/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;


public class Descuento implements Visitante {
    private final double descuentoEstudiantePorcentaje = 0.8;
    private final double descuentoNormalPorcentaje = 0;
    private final double descuentoMayorPorcentaje = 0.25;
    
    @Override
    public double visit(TarjetaEstudiante estudiante) {
        return Math.round(estudiante.getPrecio() *(1 - descuentoEstudiantePorcentaje));
    }

    @Override
    public double visit(TarjetaNormal normal) {
        return Math.round(normal.getPrecio() *(1 - descuentoNormalPorcentaje));
    }

    @Override
    public double visit(TarjetaMayor mayor) {
        return Math.round(mayor.getPrecio() *(1 - descuentoMayorPorcentaje));
    }
    
}
