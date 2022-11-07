
/**
 * Trabajo Practico N° 2 - Ejercicio N° 2
 * Trabajo Practico N° 4 - Ejercicio N° 3
 * @author (Sergio Ariel Zapata) 
 * @version (2.2.4.3)
 */
import java.io.*;
import java.util.*;
public class Laboratorio {
    //Variables de instancia
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    /**
     * Constructor para objetos de la clase Laboratorio
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt){
        //Inicializacion de variables de instancia
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMin(p_compraMin);
        this.setDiaEnt(p_diaEnt);
    }
    
    /**
     * Constructor sobrecargado para el objeto de la clase Laboratorio
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
        //Inicializacion de variables de instancia
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
    }
    
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    private void setCompraMin(int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    private void setDiaEnt(int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public int getCompraMin(){
        return this.compraMinima;
    }
    public int getDiaEnt(){
        return this.diaEntrega;
    }
    
    //Metodos
    /**
     * Metodo para el ajuste de la compra minima
     */
    public void nuevaCompraMin(int p_compraMin){
        this.setCompraMin(p_compraMin);
    }
    /**
     * Metodo para el ajuste del dia de entrega
     */
    public void nuevoDiaEntrega(int p_diaEnt){
        this.setDiaEnt(p_diaEnt);
    }
    /**
     * Metodo de Salida impresa
     */
    public String mostrar(){
        return ("Laboratorio: "+this.getNombre() +"\nDomicilio: "+this.getDomicilio() +" - Teléfono: "+this.getTelefono());
    }
}