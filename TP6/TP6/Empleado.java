/**
 * Trabajo Practico N° 2 - Ejercicio N° 5
 * Trabajo Practico N° 3 - Ejercicio N° 11 Modificado
 * Trabajo Practico N° 5 - Ejercicio N° 3
 * Trabajo Practico N° 6 - Ejercicio N° 2
 * @author (Sergio Ariel Zapata) 
 * @version (2.5.3.11.5.3.6.2)
 */ 
import java.util.*;
import java.text.DecimalFormat;
public class Empleado extends Persona{
    //Variables de instancias
    private long cuil;
    //private String apellido;
    //private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    
    /**
     * Constructor para objetos de la clase Empleado
     */
    public Empleado(int p_dni, String p_nombre, String p_apellido, int p_fechaNacimiento, long p_cuil, double p_importe, int p_anio){
        //Inicializacion de variables de instancia
        super(p_dni,p_nombre,p_apellido,p_fechaNacimiento);
        this.setCuil(p_cuil);
        /*this.setApellido(p_apellido);
        this.setNombre(p_nombre);*/
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }
    /**
     * Constructor Sobrecargado para objetos de la clase Empleado
     */
    public Empleado(int p_dni, String p_nombre, String p_apellido, int p_fechaNacimiento, long p_cuil, double p_importe, Calendar p_fecha){
        // inicializacion de variables de instancias
        super(p_dni,p_nombre,p_apellido,p_fechaNacimiento);
        this.setCuil(p_cuil);
        /*this.setApellido(p_apellido);
        this.setNombre(p_nombre);*/
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }
    
    //Setters
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    /*private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }*/
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }
    private void setAnioIngreso(int p_anio){
        this.setFechaIngreso(new GregorianCalendar());
        this.getFechaIngreso().set(p_anio,1,1);
    }
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso = p_fecha;
    }
    
    //Getters
    public long getCuil(){
        return this.cuil;
    }
    /*public String getApellido(){
        return this.apellido;
    }
    public String getNombre(){
        return this.nombre;
    }*/
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    public int getAnioIngreso(){
        return this.getFechaIngreso().YEAR;
    }
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    
    //Metodos
    /**
     * Metodo que devuelve la cantidad de años de antiguedad, desde el ingreso 
     * @return retorna un valor del tipo entero
     */
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return (anioHoy - this.getFechaIngreso().get(Calendar.YEAR));
    }
    /**
     * Metodo que calcula el descuento del 2% del sueldo basico en concepto de obra social
     * mas un $ 12.00 del seguro de vida
     * @return un valor del tipo double
     */
    private double descuento(){
        return ((this.getSueldoBasico()-12)*2/100);
    }
    /**
     * Metodo que calcula el adicional que es una asignacion sobre el sueldo basico
     * @return retorna un valor del tipo double
     */
    private double adicional(){
        if (this.antiguedad() < 2){
            return (this.getSueldoBasico() + (this.getSueldoBasico() * 2 / 100));
        }else if ((this.antiguedad() >= 2) && (this.antiguedad() < 10)){
            return (this.getSueldoBasico()+(this.getSueldoBasico() * 4 / 100));
        }else{
            return (this.getSueldoBasico()+(this.getSueldoBasico()* 6 / 100));
        }
    }
    /**
     * Metodo que culcula la suma del sueldo basico mas el adicional, menos el descuento
     * @return retorna un valor del tipo double
     */
    public double sueldoNeto(){
        return (this.getSueldoBasico() + this.adicional() - this.descuento());
    }
    /**
     * Metodo que concatena los atributos de nombre y apellido
     * @return un valor del tipo String
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    /**
     * Meodo que concatena los atributos de apellido y Nombre
     * @return retorna un valor del tipo String
     */
    public String apeYNom(){
        return this.getApellido() + ", " + this.getNombre();
    }
    /**
     * Metodo que muestra la salida impresa por pantalla
     */
    public void mostrar(){
        //System.out.println("Nombre y Apellido: " + this.nomYApe());
        super.mostrar();
        System.out.println("CUIL: " + this.getCuil() + "\tAntiguedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: " + this.sueldoNeto());
    }
    /**
     * Metodo que devuelve una cadena del cual los valores dependen del estado interno del objeto
     * @return un valor del tipo String
     */
    public String mostrarLinea(){
        DecimalFormat decimales = new DecimalFormat("#.00");
        return (this.getCuil() + "\t  " + this.apeYNom() + "\t .................$ \t" + decimales.format(this.sueldoNeto()));
    }
    /**
     * Metodo que comprueba si el empleado cumplio un año mas en la empresa
     * @return retorna un valor del tipo boolean
     */
    public boolean esAniversario(){
        Calendar hoy = Calendar.getInstance();
        if ((hoy.get(Calendar.MONTH)+1) == this.getFechaIngreso().get(Calendar.MONTH) && hoy.get(Calendar.DATE) == this.getFechaIngreso().get(Calendar.DATE)){
            return true;
        } else{
            return false;
        }    
    }
}