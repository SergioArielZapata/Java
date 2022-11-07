import java.util.*;
/**
 * @author (Enzo Romero) 
 * @version (27/10/2021)
 */
public class Estudiante extends Socio
{
    private String carrera;

    /**
     * Constructor para objetos de la clase Estudiante
     */
    public Estudiante(int p_dniSocio, String p_nombre, String p_carrera)
    {
        super(p_dniSocio, p_nombre, 20);
        this.setCarrera(p_carrera);
    }

    private void setCarrera(String p_carrera){
        this.carrera = p_carrera;
    }
    
    public String getCarrera(){
        return this.carrera;
    }
    
    /**
     * Este metodo retorna true si el estudiante no tiene ningun prestamo vencido y si no tiene mas de 3 libros prestados
     */
    public boolean puedePedir()
    {    
       if((super.puedePedir() == true) &&(this.cantLibrosPrestados() <= 3)){
           return true; // puede pedir
       }else{
           return false; // no puede pedir
       }
   }

    
    /**
     * Este metodo retorna un String "Estudiante" 
     */
    public String soyDeLaClase(){
        return "Estudiante";
    }
}
