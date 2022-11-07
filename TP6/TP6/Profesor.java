/**
 * Trabajo Practico N° 6 - Ejercicio N° 5
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.5)
 */
import java.util.*;
public class Profesor extends Persona{
    //Variables de instancias
    private String titulo;
    private ArrayList<Cargo> cargos;
    /**
     * Constructor para el objeto de la clase Profesor
     */
    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, ArrayList<Cargo> p_cargos){
        //inicializacion de variables de instancias
        super(p_dni,p_nombre,p_apellido,p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(p_cargos);
    }
    /**
     * Constuctor sobrecargado para el objeto de la clase Profesor
     */
    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, Cargo p_cargos){
        //inicializacion de variables de instancias
        super(p_dni,p_nombre,p_apellido,p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(new ArrayList());
        this.agregarCargo(p_cargos);
    }
    //Setters
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    private void setCargos(ArrayList<Cargo> p_cargos){
        this.cargos = p_cargos;
    }
    //Getters
    public String getTitulo(){
        return this.titulo;
    }
    public ArrayList<Cargo> getCargos(){
        return this.cargos;
    }
    //Metodos
    /**
     * Metodos para agregar y quitar Elementos dentro del ArrayList
     * @return retornan un simbolo del tipo boolean
     */
    public boolean agregarCargo(Cargo p_cargos){
        return this.getCargos().add(p_cargos);
    }
    public boolean quitarCargos(Cargo p_cargos){
        return this.getCargos().remove(p_cargos);
    }
    /**
     * Metodo que muestra los datos de Persona
     */
    public void mostrar(){
        super.mostrar();
        System.out.println("Titulo: " + this.getTitulo() + "\n");
        listarCargos();
        System.out.println("** Sueldo Total: $" + sueldoTotal() + " **");
    }
    /**
     * Meodo que lista los cargos de cada profesor
     */
    public void listarCargos(){
         System.out.println("-***** Cargos Asignados *****-");
        System.out.println("---------------------------------------");
        /*for(int i = 0; i<=this.getCargos().size(); i++){
            this.getCargos().get(i).mostrarCargo();
        }*/
        for (Cargo c:cargos){
            c.mostrarCargo();
        } 
    }
    /**
     * Metodo que permite obtener el sueldo total, sumando los sueldos de cada cargo que posea el profesor
     */
    public double sueldoTotal(){
        double total = 0;
        for(int i = 0; i<this.getCargos().size();i++){
            total = total +  this.getCargos().get(i).sueldoDelCargo();
        }
        return total;
    }
    /**
     * Metodo que obtiene una cadena con los datos del profesor
     */
    public String mostrarLinea(){
        return ("DNI: " + super.getDNI() +  " - Nombre: " + super.nomYApe() + " - Sueldo Total: $" + this.sueldoTotal());
    }
}