/**
 * Trabajo Practico N° 6 - Ejercicio N° 9
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.9)
 */
public class Servicio{
    //Variables de instancias
    private String descripcion;
    private double precio;
    /**
     * Constructor para objetos de la clase Servicio
     */
    public Servicio(String p_descripcion, double p_precio){
        //inicializacion de variables
        this.setDescripcion(p_descripcion);
        this.setPrecio(p_precio);
    }
    //Setters
    private void setDescripcion(String p_descripcion){
        this.descripcion = p_descripcion;
    }
    private void setPrecio(double p_precio){
        this.precio = p_precio;
    }
    //Getters
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getPrecio(){
        return this.precio;
    }
}