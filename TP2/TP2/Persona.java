
/**
 * Trabajo Pactico N° 2 - Ejercicio N° 1
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (2.1)
 */
import java.util.*;
public class Persona {
    //Variables de Instancias
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    //Constructor
    /**
     * Constructor para los objetos de la clase persona
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        // inicializacion de variables de instancia
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    //Setters
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setAnioNacimiento(int p_anio){
        this.anioNacimiento = p_anio;
    }
    //Getters
    public int getDNI(){
        return this.nroDni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getAnioNacimiento(){
        return this.anioNacimiento;
    }
    //Metodos
    /**
     * Metodo para calcular la edad de la persona restando el año actual menos el año de nacimiento
     * @return la edad de la persona
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int t_edad = anioHoy - this.getAnioNacimiento();
        return t_edad;
    }
    
    /**
     * Metodo para devolver en orden el Nombre y Apellido de la persona
     * @return un valor del tipo String
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Metodo para devolver en orden el Apellido y Nombre de la persona
     * @return un valor del tipo String
     */
    public String ApeYNom(){
        return this.getApellido() + " " + getNombre();
    }

    /**
     * Metodo para mostrar datos
     */
    public void mostrar(){
        System.out.println("\nNombre y Apellido: " + nomYApe());
        System.out.println("\nDNI: " + this.getDNI() + "\t Edad: " + this.edad() + " años");
    }
}