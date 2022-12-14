/**
 * Crear una clase denominada TrianguloRectangulo, que contenga el método main(), en el que se determine si
un triangulo es rectángulo (Teorema de Pitágoras  h2 = cateto12 + cateto22). Los lados se deben ingresar por
teclado, utilizando el argumento del main().               
 * @author (Sergio Ariel Zapata) 
 * @version (1.6)
 */
public class TrianguloRectangulo {
    public static void main (String [] args) {
    double hipotenusa = Double.parseDouble(args [0]);
    double cateto1 = Double.parseDouble(args [1]);
    double cateto2 = Double.parseDouble(args [2]);
    double sumaCat = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
    if (sumaCat == (Math.pow(hipotenusa, 2))) {
            System.out.println(" Los datos corresponde a un Triangulo Rectángulo ");
        }
            else{
            System.out.println(" Los datos No corresponde a un Triángulo Rectángulo ");
    }
    }
}
