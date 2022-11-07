/**
 * Integrado
 * 
 * @author (Sergio Ariel Zapata)
 * @version (1.2)
 */
import java.util.*;
public abstract class Socio{
    //variables de instancia
    private int dniSocio;
    private String nombre;
    private int diasPrestamo;
    private ArrayList<Prestamo> prestamos;
    /**
     * Constructor para objetos de la clase Socio
     */
    protected Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo){
        setDniSocio(p_dniSocio);
        setNombre(p_nombre);
        setDiasPrestamo(p_diasPrestamo);
        setPrestamos(new ArrayList<Prestamo>());
    }
    //Setters
    public void setPrestamos(ArrayList<Prestamo> prestamos){
        this.prestamos = prestamos;
    }
    private void setDniSocio(int p_dniSocio){
        this.dniSocio = p_dniSocio;
    }
    public void setDiasPrestamo(int p_diasPrestamo){
        this.diasPrestamo = p_diasPrestamo;
    }
    public void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    //Getters
    public ArrayList<Prestamo> getPrestamos(){
        return this.prestamos;
    }
    public int getDniSocio(){
        return this.dniSocio;
    }
    public int getDiasPrestamo(){
        return this.diasPrestamo;
    }
    public String getNombre(){
        return this.nombre;
    }
    //Metodos
    /**
     * Metodo que agrega un prestamo al Array Prestamos de Socio
     * @param p_prestamo
     */
    public void addPrestamo(Prestamo p_prestamo){
        this.getPrestamos().add(p_prestamo);
    }
    /**
     * Metodo que elimina un prestamo del Array de Prestaos de Socio
     * @param p_prestamo
     * @return retorna un simbolo del tipo Prestamo
     */
    public Prestamo removePrestamo(Prestamo p_prestamo){
        Prestamo elPrestamo = p_prestamo;
        this.getPrestamos().remove(p_prestamo);
        return elPrestamo;
    }
    /**
     * Metodo que retorna la candidad de libros en poder del socio
     * @return retorna un simbolo del tipo int
     */
    public int cantLibrosPrestados(){
        return this.getPrestamos().size();
    }
    /**
     * Metodo que devuelve una concatenacion de variables
     */
    public String toString(){
        return ("DNI: " + this.getDniSocio() + "||" + this.getNombre() + "|| Libros prestados: " + this.cantLibrosPrestados());
    }
    /**
     * Metodo que determina  si un socio puede pedir un libro segun los criterios establecidos
     * @return retorna un simbolo del tipo boolean
     */
    public boolean puedePedir(){
        Calendar fechaActual = new GregorianCalendar();
        Calendar fecha_prestamo = Calendar.getInstance();
        for(Prestamo prestamo : this.getPrestamos()){
            if(prestamo.vencido(fechaActual)){
                return false;
            }
        }
        return true;
    }
    /**
     * Metodo abstracto soyDeLaClase. sin implementacion
     */
    public abstract String soyDeLaClase();
}