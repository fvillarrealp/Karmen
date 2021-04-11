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
public interface Visitante {
    public double visit(TarjetaEstudiante estudiante);
    public double visit(TarjetaNormal normal);
    public double visit(TarjetaMayor mayor);

}
