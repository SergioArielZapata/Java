
/**
 * Trabajo Practico N° 3 - Ejercicio 6
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.6.2)
 */
public class Escuela{
    //Variables de instancia
    private String nombre;
    private String domicilio;
    private String director;
    
    /**
     * Constructor de objetos para la clase Escuela
     */
    public Escuela(String p_nombre, String p_domicilio, String p_director){
        //Inicializacion de variables de instancia
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setDirector(String p_director){
        this.director = p_director;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    public String getDirector(){
        return this.director;
    }
    
    //Metodos
    /**
     * Metodo para imprimir por pantalla el recibo de sueldo del docente
     */
    public void imprimirRecibo(Docente p_docente){
        System.out.println("Escuela: " + this.getNombre() + "\tDomicilio: " + this.getDomicilio() + "\tDirector: " + getDirector());
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Docente:      " + p_docente.getNombre());
        System.out.println("Sueldo: ................" + p_docente.calcularSueldo());
        System.out.println("Sueldo Basico: ........." + p_docente.getSueldo());
        System.out.println("Asignacion Familiar: ..." + p_docente.getAsignacion());
    }
}
