import java.util.*;
/**
 * Ejecutable la clase Empleado y Comercio
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (5.6)
 */
public class GestionComercio{
    public static void main (String [] args){
       Scanner sn = new Scanner(System.in);
       sn.useDelimiter("\n");
       int op = 1;
       int cuil;
       int anio;
       String nomEmp;
       String apeEmp;
       double sueBas;
       boolean salir = false;
       HashMap<Long,Empleado> lista = new HashMap<Long,Empleado>();
       Comercio comer = new Comercio("Impulso",lista);
       int opcion; //Guardaremos la opcion del usuario
       while(!salir){
           System.out.print("\u000c");
           System.out.println("\n********    Menú Gestión Comercio   ********");
           System.out.println("\n1. Ingresar Datos para la prueba");
           System.out.println("2. Dar de Baja a empleado       ");
           System.out.println("3. Prueba con datos pre-cargados");
           System.out.println("0. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   while( op != 0){
                       System.out.print("\u000c");
                       System.out.print("****** Ingrese Datos del Empleado ******");
                       System.out.print("\nIngrese CUIL                  : ");
                       cuil = sn.nextInt();
                       System.out.print("\nIngrese Nombre del empleado   : ");
                       nomEmp = sn.next();
                       System.out.print("\nIngrese Apellido del empleado : ");
                       apeEmp = sn.next();
                       System.out.print("\nIngrese el Sueldo Basico      : ");
                       sueBas = sn.nextDouble();
                       System.out.print("\nIngrese año nacimiento        : ");
                       anio = sn.nextInt();
                       Empleado empleado = new Empleado(cuil,nomEmp,apeEmp,sueBas,anio);
                       lista.put(empleado.getCuil(), empleado);
                       Comercio comercio2 = new Comercio("Impulso",lista);
                       comer.nomina();
                       System.out.println("----------------------------------------------------------");
                       System.out.println("\n\n**Escriba -> 0 <- para salir de la Carga de EMPLEADOS **");
                       System.out.println("\n**Escriba -> 1 <- para continuar con la carga de datos **");
                       op = sn.nextInt();
                   }
                   op = 1;
                   break;
               case 2:
                   int pos;
                   System.out.print("\u000c");
                   comer.nomina();
                   System.out.print("\n\nIngrese el CUIL del empleado a dar de baja  ");
                   System.out.print("\n      **Escriba -> 0 <- para CANCELAR **    : ");
                   pos = sn.nextInt();
                       if (pos == 0){
                           break;
                       }
                   comer.bajaEmpleado(pos);
                   comer.nomina();
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt();
                   break; 
               case 3:
                   System.out.print("\u000c");
                   //creamos objetos de tipo Empleado        
                   Empleado emp1 = new Empleado(30100623,"Gonzalez","Juan",3400,1991);
                   Empleado emp2 = new Empleado(37045987,"Martinez","Maria",2400,1998);
                   Empleado emp3 = new Empleado(32550096,"Gomez","Virginia",2000,2000);
                   Empleado emp4 = new Empleado(33224455,"Perez","Dario",1500,1980); 
                   lista.put(emp1.getCuil(), emp1);
                   lista.put(emp2.getCuil(), emp2);
                   lista.put(emp3.getCuil(), emp3);
                   //creamos un objeto de tipo Comercio        
                   Comercio com = new Comercio("Impulso",lista); 
                   //mostramos la nomina         
                   com.nomina(); 
                   System.out.println("**** Se da de Alta a Perez,Dario ****");        
                   com.altaEmpleado(emp4); 
                   System.out.println("**** Se da de Baja a Gomez, Virginia ****\n");        
                   com.bajaEmpleado(32550096);        
                   com.nomina();  
                   System.out.println("**** Se busca al Empleado con cuil 30100623 ****\n");        
                   com.buscarEmpleado(30100623).mostrar();
                   System.out.println("\n\n**Escriba CUALQUIER NUMERO para volver al menú**");
                   opcion = sn.nextInt();
                   break;
                case 0:
                   System.out.print("\u000c");
                   System.out.println("\n\n\n\n\n\n\n  ******     EL PROGRAMA A FINALIZADO     *******");
                   System.out.println("\n\n\n\n\n\n\n  ****** SEA FELIZ Y HAGA AL ALUMNO FELIZ *******");
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 3");
           }
       }
    }
}
