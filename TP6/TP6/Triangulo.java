/**
 * Trabajo Practico N° 6 - Ejercicio N° 7
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.7)
 */
public class Triangulo extends FiguraGeometrica{
    //Variables de instancias
    private double base;
    private double altura;
    /**
     * Constructor para objetos de la clase Triangulo
     */
    public Triangulo(Punto p_origen,double p_base, double p_altura){
        //inicializacion de variables de instancias
        super(p_origen);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    //Setters
    private void setBase(double p_base){
        this.base = p_base;
    }
    private void setAltura(double p_altura){
        this.altura = p_altura;
    }
    //Getters
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    //Metodos
    public String nombreFigura(){
        return ("****** Triangulo ******");
    }
    /**
     * Metodo que calcula la superficie del triangulo
     */
    public double superficie(){
        return ((this.getBase() * this.getAltura()) / 2);
    }
}