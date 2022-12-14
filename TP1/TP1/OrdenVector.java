import java.util.Scanner;
/**
 * Crear una clase denominada OrdenVector, que permita ingresar por teclado (Scanner) 4 elementos dobles, y
almacenarlos en un array. Determinar el menor elemento y mostrarlo. Ordenar los elementos del vector de
menor a mayor. Mostrar los elementos ordenados, separados por un tabulador. Usar sentencia FOR para el
ingreso de datos. Utilizar método de la Burbuja.               
 * @author (Sergio Ariel Zapata) 
 * @version (1.9)
 */
public class OrdenVector {
    public static void main(String [] args){
        double[] elem = new double[4];
        Scanner teclado = new Scanner (System.in);
        double menor = Double.MAX_VALUE;
        double aux;
        for (int i = 0; i < elem.length; i++){
            System.out.print(" Ingrese valor " + (i+1) + " : ");
            elem[i] = teclado.nextDouble();
            if (elem[i] < menor){
                menor = elem[i];
            }
        }
        System.out.println("\n El menor elemento es : " + menor);
        for (int i = 1; i < elem.length; i++){
            for (int j = 0; j < elem.length - 1; j++){
                if (elem[j] > elem[j+1]){
                    aux = elem[j];
                    elem[j] = elem[j+1];
                    elem[j+1] = aux;
                }
            }
        }
        System.out.println(" ");
        for (int i = 0; i < elem.length; i++){
            System.out.print(elem[i] + "\t");
        }
    }
}