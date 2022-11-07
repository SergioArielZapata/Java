
/**
 * Ejecutable de la clase Punto
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (2.6)
 */
import java.util.Scanner;
public class PruebaPunto{
    public static void main(String[] args){
        //Carga de atributos
        double x;
        double y;
        Scanner teclado = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.print("Ingresar el punto de la abscisa: ");
        x = teclado.nextDouble();
        System.out.print("Ingresar el punto de la ordenada: ");
        y = teclado.nextDouble();
        
        //Creacion del Objeto Punto
        System.out.println("Origen de los Puntos");
        Punto punto_1 = new Punto();
        punto_1.mostrar(); //muestra por pantalla la salida impresa de los datos
        System.out.println(punto_1.coordenadas()); //muestra por pantalla la salida en una linea
        System.out.println("");
        punto_1.desplazar(x,y);
        System.out.println("Los puntos se desplazaron a las coordenadas");
        punto_1.mostrar(); //muestra la salida impresa de los datos
        System.out.println(punto_1.coordenadas()); //muestra la salida impresa de los datos en una linea
        System.out.println("\n Prueba Finalizada Exitosamente!!! ...");
        System.out.println("\n Sistemas SAZ InforPOWER");
    }
}
