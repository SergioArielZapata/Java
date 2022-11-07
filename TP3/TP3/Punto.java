
/**
 * Trabajo Practico N" 2 - Ejercicio N° 6
 * Trabajo Practico N° 3 - Ejercicio N° 2
 * @author (Sergio Ariel Zapata) 
 * @version (2.6.3.2)
 */
public class Punto{
    //Variables de instancia
    private double x;
    private double y;
    
    /**
     * Constructor sin parametros de la clase Punto
     */
    public Punto(){
        this.setX(0.0);
        this.setY(0.0);
    }
    
    /**
     * Constructor con parametros de la clase Punto
     */
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
    
    //Setters
    private void setX(double p_x){
        this.x = p_x;
    }
    private void setY(double p_y){
        this.y = p_y;
    }
    
    //Getters
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    
    //Metodos
    /**
     * Metodo para desplazar (dx dy) cambia la posicion del punto desde (x, y) a (x+dx, y+dy)
     */
    public void desplazar(double p_dx, double p_dy){
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    /**
     * Metodo que calcula la distancia desde el punto, hasta otro punto que se recibe como parametro
     * @param Punto p_ptoDistante
     * @return retorna un valor del tipo double
     */
    public double distanciaA(Punto p_ptoDistante){
        double distancia = Math.sqrt(Math.pow((p_ptoDistante.getX() - this.getX()),2) + Math.pow((p_ptoDistante.getY() - this.getY()),2));
        return distancia;
    }
    /**
     * Metodo que muestra la salida impresa por pantalla
     */
    public void mostrar(){
        System.out.println("Punto X; " + this.getX() + ", Y: " + this.getY());
    }
    /**
     * Metodo que devuelve una cadena con el formato (X, Y)
     * @return retorna un valor del tipo String
     */
    public String coordenadas(){
        return ("(" + this.getX() +  ", " + this.getY() + ")");
    }

}