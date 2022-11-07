import java.util.*;
/**
 * @author (Enzo Romero) 
 * @version (27/10/2021)
 */
public class Docente extends Socio
{
    private String area;

    /**
     * Constructor para objetos de la clase Docente
     */
    public Docente(int p_dniSocio, String p_nombre, String p_area)
    {
        super(p_dniSocio, p_nombre, 5);
        this.setArea(p_area);
    }
    
    private void setArea(String p_area){
        this.area = p_area;
    }
    
    public String getArea(){
        return this.area;
    }
    
    /**
     * Este metodo retorna true si el Docente nunca tuvo ni tiene un prestamo vencido
     */
    public boolean esResponsable(){
        if(super.puedePedir() == true){
            return true;
        } else{
            return false;
        }
    }
    
    /**
     * Este metodo adiciona dias de prestamo al Docente,depende de si es responsable o no
     */
    public void agregarDiasDePrestamo(int p_dias){
        if(this.esResponsable() == true){
            super.setDiasPrestamo(super.getDiasPrestamo() + p_dias);
        }
    }
    
    /**
     * Este metodo retorna un String "Docente"
     */
    public String soyDeLaClase(){
        return "Docente";
    }
}
