
/**
 * Trabajo Practico N° 3 - Ejercicio 7
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.7)
 */
public class CuentaCorriente{
   //Variables de instancia
   private int nroCuenta;
   private double saldo;
   private double limiteDescubierto;
   private Persona titular;
   
   /**
    * Constructor de objartos para la clase CuentaCorriente
    */
   public CuentaCorriente(int p_nroCuenta, Persona p_titular){
       //Inicializacion de variables de instancia
       this.setNroCuenta(p_nroCuenta);
       this.setSaldo(0.0);
       this.setLimiteDescubierto(500);
       this.setTitular(p_titular);
   }
   /**
    * Constructor sorecargado de objetos para la clase CuentaCorriente
    */
   public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
       this.setNroCuenta(p_nroCuenta);
       this.setSaldo(p_saldo);
       this.setLimiteDescubierto(500);
       this.setTitular(p_titular);
   }
   
   //Setters
   private void setNroCuenta(int p_nroCuenta){
       this.nroCuenta = p_nroCuenta;
   }
   private void setSaldo(double p_Saldo){
       this.saldo = p_Saldo;
   }
   private void setLimiteDescubierto(double p_limite){
       this.limiteDescubierto = p_limite;
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
   public double getLimiteDescubierto(){
       return this.limiteDescubierto;
   }
   public Persona getTitular(){
       return this.titular;
   }
   
   //Metodos
   /**
    * Metodo que devuelve true si el importe retirar no supera el saldo limite de descubirte
    * @param recibe un valor double como parametro
    * @return retorna un valor del tipo boolean
    */
   private boolean puedeExtraer(double p_importe){
       if(p_importe <= (this.getSaldo() + this.getLimiteDescubierto())){
           return true;
       }else{
           return false;
       }
   }
   /**
    * Metodo que realiza la extraccion a la cuenta corriente
    * @param recibe un valor double como parametro
    * @return retorna un valor del tipo double
    */
   private void extraccion(double p_importe){
       this.setSaldo(this.getSaldo() - p_importe);
   }
   /**
    * Metodo habilita o no la extraccion y luego informa el motivo de si el resultado es negativo
    * @param recibe un valor del tipo double
    */
   public void extraer(double p_importe){
       if(this.puedeExtraer(p_importe) == true){
           this.extraccion(p_importe);
       }else{
           System.out.println("El importe de extraccion sobrepasa el limite de descubirto!");
       }
   }
   /**
    * Metodo que recibe un monto del tipo double y la asigna a la cuenta coriente
    * @param recibe un valor del tipo double
    */
   public void depositar(double p_importe){
       this.setSaldo(this.getSaldo() + p_importe);
   }
   /**
    * Metodo que muestra por pantalla la salida impresa
    */ 
   public void mostrar(){
       System.out.println("\n- Cuenta Corriente -");
       System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
       System.out.println("Titular: " + this.getTitular().nomYApe());
       System.out.println("Descubierto: " + this.getLimiteDescubierto());
   }
}
