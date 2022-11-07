
/**
 * Trabajo Practico N° 5 - Ejercicio N° 5
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (5.5)
 */
import java.util.*;
public class Curso {
    //VAriables de instancias
    private String nombre;
    private HashMap<Integer, Alumno> alumnos;
    /**
     * Contrutor de objetos para la clase Curso
     */
    public Curso(String p_nombre){
        //inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap());
    }
    /**
     * Constructor sobrecargado de objetos para la clase Curso
     */
    public Curso(String p_nombre, HashMap<Integer, Alumno> p_alumnos){
        //inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setAlumnos(HashMap<Integer, Alumno> p_alumnos){
        this.alumnos = p_alumnos;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public HashMap<Integer, Alumno> getAlumnos(){
        return this.alumnos;
    }
    //Metodos
    /**
     * Metodo que permite inscribir al alumno en un curso mediante su LU
     * @param p_alumno
     */
    public void inscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(p_alumno.getLu(),p_alumno);
    }
    /**
     * Metodo que quita un alumno de la lista
     * @param p_lu
     * @return un simbolo del tipo Alumno
     */
    public Alumno quitarAlumno(int p_lu){
        return (Alumno)this.getAlumnos().remove(new Integer(p_lu));
    }
    /**
     * Metodo que muestra la cantidad de alumnos
     * @return retorna un simbolo del tipo int
     */
    public int cantidadDeAlumnos(){
        return this.getAlumnos().size();
    }
    /**
     * Metodo que verifica si el alumno esta inscripto o no en un curso
     * @param p_lu
     * @return retorna un simbolo del tipo boolena
     */
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(p_lu);
    }
    /**
     * metodo sobrecargado que verifica si un alumno esta inscripto o no en un curso
     * @param p_alumno
     * @return retorna un simbolo del tipo boolean
     */
    public boolean estaInscripto(Alumno p_alumno){
        return this.getAlumnos().containsValue(p_alumno);// verifica si existe a partir de un valor objeto
    }
    /**
     * Metodo que permite obtener un alumno de la coleccion proporcionando su LU
     * @param p_lu
     * @return retorna un simbolo del tipo Alumno
     */
    public Alumno buscarAlumno(int p_lu){
        return this.getAlumnos().get(p_lu);
    }
    /**
     * Metodo que muestra el promedio de un alumno, del que se sabe el LU
     * @param p_lu
     */
    public void imprimirPromedioDelAlumno(int p_lu){
        ((Alumno)(this.getAlumnos().get(buscarAlumno(p_lu)))).mostrar();
    }
    /**
     * Metodo para listar todos los alumnos inscriptos en el cursado
     */
    public void mostrarInscriptos(){
        System.out.println("\n ******** Cantidad de inscriptos -----> :"+cantidadDeAlumnos());
        for(Map.Entry<Integer, Alumno> alumno:alumnos.entrySet()){
            System.out.println("\n" + alumno.getValue().getLu() + "\t" + alumno.getValue().nomYApe());
        }
    }
}
