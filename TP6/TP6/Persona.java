/**
 * Trabajo Practico N° 2 - Ejercicio N° 1
 * Trabajo Practico N° 3 - Ejercicio N° 9
 * Trabajo Practico N° 5 - Ejercicio N° 3
 * Trabajo Practico N° 6 - Ejercicio N° 1
 * @author (Sergio Ariel Zapata) 
 * @version (2.1.3.9.6.1)
 */
import java.util.*;
public class Persona {
    //Variables de Instancias
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
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
    /**
     * Constructor sobrecargado de los objetos de la clase persona
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
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
        this.setFechaNacimiento(new GregorianCalendar());
        this.getFechaNacimiento().set(p_anio,1,1);
    }
    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento = p_fecha;
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
        return this.getFechaNacimiento().YEAR;
    }
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    //Metodos
    /**
     * Metodo para calcular la edad de la persona restando el año actual menos el año de nacimiento
     * @return la edad de la persona
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int t_edad = anioHoy - this.getFechaNacimiento().get(Calendar.YEAR);
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
        System.out.println("DNI: " + this.getDNI() + "\t Edad: " + this.edad() + " años");
    }
    /**
     * Metodo que comprueba si el cliente cumple años
     * @return devuelve un valor del tipo boolean
     */
    public boolean esCumpleaños(){
        Calendar fechaActual = new GregorianCalendar();
        //Calcula el dia, mes actual y de naciemiento para verificar si cumple años en el dia actual
        //Los dias del mes se comienza a contar desde 0
        int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);
        int mesActual = fechaActual.get(Calendar.MONTH) + 1;
        int diaNacimientoPersona = this.getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
        int mesNacimientoPersona = this.getFechaNacimiento().get(Calendar.MONTH);
        //Revisa si es el cumpleaños
        if(diaActual == diaNacimientoPersona && mesActual == mesNacimientoPersona){
            return true;
        }else{
            return false;
        }
    }
}