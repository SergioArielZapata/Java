
/**
 * Ejecutable de la clase Cliente
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (2.3)
 */
public class PruebaCiente{
    public static void main(String [] args){
        int nroDNI = Integer.parseInt(args[0]);
        String apellido = args[1];
        String nombre = args[2];
        double saldo = Double.parseDouble(args[3]);
        
        Cliente cli = new Cliente(nroDNI, apellido, nombre, saldo);
        cli.mostrar();
        System.out.println("\n Prueba Finalizada Exitosamente!!! ...");
        System.out.println("\n Sistemas SAZ InforPOWER");
    }
}
