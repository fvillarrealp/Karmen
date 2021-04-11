/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Usuario
 */
public class TarjetaMayor extends Tarjeta {
    private double precio;

    @Override
    public double aceptVisit(Visitante vi) {
        return vi.visit(this);
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    /**
     *
     * @param precio
     */
    public void setPrecio(double precio){
        this.precio = precio;
    }
}
