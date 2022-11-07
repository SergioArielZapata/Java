
/**
 * Ejecutable de la clase Empleado
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (2.5)
 */
import java.util.Scanner;
public class PruebaEmpleado {
    public static void main(String [] args){
        //carga de atributos
        long cuil;
        String apellido;
        String nombre;
        double sueldoBasico;
        int anioIngreso;
        Scanner teclado = new Scanner(System.in);
        
        //Ingreso por teclado de los datos
        System.out.print("Ingrese el CUIL del empleado: ");
        cuil = teclado.nextLong();
        System.out.print("Ingrese el Apellido: ");
        apellido = teclado.next();
        System.out.print("Ingresar el Nombre: ");
        nombre = teclado.next();
        System.out.print("Ingrese el Sueldo Basico: ");
        sueldoBasico = teclado.nextDouble();
        System.out.print("Ingrese el año de Ingreso: ");
        anioIngreso = teclado.nextInt();
        
        //Creacion del objeto empleado
        Empleado emple = new Empleado(cuil, apellido, nombre, sueldoBasico, anioIngreso);
        System.out.println("");
        emple.mostrar(); //muestra la salida por pantalla de los datos
        System.out.println("");
        System.out.println(emple.mostrarLinea()); // muestra la salida de una Linea
        System.out.println("");
        System.out.println("\n Prueba Finalizada Exitosamente!!! ...");
        System.out.println("\n Sistemas SAZ InforPOWER");
    }
}
