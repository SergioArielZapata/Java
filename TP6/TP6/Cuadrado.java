/**
 * Trabajo Practico N° 6 - Ejercicio N° 3
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.3)
 */
public class Cuadrado extends Rectangulo{
    //Variables de instancias
    private double lado;
    /**
     * Constructor para objetos de la clase Cuadrado
     */
    public Cuadrado(Punto p_origen, double p_ancho, double p_alto, double p_lado){
        //inicializacion de variables de instancias
        super(p_origen, p_ancho, p_alto);
        this.setLado(p_lado);
    }
    //Setters
    private void setLado(double p_lado){
        this.lado = p_lado;
    }
    //Getters
    public double getLado(){
        return this.lado;
    }
    //Metodos
    /**
     * Metodo que permite devolver el nombre de la figura
     * @return retorna un simbolo del tipo String
     */
    public String nombreFigura(){
        return ("****** Cuadrado ******");
    }
    /**
     * Metodo que devuelve las caracteristicas de la figura
     */
    public void caracteristicas(){
        this.nombreFigura();
        System.out.println("Origen: "+super.getOrigen().coordenadas()+" - Lado: "+this.getLado());//en duda si es this o super
        System.out.println("Superficie: "+super.superficie()+" - Perimetro :"+super.perimetro());
    }
}