
/**
 * Trabajo Practico N° 3 - Ejercicio N° 7
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.7.2)
 */
public class CajaDeAhorro{
    //Variables de instancia
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    
    /**
     * Constructor de objetos para la clase CajaDeAhorro
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        //Inicializacion de variables de instancia
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0.0);
        this.setExtraccionesPosibles(10);
        this.setTitular(p_titular);
    }
    /**
     * Constructor sobrecargado de objetos para la clase CajaDeAhorro
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
        this.setTitular(p_titular);
    }
    
    //Setters
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    private void setExtraccionesPosibles(int p_extracciones){
        this.extraccionesPosibles = p_extracciones;
    }
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    //Getters
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    public Persona getTitular(){
        return this.titular;
    }
    
    //Metodos
    /**
     * Metodo que devuelve un valor true si el importe a retir no supera el saldo disponible y si no uso todas las extracciones posibles
     * @param recibe un valor del tipo double
     * @return retorna un valor del tipo boolean
     */
    private boolean puedeExtraer(double p_importe){
        if((p_importe <= this.getSaldo()) && (this.getExtraccionesPosibles() > 0)){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Metodo que realiza la extraccion y descuenta en 1 el numero de extracciones posibles
     * @param recibe un valor del tipo double
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    /**
     * Metodo que determina si cumple las condiciones de extraccion, si no puede informara el motivo
     * @param recibe un valor del tipo double
     */
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe) == true){
            this.extraccion(p_importe);
        }else if (p_importe > this.getSaldo()){
            System.out.println("No puede mas que el saldo!");
        }else{
            System.out.println("No tiene habilitadas mas extracciones!");
        }
    }
    /**
     * Metodo que agrega el importe recibido al saldo actual
     * @param recibe un valor del tipo double
     */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    /**
     * Metodo que muestra la salida impresa por pantalla
     */
    public void mostrar(){
        System.out.println(" - Caja de Ahorro -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones Posibles: " + this.getExtraccionesPosibles());        
    }
}
