
/**
 * Trabajo Practico N° 3 - Ejercicio N° 5
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.5)
 */
public class CuentaBancaria {
    //Variables de instancia
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    /**
     * Contructor de objetos de la clase CuentaBancaria
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    /**
     * Constructor sobrecargado de la clase CuentaBancaria
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    //Setters
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    //Getters
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    public Persona getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
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
    /**
     * Metodo que disminuye el saldo actual por el pasado por parametro
     * @param recibe un parametro del tipo double
     * @return retorna un valor del tipo double
     */
    public double extraer(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        return getSaldo();
    }
    /**
     * Metodo que muestra por pantalla la salida
     */
    public void mostrar(){
        System.out.println("- Cuenta Bancaria -");
        System.out.println("Titular: " + this.getTitular().nomYApe() + "(" + this.getTitular().edad() + " años)");
        System.out.println("Saldo: " + this.getSaldo());
    }
    /**
     * Metodo que concatena un String con el numero, titular, saldo de la cuenta
     * @return retorna un valor del tipo String
     */
    public String toString(){
        return (this.getNroCuenta() + "\t" + this.getTitular().nomYApe() + "\t" + this.getSaldo());
    }
}
