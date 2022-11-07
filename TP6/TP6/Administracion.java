/**
 * Ejecutable de la Jardin
 * Trabajo Practico Nº 6 - Ejercicio 7
 * 
 * @author (Sergio A. Zapata) 
 * @version (1.0)
 */
import java.util.*;
public class Administracion{
    public static void main (String []args){
        
        //creamos objetos geometricos
        FiguraGeometrica cuadrado = new Cuadrado((new Punto(3.4,5.4)),3, 20,3 );
        FiguraGeometrica triangulo = new Triangulo((new Punto(8.4,5.4)),2, 3);
        FiguraGeometrica circulo = new Circulo((new Punto(8.4,9.4)),2,15,3);
        FiguraGeometrica elipse = new Elipse((new Punto(2.3,3.7)),3,4);
        
        //los agregamos a un arraylist
        //ArrayList<FiguraGeometrica> figu = new ArrayList<FiguraGeometrica>();
        //creamos objeto de Jardin 
        Jardin jardin = new Jardin("Bichito de Luz");
        jardin.agregarFigura(cuadrado);
        jardin.agregarFigura(triangulo);
        jardin.agregarFigura(circulo);
        jardin.agregarFigura(elipse);
              
        //imprimimos el detalle del presupuesto del jardin para pinturas
        jardin.detalleFiguras();
    }
}
