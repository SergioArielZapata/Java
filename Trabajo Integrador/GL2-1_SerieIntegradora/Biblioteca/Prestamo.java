/**
 * Integrador
 *
 *@autor(Sergio Ariel Zapata)
 *@version (1.1)
 */
 
import java.util.*;
import java.text.*;
public class Prestamo{
    //variables de instancia
    private Calendar fechaRetiro;
    private Calendar fechaDevolucion;
    private Socio socio;
    private Libro libro;
    /**
     * Constructor para objetos de la clase Prestamo
     */
    public Prestamo(Calendar p_fechaRetiro, Socio p_socio, Libro p_libro){
        //inicializacion de variables
        setFechaRetiro(p_fechaRetiro);
        setSocio(p_socio);
        setLibro(p_libro);
    }
    //Setters
    private void setFechaRetiro(Calendar p_fechaRetiro){
        this.fechaRetiro = p_fechaRetiro;
    }
    public void setFechaDevolucion(Calendar p_fechaDevolucion){
        this.fechaDevolucion = p_fechaDevolucion;
    }
    public void setSocio(Socio p_socio){
        this.socio = p_socio;
    }private void setLibro(Libro p_libro){
        this.libro = p_libro;
    }
    //Getters
    public Calendar getFechaRetiro(){
        return this.fechaRetiro;
    }
    public Calendar getFechaDevolucion(){
        return this.fechaDevolucion;
    }
    public Socio getSocio(){
        return this.socio;
    }
    public Libro getLibro(){
        return this.libro;
    }
    //Metodos
    /**
     * Metodo que registra la fecha en la cual se devuelve un libro
     * @param p_fechaDevolucion
     */
    public void registrarFechaDevolucion(Calendar p_fechaDevolucion){
        this.setFechaDevolucion(p_fechaDevolucion);
    }
    /**
     * Metodo que determina si un prestamo se encuentra vencido
     * @param p_fecha
     * @return retorna un simbolo del tipo boolean
     */
    public boolean vencido(Calendar p_fecha){
        int anioVencimiento = this.getFechaRetiro().get(Calendar.YEAR);
        int mesVencimiento = (this.getFechaRetiro().get(Calendar.MONTH) + 1);
        int diaVencimiento = this.getFechaRetiro().get(Calendar.DATE);

        Calendar fechaVencimiento = Calendar.getInstance();
        fechaVencimiento.set(anioVencimiento, mesVencimiento, diaVencimiento);
        
        if (socio.getDiasPrestamo() == 5){
            fechaVencimiento.add(Calendar.DATE, 5); 
            this.registrarFechaDevolucion(fechaVencimiento);
        }
        if (socio.getDiasPrestamo() == 20){
            fechaVencimiento.add(Calendar.DATE, 20); 
            this.registrarFechaDevolucion(fechaVencimiento);
        }
        if(p_fecha.before(fechaDevolucion)) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Metodo que devuelve un concatenacion de variables
     * @return retorna un simbolo del tipo String
     */
    public String toStrin(){
        return "Retiro " +this.getFechaRetiro().get(Calendar.DATE) +"/" +this.getFechaRetiro().get(Calendar.MONTH) +"/" +this.getFechaRetiro().get(Calendar.YEAR) 
                +" - Devolución: " + this.getFechaDevolucion().get(Calendar.DATE)+"/" + (this.getFechaDevolucion().get(Calendar.MONTH) - 1)  +"/" +this.getFechaDevolucion().get(Calendar.YEAR)
                +"\nLibro: " +this.getLibro().getTitulo()
                +"\nSocio: " +this.getSocio().getNombre();
    }
}