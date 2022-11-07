/**
 * Trabajo Practico N° 6 - Ejercicio N° 7
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.7)
 */
public abstract class FiguraGeometrica{
    //Variables de instancias
    private Punto origen;
    /**
     * Constructor para el objeto de la clase FiguraGeometrica
     */
    public FiguraGeometrica(Punto p_origen){
        //inicializacion de variables de instancias
        this.setOrigen(p_origen);
    }
    //Setters
    protected void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    //Getters
    public Punto getOrigen(){
        return this.origen;
    }
    public abstract String nombreFigura();
    public abstract double superficie();
    public void mostrarSuperficie(){
        System.out.println(this.nombreFigura());
        System.out.printf("Superficie: %8.2f\n", this.superficie());
    }
}