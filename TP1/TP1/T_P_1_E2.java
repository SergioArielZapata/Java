/**
 * Crear una clase que contenga el método main(), en el que se determinen y muestren por pantalla los números
múltiplos de 4 a partir de 42 y hasta el 150 inclusive. Usar la sentencia de bucle más apropiada.               
 * @author (Sergio Ariel Zapata) 
 * @version (1.2)
 */
public class T_P_1_E2{
    public static void main(String[] args) {
        int multi = Integer.valueOf(args [0]);
        int resto;
            for(int i = 42; i<=150; i = i + 1){
                resto = i % multi;
                if (resto==0)
            System.out.println("Los multiplos de "+ multi + " son: " +i);
        }
    }  
}
