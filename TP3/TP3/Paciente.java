
/**
 * Trabajo Practico N° 3 - Ejercicio N° 8
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.8)
 */
public class Paciente{
    //variables de instancia
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    /**
     * Constructor de objetos de la clase Paciente
     */
    public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
        this.setHistoria(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setLocalidadNacido(p_localidadNacido);
        this.setLocalidadVive(p_localidadVive);
    }
    
    //Setters
    private void setHistoria(int p_historia){
        this.historiaClinica = p_historia;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setLocalidadNacido(Localidad p_localidadNacido){
        this.localidadNacido = p_localidadNacido;
    }
    private void setLocalidadVive(Localidad p_localidadVive){
        this.localidadVive = p_localidadVive;
    }
    
    //Getters
    public int getHistoria(){
        return this.historiaClinica;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    public Localidad getLocalidadNacido(){
        return this.localidadNacido;
    }
    public Localidad getLocalidadVive(){
        return this.localidadVive;
    }
    
    //Metodos
    /**
     * Metodo que muestra los datos al operador
     */
    public void mostrarDatosPantalla(){
        System.out.println("Paciente: " + this.getNombre() + "\t\tHistoria Clinica: " + this.getHistoria() + "\tDomicilio: " + this.getDomicilio());
        this.getLocalidadNacido().mostrar();
    }
    /**
     * Metodo que concatena datos y retorna un String con datos
     */
    public String cadenaDeDatos(){
        return (this.getNombre() + "....." + this.getHistoria() + "....." + this.getDomicilio() + "-" + this.getLocalidadNacido().getNombre() + " - " + this.getLocalidadVive().getProvincia());
    }
    
}
