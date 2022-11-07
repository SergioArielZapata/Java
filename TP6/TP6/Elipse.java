/**
 * Trabajo Practico N° 6 - Ejercicio N° 4
 * Trabajo Practico N° 6 - Ejercicio N° 7
 * @author (Sergio Ariel Zapata)
 * @version (6.4.6.7)
 */
public class Elipse extends FiguraGeometrica{
    //Variables de instancias
    private double sEjeMayor;
    private double sEjeMenor;
    //private Punto Centro;
    /**
     * Constructor para objetos de la clase Elipse
     */
    public Elipse(Punto p_centro, double p_sEjeMayor, double p_sEjeMenor){
        //inicializacion de variables de instancias
        super(p_centro);
        this.setSEjeMayor(p_sEjeMayor);
        this.setSEjeMenor(p_sEjeMenor);
    }
    //Setters
    private void setSEjeMayor(double p_sEjeMayor){
        this.sEjeMayor = p_sEjeMayor;
    }
    private void setSEjeMenor(double p_sEjeMenor){
        this.sEjeMenor = p_sEjeMenor;
    }
    /*private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }*/
    
    //Getters
    public double getSEjeMayor(){
        return this.sEjeMayor;
    }
    public double getSEjeMenor(){
        return this.sEjeMenor;
    }
    /* public Punto getCentro(){
         return this.centro;
    }*/
    //Metodos
    /**
     * Metodo que permite devolver el nombre de la figura
     * @return retorna un simbolo del tipo String
    */
    public String nombreFigura(){
        return ("****** Elipse ******");
    }
    public void caracteristicas(){
        this.nombreFigura();
        System.out.println("Origen: "+super.getOrigen().coordenadas()+" - Semieje Mayor: "+this.getSEjeMayor()+" - Semieje Menor: "+this.getSEjeMenor());
        System.out.println("Superficie: "+this.superficie());
    }
    /**
     * Metodo que permite calcular el perimetro de un rectangulo
     * @return retorna un simbolo del tipo Double
     */
    public double superficie(){
        return (Math.PI*this.getSEjeMayor()*this.getSEjeMenor());
    }
    /**
     * Metodo que desplaza el origen del rectangulo a otro punto sin cambiar las caracteristicas
     */
    public void desplazar(double p_dx, double p_dy){
        this.setOrigen(new Punto(this.getOrigen().getX()+p_dx, this.getOrigen().getY()+p_dy));
        //this.getCentro().desplazar(p_dx, p_dy);
    }
    /**
     * Metodo que calcula la distancia entro dos elipses
     * @return retorna un simbolo del ditpo Double
     */
    public double distanciaA(Elipse otraElipse){
        return this.getOrigen().distanciaA(otraElipse.getOrigen());
    }
    /**
     * Metodo que indica cual de los Elipses es mayor
     * @return retorna un simbolo del tipo Elipse
     */
    public Elipse ElMayor(Elipse otraElipse){
        if(this.superficie() > otraElipse.superficie()){
            return this;
        }else{
            return otraElipse;
        }
    }
}