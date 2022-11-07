
/**
 * Trabajo Practico N° 4 - Ejercicio N° 5
 *
 * @author (Sergio Ariel Zapata) 
 * @version (4.5)
 */
import java.util.*;
public class Evento{
    //Variables de instancia
    private String nombre;
    private String lugar;
    private Calendar fecha;
    private int diasInscripcion;
    private double costo;
    //Constructor
    public Evento(String p_nombre, String p_lugar, Calendar p_fecha, int p_diasIns, double p_costo){
        //Inicializacion de variables de instancia
        this.setNombre(p_nombre);
        this.setLugar(p_lugar);
        this.setFecha(p_fecha);
        this.setDiasInscripcion(p_diasIns);
        this.setCosto(p_costo);
    }
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setLugar(String p_lugar){
        this.lugar = p_lugar;
    }
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    private void setDiasInscripcion(int p_diasIns){
        this.diasInscripcion = p_diasIns;
    }
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getLugar(){
        return this.lugar;
    }
    public Calendar getFecha(){
        return this.fecha;
    }
    public int getDiasInscripcion(){
        return this.diasInscripcion;
    }
    public double getCosto(){
        return this.costo;
    }
    //Metodos
    /**
     * Metodo que calcula el costo de la invitacion al evento recibiendo la edad del intivado, calcula si habra descuento
     * @return un valor del tipo String
     */
    public String costoFinal(int p_edadInvitado){
        if(p_edadInvitado >= 60){
            return ("Costo: " + (this.getCosto() - (this.getCosto()/100*10)) + " incluye descuento");
        }else{
            return ("Costo: " + getCosto());
        }
    }
    /**
     * Metodo que devuelve la fecha de inscripo de la persona
     * @return un valor del tipo Calendar
     */
    public Calendar fechaInscripcion(){
        return getFecha();
    }
}