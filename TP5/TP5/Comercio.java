
/**
 * Trabajo Practico Nº5 - Ejercicio Nº 6
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (5.6)
 */
import java.util.*;
public class Comercio
{
    // Variables de Instancias
    private String nombre;
    private HashMap<Long, Empleado> empleados;//declaramos colección con clave de tipo Long y valor de tipo Empleado 

    /**
     * Constructor para los objetos de la clase Comercio
     */
    public Comercio(String p_nombre){
        // inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap());
    }
    /**
     * Constructor sobrecargado para los objetos de la clase Comercio
     */
    public Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados){
        // inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setEmpleados(HashMap<Long, Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public HashMap<Long, Empleado> getEmpleados(){
        return this.empleados;
    }
    //Metodos
    /**
     * Metodo que permite dar de alta a un empleado
     * @param p_empleado
     */
    public void altaEmpleado(Empleado p_empleado){
        this.getEmpleados().put(new Long(p_empleado.getCuil()), p_empleado);//agregamos un elemento con su respectiva clave 
    }
    
    /** 
     * Metodo que permite quitar a un empleado de la coleccion del comercio
     * @param p_cuil
     * @return un simbolo del tipo Empleado
     */
    public Empleado bajaEmpleado(long p_cuil){
        return (Empleado)this.getEmpleados().remove(new Long(p_cuil));
    }
    
    /**
     * Meodo que muestra la cantidad de Empleados
     * @return retorna un simbolo del tipo int
     */
    public int cantidadDeEmpleados(){
        return this.getEmpleados().size();
    }
    
    /**
     * Metodo que permite consultar por medio del CUIL si un empleado es parte de la empresa
     * @return retorna un simbolo del tipo boolean
     */
    public boolean esEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(p_cuil);// verifica si existe un elemento a partir de una clave 
    }
    
    /**
     * Metodo que permite buscar un empleado determinado, conociendo su CUIL
     * @return returna un simbolo del tipo Empleado
     */
    public Empleado buscarEmpleado(long p_cuil){
        return (Empleado)this.getEmpleados().get(new Long(p_cuil));//utilizado para buscar un elemento a partir de la clave – retorna elemento 
    }
    
    /**
     * Metodo que permite conocer el sueldo neto de un empleado determinado
     */
    public void sueldoNeto(long p_cuil){
        ((Empleado)(this.getEmpleados().get(buscarEmpleado(p_cuil)))).mostrarLinea();
    }
    
    /**
     * metodo que muestra por pantalla la nomina de empleados
     */
    public void nomina(){
        System.out.println("**** Nomina de empleados de Impulso ****");
        for(Map.Entry<Long, Empleado> empleado:empleados.entrySet()){// se hace uso de Foreach en base a Map.Entry para recorrer la colección 
            System.out.printf( "\n %d      %s  \t----------$ %8.2f \n", empleado.getKey(), this.buscarEmpleado(empleado.getKey()).nomYApe(), this.buscarEmpleado(empleado.getKey()).sueldoNeto());
            //System.out.println(empleado.getKey() + "\t" + this.buscarEmpleado(empleado.getKey()).nomYApe() + "\t\t -----$\t\t " + this.buscarEmpleado(empleado.getKey()).sueldoNeto());
        }
    }
}
