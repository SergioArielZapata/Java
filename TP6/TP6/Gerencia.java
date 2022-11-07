/**
 * Trabajo Practico N° 6 - Ejercicio N° 9
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.9)
 */
import java.util.*;
public class Gerencia{
    //Variables de instancias
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;
    /**
     * Contructor para objetos de la clase Gerencia
     */
    public Gerencia(String p_nombre){
        //inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(new ArrayList());
    }
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setAlojamientosAlquilados(ArrayList<Alojamiento> p_alojamientosAlquilados){
        this.alojamientosAlquilados = p_alojamientosAlquilados;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Alojamiento> getAlojamientosAlquilados(){
        return this.alojamientosAlquilados;
    }
    //Metodos
    /**
     * Metodos que permite agregar y quitar un alojamiento al Array
     * @param p_alojamiento
     * return retorna un simbolo del tipo boolean
     */
    public boolean agregarAlojamientos(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().add(p_alojamiento);
    }
    public boolean quitarAlojamientos(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().remove(p_alojamiento);
    }
    /**
     * Metodo que permite contar un tipo de alojamiento en particular
     * @param p_tipoAlojamiento
     * @return retorna un simbolo del tipo int
     */
    public int contarAlojamiento(String p_tipoAlojamiento){
        int contador=0;
        for (int i=0; i < this.getAlojamientosAlquilados().size();i++){
            contador = contador+this.getAlojamientosAlquilados().get(i).contar(p_tipoAlojamiento);
        }
        return contador;
    }
    /**
    * Imprime los detalles del la gerencia
    */  
    public void liquidar(){        
        for(int i = 0; i < this.getAlojamientosAlquilados().size(); i++){
            System.out.println("                          Posicion del Registro: " + (i+1));
            this.getAlojamientosAlquilados().get(i).liquidar();
        }
    }
    public void mostrarLiquidacion(){
        System.out.println("****** Gerencia "+this.getNombre() + " ******");
        System.out.println("------------ Liquidación ------------");
        System.out.println();
        this.liquidar();
        System.out.println();
        System.out.println("Alojamiento tipo Cabaña ----> " + this.contarAlojamiento("Cabaña"));
        System.out.println("Alojamiento tipo Hotel  ----> " + this.contarAlojamiento("Hotel"));
    }
}