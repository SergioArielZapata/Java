/**
 * Trabajo Practico N° 6 - Ejercicio N° 10
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.10)
 */
import java.util.*;
public class Individuo extends Visitante{
    //variables de instancias
    private Persona persona;
    /**
     * Constructor para objetos de la clase Individuo
     */
    public Individuo(String p_nombre, Calendar p_fecha, Persona p_persona){
        //inicializacion de variables de instancias
        super(p_nombre,p_fecha);
        this.setPersona(p_persona);
    }
    //Setters
    private void setPersona(Persona p_persona){
        this.persona = p_persona;
    }
    //Getters
    public Persona getPersona(){
        return this.persona;
    }
    //Metodos
    /**
     * Meodo que devuelve el valor de la entrada
     * @return retorn a un simbolo del tipo double
     */
    public double entrada(){
        return 10.0;
    }
    /**
     * Metodo que devuelve un formato de impresion de individuo
     */
    public void mostrar(){
        this.getPersona().mostrar();
    }
    /**
     * Metodo que devuelve un listado en una fecha en particular de cada tipo de vis
     * @param p_fecha, p_visitante
     */
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if((p_fecha == super.getFechaVisita()) && (p_visitante == this.tipoVisitante())){
            this.mostrar();
        }
    }
    /**
     * Metodo que determian el tipo de visitante
     */
    public String tipoVisitante(){
        return "Individuo";
    }
}