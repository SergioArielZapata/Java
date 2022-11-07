/**
 * Trabajo Practico N° 6 - Ejercicio N° 9
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.9)
 */
public class Cabaña extends Alojamiento{
    //Variables de instancias
    private int nroHabitaciones;
    /**
     * Contructor para objetos de la clase Cabaña
     */
    public Cabaña(String p_nombre, double p_precioBase, int p_dias, int p_nroHabitaciones){
        //inicializacion de variables de instancias
        super(p_nombre, p_precioBase, p_dias);
        this.setNroHabitaciones(p_nroHabitaciones);
    }
    //Setters
    private void setNroHabitaciones(int p_nroHabitaciones){
        this.nroHabitaciones = p_nroHabitaciones;
    }
    //Getters
    public int getNroHabitaciones(){
        return this.nroHabitaciones;
    }
    //Metodos
    /**
     * Metodo que calcula el costo del alquiler en función del precio base y la cantidad de días de alquiler
     * En el caso particular de las cabañas, al costo calculado para el alojamiento se debe agregar $30 por día por cada habitación que tenga la cabaña. 
     */
    public double costo(){
        double adicionalXHabitacionXDia = this.getNroHabitaciones() * 30 * super.getDiasAlquiler();
        return super.costo() + adicionalXHabitacionXDia + super.costoServicios();
    }
    /**
     * Metodo para contar alojamientos, por cada tipo de alojamieto en particular
     * se puede contar la cantidad de alquileres de un tipo determinado que se ingrese por parametro
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
        System.out.println("Cabaña con " + this.getNroHabitaciones() + " habitaciones");
        System.out.println("Total: ---------> $ " + this.costo());
        System.out.println();
    }
}