
/**
 * Write a description of class s here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Localidades{
    // instance variables - replace the example below with your own
    private int disponibles;

    /**
     * Constructor for objects of class s
     */
    public Localidades(int p_disponibles){
        this.setDisponibles(p_disponibles);
    }
    private void setDisponibles(int p_disponibles){
        this.disponibles = p_disponibles;
    }
    public int getDisponibles(){
        return this.disponibles;
    }
}