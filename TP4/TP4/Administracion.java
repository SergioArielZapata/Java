
/**
 * Ejecutable para Fundacion
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (4.5)
 */
import java.io.*;
import java.util.*;
public class Administracion{
    public static void main(String [] args){
        //Variables que usara Persona
        int DNI;
        String apellido;
        String nombre;
        int diaNaci;
        int mesNaci;
        int anioNac;
        //Variables que usara Evento
        String NomFun = "Educar para Crecer ";
        String lugar = "Facultad Medicina UBA";
        int dia = 17;
        int mes = 10;
        int anio = 2021;
        Calendar fecha = Calendar.getInstance();
        fecha.set(anio,mes,dia);
        int diasIns = 10;
        double costo = 300;
        Calendar fechaNacimiento = Calendar.getInstance();
        try{  
            //FileInputStream archiFIS = new FileInputStream("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Invitados.dat");// Con 2 lineas
            //DataInputStream archiDIS = new DataInputStream(archiFIS);
            DataInputStream archiDIS = new DataInputStream(new FileInputStream("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Invitados.dat"));// Con 1 Linea
            //FileOutputStream archiFOS = new FileOutputStream("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Invitados2.dat"); //Con 2 lineas 
            //DataOutputStream archiDOS = new DataOutputStream(archiFOS));
            DataOutputStream archiDOS = new DataOutputStream(new FileOutputStream("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Invitados2.dat"));//Con 1 linea
            while (archiDIS.available()>0){ 
                  DNI = archiDIS.readInt();
                  apellido = archiDIS.readUTF();
                  nombre = archiDIS.readUTF();
                  diaNaci = archiDIS.readInt();
                  mesNaci = archiDIS.readInt();
                  anioNac = archiDIS.readInt();
                  //Transformo los campos de fecha a tipo Calendar para enviarlo a Clase Persona
                  fechaNacimiento.set(anioNac,mesNaci,diaNaci);
                  //Creo y Cargo con datos a la clase Persona
                  Persona persona = new Persona(DNI, apellido, nombre, fechaNacimiento);
                  //Creo y Cargo con datos a la clase Eventos
                  Evento evento = new Evento(NomFun, lugar, fecha, diasIns, costo);
                  //Creo una nueva instancia para la clase Fundacion
                  Fundacion fundacion = new Fundacion();
                  //System.out.printf("%8d %-10S  %-20S         %2d             %2d           %4d %n", DNI, apellido, nombre, diaNaci, mesNaci, anioNac);
                  fundacion.imprimirInvitacion(evento, persona);
                  fundacion.grabarInvitacion(evento,persona,archiDOS);
            }
            archiDOS.close();
            archiDIS.close();
        }
        catch(FileNotFoundException fnfe){
           System.out.println("Archivo no encontrado");
        }
        catch(IOException ioe){
            System.out.println("Error al grabar");
        }
        
      }
    }
