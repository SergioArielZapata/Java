
/**
 * Trabajo Practico N° 2 - Ejercicio N° 5
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (2.5)
 */
import java.util.*;
public class Empleado {
    //Variables de instancias
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;
    
    /**
     * Constructor para objetos de la clase Empleado
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        //Inicializacion de variables de instancia
        setCuil(p_cuil);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSueldoBasico(p_importe);
        setAnioIngreso(p_anio);
    }
    
    //Setters
    private void setCuil(long p_cuil){
        cuil = p_cuil;
    }
    private void setApellido(String p_apellido){
        apellido = p_apellido;
    }
    private void setNombre(String p_nombre){
        nombre = p_nombre;
    }
    private void setSueldoBasico(double p_importe){
        sueldoBasico = p_importe;
    }
    private void setAnioIngreso(int p_anio){
        anioIngreso = p_anio;
    }
    
    //Getters
    public long getCuil(){
        return cuil;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public double getSueldoBasico(){
        return sueldoBasico;
    }
    public int getAnioIngreso(){
        return anioIngreso;
    }
    
    //Metodos
    /**
     * Metodo que devuelve la cantidad de años de antiguedad, desde el ingreso 
     * @return retorna un valor del tipo entero
     */
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy =fechaHoy.get(Calendar.YEAR);
        return (anioHoy - getAnioIngreso());
    }
    /**
     * Metodo que calcula el descuento del 2% del sueldo basico en concepto de obra social
     * mas un $ 12.00 del seguro de vida
     * @return un valor del tipo double
     */
    private double descuento(){
        return ((getSueldoBasico()-12)*2/100);
    }
        /**
     * Metodo que calcula el adicional que es una asignacion sobre el sueldo basico
     * @return retorna un valor del tipo double
     */
    private double adicional(){
        if (antiguedad() < 2){
            return (getSueldoBasico()+(getSueldoBasico()*2/100));
        }
        else if ((antiguedad()<10)){
            return (getSueldoBasico()+(getSueldoBasico()*4/100));
        }
        else{
            return (getSueldoBasico()+(getSueldoBasico()*6/100));
        }
    }
    /**
     * Metodo que culcula la suma del sueldo basico mas el adicional, menos el descuento
     * @return retorna un valor del tipo double
     */
    public double sueldoNeto(){
        return (getSueldoBasico() + adicional() - descuento());
    }
    /**
     * Metodo que concatena los atributos de nombre y apellido
     * @return un valor del tipo String
     */
    public String nomYApe(){
        return getNombre() + " " + getApellido();
    }
    /**
     * Meodo que concatena los atributos de apellido y Nombre
     * @return retorna un valor del tipo String
     */
    public String apeYNom(){
        return getApellido() + ", " + getNombre();
    }
    /**
     * Metodo que muestra la salida impresa por pantalla
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("CUIL: " + getCuil() + "\tAntiguedad: " + antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: " + sueldoNeto());
    }
    /**
     * Metodo que devuelve una cadena del cual los valores dependen del estado interno del objeto
     * @return un valor del tipo String
     */
    public String mostrarLinea(){
        return (getCuil() + "\t" + apeYNom() + ".................$ " + sueldoNeto());
    }
}
