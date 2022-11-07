
/**
 * Trabajo Practico N° 9 - Ejercicio N° 1
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (9.1)
 */
public class Boleteria implements Runnable{
    // instance variables - replace the example below with your own
    private Localidades localidades;

    /**
     * Constructor for objects of class g
     */
    public Boleteria(Localidades p_localidades){
        this.setLocalidades(p_localidades);
    }
    private void setLocalidades(Localidades p_localidades){
        this.localidades = p_localidades;
    }
    //Getters
    public Localidades getLocalidades(){
        return this.localidades;
    }
    //Metodos
    public void run(){
        while(this.getLocalidades().hayDisponible()){
            this.vender();
        }
    }
    private synchronized void vender(){
        System.out.println(Thread.currentThread().getName() + "desea vender una entrada");
        if(this.getLocalidades().hayDisponibles()){
            System.out.println(Thread.currenteThread().getName() + "vendio una entrada - dispobible: " + this.getLocalidades().getDispobibles());
            this.getLocalidades().actualizarDisponibles();
        }else{
            System.out.println("No hay localidades dispobibles");
        }
        try {
            Thread.sleep(1000);   
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }        
    }
}
    