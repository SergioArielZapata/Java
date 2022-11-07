
/**
 * Ejecutable de la clase Laboratorio y Producto
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.1)
 */
public class GestionStock {
    public static void main(String [] args){
        int codigo = 10;
        String nombre = "Colgate S.A.";
        String domicilio = "Scalabrini Ortiz 5524";
        String telefono = "54-11.4239.8447";
        String rubro = "Perfumeria";
        String descripcion = "Jabón Deluxe";
        double costo = 5.25;
        
        Laboratorio lab = new Laboratorio(nombre, domicilio, telefono);
        
        // Carga de 1 producto, se le asigne un stock de 500, que surgieron de una promoción de un laboratorio,
        // luego se muestre por pantalla sus datos, incluido el stock valorizado.
        Producto prod = new Producto(codigo, rubro, descripcion, costo,lab);
        
        prod.ajuste(500);
        prod.mostrar();
        System.out.println(" ");
        
        prod.ajuste(-200);// se da de baja productos por estar mal estibados
        System.out.print(" ");
        prod.mostrar();// muestra el producto actual
        System.out.println(" ");
        // consulta de cliente, muestre el precio de lista y el precio al contado
        System.out.println(prod.mostrarLinea());
        System.out.println(" ");
        prod.ajustarPtoRepo(34.23);
        prod.ajustarExisMin(35);
    
    }
}
