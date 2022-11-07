
/**
 * Trabajo Practico N° 3 - Ejercicio N° 4
 * Trabajo Practico N° 6 - Ejercicio N° 3
 * @author (Sergio Ariel Zapata) 
 * @version (3.4.6.3)
 */
public class Rectangulo extends FiguraGeometrica{
    //Variables de instancia
    private Punto origen;//se situa en esquina inferior izquierda
    private double ancho;
    private double alto;
    
    /**
     * Constructor de la clase Rectangulo que crea un rectangulo situado en un punto p mas los parametros que recibe
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        //Inicializacion de variables
        //this.setOrigen(p_origen);
        super(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    /**
     * Constructor sobrecargado para objetos de la clase Rectangulo de origen (0.0)
     */
    public Rectangulo(double p_ancho, double p_alto){
        //Inicializacion de variables
        //this.setOrigen(new Punto(0.0,0.0));
        super(new Punto(0.0,0.0));
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    //Setters
    /*private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }*/
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    
    //Getters
    /*public Punto getOrigen(){
        return this.origen;
    }*/
    public double getAncho(){
        return this.ancho;
    }
    public double getAlto(){
        return this.alto;
    }
    
    //Metodos
    /**
     * Metodo que permite devolver el nombre de la figura
     * @return retorna un simbolo del tipo String
     */
    public String nombreFigura(){
        return ("****** Rectangulo ******");
    }
    /**
     * Metodo que translada el origen del rectangulo sin cambiar la dimension
     */
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    /**
     * Metodo que muestra las caracteristicas del rectangulo
     */
    public void caracteristicas(){
        this.nombreFigura();
        System.out.printf("Origen: %s  -  Alto: %6.1f  -  Ancho: %6.1f", this.getOrigen().coordenadas(), this.getAlto(), this.getAncho());
        System.out.printf("\nSuperficie: %6.1f  -  Perimetro: %6.1f\n", this.superficie(), this.perimetro());
    }
    /**
     * Metodo que calcula el perimetro de un rectangulo
     * @return retorna un valor del tipo double
     */
    public double perimetro(){
        return (2 * (this.getAncho() +  this.getAlto()));
    }
    /**
     * Metodo que calcula la superficie de un rectangulo
     * @return retorna un valor del tipo double
     */
    public double superficie(){
        return (this.getAncho() * this.getAlto());
    }
    /**
     * Metodo que permite calcular la distancia entre dos rectangulos que sera la distancia entre sus origentes
     * @return retorna un valor del tipo double
     */
    public double distanciaA(Rectangulo otroRectangulo){
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }
    /**
     * Metodo que calcula el mayor entre dos rectangulos calculando las superficies
     * @return retorna un valor del tipo Rectangulo
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie() > otroRectangulo.superficie()){
            return this;
        }else{
            return otroRectangulo;
        }
    }
}