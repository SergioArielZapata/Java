/**
 * Trabajo Practico N° 6 - Ejercicio N° 8
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.8)
 */
public class Cocina extends ArtefactoHogar{
    //variables de instancias
    private int hornallas;
    private int calorias;
    private String dimensiones;
    /**
     * Contructor para objestos de la clase Cocina
     */
    public Cocina(String p_marca, float p_precio, int p_stock, int p_hornallas, int p_calorias, String p_dimensiones){
        //inicializacion de variables de instancias
        super(p_marca,p_precio,p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
    }
    //Setters
    private void setHornallas(int p_hornallas){
        this.hornallas = p_hornallas;
    }
    private void setCalorias(int p_calorias){
        this.calorias = p_calorias;
    }
    private void setDimensiones(String p_dimensiones){
        this.dimensiones = p_dimensiones;
    }
    //Getters
    public int getHornallas(){
        return this.hornallas;
    }
    public int getCalorias(){
        return this.calorias;
    }
    public String getDimensiones(){
        return this.dimensiones;
    }
    //Metodos
    /**
     * Metodo para mostrar los datos comunes a todos los artefactos y debe imprimir los datos particulares
     */
    public void imprimir(){
        System.out.println("***** Cocina *****");
        super.imprimir();
        System.out.println("Hornallas: " + this.getHornallas());
        System.out.println("Calorias: " + this.getCalorias());
        System.out.println("Dimensiones: " + this.getDimensiones());
    }
    /**
     * Metodo que según el artefacto, el valor de la cuota podrá tener un cálculo adicional
     * @param p_cuotas, p_intereses
     * @return retorna un valor del tipo float
     */
    public float creditoConAdicional(int p_cuotas, float p_intereses){
        return super.cuotaCredito(p_cuotas, p_intereses);
    }
}