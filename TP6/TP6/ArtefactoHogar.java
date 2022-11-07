/**
 * Trabajo Practico N° 6 - Ejercicio N° 8
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.8)
 */
public abstract class ArtefactoHogar{
    //variables de instancias
    private String marca;
    private float precio;
    private int stock;
    /**
     * Constructor para objetos de la clase ArtefactoHogar
     */
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock){
        //inicializacion de variables de instancias
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }
    //Setters
    private void setMarca(String p_marca){
        this.marca = p_marca;
    }
    private void setPrecio(float p_precio){
        this.precio = p_precio;
    }
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    //Getters
    public String getMarca(){
        return this.marca;
    }
    public float getPrecio(){
        return this.precio;
    }
    public int getStock(){
        return this.stock;
    }
    //Metodos
    /**
     * Metodo que muestra los datos comentes a todos los artefactos
     */
    public void imprimir(){
        System.out.println("Marca: " + this.getMarca() + " - Precio: " +  this.getPrecio() + " - Stock: " + this.getStock());
    }
    /**
     * Metodo para calcular el valor de la cuota al solicitar un credito, es comun a todos los artefeactos:
     * al precio original se agrega el interes y se divide por el numero de cuotas pactadas
     * @param p_cuotas, p_intereses
     * @return retorna un simbolo del tipo float
     */
    public float cuotaCredito(int p_cuotas, float p_intereses){
        return ((this.getPrecio()+((this.getPrecio() * p_intereses) / 100)) / p_cuotas);
    }
    /**
     * Metodo que segun el artefacto, el valor de la cuota podra tener un calculo adicional 
     */
    public abstract float creditoConAdicional(int p_cuotas, float p_intereses);
}