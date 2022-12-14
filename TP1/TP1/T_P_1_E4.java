/**
 * Crear una clase que contenga el método main(), declarar las variables a, b y c de tipo double, que
corresponden a los lados de un triángulo. Los valores deben ser ingresados por teclado como argumentos del
método main(). Calcular y mostrar el semiperímetro y el área del triángulo con las siguientes fórmulas:
semiperimetro= (a+b+c)/2
area= raíz cuadrada(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c))               
 * @author (Sergio Ariel Zapata) 
 * @version (1.4)
 */
public class T_P_1_E4 {
    public static void main(String [] args) {
        double a = Double.parseDouble(args [0] );
        double b = Double.parseDouble(args [1] );
        double c = Double.parseDouble(args [2] );
        System.out.println(" Lado a: " + a);
        System.out.println(" Lado b: " + b);
        System.out.println(" Lado c: " + c);
        double semiperimetro = (a+b+c)/2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
        System.out.println(" El área del triángulo es: " + area);
        System.out.println(" El semiperimetro es     : " + semiperimetro);
    }
}