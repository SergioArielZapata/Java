/**
 * Trabajo Practico N° 6 - Ejercicio N° 10
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.10)
 */
import java.util.*;
public abstract class Visitante {
    //variables de instancias
    private String nombre;
    private Calendar fechaVisita;
    /**
     * Constructor para objetos de la clase Visitante
     */
    public Visitante(String p_nombre, Calendar p_fecha){
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fecha);
    }
    //Setters
    protected void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    protected void setFechaVisita(Calendar p_fecha){
        this.fechaVisita = p_fecha;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public Calendar getFechaVisita(){
        return this.fechaVisita;
    }
    //Metodos
    /**
     * Metodo que devuelve el formato de impresion que depende del visitante
     */
    public abstract void mostrar();
    /**
     * Metodo que devuelve el valor de la entrada segun el visitante
     */
    public abstract double entrada();
    /**
     * Metodo que devuelve un listado en una fecha particular y por visitante paricular
     * permite listar visitante y delegaciones 
     */
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);
    /**
     * Metodo que determina el tipo de visitante, cada clase retorna una cadena
     * indicando el tipo de visitante
     */
    public abstract String tipoVisitante();
}