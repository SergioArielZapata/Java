/**
 * Ejecutable de la Clase Zoologico
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (6.10)
 */
import java.util.*;
public class VentaEntradas{
    public static void  main(String [] args){
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        Zoologico zoologico = new Zoologico("El Caribú");
        Calendar fecVis  = Calendar.getInstance();
        Calendar fecVis2 = Calendar.getInstance();
        Calendar fecVis3 = Calendar.getInstance();
        Calendar fecVis4 = Calendar.getInstance();
        Calendar fecVis5 = Calendar.getInstance();
        Calendar fecVis6 = Calendar.getInstance();
        int op = 1;
        boolean salir = false;
        int opcion;
        char serv;
        int docVis = 0;
        int d = 0;
        int m = 0;
        int a = 0;
        int dd = 0;
        int mm = 0;
        int aa = 0;
        String nomVis = " ";
        String apeVis = " ";
        int aniVis = 0;
        int canDel = 0;
        String nomDel = " ";        
        while(!salir){
           System.out.print("\u000c");
           System.out.println("\n**********  Menú de Entradas Zoologico  *********");
           System.out.println("\n1. Ingresar Datos del Visitante                  ");
           System.out.println("2. Mostrar Entradas por fecha y por Individuo      ");
           System.out.println("3. Mostrar Entradas por fecha y por Delegacion     ");
           System.out.println("4. Mostrar Entradas por en General sin discrimiar  ");
           System.out.println("5. Mostrar Recaudacion Desde y Hasta               ");
           System.out.println("6. Prueba con datos pre-cargados                   ");
           System.out.println("0. Salir");            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
           switch(opcion){
               case 1:
                   System.out.print("\u000c");
                   System.out.print("******* Carga Datos de Zoologico ********");
                   System.out.print("\nIngrese Numero de Documento        : ");
                   docVis = sn.nextInt();
                   System.out.print("\nIngrese Nombre del visitante       : ");
                   nomVis = sn.next();
                   System.out.print("\nIngrese Apellido del visitante     : ");
                   apeVis = sn.next();
                   System.out.print("\nIngrese Ingrese Año de Nacimiento  : ");
                   aniVis = sn.nextInt();
                   System.out.print("\nIngreso al Zoologico el Dia: ");
                   d = sn.nextInt();
                   System.out.print("\n                        Mes: ");
                   m = sn.nextInt();
                   System.out.print("\n                        Año: ");
                   a = sn.nextInt();
                   
                   Persona persona = new Persona(docVis,nomVis,apeVis,aniVis);
                   fecVis.set(a,m,d);
                   Individuo individuo = new Individuo("Individuo", fecVis, persona);                   
                   zoologico.nuevoVisitante(individuo);
                   
                   System.out.print("\n¿El visitante viene con Delegacion? s-n ");
                   serv = sn.next().charAt(0);
                   if (serv == 's'){
                        System.out.print("\nIngrese Nombre de Delegacion: ");
                        nomDel = sn.next(); 
                        Delegacion delegacion = new Delegacion(nomDel, fecVis, individuo);
                        zoologico.nuevoVisitante(delegacion);
                        System.out.println("\nIngrese la cantidad restante de la Delegacion: ");
                        canDel = sn.nextInt();
                        for(int i = 0; i < canDel; i++){
                            System.out.print("\u000c");
                            System.out.print("******* Carga Datos de Delegacion ********" + (i+1));
                            System.out.print("\nIngrese Numero de Documento        : ");
                            docVis = sn.nextInt();
                            System.out.print("\nIngrese Nombre del visitante       : ");
                            nomVis = sn.next();
                            System.out.print("\nIngrese Apellido del visitante     : ");
                            apeVis = sn.next();
                            System.out.print("\nIngrese Ingrese Año de Nacimiento  : ");
                            aniVis = sn.nextInt();
                            Persona personal = new Persona(docVis,nomVis,apeVis,aniVis);
                            Individuo individuos = new Individuo("Individuo", fecVis, personal);
                            delegacion.inscribirIndividuo(individuos);
                        }
                   }
                   //zoologico.listaTipoVisitantePorFecha(fecVis,"Individuo");
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt(); 
                   break;
               case 2:
                   System.out.print("\u000c");
                   System.out.print("\nIngreso al Zoologico el Dia: ");
                   d = sn.nextInt();
                   System.out.print("\n                        Mes: ");
                   m = sn.nextInt();
                   System.out.print("\n                        Año: ");
                   a = sn.nextInt();                   
                   fecVis2.set(a,m,d);
                   zoologico.listaTipoVisitantePorFecha(fecVis2,"Individuo");
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt();
                   break;
               case 3:                   
                   System.out.print("\u000c");
                   System.out.print("\nIngreso al Zoologico el Dia: ");
                   d = sn.nextInt();
                   System.out.print("\n                        Mes: ");
                   m = sn.nextInt();
                   System.out.print("\n                        Año: ");
                   a = sn.nextInt();
                   fecVis3.set(a,m,d);
                   zoologico.listaTipoVisitantePorFecha(fecVis3,"Delegacion");
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt();
                   break;
               case 4:
                   System.out.print("\u000c");
                   System.out.print("\nIngreso al Zoologico el Dia: ");
                   d = sn.nextInt();
                   System.out.print("\n                        Mes: ");
                   m = sn.nextInt();
                   System.out.print("\n                        Año: ");
                   a = sn.nextInt();
                   fecVis4.set(a,m,d);
                   zoologico.listaTipoVisitantePorFecha(fecVis4,"Individuo");
                   zoologico.listaTipoVisitantePorFecha(fecVis4,"Delegacion");
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt();
                   break;
               case 5:
                   System.out.print("\u000c");
                   System.out.print("\nIngreso Desde el Dia: ");
                   d = sn.nextInt();
                   System.out.print("\n                 Mes: ");
                   m = sn.nextInt();
                   System.out.print("\n                 Año: ");
                   a = sn.nextInt();
                   fecVis.set(a,m,d);
                   System.out.print("\nIngreso Hasta el Dia: ");
                   dd = sn.nextInt();
                   System.out.print("\n                 Mes: ");
                   mm = sn.nextInt();
                   System.out.print("\n                 Año: ");
                   aa = sn.nextInt();
                   fecVis6.set(a,m,d);
                   System.out.println("\nLa Recaudacion total es de ----> " + zoologico.recaudacion(fecVis, fecVis6));
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt();
                   break;
               case 6:
                   System.out.print("\u000c");
                   //creamos fechas
                   Calendar desde = new GregorianCalendar();
                   desde.set(2021,9,22);
                   Calendar hasta = new GregorianCalendar();
                   hasta.set(2021,9,28);
                   //creamos personas
                   Persona persona1 = new Persona(13453244,"Maria","Louseau",1956);
                   Persona persona2 = new Persona(19342342,"Carlos","Lopez",1965);
                   Persona persona3 = new Persona(24434655,"Juan","Perez",1992);
        
                   //creamos individuos
                   Individuo individuo1 = new Individuo("Individuo", desde, persona1);//individual
                   Individuo individuo2 = new Individuo("Individuo", desde, persona2);//para delegacion
                   Individuo individuo3 = new Individuo("Individuo", desde, persona3);//para delegacion     
                   //creamos delegacion
                   //ArrayList integrantes = new ArrayList();
                   //integrantes.add(individuo2);
                   Delegacion delegacion1 = new Delegacion("PAMI", hasta, individuo2);
                   //agregamos un individuo a la delegacion
                   delegacion1.inscribirIndividuo(individuo3);
                   //System.out.println(delegacion1.entrada());                   
                   //agregamos individuo
                   zoologico.nuevoVisitante(individuo1);
                   //agregamos delegacion
                   zoologico.nuevoVisitante(delegacion1);
                   //imprimimos segun individuo y desde
                   System.out.println("Visitantes Solos");
                   zoologico.listaTipoVisitantePorFecha(desde,"Individuo");
                   //imprimimos segun delegacion y desdea
                   System.out.println("\nVisitantes por Delegacion");
                   zoologico.listaTipoVisitantePorFecha(hasta,"Delegacion");
                   //imprimos por desde
                   System.out.println("\nVisitantes en fecha: "+hasta.get(Calendar.DATE)+"/"+hasta.get(Calendar.MONTH)+"/"+hasta.get(Calendar.YEAR));
                   zoologico.listaVisitantePorFecha(hasta);
                   //recaudacion total desde hasta 
                   System.out.println("La Recaudacion total es---->" + zoologico.recaudacion(desde, hasta));
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt();
                   break;
               case 0:
                   System.out.print("\u000c");
                   System.out.println("\n\n\n\n\n\n\n  ******     EL PROGRAMA A FINALIZADO     *******");
                   System.out.println("\n\n\n\n\n\n\n  ****** SEA FELIZ Y HAGA AL ALUMNO FELIZ *******");
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números");
        
           }
        }
    }
}