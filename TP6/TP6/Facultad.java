/**
 * Trabajo Practico N° 6 - Ejercicio N° 5
 * 
 * @author (Sergio Ariel Zapata)
 * @versio (6.5)
 */
import java.util.*;
public class Facultad{
    //Variables de instancias
    private String nombre;
    private ArrayList<Profesor> profesores;
    /**
     * Contructor para objetos de la clase Facultad
     */
    public Facultad(String p_nombre, ArrayList<Profesor> p_profesores){
        //inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }
    /**
     * Constuctor sobrecargado para objetos de la clase Facultad
     */
    public Facultad(String p_nombre, Profesor p_profesores){
        //inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setProfesores(new ArrayList());
        //this.agregarProfesor(p_profesores);
    }
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setProfesores(ArrayList<Profesor> p_profesores){
        this.profesores = p_profesores;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Profesor> getProfesores(){
        return this.profesores;
    }
    //Metodos
    /**
     * Metodos que permiten agregar y quitar elementos en un arreglo
     * @return retornan un simbolo del tipo boolean
     */
    public boolean agregarProfesor(Profesor p_profesores){
        return this.getProfesores().add(p_profesores);
    }
    public boolean quitarProfesor(Profesor p_profesores){
        return this.getProfesores().remove(p_profesores);
    }
    /**
     * Metodo que proporciona un listado de profesores que incluye el total a pagar
     */
    public void nominaProfesores(){
        System.out.println("*************** Nómina Facultad: "+this.getNombre());
        System.out.println("------------------------------------------------------------------");
        for(int i=0;i<this.getProfesores().size();i++){
            System.out.println(this.getProfesores().get(i).mostrarLinea());
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Total a pagar: $"+this.totalAPagar());
    }
    /**
     * Metodo que permite calcular el total a pagar de la cantidad de profesores
     * @return retorna un simbolo del tipo double
     */
    public double totalAPagar(){
        double total = 0;
        for (int i = 0; i < this.getProfesores().size(); i++){
            total = total + this.getProfesores().get(i).sueldoTotal();
        }
        return total;
    }
    /**
     * Metodo que provee un listado de los cargos de todos los profesores
     */
    public void listarProfesorCargos(){
        int cantidad = 0;
        System.out.println("***** Detalle de Profesores y cargos de Facultad: "+this.getNombre());
        System.out.println("--------------------------------------------------------------------------------");
        for(int i=0;i<this.getProfesores().size();i++){
            this.getProfesores().get(i).mostrar();
            System.out.println("\n------------------ **** -------------------");
            cantidad++;
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Hay "+cantidad+" profesores");
    }
}