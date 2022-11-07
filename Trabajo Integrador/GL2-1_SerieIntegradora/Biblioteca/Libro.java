import java.util.*;
/**
 * Serie-Integradora - Clase Libro
 * 
 * @author Vendler Ramon 
 * 
 */


public class Libro{
    //atributos
    private String titulo;
    private int edicion;
    private String editorial;
    private int anio;
    private Prestamo prestamos;
    
    /** Libro
     * @param p_titulo: String, p_edicion: int, p_editorial: String, p_anio: int 
    */
    public Libro(String p_titulo, int p_edicion, String p_editorial, int p_anio){
        this.setTitulo(p_titulo);
        this.setEdicion(p_edicion);
        this.setEditorial(p_editorial);
        this.setAnio(p_anio);
    }
    
    //setters
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    
    private void setEdicion(int p_edicion){
        this.edicion = p_edicion;
    }
    
    private void setEditorial(String p_editorial){
        this.editorial = p_editorial;
    }
    
    private void setAnio(int p_anio){
        this.anio = p_anio;
    }
    
       private void setPrestamo(Prestamo p_prestamos){
        this.prestamos = p_prestamos;
    }
    
    //getters
    public String getTitulo(){
        return this.titulo;
    }
    
    public int getEdicion(){
        return this.edicion;
    }
    
    public String getEditorial(){
        return this.editorial;
    }
    
    public int getAnio(){
        return this.anio;
    }
    
    public Prestamo getPrestamo(){
        return this.prestamos;
    }
    
    //metodo de la clase
    /** addPrestamos, setea la V.I prestamo
     * @param p_prestamo: Prestamo
    */
    public void addPrestamos(Prestamo p_prestamo){
        //seteamos la V.I prestamos
        this.setPrestamo(p_prestamo);
    }
    
    public void removePrestamo(Prestamo p_prestamo){
            this.setPrestamo(p_prestamo);
    }
    
    public boolean prestado(){
       return !(this.getPrestamo() == null);
    }
    
    public String toString(){
        return "Titulo: " + this.getTitulo();
    }
    
}
