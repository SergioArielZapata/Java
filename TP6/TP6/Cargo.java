/**
 * Trabajo Practico N° 6 - Ejercicio N° 5
 * 
 * @Author (Sergio Ariel Zapata)
 * @version (6.5)
 */
import java.util.*;
public class Cargo{
    //Variables de instancias
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;
    /**
     * Contructor para objeos de la clase Cargo
     */
    public Cargo(String p_nombreCargo, double p_sueldo, int p_anio, int p_horas){
        //inicializacion de variables de instancias
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldo);
        this.setAnioIngreso(p_anio);
        this.setHorasDeDocencia(p_horas);
    }
    //Setters
    private void setNombreCargo(String p_nombreCargo){
        this.nombreCargo = p_nombreCargo;
    }
    private void setSueldoBasico(double p_sueldo){
        this.sueldoBasico = p_sueldo;
    }
    private void setAnioIngreso(int p_anio){
        this.anioIngreso = p_anio;
    }
    private void setHorasDeDocencia(int p_horas){
        this.horasDeDocencia = p_horas;
    }
    //Getters
    public String getNombreCargo(){
        return this.nombreCargo;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    public int getHorasDeDocencia(){
        return this.horasDeDocencia;
    }
    //Metodos
    /**
     * Meodo que determina la antiguedad de permanencia en el cargo
     * @return retorna un simbolo del tipo int
     */
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int fecha = this.getAnioIngreso();
        return anioHoy - fecha;
    }
    /**
     * Metodo que calcula el 1% del sueldo basico por año de antigueadad
     * @return retoruna un simbolo del tipo double
     */
    private double adicionalXAntiguedad(){
        return ((this.getSueldoBasico() + (this.getSueldoBasico() * 0.01)) * antiguedad());
    }
    /**
     * Metodo que suma el sueldo basico mas el adicional
     * @return rotorna un simbolo del tipo double
     */
    public double sueldoDelCargo(){
        return (this.getSueldoBasico() + this.adicionalXAntiguedad());
    }
    /**
     * Metodo para mostrar lod datos del cargo
     */
    public void mostrarCargo(){
        System.out.println(this.getNombreCargo()+" - Sueldo  Basico: "+this.getSueldoBasico()+" - Sueldo del Cargo: "+this.sueldoDelCargo()+" - Antiguedad: "+this.antiguedad());
        System.out.println("Horas de Docencia: "+this.getHorasDeDocencia());
    }
}