/**
 * Crear una clase que contenga el método main(). En él declarar las variables a y b de tipo entero.
Inicializarlas con los valores 8 y 3 respectivamente. Realizar y mostrar por pantalla las siguientes
operaciones aritméticas: suma, resta, multiplicación, división y resto.               
 * @author (Sergio Ariel Zapata) 
 * @version (1.0)
 */
public class T_P_1_E1{
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        
        int suma;
        int resta;
        int mul;
        int div;
        int resto;
        
        suma = a + b;
        resta = a - b;
        mul = a * b;
        div = a / b;
        resto = a % b;
        
        System.out.println(a +" + " +b +" = " +suma);
        System.out.println(a +" - " +b +" = " +resta);
        System.out.println(a +" * " +b +" = " +mul);
        System.out.println(a +" / " +b +" = " +div);
        System.out.println(a +" % " +b +" = " +resto);
    }
}