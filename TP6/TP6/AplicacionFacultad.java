/**
 * Trabajo Practico Nº 6 - Ejercicio Nº 5 - Ejecutable de la clase Facultad
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (6.5)
 */
import java.util.*;
public class AplicacionFacultad{
    public static void main (String [] args){
        //creamos una coleccion de profesores
        ArrayList<Profesor> profes = new ArrayList<Profesor>();
        //creamos objeto de tipo Facultad
        Facultad facul = new Facultad ("FaCENA", profes);
        //creamos un objeto de tipo cargo (simple)
        Cargo cargo1 = new Cargo("JTP-Programacion OO", 3500, 1990, 10);
        //creamos un objeto de tipo Exclusivo (hereda de cargo)
        Exclusivo exclusivo1 = new Exclusivo("Titular-TFA", 3500, 1992, 10,20,30);
        //creamos un objeto de tipo SemiExclusivo (hereda de cargo)
        SemiExclusivo semi1 = new SemiExclusivo("JTP-Analisis de Sistemas", 3500, 1993, 10,10);
        //creamos un objeto de tipo Profesor
        Profesor profesor1 = new Profesor(33063932,"Juan","Perez",1983, "Lic. en Sistemas de Informacion", cargo1);
        //agregamos los cargos
        profesor1.agregarCargo(exclusivo1);
        profesor1.agregarCargo(semi1);
        //creamos objetos
        Cargo cargo2 = new Cargo("JTP-TP-II", 2500, 1995, 10);
        Cargo cargo3 = new Cargo("JTP-Ing.Soft", 2300, 2010,10);
        Exclusivo exclusivo2= new Exclusivo("Titular-TFA", 2500, 1990, 10,20,30);
        SemiExclusivo semi2 = new SemiExclusivo("JTP-Analisis de Sistemas", 2500, 1998, 10,10);
        Profesor profesor2 = new Profesor(34519921,"Mirta","Lopez",1990, "Lic. en Sistemas de Informacion", cargo2);
        //agregamos
        profesor2.agregarCargo(exclusivo2);
        profesor2.agregarCargo(cargo3);
        profesor2.agregarCargo(semi2);
                
        //agregamos profesores a la coleccion
        facul.agregarProfesor(profesor1);
        facul.agregarProfesor(profesor2);
        //profes.add(profesor1);
        //profes.add(profesor2);
        
        //imprimimos informes
        facul.nominaProfesores();
        facul.listarProfesorCargos();
    }
}