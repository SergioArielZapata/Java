import java.util.Scanner;
/**
 * Crear una clase denominada OperarVector que permita ingresar por teclado (Scanner) 5 notas de alumnos, las
que serán almacenadas en un array de enteros. Calcular el promedio y determinar la mayor nota. El promedio
debe permitir resultado con decimales (aplicar cast a los elementos enteros cuando sea necesario para obtener
dicho resultado). Mostrar los elementos ingresados, separados por un tabulador. Mostrar el promedio y la
mayor nota con el mensaje respectivo.               
 * @author (Sergio Ariel Zapata) 
 * @version (1.8)
 */
public class OperarVector {
    public static void main(String [] args){
        int[] notas = new int[5];
        Scanner teclado = new Scanner (System.in);
        int suma = 0;
        double promedio;
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < notas.length; i ++){
            System.out.print(" Ingrese Nota " + (i+1) + ": ");
            notas[i] = teclado.nextInt();
            suma += notas[i];
            if (notas[i] > mayor){
                mayor = notas[i];
            }
        }
        System.out.println(" ");
        for (int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + "\t");
        }
        promedio = (double)suma / notas.length;
        System.out.println (" ");
        System.out.println ("\n El promedio de las notas es : " + promedio );
        System.out.println ("\n La nota mayor ingresada es  : " + mayor);
    }
}