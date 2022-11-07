import java.util.*;
/**
 * Ejecutable la clase Banco
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (5.5)
 */
public class AplicacionBanco{
    public static void main (String [] args){
        int op = 1;
        int cuil;
        String nomEmp;
        String apeEmp;
        double sueBas;
        int anio;
        int dni = 0;
        int cueBan;
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        ArrayList empleados = new ArrayList();
        ArrayList cuentas = new ArrayList();
        Localidad localidad = new Localidad("Corrientes","Corrientes");
        Banco banco = new Banco("Rio", localidad, 3, empleados);
        Banco banco2 = new Banco("Rio", localidad, 3, empleados, cuentas);
        CuentaBancaria cuentaB;
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
       while(!salir){
           System.out.print("\u000c");
           System.out.println("\n********    Menú Banco   ********");
           System.out.println("\n1. Ingresar Datos del Empleado");
           System.out.println("2. Despedir a Empleado");
           System.out.println("3. Ingresar Cuentas Bancarias  ");
           System.out.println("4. Borrar Cuenta Bancaria      ");
           System.out.println("5. Prueba con datos pre-cargados  ");
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
                       System.out.print("\nIngrese año ingreso           : ");
                       anio = sn.nextInt();
                       System.out.println("----------------------------------------------------------");
                       Empleado emple = new Empleado(cuil,nomEmp,apeEmp,sueBas,anio);
                       banco.agregarEmpleado(emple);
                       banco.mostrar();
                       System.out.println("\n\n**Escriba -> 0 <- para salir de la Carga de EMPLEADOS **");
                       System.out.println("\n**Escriba -> 1 <- para continuar con la carga de datos **");
                       op = sn.nextInt();
                   }
                   op = 1;
                   break;
               case 2:
                   int pos;
                   System.out.print("\u000c");
                   banco.mostrar();
                   System.out.print("\n\nIngrese la posicion del empleado a despedir: ");
                   System.out.print("\n      **Escriba -> 0 <- para CANCELAR **     ");
                   pos = sn.nextInt();
                       if (pos == 0){
                           break;
                       }
                   empleados.remove(pos-1);
                   banco.mostrar();
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt();
                   break;
               case 3:
                   while( op != 0){
                       System.out.print("\u000c");
                       System.out.print("****** Ingrese Datos del Empleado ******");
                       System.out.print("\nIngrese CUIL                  : ");
                       cuil = sn.nextInt();
                       System.out.print("\nIngrese Cuenta Bancaria       : ");
                       cueBan = sn.nextInt();
                       System.out.print("\nIngrese Nombre del empleado   : ");
                       nomEmp = sn.next();
                       System.out.print("\nIngrese Apellido del empleado : ");
                       apeEmp = sn.next();
                       System.out.print("\nIngrese el Sueldo Basico      : ");
                       sueBas = sn.nextDouble();
                       System.out.print("\nIngrese año nacimiento        : ");
                       anio = sn.nextInt();
                       System.out.println("----------------------------------------------------------");
                       Persona perso = new Persona(dni,nomEmp,apeEmp,anio);
                       CuentaBancaria cuent = new CuentaBancaria(cueBan,perso,sueBas);
                       banco2.agregarCuentaBancaria(cuent);
                       System.out.println("\n------------------------------------------------------------------------");
                       banco2.cuentasMos();
                       System.out.println("\n\n**Escriba -> 0 <- para salir de la Carga de EMPLEADOS **");
                       System.out.println("\n**Escriba -> 1 <- para continuar con la carga de datos **");
                       op = sn.nextInt();
                   }
                   op = 1;
                   break;
               case 4:
                   int posi;
                   System.out.print("\u000c");
                   banco2.cuentasMos();
                   System.out.print("\n\nIngrese la posicion de la cuenta bancaria a dar de Baja: ");
                   System.out.print("\n          **Escriba -> 0 <- para CANCELAR **     ");
                   posi = sn.nextInt();
                       if (posi == 0){
                           break;
                       }
                   cuentas.remove(posi-1);
                   banco2.cuentasMos();
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt();
                   break;    
               case 5:
                   System.out.print("\u000c");
                   Empleado empleado1 = new Empleado(272675042,"Lorena","Perez",2500, 2012);
                   Empleado empleado2 = new Empleado(272785942,"Jose","Perez",3500, 2012);
                   Empleado empleado3 = new Empleado(372975042,"Miguel","Perez",3000, 2012);
                   Empleado empleado4 = new Empleado(272644042,"Pedro","Perez",1550, 2012);
                   banco.agregarEmpleado(empleado1);
                   banco.agregarEmpleado(empleado2);
                   banco.agregarEmpleado(empleado3);
                   banco.mostrar();
                   //se despide a un empleado
                   System.out.println("\nSe despide al empleado Miguel Perez");
                   banco.quitarEmpleado(empleado3);
                   banco.mostrar();
                   //Se contrata un nuevo empleado
                   System.out.println("\nSe contrata al empleado Pedro Perez");
                   banco.agregarEmpleado(empleado4);
                   banco.mostrar();
                   //Creamos los objetos CuentaBancaria y Persona        
                   Persona persona1 = new Persona(28885888,"juan", "perez", 1988);
                   Persona persona2 = new Persona(1234567, "Mario", "Noser", 1980);
                   Persona persona3 = new Persona(7653423, "Oto", "Lord", 2000);
                   Persona persona4 = new Persona(3824481, "Soledad", "Picard", 1960);
                   CuentaBancaria cuenta1 = new CuentaBancaria(324354657,persona1,155.25);
                   CuentaBancaria cuenta2 = new CuentaBancaria(435421788, persona2, 2000);
                   CuentaBancaria cuenta3 = new CuentaBancaria(321539809, persona3, 900);
                   CuentaBancaria cuenta4 = new CuentaBancaria(429876890, persona4, 0);
                   banco2.agregarCuentaBancaria(cuenta1);
                   banco2.agregarCuentaBancaria(cuenta2);
                   banco2.agregarCuentaBancaria(cuenta3);
                   System.out.println("\n------------------------------------------------------------------------");
                   banco2.mostrarResumen();
                   //Se quita una cuenta del banco
                   banco2.quitarCuentaBancaria(cuenta3);
                   //Se agrega una cuenta al banco
                   banco2.agregarCuentaBancaria(cuenta4);
                   banco2.mostrarResumen();
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
                   System.out.println("Solo números entre 1 y 3");
           }
       }
    }
}