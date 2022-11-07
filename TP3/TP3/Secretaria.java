
/**
 * Ejecutabla de la clase Docente y Escuela
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.6)
 */
import java.util.Scanner;
public class Secretaria {
    public static void main(String [] args){
        //Docente
        String nombre1;
        String grado;
        double sueldoBasico;
        double asignacionFamiliar;
        
        //Escuela
        String nombre2;
        String domicilio;
        String director;
        
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        //Recolecta datos y los envia a Docente
        System.out.print("Ingrese nombre del docente: ");
        nombre1 = teclado.next();
        System.out.print("Ingrese el grado: ");
        grado = teclado.next();
        System.out.print("Ingrese Sueldo Basico: ");
        sueldoBasico = teclado.nextDouble();
        System.out.print("Ingrese la asignacion familiar: ");
        asignacionFamiliar = teclado.nextDouble();
        Docente docente1 = new Docente(nombre1, grado, sueldoBasico, asignacionFamiliar);
        
        //Recolecta datos y los envia a Escuela
        System.out.println(" ");
        System.out.print("Ingrese el nombre de la escuela: ");
        nombre2 = teclado.next();
        System.out.print("ingrese Direccion de la escuela: ");
        domicilio = teclado.next();
        System.out.print("Ingrese el nombre del Director: ");
        director = teclado.next();
        Escuela escuela1 = new Escuela(nombre2, domicilio, director);
        System.out.println(" ");
        
        //Imprime Salida final
        escuela1.imprimirRecibo(docente1);
    }
}
