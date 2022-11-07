
/**
 * Trabajo Practico N° 3 - Ejercicio N° 6
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.6)
 */
public class Docente{
   //Variables de instancia
   private String nombre;
   private String grado;
   private double sueldoBasico;
   private double asignacionFamiliar;
   
   /**
    * Constructor de objetos para la clase Docente
    */
   public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asignacion){
       //Inicializacion de variables de instancia
       this.setNombre(p_nombre);
       this.setGrado(p_grado);
       this.setSueldo(p_sueldoBasico);
       this.setAsignacion(p_asignacion);
   }
   
   //Setters
   private void setNombre(String p_nombre){
       this.nombre = p_nombre;
   }
   private void setGrado(String p_grado){
       this.grado = p_grado;
   }
   private void setSueldo(double p_sueldo){
       this.sueldoBasico = p_sueldo;
   }
   private void setAsignacion(double p_asignacion){
       this.asignacionFamiliar = p_asignacion;
   }
      
   //Getters
   public String getNombre(){
       return this.nombre;
   }
   public String getGrado(){
       return this.grado;
   }
   public double getSueldo(){
       return this.sueldoBasico;
   }
   public double getAsignacion(){
       return this.asignacionFamiliar;
   }
   
   //Metodos
   /**
    * Metodo que calcula el sueldo del docente
    * @return retorna un valor del tipo double
    */
   public double calcularSueldo(){
       return (this.getSueldo() + this.getAsignacion());
   }
}
