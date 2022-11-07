/**
 * Trabajo Practico N° 3 - Ejercicio N° 5
 * Trabajo Practico N° 6 - Ejercicio N° 5
 * @author (Sergio Ariel Zapata)
 * @version (3.5.6.5)
 */
public abstract class CuentaBancaria{
    //Variables de instancias
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    /**
     * Constructor para objeos de la clase CuentaBancaria
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        //inicializacion de variables de instancia
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    /**
     * Constructor sobrecargado para objetos de la clase CuentaBancaria
     */
    public CuentaBancaria(int p_nroCuenta, double p_saldo, Persona p_titular){
        //inicializacion de variables de instancia
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setTitular(p_titular);
    }
    //Setters
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    protected void setSaldo(double p_saldo){
        this.saldo = p_saldo;
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
    public Persona getTitular(){
        return this.titular;
    }
    //Metodos
    /**
     * Metodo que modifica el saldo actual por el pasado por parametro
     * @param recibe un parametro del tipo double
     * @return retorna un un valor del tipo double
     */
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return getSaldo();
    } 
     /*
     * Metodo que disminuye el saldo actual por el pasado por parametro
     * @param recibe un parametro del tipo double
     * @return retorna un valor del tipo double
     
    public double extraer(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        return getSaldo();
    } */
    /**
     * Metodo Extraer devuelve true o flase dependiendo si se puede hacer la operacion
     * @param p_importe
     */
    abstract public boolean extraer(double p_importe);
    /**
     * Metodo que muestra por pantalla la salida
     */
    public void mostrar(){
        System.out.println("Nro. Cuenta: "+this.getNroCuenta()+" - Saldo: "+this.getSaldo());
        System.out.println("Titular: "+this.getTitular().nomYApe());
    }
    /*
     * Metodo que concatena un String con el numero, titular, saldo de la cuenta
     * @return retorna un valor del tipo String
     
    public String toString(){
        return (this.getNroCuenta() + "\t" + this.getTitular().nomYApe() + "\t" + this.getSaldo());
    }*/
}