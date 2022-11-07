/**
 * Trabajo Practico N° 6 - Ejercicio N° 9
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.9)
 */
public class Hotel extends Alojamiento{
    //Variables de instancias
    private String tipoHabitacion;
    /**
     * Contructor para objetos de la clase Hotel
     */
    public Hotel(String p_nombre, double p_precioBase, int p_dias, String p_tipo){
        //inicializacion de variables de instancias
        super(p_nombre,p_precioBase,p_dias);
        this.setTipoHabitacion(p_tipo);
    }
    //Setters
    private void setTipoHabitacion(String p_tipo){
        this.tipoHabitacion = p_tipo;
    }
    //Getters
    public String getTipoHabitacion(){
        return this.tipoHabitacion;
    }
    //Metodos
    /**
     * Metodos para calcualar el costo del alquiler en funcion del precio y la cantidad de dias de alquiler
     * al costo base se debe agregar $ 20 si el tipo de habitacion es  “Single” o $35 si es habitación “Doble”, por la cantidad de días alojado.
     */
    public double costo(){
        double adicionalXHabitacionXDia = 0.0;
        if (this.getTipoHabitacion() == "Single"){
                adicionalXHabitacionXDia = 20 * super.getDiasAlquiler();
        }
        if (this.getTipoHabitacion() == "Doble"){
                adicionalXHabitacionXDia = 35 * super.getDiasAlquiler();
        }
        return (super.costo() + adicionalXHabitacionXDia + super.costoServicios());
    }
    /**
     * Metodo que permite contar un alojamiento mas en cada tipo de alojamiento, que al recorrer el Array
     * se pueda contar la cantidad de alquileres de un tipo determinado (hotel o cabaña) que se ingresa como parametro
     * @param p_alojamiento
     * @return retorna un simbolo del tipo int
     */
    public int contar(String p_alojamiento){
        int cant = 0;
        if (p_alojamiento == this.getClass().getName()){
            cant++;
        }
        return cant;
    }
    /**
     * Metodo que devuelve la liquidacion de la estadia 
     */
    public void liquidar(){
        super.liquidar();
        System.out.println("Habitacion : " + this.getTipoHabitacion());
        System.out.println("Total: ----------> $ " + this.costo());
        System.out.println();
    }
}