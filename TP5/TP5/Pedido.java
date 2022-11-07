
/**
 * Trabajo Practico N° 5 - Ejercicio N° 2
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (5.2)
 */
import java.util.*;
public class Pedido{
    // Variables de instancia
    private Calendar fecha;
    private ArrayList productos;
    private Producto producto;
    private Cliente cliente;

    /**
     * Consructor de objetos para la clase Pedido
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList p_productos){
        //Inicializacion de variables de instancia
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }
    /**
     * Constructor sobrecargado para la clase Pedido
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList());
        this.agregarProducto(p_producto);
    }
    //Setters
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    private void setCliente(Cliente p_cliente){
        this.cliente = p_cliente;
    }
    private void setProductos(ArrayList p_productos){
        this.productos = p_productos;
    }
    private void setProducto(Producto p_producto){
        this.producto = p_producto;
    }
    //Getters
    public Calendar getFecha(){
        return this.fecha;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public ArrayList getProductos(){
        return this.productos;
    }
    public Producto getProducto(){
        return this.producto;
    }
    //Metodos
    /**
     * Metodo totalAlContado() sera el resultado de Calcular la suma del precio de contado con cada elemento de la lista
     * @return un simbolo del tipo Double
    */
    public double totalAlContado(){
        double suma = 0;
        for(int i = 0; i < this.getProductos().size(); i++){
            suma = suma + ((Producto)(this.getProductos().get(i))).precioContado();
        }
        return suma;
    }
    /**
     * Metodo que surge de la suma del precio de lista de cada elemento de la coleccion de productos solicitados
     * @return retorn un simbolo del tipo Double
     */
    public double totalFinanciado(){
        double suma = 0;
        for (int i = 0; i < this.getProductos().size(); i++){
            suma = suma + ((Producto)(this.getProductos().get(i))).precioLista();
        }
        return suma;
    }
    /**
     * Metodo que agrega productos a la lista solicitada
     * @return retorna un simbolo del tipo boolean
     */
    public boolean agregarProducto(Producto p_producto){
        return this.getProductos().add(p_producto);//agregamos producto a la coleccion
    }
    /**
     * Metodo que elimina un produco a la lista de productos
     * @param p_producto
     * @return retorna un simbolo del tipo boolean
     */
    public boolean quitarProducto(Producto p_producto){
        return this.getProductos().remove(p_producto);//Elimina un producto de la coleccion
    }
    /**
     * Metodo que muestra por pantalla detalles del pedido
     */
    public void mostrarPedido(){
        System.out.printf("\n****** Detalle del pedido ****** Fecha: %te de %tB de %tY%n",this.getFecha(),this.getFecha(),this.getFecha());
        //System.out.format("%te de %tB de %tY%n",this.getFecha(),this.getFecha(),this.getFecha());
        System.out.println("        Producto " + "\t\t\t Precio Lista" + "\t\tPrecio Contado");
        System.out.println("-----------------------------------------------------------------------------");
        for(int i = 0; i<this.getProductos().size(); i++){
            System.out.println(((Producto)this.getProductos().get(i)).mostrarLinea());
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("****** Total --------------------------      %8.2f\t\t     %8.2f", this.totalFinanciado() , this.totalAlContado());
    }
}