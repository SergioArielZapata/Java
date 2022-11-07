
/**
 * Trabajo Practico N° 3 - Ejercicio N° 8
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.8)
 */
public class Hospital{
    //Variables de instancia
    private String nombreHospital;
    private String nombreDirector;
    private Paciente paciente;
    
    /**
     * Constructor de objetos de la clase Hospital
     */
    public Hospital(String p_nomHospital, String p_nomDirector, Paciente p_paciente){
        //Inicializacion de variables de instancia
        this.setNombreHospital(p_nomHospital);
        this.setNombreDirector(p_nomDirector);
        this.setPaciente(p_paciente);
    }
    
    //Setters
    private void setNombreHospital(String p_nomHospital){
        this.nombreHospital = p_nomHospital;
    }
    private void setNombreDirector(String p_nomDirector){
        this.nombreDirector = p_nomDirector;
    }
    private void setPaciente(Paciente p_paciente){
        this.paciente = p_paciente;
    }
    
    //Getters
    public String getNombreHospital(){
        return this.nombreHospital;
    }
    public String getNombreDirector(){
        return this.nombreDirector;
    }
    public Paciente getPaciente(){
        return this.paciente;
    }
    
    //Metodos
    /**
     * Metodo que muestra los datos del Paciente
     * @param recibe datos de la clase Paciente
     */
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: " + this.getNombreHospital() + "\tDirector: " + this.getNombreDirector());
        System.out.println("--------------------------------------------------------------------------------------------------------");
        p_paciente.mostrarDatosPantalla();
    }
}
