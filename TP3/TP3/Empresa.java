
/**
 * Ejecutable de las clases Empleado y EmpleadoConJefe
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.12)
 */
import java.util.*;
public class Empresa {
    public static void main(String [] args){
        //Variables de instancia
        long cuil;
        String apellido;
        String nombre;
        double sueldoBasico;
        int anioIngreso;
        int mes;
        int dia;
        
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        //Ingreso por teclado de datos
        System.out.print("Ingresar el CUIL del empleado: ");
        cuil = teclado.nextLong();
        System.out.print("Ingresar el Apellido: ");
        apellido = teclado.next();
        System.out.print("Ingresar el Nombre: ");
        nombre = teclado.next();
        System.out.print("Ingresar el sueldo basico: ");
        sueldoBasico = teclado.nextDouble();
        System.out.print("Ingresar el año de Ingreso: ");
        anioIngreso = teclado.nextInt();
        System.out.print("Ingrese el mes de Ingreso: ");
        mes = teclado.nextInt();
        System.out.print("Ingrese el dia de Ingreso: ");
        dia = teclado.nextInt();
        
        Calendar fechaIngreso = Calendar.getInstance();
        fechaIngreso.set(anioIngreso,mes,dia);
        
        //Crea objeto Empleado
        Empleado empleado1 = new Empleado(cuil, apellido, nombre, sueldoBasico, anioIngreso);
        
        System.out.println(" ");
        System.out.println("\n---------------------------------------------------------------------------\n");
        System.out.println("                 Ibera Servicios\n");
        Empleado empleadoAniversario = new Empleado(cuil, apellido, nombre, sueldoBasico, fechaIngreso);
        if(empleadoAniversario.esAniversario() == true){
            System.out.println("!FELIZ ANIVERSARIO - PUEDE RETIRARSE 1 HORA ANTES\n");
            System.out.println("Se le concede un permiso de salida a: \n");
        }else{
            System.out.println("El empleado no cumple con Aniversario de ingreso\n");
        }
        //Prueba Empleado con Jefe
        System.out.println("\nEmpleado con Jefe \n");
        EmpleadoConJefe jefe1 = new EmpleadoConJefe(cuil, apellido, nombre, sueldoBasico, fechaIngreso,(new EmpleadoConJefe(345214, "Perez", "Romina Gabriela", 20000.00, 1992)));
        jefe1.mostrarPantalla();
               
        //Prueba Empleado sin Jefe
        System.out.println("\n---------------------------------------------------------------------------\n");
        System.out.println("\nSin Jefe \n");
        EmpleadoConJefe jefe2 = new EmpleadoConJefe(cuil, apellido, nombre, sueldoBasico, fechaIngreso);
        jefe2.mostrarPantalla();
    }
}
