/**
 * Trabajo Practico N° 6 - Ejercicio N° 10
 * 
 * @author (Sergio Ariel Zapata)
 * @version (6.10)
 */
import java.util.*;
public class Zoologico{
    //variables de instancias
    private String nombre;
    private ArrayList<Visitante> visitantes;
    /**
     * Constructor para objetos de la clase Zoologico
    */
    public Zoologico(String p_nombre){
        //inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList());
    }
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setVisitantes(ArrayList<Visitante> p_visitantes){
        this.visitantes = p_visitantes;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Visitante> getVisitantes(){
        return this.visitantes;
    }
    //Metodos
    /**
     * Metodo que permite agregar visitante
     * @param p_visitante
     */
    public void nuevoVisitante(Visitante p_visitante){
        this.getVisitantes().add(p_visitante);
    }
    /**
     * Metodo que lista todos los tipos de visitantes
     */
    public void listaTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante){
        for(Visitante v:visitantes){
            int dV = v.getFechaVisita().get(Calendar.DAY_OF_MONTH);
            int mV = v.getFechaVisita().get(Calendar.MONTH) + 1;
            int aV = v.getFechaVisita().get(Calendar.YEAR);
            int dP = p_fecha.get(Calendar.DAY_OF_MONTH);
            int mP = p_fecha.get(Calendar.MONTH) + 1;
            int aP = p_fecha.get(Calendar.YEAR);
            int vv = Integer.valueOf(String.valueOf(dV) + String.valueOf(mV) + String.valueOf(aV));
            int pp = Integer.valueOf(String.valueOf(dP) + String.valueOf(mP) + String.valueOf(aP));
            if(v.tipoVisitante() == p_tipoVisitante && vv == pp){
                v.mostrar();
            }
        }
    }
    /**
     * Metodo permite proveer listados de visitantes en una fecha en particular
     */
    public void listaVisitantePorFecha(Calendar p_fecha){        
        for(Visitante e:visitantes){
            if (p_fecha == e.getFechaVisita()){
                    e.mostrar();
            }
        }
    }
    /**
     * Metodo que calcula la recaudacion en un rango de fechas determinado
     * @param p_fechaDesde, p_fechaHasta
     * @return retorna un simbolo del tipo double
     */
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta){
        double recaudacion = 0.0;
        for(int i = 0; i < this.getVisitantes().size(); i++){
            if ((p_fechaDesde == this.getVisitantes().get(i).getFechaVisita()) || (p_fechaHasta == this.getVisitantes().get(i).getFechaVisita())){
                recaudacion = recaudacion + this.getVisitantes().get(i).entrada();
            }
        }
        return recaudacion;
    }
}