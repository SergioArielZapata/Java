/**
 * Trabajo Practico N° 6 - Ejercicio N° 5
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.5)
 */
public class SemiExclusivo extends Cargo{
    //Variables de instancias
    private int horasDeInvestigacion;
    /**
     * Constructor para objetos de la clase SemiExclusivo
     */
    public SemiExclusivo(String p_nombreCargo, double p_sueldo, int p_anio, int p_horas, int p_horasInvestigacion){
    //inicializacion de variables de instancias
    super(p_nombreCargo,p_sueldo,p_anio,p_horas);
    this.setHorasDeInvestigacion(p_horasInvestigacion);
    }
    //Setters
    private void setHorasDeInvestigacion(int p_horasInvestigacion){
        this.horasDeInvestigacion = p_horasInvestigacion;
    }
    //Getters
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    /**
     * Meodo que redefine el metodo mostrar de la super clase y muestra mas datos
     */
    public void mosrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter SemiExclusivo----");
        System.out.println("Horas Investigación: "+this.getHorasDeInvestigacion());
    }
}