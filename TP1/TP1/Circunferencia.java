/**
 * Crear una clase denominada Circunferencia, que contenga el método main(), en el que se calcule el perímetro
de una circunferencia, ingresando el radio de tipo entero a través del argumento del main().               
 * @author (Sergio Ariel Zapata) 
 * @version (1.3)
 */
public class Circunferencia {
    public static void main (String[] args){
    int radio = Integer.valueOf(args [0]);
    double peri = (2 * Math.PI) * radio;
    System.out.println("El perimetro de una circunferencia es: "+ peri);
    }
}