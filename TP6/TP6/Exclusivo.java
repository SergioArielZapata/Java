/**
 * Trabajo Practico N° 6 - Ejercicio N° 5
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.5)
 */
public class Exclusivo extends Cargo{
    //Variables de instancias
    private int horasDeInvestigacion;
    private int horasDeExtension;
    /**
     * Contructor para objetos de la clase Exclusivo
     */
    public Exclusivo(String p_nombreCargo, double p_sueldo, int p_anio, int p_horas, int p_horasInvestigacion, int p_horasExtension){
        //inicializacion de variables de instancias
        super(p_nombreCargo,p_sueldo,p_anio,p_horas);
        this.setHorasDeInvestigacion(p_horasInvestigacion);
        this.setHorasDeExtension(p_horasExtension);
    }
    //Setters
    private void setHorasDeInvestigacion(int p_horasInvestigacion){
        this.horasDeInvestigacion = p_horasInvestigacion;
    }
    private void setHorasDeExtension(int p_horasExtension){
        this.horasDeExtension = p_horasExtension;
    }
    //Getters
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    public int getHorasDeExtension(){
        return this.horasDeExtension;
    }
    //Metodos
    /**
     * Metodo que redefine el metodo mostrar de la super clase para mostrar mas datos
     */
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter Exclusivo----");
        System.out.println("Horas Investigación: "+this.getHorasDeInvestigacion());
        System.out.println("Horas Extensión: " +this.getHorasDeExtension());
    }
}