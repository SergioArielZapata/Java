
/**
 * Ejecutable de la clase gerencia
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (6.9)
 */
import java.util.*;
public class AdministracionGerencia{
     public static void main(String[]args){         
         Scanner sn = new Scanner(System.in);
         sn.useDelimiter("\n");         
         Gerencia gerencia = new Gerencia("Los Arroyos");
         int op = 1;
         boolean salir = false;
         int opcion;
         String nomCab;
         double preCab;
         int diaCab;
         int nroHab;
         char serv;
         int tipHab;
         String habitacion = "Single";
         String desSer1 ="Ninguno";
         String desSer2 ="Ninguno";
         String desSer3 ="Ninguno";
         String desSer4 ="Ninguno";
         String desSer5 ="Ninguno";
         double preSer1 = 0;
         double preSer2 = 0;
         double preSer3 = 0;
         double preSer4 = 0;
         double preSer5 = 0;
        while(!salir){
           System.out.print("\u000c");
           System.out.println("\n********  Menú de Alojamientos  ********");
           System.out.println("\n1. Ingresar Datos para Cabaña        ");
           System.out.println("2. Ingresar Datos para Hotel           ");
           System.out.println("3. Mostrar Datos de Gerencia           ");
           System.out.println("4. Borrar Ingreso de Hotel o Cabaña    ");
           System.out.println("5. Prueba con datos pre-cargados       ");
           System.out.println("0. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.print("\u000c");
                   System.out.print("******* Carga Datos de Cañaba ********");
                   System.out.print("\nIngrese Nomre de la Cabaña            : ");
                   nomCab = sn.next();
                   System.out.print("\nIngrese Precio Base de la cabaña      : ");
                   preCab = sn.nextDouble();
                   System.out.print("\nIngrese Cantidad de dias en la cabaña : ");
                   diaCab = sn.nextInt();
                   System.out.print("\nIngrese numeros de Habitaciones       : ");
                   nroHab = sn.nextInt();
                   System.out.print("\n¿El cliente tiene Servicios Adicionales? s-n ");
                   serv = sn.next().charAt(0);
                   if (serv == 's'){
                        System.out.print("Cantidad de servicios (1 - 5): ");
                        int cant = sn.nextInt();
                        switch(cant){
                                  case 1:
                                        System.out.print("\nIngrese Servicio 1: ");
                                        desSer1 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer1 = sn.nextDouble();
                                        break;
                                  case 2:
                                        System.out.print("\nIngrese Servicio 1: ");
                                        desSer1 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer1 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 2: ");
                                        desSer2 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer2 = sn.nextDouble();
                                        break;
                                  case 3:
                                        System.out.print("\nIngrese Servicio 1: ");
                                        desSer1 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer1 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 2: ");
                                        desSer2 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer2 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 3: ");
                                        desSer3 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer3 = sn.nextDouble();
                                        break;
                                  case 4:
                                        System.out.print("\nIngrese Servicio 1: ");
                                        desSer1 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer1 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 2: ");
                                        desSer2 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer2 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 3: ");
                                        desSer3 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer3 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 4: ");
                                        desSer4 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer4 = sn.nextDouble();
                                        break;
                                  case 5:
                                        System.out.print("\nIngrese Servicio 1: ");
                                        desSer1 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer1 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 2: ");
                                        desSer2 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer2 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 3: ");
                                        desSer3 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer3 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 4: ");
                                        desSer4 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer4 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 5: ");
                                        desSer5 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer5 = sn.nextDouble();
                                        break;
                        }                                                                   
                   }
                   Alojamiento cabaña = new Cabaña(nomCab,preCab, diaCab, nroHab);
                        Servicio servicio1 = new Servicio(desSer1, preSer1);
                        Servicio servicio2 = new Servicio(desSer2, preSer2);
                        Servicio servicio3 = new Servicio(desSer3, preSer3);
                        Servicio servicio4 = new Servicio(desSer4, preSer4);
                        Servicio servicio5 = new Servicio(desSer5, preSer5);
                        cabaña.agregarServicios(servicio1);
                        cabaña.agregarServicios(servicio2);
                        cabaña.agregarServicios(servicio3);
                        cabaña.agregarServicios(servicio4);
                        cabaña.agregarServicios(servicio5);
                        gerencia.agregarAlojamientos(cabaña);    
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt(); 
                   break;
               case 2:
                   System.out.print("\u000c");
                   System.out.print("******* Carga Datos de Cañaba ********");
                   System.out.print("\nIngrese Nomre de la Hotel                          : ");
                   nomCab = sn.next();
                   System.out.print("\nIngrese Precio Base del Hotel                      : ");
                   preCab = sn.nextDouble();
                   System.out.print("\nIngrese Cantidad de dias en el Hotel               : ");
                   diaCab = sn.nextInt();
                   System.out.print("\nIngrese Tipo de habitación 1 = Single o 2 = Doble) : ");
                   tipHab = sn.nextInt();
                   if (tipHab == 1){ habitacion = "Single"; }
                   if (tipHab == 2){ habitacion = "Doble" ; }
                   System.out.print("\n¿El cliente tiene Servicios Adicionales? s-n ");
                   serv = sn.next().charAt(0);
                   if (serv == 's'){
                        System.out.print("Cantidad de servicios (1 - 5): ");
                        int cant = sn.nextInt();
                        switch(cant){
                                  case 1:
                                        System.out.print("\nIngrese Servicio 1: ");
                                        desSer1 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer1 = sn.nextDouble();
                                        break;
                                  case 2:
                                        System.out.print("\nIngrese Servicio 1: ");
                                        desSer1 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer1 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 2: ");
                                        desSer2 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer2 = sn.nextDouble();
                                        break;
                                  case 3:
                                        System.out.print("\nIngrese Servicio 1: ");
                                        desSer1 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer1 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 2: ");
                                        desSer2 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer2 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 3: ");
                                        desSer3 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer3 = sn.nextDouble();
                                        break;
                                  case 4:
                                        System.out.print("\nIngrese Servicio 1: ");
                                        desSer1 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer1 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 2: ");
                                        desSer2 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer2 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 3: ");
                                        desSer3 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer3 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 4: ");
                                        desSer4 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer4 = sn.nextDouble();
                                        break;
                                  case 5:
                                        System.out.print("\nIngrese Servicio 1: ");
                                        desSer1 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer1 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 2: ");
                                        desSer2 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer2 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 3: ");
                                        desSer3 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer3 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 4: ");
                                        desSer4 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer4 = sn.nextDouble();
                                        System.out.print("\nIngrese Servicio 5: ");
                                        desSer5 = sn.next();
                                        System.out.print("Ingrese Precio:");
                                        preSer5 = sn.nextDouble();
                                        break;
                        }                                               
                   }
                   Alojamiento  hotel= new Hotel(nomCab,preCab, diaCab, habitacion);
                        Servicio servicios1 = new Servicio(desSer1, preSer1);
                        Servicio servicios2 = new Servicio(desSer2, preSer2);
                        Servicio servicios3 = new Servicio(desSer3, preSer3);
                        Servicio servicios4 = new Servicio(desSer4, preSer4);
                        Servicio servicios5 = new Servicio(desSer5, preSer5);
                        hotel.agregarServicios(servicios1);
                        hotel.agregarServicios(servicios2);
                        hotel.agregarServicios(servicios3);
                        hotel.agregarServicios(servicios4);
                        hotel.agregarServicios(servicios5);
                        gerencia.agregarAlojamientos(hotel);
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt(); 
                   break;
               case 3:                   
                   System.out.print("\u000c");
                   gerencia.mostrarLiquidacion();
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt();
                   break;
               case 4:
                   int pos;
                   System.out.print("\u000c");
                   gerencia.mostrarLiquidacion();
                   System.out.print("\n\nIngrese la posicion del producto a retirar: ");
                   System.out.print("\n      **Escriba -> 0 <- para CANCELAR **     ");
                   pos = sn.nextInt();
                   if (pos == 0){
                           break;
                       }
                   for(int i = 0; i < gerencia.getAlojamientosAlquilados().size(); i++){
                       if((pos-1) == i){
                           gerencia.getAlojamientosAlquilados().remove(i);
                       }
                   }
                   System.out.print("\u000c");
                   gerencia.mostrarLiquidacion();
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt();
                   break;
               case 5:
                   System.out.print("\u000c");
                   //creamos los servicios
                   Servicio servici1 = new Servicio("Alquiler de Autos",100);
                   Servicio servici2 = new Servicio("Lavanderia",20);
                   Servicio servici3 = new Servicio("Internet",5);
       
                   //creamos alojamientos
                   Alojamiento cabañas = new Cabaña("Cabañas La Alondra", 1050, 5, 3);
                   Alojamiento hoteles = new Hotel("Hotel Guarani", 630, 7,"Single");
                   Alojamiento hoteles2 = new Hotel("Hotel Guarani", 630, 7,"Doble");
       
                   //Agregamos servicios a los alojamientos
                   cabañas.agregarServicios(servici1);
                   cabañas.agregarServicios(servici2);
                   hoteles.agregarServicios(servici1);
                   hoteles.agregarServicios(servici3);
                   hoteles2.agregarServicios(servici1);
                   hoteles2.agregarServicios(servici3);   
                   //Agregamos alojamientos a la gerencia
                   gerencia.agregarAlojamientos(cabañas);
                   gerencia.agregarAlojamientos(hoteles);
                   gerencia.agregarAlojamientos(hoteles2);
                   //Mostramos La liquidacion de la gerencia
                   gerencia.mostrarLiquidacion();
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