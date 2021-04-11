
package visitor;

public class Visitor {

    public static void main(String[] args) {
        int precioPasaje = 2000; 
        
        TarjetaNormal tarjeta1 = new TarjetaNormal();
        tarjeta1.setPrecio(precioPasaje);
        
        TarjetaEstudiante tarjeta2 = new TarjetaEstudiante();
        tarjeta2.setPrecio(precioPasaje);
        
        TarjetaMayor tarjeta3 = new TarjetaMayor();
        tarjeta3.setPrecio(precioPasaje);
         
        Descuento desc = new Descuento();
        double resultado1 = tarjeta1.aceptVisit(desc);
        double resultado2 = tarjeta2.aceptVisit(desc);
        double resultado3 = tarjeta3.aceptVisit(desc);
        
        System.out.println("Resultado Precio Tarjeta Normal: " + "$" + resultado1);
        System.out.println("Resultado Precio Tarjeta Estudiante: " + "$" + resultado2);
        System.out.println("Resultado Precio Tarjeta Mayor: " + "$" + resultado3);
    }
    
}
