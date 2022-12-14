/**
 * Trabajo Practico N° 4 - Ejercicion N° 5
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (4.5)
 */
import java.util.*;
import java.io.*;
public class Fundacion{
    //Variables de instancias
    private String nombre;
    private Evento p_evento;
    private Persona p_persona;
    String MES[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    /**
     * Metodo que recibe datos para imprimir invitacion
     * @param Recibed datos de la clase Administracion, y contene datos de la clase Evento y Persona
     */
    public void imprimirInvitacion(Evento p_evento, Persona p_persona){
        System.out.println("\n Estimado: " + p_persona.nomYApe());
        System.out.println("\n La fundacion: " + p_evento.getNombre());
        System.out.println(" La inscripción se realiza con " + p_evento.getDiasInscripcion() + " dias de anticipación");
        int a = (p_evento.fechaInscripcion().get(Calendar.YEAR));
        int m = (p_evento.fechaInscripcion().get(Calendar.MONTH));
        int d = (p_evento.fechaInscripcion().get(Calendar.DATE));
        String mes = MES[p_evento.fechaInscripcion().get(Calendar.MONTH)-1];
        System.out.println(" La misma se llevara a cabo el desde el dia " + d+"/"+m+"/"+a);
        System.out.println(" El evento tendra lugar en: " + p_evento.getLugar() + ", el " + (d + p_evento.getDiasInscripcion()) +" de "+ mes +" de "+ a);
        System.out.println(" " + p_evento.costoFinal(p_persona.edad()) + " Lo esperamos.");
        System.out.println("\n --------------------------------------------------------------------------");
    }
    /**
    * Metodo que recibe datos para guardarlos en un archivo
    * @param Recibed datos de la clase Administracion, y contene datos de la clase Evento, Persona y DataOutStream con
    * datos sobre el archivo que se utilzara para grabar la Invitarcion
    */
    public void grabarInvitacion(Evento p_evento, Persona p_persona, DataOutputStream unArchivo               ){
       try{
           unArchivo.writeInt(p_persona.getDNI());
           unArchivo.writeUTF(p_persona.ApeYNom());
           unArchivo.writeUTF(p_evento.getNombre());
           unArchivo.writeUTF(p_evento.getLugar());
           unArchivo.writeDouble(p_evento.getCosto());
           int mm = (p_evento.fechaInscripcion().get(Calendar.MONTH)-1);
           int dd = (p_evento.fechaInscripcion().get(Calendar.DATE));
           unArchivo.writeInt(mm);
           unArchivo.writeInt(dd);
        }
       catch(FileNotFoundException fnfe) {
            System.out.println("Archivo no encontrado");
        }
        catch(IOException ioe){
            System.out.println("Error al grabar");
        }
    }
}
