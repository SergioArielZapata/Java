/**
 * Crear una clase denominada Ecuacion que contenga el método main() y que calcule las raíces reales de una
ecuación de segundo grado. Los valores de los coeficientes a, b y c se ingresarán por teclado como
argumentos del método main(). Considerar que si discriminante > 0 se deben calcular las 2 raíces, si
discriminante = 0 se debe calcular una sola raíz, especificando por pantalla que x1 = x2. En caso de ser
negativo, mostrar un mensaje indicando que se encuentra frente a una solución compleja (numero
imaginario).               
 * @author (Sergio Ariel Zapata) 
 * @version (1.5)
 */
public class Ecuacion {
    public static void main(String [] args){
    double a = Double.parseDouble(args [0]);
    double b = Double.parseDouble(args [1]);
    double c = Double.parseDouble(args [2]);
    double x1;
    double x2;
    System.out.println(" Dato a: " + a);
    System.out.println(" Dato b: " + b);
    System.out.println(" Dato c: " + c);
    double discri = (Math.pow(b, 2) - (4 * a * c));
    
    if (discri > 0) {
        x1 = (((-b)+Math.sqrt(discri)) / (2 * a));
        x2 = (((-b)-Math.sqrt(discri)) / (2 * a));
        System.out.println(" La solucion de x1 es: " + x1);
        System.out.println(" La solucion de x2 es: " + x2);
    }
    if (discri == 0) {
        x1 = (((-b)+Math.sqrt(discri)) / (2 * a));
        System.out.println(" La solucion de x1 es igual a x2, el resultado es : " + x1);
    }
    if (discri < 0) {
        System.out.println(" Se encuentra frente a una solución compleja (número imaginario) ");
    }
    
    }
}
