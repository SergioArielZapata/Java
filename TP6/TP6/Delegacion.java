/**
 * Trabajo Practico N° 6 - Ejercicio N° 10
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.10)
 */
import java.util.*;
public class Delegacion extends Visitante{
    //Variables de instancias
    private ArrayList<Individuo> integrantes;
    /**
     * Constructor para objetos de la clase Delegacion
     */
    public Delegacion(String p_nombre, Calendar p_fecha, ArrayList<Individuo> p_integrantes){
        //inicializacion de variables de instancias
        super(p_nombre,p_fecha);
        this.setIntegrantes(p_integrantes);
    }
    /**
     * Constructor sobrecargado para objetos de la clase Delegacion
     */
    public Delegacion(String p_nombre, Calendar p_fecha, Individuo p_integrantes){
        //inicializacion de variables de instancias
        super(p_nombre, p_fecha);
        this.setIntegrantes(new ArrayList());
        this.inscribirIndividuo(p_integrantes);
    }
    //Setters
    private void setIntegrantes(ArrayList<Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }
    //Getters
    public ArrayList<Individuo> getIntegrantes(){
        return this.integrantes;
    }
    //Metodos
    /**
     * Metodo que devuelve el valor de la entradaque es la suma de las entradas de sus integrantes, menos un 10% de descuento
     * @return retorna un simbolo del tipo double
     */
    public double entrada(){
        double costo = 0.0;
        for(int i = 0; i < this.getIntegrantes().size(); i++){
            costo = costo + this.getIntegrantes().get(i).entrada();
        }
        double descuento = ((costo * 10) / 100);
        return (costo - descuento);
    }
    /**
     * Metodo que permite inscribir un individuo a una delegacion
     * @param p_individuo
     */
    public void inscribirIndividuo(Individuo p_individuo){
        this.getIntegrantes().add(p_individuo);
    }
    /**
     * Metodo que permite conocer la cantidad de individuos de una delegacion
     * @return retorna un simbolo del tipo int
     */
    public int cantidadIntegrantes(){
        return this.getIntegrantes().size();
    }
    /**
     * Metodo que muestra por pantalla los datos de la visita
     */
    public void mostrar(){
        System.out.println("---------------------------------------------------------");
        System.out.println(this.tipoVisitante() + ": " + super.getNombre());
        System.out.println("\nIntegrantes");
        for(int i = 0; i < this.getIntegrantes().size(); i++){
            this.getIntegrantes().get(i).mostrar();
            System.out.println("");
        }
        System.out.println("\nCantidad de Integrantes " + this.cantidadIntegrantes());
        System.out.println("---------------------------------------------------------");
    }
    /**
     * Metodo que devuelve un listado en una fecha en particular y tipo de visitante
     * @param p_fecha, p_visitante
     */
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        for(int i = 0; i < this.getIntegrantes().size(); i++){
            if((p_fecha == this.getIntegrantes().get(i).getFechaVisita()) && (p_visitante == this.tipoVisitante())){
                this.getIntegrantes().get(i).mostrar();
            }
        }
    }
    /**
     * Metodo que determina el tipo de visitante
     */
    public String tipoVisitante(){
        return "Delegacion";
    }
}