
/**
 * Trabajo Practico N° 3 - Ejercicio N° 12
 * 
 * @author (Sergio Ariel Zapata)
 * @version (3.12)
 */
import java.util.*;
public class EmpleadoConJefe{
    //Variables de instancia
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;
    
    /**
     * Constructor para objetos de la clase EmpleadoConJefe
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe){
         // inicializacion de variables de instancias
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }
    /**
     * Constructor Sobrecargado 1 para objetos de la clase EmpleadoConJefe
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha){
         // inicializacion de variables de instancias
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(null);
    }
    /**
     * Constructor Sobrecargado 2 para objetos de la clase EmpleadoConJefe
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        // inicializacion de variables de instancias
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
        this.setJefe(null);
    }
    
    //Setters
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
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
    private void setJefe(EmpleadoConJefe p_jefe){
        this.jefe = p_jefe;
    }
    
    //Getters
    public long getCuil(){
        return this.cuil;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    public int getAnioIngreso(){
        return this.getFechaIngreso().YEAR;
    }
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    public EmpleadoConJefe getJefe(){
        return this.jefe;
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
        }
        else if ((this.antiguedad() < 10)){
            return (this.getSueldoBasico()+(this.getSueldoBasico() * 4 / 100));
        }
        else{
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
    public void mostrarPantalla(){
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("CUIL: " + this.getCuil() + "\tAntiguedad: " + this.antiguedad() + " años de servicio");
        System.out.printf("Sueldo Neto: %12.2f\n", this.sueldoNeto());
        if(this.getJefe() != null){
            System.out.println("Responde a: " + this.getJefe().nomYApe());
        }else{
            System.out.println("GERENTE GENERAL");
        }
    }
    /**
     * Metodo que retorna una cadena con informacion cuyo valores dependeran del estado interno del objeto
     * @return retorna un valor del tipo String
     */
    public String mostrarLinea(){
        return (this.getCuil() + "\t" + this.apeYNom() + ".....................$ " + this.sueldoNeto());
    }
}
