
/**
 * Trabajo Practico N° 3 - Ejercicio N° 3
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.3)
 */
public class Circulo{
    // Variables de instancia
    private double radio;
    private Punto centro;// Objeto de clase Punto
    
    /**
     * Contructor para objetos de la clase Circuito
     */
    public Circulo(double p_radio, Punto p_centro){
        //Inicializacion de variables de instancia
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    /**
     * Constructor sobrecargado de la clase Circulo
     * crea un circulo con radio 0, el origen esta en el punto(0, 0)
     */
    public Circulo(){
        //Inicializacion de variables de instancias
        this.setRadio(0.0);
        this.setCentro(new Punto(0.0 , 0.0));
    }
    
    //Setters
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    //Getters
    public double getRadio(){
        return this.radio;
    }
    public Punto getCentro(){
        return this.centro;
    }
    
    //Metodos
    /**
     * Metodo para desplazar el circulo, sin cambiar dimensiones, transladando el centro a otra posicion
     * se debe despalzar el objeto colaborador Punto que representa al centro
     */
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    public void caracteristicas(){
        System.out.println("****** Circulo ******");
        System.out.printf("Centro: %s  -  Radio: %6.1f ", this.getCentro().coordenadas(), this.getRadio());
        System.out.printf("\nSuperficie: %6.1f  -  Perimetro: %6.1f \n", this.superficie(), this.perimetro());
    }
    /**
     * Metodo que permite calcular el perimetro de un circulo
     */
    public double perimetro(){
        return (2 * Math.PI * this.getRadio());
    }
    /**
     * Metodo que permite calcular la superficie de un circulo
     */
    public double superficie(){
        return (Math.PI * this.getRadio() * this.getRadio());
    }
    /**
     * Metodo que permite calcular la distancia entre dos circulos, que es la distancia
     * entre sus centros
     */
    public double distanciaA(Circulo otroCirculo){
        return this.getCentro().distanciaA(otroCirculo.getCentro());
    }
    /**
     * Metodo que calcula el circulo mayor calculando sus superficies
     * @return Retorna un valor del tipo Circulo
     */
    public Circulo elMayor(Circulo otroCirculo){
        if (this.superficie() > otroCirculo.superficie()){
            return this;
        }else{
            return otroCirculo;
        }
    }
}
