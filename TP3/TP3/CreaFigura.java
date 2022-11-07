
/**
 * Ejecutable de la clase Punto y Circulo
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.4.2)
 */
import java.util.Random;// Genera numeros aleatorios
public class CreaFigura {
    public static void main(String [] args){
        //Crea random para el circulo
        Random unNumero = new Random();
        double radio_1 = unNumero.nextDouble() * 100.0;
        
        //Crea objeto Punto
        System.out.println("Circulo con Centro en el Origen");
        Punto punto_1 = new Punto();
        //Circulo en el punto de origen (0.0)
        Circulo circulo_1 = new Circulo(radio_1, punto_1);
        circulo_1.caracteristicas();
        System.out.println(" ");
        System.out.println("Circulo desplazado en el punto situado 240 unidades hacia la izquierda y 230 hacia abajo");
        circulo_1.desplazar(-240, -230);
        circulo_1.caracteristicas();
        System.out.println(" ");
        System.out.println("Segundo circulo creado");
        Punto punto_2 = new Punto(5.2, 0.5);
        double radio_2 = unNumero.nextDouble() * 100.0;
        Circulo circulo_2 = new Circulo(radio_2, punto_2);
        circulo_2.caracteristicas();
        System.out.println(" ");
        System.out.println("La caracteristica del circulo mayor con respecto a la superficie");
        //Se envia los datos de clase Circulo para comparar cual es el mayor, cuando devuelve el mayor tambien de la clase Circulo
        //compara si es igual al segundo Dato enviado para su comparacion de la clase Circulo, si es igual las dos devoluciones
        //muestra el primer circulo, si no es igual muestra el segundo circulo
        //Lo mismo con la comparacion del rectangulo
        if(circulo_1.elMayor(circulo_2) == circulo_1.elMayor(circulo_1)){
            circulo_1.caracteristicas();
        }else{
            circulo_2.caracteristicas();
        }
        System.out.printf("La distancia entre los circulos es: %6.1f\n", circulo_1.distanciaA(circulo_2));
        System.out.println(" ");
        //Creacion de un rectangulo con punto de origen (0.0)
        System.out.println("Rectangulo con Origen en el punto (0.0)");
        double ancho_1 = unNumero.nextDouble() * 100.0;
        double alto_1 = unNumero.nextDouble() * 100.0;
        Rectangulo rectangulo_1 = new Rectangulo(ancho_1, alto_1);
        rectangulo_1.caracteristicas();
        // Desplaza el rectangulo
        System.out.println("\nRectangulo desplazado en el punto situado 40 unidades hacia la derecha y 20 hacia abajo");
        rectangulo_1.desplazar(40, -20);
        rectangulo_1.caracteristicas();
        //Rectangulo en el punto distinto
        System.out.println(" ");
        System.out.println("Segundo rectangulo creado");
        //Se crea otro rectangulo
        Punto punto_3 = new Punto(7.4,4.5);
        double ancho_2 = unNumero.nextDouble() * 100.0;
        double alto_2 = unNumero.nextDouble() * 100.0;
        Rectangulo rectangulo_2 = new Rectangulo(punto_3, ancho_2, alto_2);
        rectangulo_2.caracteristicas();
        System.out.println(" ");
        System.out.println("La caracteristica del rectangulo mayor con respecto a la superficie");
        if(rectangulo_1.elMayor(rectangulo_2) == rectangulo_1.elMayor(rectangulo_1)){
            rectangulo_1.caracteristicas();
        }else{
            rectangulo_2.caracteristicas();
        }
        System.out.printf("La distancia entre los rectangulos es: %6.1f\n", rectangulo_1.distanciaA(rectangulo_2));
    }
    
}
