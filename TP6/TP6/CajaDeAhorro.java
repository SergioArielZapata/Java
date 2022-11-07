
/**
 * Trabajo Practico N° 3 - Ejercicio N° 7
 * Trabajo Practico N° 6 - Ejercicio N° 6
 * @author (Sergio Ariel Zapata) 
 * @version (3.7.6.6)
 */
public class CajaDeAhorro extends CuentaBancaria{
    //Variables de instancia
    //private int nroCuenta;
    //private double saldo;
    private int extraccionesPosibles;
    //private Persona titular;
    
    /**
     * Constructor de objetos para la clase CajaDeAhorro
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        //Inicializacion de variables de instancia
        //this.setNroCuenta(p_nroCuenta);
        //this.setSaldo(0.0);
        super(p_nroCuenta,p_titular);
        this.setExtraccionesPosibles(10);
        //this.setTitular(p_titular);
    }
    /**
     * Constructor sobrecargado de objetos para la clase CajaDeAhorro
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        //this.setNroCuenta(p_nroCuenta);
        //this.setSaldo(p_saldo);
        super(p_nroCuenta,p_saldo,p_titular);
        this.setExtraccionesPosibles(10);
        //this.setTitular(p_titular);
    }
    
    //Setters
    /*private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }*/
    private void setExtraccionesPosibles(int p_extracciones){
        this.extraccionesPosibles = p_extracciones;
    }
    
    
    //Getters
    /*public int getNroCuenta(){
        return this.nroCuenta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public Persona getTitular(){
        return this.titular;
    }*/
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    //Metodos
    /**
     * Metodo que devuelve un valor true si el importe a retir no supera el saldo disponible y si no uso todas las extracciones posibles
     * @param recibe un valor del tipo double
     * @return retorna un valor del tipo boolean
     */
    private boolean puedeExtraer(double p_importe){//polimorfismo
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
    private void extraccion(double p_importe){//redefinicion
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    /**
     * Metodo que determina si cumple las condiciones de extraccion, si no puede informara el motivo
     * @param recibe un valor del tipo double
     * @return retorna un simbolo del tipo boolean
     */
    public boolean extraer(double p_importe){//redefinicion
        if(this.puedeExtraer(p_importe)==false){
            System.out.println(this.xQNoPuedoExtraer(p_importe));
            return false;
        }else{
            this.extraccion(p_importe);
            return true;            
        }  
    }
    /**
     * Metodo que agrega el importe recibido al saldo actual
     * @param recibe un valor del tipo double
     * @return retorna un simbolo del tipo double
     */
    public double depositar(double p_importe){//redefinicion
        return super.depositar(p_importe);
    }
    /**
     * Metodo que devuelve un el mensaje del porque no puede extraer
     */
    public String xQNoPuedoExtraer(double p_importe){//polimorfismo
        String msj = "";
        if(p_importe >= super.getSaldo()){
            msj = "No puede extraer mas que el saldo!";
        }else{
            msj = "No tiene habilitadas mas extracciones!";
        }
        return msj;
    }
    /**
     * Metodo que muestra la salida impresa por pantalla
     */
    public void mostrar(){//redefinicion
        System.out.println(" - Caja de Ahorro -");
        super.mostrar();
        //System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        //System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones Posibles: " + this.getExtraccionesPosibles());        
    }
}
