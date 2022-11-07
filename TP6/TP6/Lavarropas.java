/**
 * Trabajo Practico N° 6 - Ejercicio N° 8
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.8)
 */
public class Lavarropas extends ArtefactoHogar{
    //Variables de instancias
    private int programas;
    private float kilos;
    private boolean automatico;
    /**
     * Constructor para objetos de la clase Lavarropas
     */
    public Lavarropas(String p_marca, float p_precio, int p_stock, int p_programas, float p_kilos, boolean p_automatico){
    //inicializacion de variables de instancias
    super(p_marca,p_precio,p_stock);
    this.setProgramas(p_programas);
    this.setKilos(p_kilos);
    this.setAutomatico(p_automatico);
    }
    //Setters
    private void setProgramas(int p_programas){
        this.programas = p_programas;
    }
    private void setKilos(float p_kilos){
        this.kilos = p_kilos;
    }
    private void setAutomatico(boolean p_automatico){
        this.automatico = p_automatico;
    }
    //Getters
    public int getProgramas(){
        return this.programas;
    }
    public float getKilos(){
        return this.kilos;
    }
    public boolean getAutomatico(){
        return this.automatico;
    }
    //Metodos
    /**
     * Metodo que muestra los datos comunes a todos los artefactos y debe imprimir los dapartics
     */
    public void imprimir(){
        System.out.println("***** Lavarropas *****");
        super.imprimir();
        System.out.println("Programas: " + this.getProgramas());
        System.out.println("Kilos: " + this.getKilos());
        System.out.print("Automatico: ");
        if(this.getAutomatico() == true){
            System.out.print("Si");
        }else{
            System.out.print("No");
        }
    }
    /**
     * Metodo que segun el artefacto, el valor de la cuota podra tener un calculo adicional
     * una heladera, si posee compresor, pagara $50 adicionales por cada cuota en concepto de seguro
     * @param p_cuotas, p_intereses
     * @return retorna un simbolo del tipo float
     */
    public float creditoConAdicional(int p_cuotas, float p_intereses){
        float credito = super.cuotaCredito(p_cuotas, p_intereses);
        if (this.getAutomatico() == false){ 
            return (credito - (float)(credito * 0.02));
        }else{
            return credito;
        }
    }
}