/**
 * Trabajo Practico N° 6 - Ejercicio N° 7
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.7)
 */
import java.util.*;
public class Jardin {
    //Variables de instancias
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;
    /**
     * Constructor para objetos de la clase Jardin
     */
    public Jardin(String p_nombre){
        //Inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList());
    }
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras){
        this.figuras = p_figuras;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<FiguraGeometrica> getFiguras(){
        return this.figuras;
    }
    //Metodos
    /**
     * Metodo que agrega y retirar una figura al Array
     * @param p_figura
     * @return retorna un simbolo del tipo boolean
     */
    public boolean agregarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().add(p_figura);
    }
    public boolean quitarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().remove(p_figura);
    }
    /**
     * Metodo que devuelve los liros por latas
     * @return retorna un simbolo del tipo double
     */
    public double cuantosLitros(){
        return cuantasLatas() * 4;
    }
    /**
     * Metodo que calcula las latas por metros
     */
    public int cuantasLatas(){
        return (int)Math.ceil(cuantosMetros()/20);
    }
    /**
     * Metodo que extrae del Array la cantidad de metros
     * @return retorna un simbolo del tipo double
     */
    public double cuantosMetros(){
        double metros = 0;
        for (int i = 0; i < this.getFiguras().size(); i++){
            metros = metros + this.getFiguras().get(i).superficie();
        }
        return metros;
    }
    /**
     * Metodo que lita todas las figuras que se pintara en el jardin
     * que es el total de superficie a cubrir y la cantidad de latas que se necesitaran
     */
    public void detalleFiguras(){
        System.out.println("Presupuesto: "+this.getNombre());
        for(int i=0;i<this.getFiguras().size();i++){
            this.getFiguras().get(i).mostrarSuperficie();            
        }
        System.out.println("----------------------------------");
        System.out.printf("Total a cubrir: %8.2f \n", this.cuantosMetros());
        System.out.println("Comprar "+this.cuantasLatas()+" latas");
    }
}