
/**
 * Trabajo Practico N° 5 - Ejercicio N° 3
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (5.3)
 */
import java.util.*;
public class Banco{
    //Variables de Instancias
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private Empleado empleado;
    private ArrayList<Empleado> empleados;
    private ArrayList<CuentaBancaria> cuentas;
    /**
     * Construtor para objetos de la Clase Banco
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado){
        //inicializacion de Variables de instancias
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.agregarEmpleado(p_empleado);
        this.setEmpleados(new ArrayList());
        this.setCuentas(new ArrayList());
    }
    /**
     * Construtor sobrecargado para objetos de la clase banco
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados){
        // inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentas(new ArrayList());
    }
    /**
     * Construtor sobrecargado para objetos de la clase banco
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados, ArrayList<CuentaBancaria> p_cuentas){
        // inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentas(p_cuentas);
    }
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setNroSucursal(int p_nroSucursal){
        this.nroSucursal = p_nroSucursal;
    }
    private void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    private void setEmpleado(Empleado p_empleado){
        this.empleado = p_empleado;
    }
    private void setEmpleados(ArrayList<Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    private void setCuentas(ArrayList<CuentaBancaria> p_cuentas){
        this.cuentas = p_cuentas;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    public Localidad getLocalidad(){
        return this.localidad;
    }
    public Empleado getEmpleado(){
        return this.empleado;
    }
    public ArrayList<Empleado> getEmpleados(){
        return this.empleados;
    }
    public ArrayList<CuentaBancaria> getCuentas(){
        return this.cuentas;
    }
    //Metodos
    /**
     * Metodo que permite la contratacion de un nuevo empleado al banco
     * @param p_empleado
     * @return retorna un simbolo del tipo boolean
     */
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    /**
     * Meodo que permite el despido de un empelado del banco
     * @param p_empleado
     * @return retorna un simbolo del tipo boolean
     */
    public boolean quitarEmpleado(Empleado p_empleado){
        return this.getEmpleados().remove(p_empleado);
    }
    /**
     * Metodo que permite listar los sueldos de cada uno de sus empleados (CUIL, apellido y nombre, y sueldo neto)
     */
    public void listarSueldos(){
        for(int i=0; i<this.getEmpleados().size();i++){
            System.out.println(((Empleado)this.getEmpleados().get(i)).mostrarLinea());
        }
    }
    /**
     * Metodo que informar el monto total a pagar en concepto de sueldos
     */
    public double sueldosAPagar(){
        double suma = 0;
        for(int i=0; i<this.getEmpleados().size();i++){
            suma = suma + (((Empleado)this.getEmpleados().get(i)).sueldoNeto());
        }
        return suma;
    }
    /**
     * Metodo que devuelve la nomina de empleados, datos que identifican a la sucursal a la que pertenecen y monto total de sueldos a pagar
     */
    public void mostrar(){
        System.out.println("Banco: "+this.getNombre()+"\tSucursal: "+this.getNroSucursal()+"\n");
        this.listarSueldos();        
        System.out.printf("\nTotal a Pagar---------------------------------------------$ %8.2f ", this.sueldosAPagar());
    }
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentas().add(p_cuenta);
    }
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentas().remove(p_cuenta);
    }
    /**
     * Metodo que permite emitir un listado con los titulares de todas sus cuentas cuyos saldos estén en 0 (cero).
     */
    public void mostrarSaldoCero(){
        System.out.println("Titulares con Cuentas en Saldo Cero");
        System.out.println("------------------------------------------------------------------------");
        for(int i=0; i<this.getCuentas().size();i++){
            if(((CuentaBancaria)(this.getCuentas().get(i))).getSaldo() == 0){
                System.out.println(this.getCuentas().get(i).toString());
            }            
        }
        System.out.println("------------------------------------------------------------------------");
    }
    /**
     * Metodo que permite conocer cuántas cuentas están activas (una cuenta activa es aquella cuyo saldo sea mayor a 0).
     * @return retorna un simbolo del timpo int
     */
    private int cuentasSaldoActivo(){
        int activas = 0;
        for(int i=0;i<this.getCuentas().size();i++){
            if(((CuentaBancaria)(this.getCuentas().get(i))).getSaldo() > 0){
                activas++;
            } 
        }
        return activas;
    }
    /**
     * Metodo que permite conocer cuántas cuentas están activas (una cuenta activa es aquella cuyo saldo sea mayor a 0).
     * @return retorna un simbolo del timpo int
     */
    protected int cuentasMos(){
        int activas = 0;
        for(int i=0;i<this.getCuentas().size();i++){
            System.out.printf("\n Nro Cuenta: %d  Titular: %s \n", (((CuentaBancaria)(this.getCuentas().get(i))).getNroCuenta()), (((CuentaBancaria)(this.getCuentas().get(i))).getTitular().nomYApe() ));
        }
        return activas;
    }
    /**
     * Metodo que muestra por pantalla todas las cuentas totalizadas
     */
    public void mostrarResumen(){
        System.out.println("Banco: "+this.getNombre()+"\tSucursal: "+this.getNroSucursal());
        System.out.println("************************************************************");
        System.out.println("RESUMEN DE CUENTAS BANCARIAS");
        System.out.println("************************************************************");
        System.out.println("Numero total de Cuentas Bancrias: "+this.getCuentas().size());
        System.out.println("Cuentas Activas: "+cuentasSaldoActivo());
        System.out.println("Cuentas Saldo Cero: "+((this.getCuentas().size())-cuentasSaldoActivo()));
        System.out.println("************************************************************");
        mostrarSaldoCero();
    }
}