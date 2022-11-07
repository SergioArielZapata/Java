
/**
 * Trabajo Practico N° 3 - Ejercicio 7
 * Trabajo Practico N° 6 - Ejercicio 6
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.7.6.6)
 */
public class CuentaCorriente extends CuentaBancaria{
   //Variables de instancia
   //private int nroCuenta;
   //private double saldo;
   private double limiteDescubierto;
   //private Persona titular;
   /**
    * Constructor de objartos para la clase CuentaCorriente
    */
   public CuentaCorriente(int p_nroCuenta, Persona p_titular){
       //Inicializacion de variables de instancia
       //this.setNroCuenta(p_nroCuenta);
       //this.setSaldo(0.0);
       super(p_nroCuenta,p_titular);
       this.setLimiteDescubierto(500);
       //this.setTitular(p_titular);
   }
   /**
    * Constructor sorecargado de objetos para la clase CuentaCorriente
    */
   public CuentaCorriente(int p_nroCuenta, double p_saldo, Persona p_titular){
       //Inicializacion de variables de instancias
       //this.setNroCuenta(p_nroCuenta);
       //this.setSaldo(p_saldo);
       super(p_nroCuenta,p_saldo,p_titular);
       this.setLimiteDescubierto(500);
       //this.setTitular(p_titular);
   }
   //Setters
   /*private void setNroCuenta(int p_nroCuenta){
       this.nroCuenta = p_nroCuenta;
   }
   private void setTitular(Persona p_titular){
       this.titular = p_titular;
   }
   private void setSaldo(double p_Saldo){
       this.saldo = p_Saldo;
   }*/
   private void setLimiteDescubierto(double p_limite){
       this.limiteDescubierto = p_limite;
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
   public double getLimiteDescubierto(){
       return this.limiteDescubierto;
   }
   //Metodos
   /**
    * Metodo que devuelve true si el importe retirar no supera el saldo limite de descubirte
    * @param recibe un valor double como parametro
    * @return retorna un valor del tipo boolean
    */
   private boolean puedeExtraer(double p_importe){
       if(p_importe <= (super.getSaldo() + this.getLimiteDescubierto())){
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
   protected void extraccion(double p_importe){
       super.setSaldo(super.getSaldo() - p_importe);
   }
   /**
    * Metodo habilita o no la extraccion y luego informa el motivo de si el resultado es negativo
    * @param recibe un valor del tipo double
    */
   public boolean extraer(double p_importe){
       if(this.puedeExtraer(p_importe) == false){
           System.out.println(this.xQNoPuedoExtraer(p_importe));
           return false;
       }else{
           this.extraccion(p_importe);
           return true;
       }
   }
   /**
    * Metodo que recibe un monto del tipo double y la asigna a la cuenta coriente
    * @param recibe un valor del tipo double
    */
   public double depositar(double p_importe){
       return super.depositar(p_importe);
   }
   /**
    * Metodo que devuelve un mensaje del por que no se puede hacer la extraccion
    * @return retorna un simbolo del tipo String
    */
   public String xQNoPuedoExtraer(double p_importe){
       String msj = " ";
       if((p_importe >= super.getSaldo()) && (p_importe >=(super.getSaldo() + this.getLimiteDescubierto()))){
           msj = "No hay Saldo disponible y/o el importe sobrepasa el limite al descubierto!";
       }
       return msj;
   }
   /**
    * Metodo que muestra por pantalla la salida impresa
    */ 
   public void mostrar(){
       System.out.println("\n- Cuenta Corriente -");
       super.mostrar();
       /* System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
       System.out.println("Titular: " + this.getTitular().nomYApe());*/
       System.out.println("Descubierto: " + this.getLimiteDescubierto());
   }
}