import java.util.Scanner;
/**
 * Modificar la clase Circunferencia para permitir que el usuario pueda calcular el perímetro de muchas
circunferencias, utilizando la estructura while. Modificar además el ingreso de datos, utilizando la clase
Scanner.               
 * @author (Sergio Ariel Zapata) 
 * @version (1.7)
 */
public class T_P_1_E7 {
    public static void main(String [] args) {
    Scanner teclado = new Scanner(System.in);
    String salir = "s";
    while (salir.equals("s")) {
        System.out.print(" Ingrese radio: ");
        int radio = teclado.nextInt();
        double peri = (2 * Math.PI) * radio;
        System.out.println(" El perimetro de una circunferencia es: "+ peri);
        System.out.print(" Continuar? s-n : ");
        salir = teclado.next();
    }
    }
}