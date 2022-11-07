
/**
 * Trabajo Practico N° 3 - Ejercicio N° 8
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.8)
 */
public class Localidad{
    //Variables de instancia
    private String nombre;
    private String provincia;
    
    /**
     * Constructor de objetos de la clase Localidad
     */
    public Localidad(String p_nombre, String p_provincia){
        //Inicializacion de variables de instancia
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getProvincia(){
        return this.provincia;
    }
    
    //Metodos
    /**
     * Metodo que muestra salida Impresa por pantalla
     */
    public void mostrar(){
        System.out.println("Localidad: " + this.getNombre() + "\t\t\tProvincia: " + this.getProvincia());
    }
}
