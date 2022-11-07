
/**
 * Trabajo Pactico N° 3 - Ejercicio N° 1
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.1)
 */
public class Producto{
    //Variables de instancia
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;
    
    /**
     * Constructor para objetos de la clase Producto
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setStock(0);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_lab);
    }
    /**
     * Constructor sobrecargado de la clase Producto
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setStock(0);
        this.setPorcPtoRepo(0.0);
        this.setExistMinima(0);
        this.setLaboratorio(p_lab);
    }
    
    //Setters
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    private void setDescripcion(String p_desc){
        this.descripcion = p_desc;
    }
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    private void setLaboratorio(Laboratorio p_lab){
        this.laboratorio = p_lab;
    }
    
    //Getters
    public int getCodigo(){
        return this.codigo;
    }
    public String getRubro(){
        return this.rubro;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getCosto(){
        return this.costo;
    }
    public int getStock(){
        return this.stock;
    }
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
    public int getExistMinima(){
        return this.existMinima;
    }
    public Laboratorio getLaboratorio(){
        return this.laboratorio;
    }
    
    //Metodos
    /**
     * Mostrar la salida impresa
     */
    public void mostrar(){
        System.out.println(this.getLaboratorio().mostrar());
        System.out.println(" ");
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripcion: " + this.getDescripcion());
        System.out.println("Precio Costo: $ " + this.getCosto());
        System.out.println("Stock: " + this.getStock() + " - Stock valorizado: $" + this.stockValorizado());
    }
    /**
     * Metodo que permite modificar el Stock
     */
    public void ajuste(int p_cantidad){
        this.setStock(getStock() + p_cantidad);
    }
    /**
     * Metodo que se ocupa en devolver el resultado de multiplicar el stock por el precio de costo mas 
     * una rentabilidad del 12%
     * @return retorna un valor del tipo double
     */
    public double stockValorizado(){
        return ((this.getStock()*this.getCosto())+((this.getStock()*this.getCosto()*12)/100));
    }
    /**
     * Metodo que devuelve el valor que resulta de agregar un 12% al precio del costo
     * @return rotorna un valor del tipo double
     */
    public double precioLista(){
        return (this.getCosto() + ((this.getCosto()*12)/100));
    }
    /**
     * Metodo que devuelve el valor que representa el precio por pago al contado del producto
     * que se calcula restando un 5% al precio de lista
     * @return retorna un valor del tipo double
     */
    public double precioContado(){
        return (this.precioLista() - ((this.precioLista()*5)/100));
    }
    /**
     * Metodo que devuelve un String que concatena la descripcion, el precio de lista y el precio conado
     * @return retorna un valor del tipo String
     */
    public String mostrarLinea(){
        return (this.getDescripcion() + "\t" + this.precioLista() + "\t" + this.precioContado());
    }
    /**
     * Metodo que permite asignar un nuevo valor a porcPtoRepo
     * @param double p_porce
     */
    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce);
    }
    /**
     * Metodo que asigna un nuevo valor a existencia minima
     * @param int p_cantidad
     */
    public void ajustarExisMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
}
