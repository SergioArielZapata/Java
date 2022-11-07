
/**
 * Trabajo Practico N° 2 - Ejercicio N° 3
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (2.3)
 */
public class Cliente{
    //Variables de instancias
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;
    
    /**
     * Constructor para Objetos de la clase Cliente
     */
    public Cliente(int p_nroDNI, String p_apellido, String p_nombre, double p_importe){
        //inicializacion de variables de instancias
        this.setDNI(p_nroDNI);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }
    
    //Setters
    private void setDNI(int p_dni){
        this.nroDNI = p_dni;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setSaldo(double p_importe){
        this.saldo = p_importe;
    }
    
    //Getters
    public int getDNI(){
        return this.nroDNI;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    //Metodos
    /**
     * Metodo de la salida impresa
     */
    public void mostrar(){
        System.out.println(" - Cliente - ");
        System.out.println("Nombre y Apellido: " + this.nomYape() + "(" + this.getDNI() + ")");
        System.out.println("Saldo: " + this.getSaldo());
    }
    /**
     * Metodo nuevoSaldo reemplazara el saldo actual por el nuevo importe
     * @return retorna el nuevo saldo.
     */
    public double nuevoSaldo(double p_importe){
        this.setSaldo(p_importe);
        return this.getSaldo();
    }
    /**
     * Metodo para agregar Saldo o actualizar el que esta
     * @return retorna el nuevo saldo.
     */
    public double agregaSaldo(double p_importe){
        this.setSaldo(getSaldo() + p_importe);
        return this.getSaldo();
    }
    /**
     * Metodo para devolver en orden Apellido y Nombre
     * @return retorna un Dato tipo String
     */
    public String apeYnom(){
        return (this.getApellido() + " " + this.getNombre());
    }
    /**
     * Metodo que devuele en orden Nombre y Apellido
     * @return retorna un Dato tipo String
     */
    public String nomYape(){
        return (this.getNombre() + " " + this.getApellido());
    }   
}