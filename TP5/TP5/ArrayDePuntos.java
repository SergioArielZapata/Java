
/**
 * Ejecutable de la clase Punto
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (5.1)
 */
import java.util.Scanner;
public class ArrayDePuntos{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        Punto[] puntos = new Punto[6];// se crea un array de 6 elementos
        double x;
        double y;
        System.out.print("---------------------Array de Puntos-------------------");
        System.out.print("\nLongitud del Array:" + puntos.length+"\n");
        //Carga de Array
        for (int i = 0; i < puntos.length; i++){ // Recorremos array para ingresar datos
            System.out.print("\nIngrese coordenada X"+"["+(i+1)+"]: ");
            x = Double.parseDouble(teclado.next());
            System.out.print("Ingrese coordenada Y"+"["+(i+1)+"]: ");
            y = Double.parseDouble(teclado.next());
            puntos[i] = new Punto(x,y);
        }
        System.out.println("\n"+"Coordenadas de los Puntos del Array\n");
        for (int i = 0; i < puntos.length; i++){//recorremos el array y enviamos un mensaje a cada elemento
            System.out.print("Coordenadas de Punto=> "+(i+1)+" => "); 
            puntos[i].mostrar();
        }
        System.out.println("\n"+"Distancia entre Puntos");        
        for (int i = 0; i < (puntos.length-1);i++){
            System.out.printf("\nDistancia de Punto %d a Punto %d => %5.1f",(i+1) , (i+2), puntos[i].distanciaA(puntos[i+1]));            
        }
    } 
}