/**
 * Trabajo Practico N° 6 - Ejercicio N° 8
 * 
 * @uthor (Sergio Ariel Zapata)
 * @version (6.8)
 */
public class Heladera extends ArtefactoHogar{
    //Variables de insancias
    private int pies;
    private int puertas;
    private boolean compresor;
    /**
     * Contructor para objetos de la clase Heladera
     */
    public Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_compresor){
        //inicializacion de variables de instancias
        super(p_marca,p_precio,p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_compresor);
    }
    //Setters
    private void setPies(int p_pies){
        this.pies = p_pies;
    }
    private void setPuertas(int p_puertas){
        this.puertas = p_puertas;
    }
    private void setCompresor(boolean p_compresor){
        this.compresor = p_compresor;
    }
    //Getters
    public int getPies(){
        return this.pies;
    }
    public int getPuertas(){
        return this.puertas;
    }
    public boolean getCompresor(){
        return this.compresor;
    }
    //Metodos
    /**
     * Metodo que muestra los datos comunes a todos los artefactos y debe imprimir los datos particulares
     */
    public void imprimir(){
        System.out.println("***** Heladera *****");
        super.imprimir();
        System.out.println("Pies: " + this.getPies());
        System.out.println("Puertas: " + this.getPuertas());
        System.out.print("Compresor: " + this.getCompresor());
        if(this.getCompresor() == true){
            System.out.print("Si");
        }else{
            System.out.print("No");
        }
    }
    /**
         * Metodo que Según el artefacto, el valor de la cuota podrá tener un cálculo adicional:
         * una heladera, si posee compresor, pagará $50 adicionales por cada cuota en concepto de un seguro
         * @param p_cuotas, p_intereses
         * @return retorna un simbolo del tipo float
    */
    public float creditoConAdicional(int p_cuotas, float p_intereses){
            float credito = super.cuotaCredito(p_cuotas, p_intereses);
            if (this.getCompresor() == true){
                return (credito + 50);
            }else{
                return credito;
            }
    }
}        