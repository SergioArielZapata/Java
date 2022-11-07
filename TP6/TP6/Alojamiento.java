/**
 * Trabajo Practico N° 6 - Ejercicio N° 9
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.9)
 */
import java.util.*;
public abstract class Alojamiento{
    //Variables de instancias
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicios;
    /**
     * Conructructor para objetos de la clase Alojamiento
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_dias){
        //inicializacion de variables
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_dias);
        this.setServicios(new ArrayList());
    }
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setPrecioBase(double p_precioBase){
        this.precioBase = p_precioBase;
    }
    private void setDiasAlquiler(int p_dias){
        this.diasAlquiler = p_dias;
    }
    private void setServicios(ArrayList<Servicio> p_servicios){
        this.servicios = p_servicios;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecioBase(){
        return this.precioBase;
    }
    public int getDiasAlquiler(){
        return this.diasAlquiler;
    }
    public ArrayList<Servicio> getServicios(){
        return this.servicios;
    }
    //Metodos
    /**
     * Metodo para agregar y quitar servicios al arreglo 
     * @param p_servicio
     * @return retorna un simbolo del tipo boolean
     */
    public boolean agregarServicios(Servicio p_servicio){
        return this.getServicios().add(p_servicio);
    }
    public boolean quitarServicios(Servicio p_servicio){
        return this.getServicios().remove(p_servicio);
    }
    /**
     * El metodo contar() devuelve la cantidad de cabañas y de habitaciones de hotel que tiene alquiladas
     */
    public abstract int contar(String p_alojamiento);
    /**
     * Metodo para calcular el costo del alquiler en funcion del precio y la cantidad de dias
     * 
     */
    public double costo(){
        return this.getPrecioBase() * this.getDiasAlquiler();
    }
    /**
     * Meodo para mostrar un listado de los servicios utilizados
     */
    public void listarServicios(){
        for(int i = 0; i < this.getServicios().size(); i++){
            System.out.println(this.getServicios().get(i).getDescripcion() + ": $" + this.getServicios().get(i).getPrecio());
        }
    }
    /**
     * Metodo que devuelve la suma de todos los servicios utilizados por el cliente
     * @return retorna un simbolo del tipo double
     */
    public double costoServicios(){
        double costo = 0;
        for(int i = 0; i < this.getServicios().size(); i++){
            costo = costo + this.getServicios().get(i).getPrecio();
        }
        return costo;
    }
    /**
     * Motodo para liquidar la estadia del cliente
     */
    public void liquidar(){
        System.out.println("Alojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDiasAlquiler() + " dias: $" + (this.getPrecioBase())*this.getDiasAlquiler());
        this.listarServicios();
    }
}