
/**
 * Ejecutable de la calse CuentaCorriente y CajaDeAhorro
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.7.4)
 */
import java.util.*;
public class Banco{
    public static void main(String [] args){
        int anio = 1988;
        int dia = 10;
        int mes = 9;
        
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(anio,mes,dia);
        
        //Ingres datos del cliente a Persona
        Persona pers = new Persona(23943312, "Juan Emanuel", "Perez", fechaNacimiento);
        
        //Ingresa datos a la cuentaCorriente y efectua operaciones de prueba
        System.out.println("-----------------------------------------------------------");
        CuentaCorriente cuenta1 = new CuentaCorriente(000011243001735, pers);
        pers.mostrar();
        if(pers.esCumpleaños() == true){
            System.out.println("\t\n            FELIZ CUMPLEAÑOS !!! ");
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("\n   TRANSACCIONES REALIZADAS POR EL CLIENTE\n");
        System.out.println("Deposito de $ 1500");
        cuenta1.depositar(1500);
        System.out.println("1era. extraccion cuenta Corriente de $ 500");
        cuenta1.extraer(500);
        cuenta1.mostrar();
        System.out.println("2da. extraccion cuenta Corriente de $ 500");
        cuenta1.extraer(500);
        cuenta1.mostrar();
        System.out.println("3ra. extraccion cuenta Corriente de $ 500");
        cuenta1.extraer(500);
        cuenta1.mostrar();
        System.out.println(" ");
        //Muestra si funciona la clausula de descubierto
        System.out.println("4ta. extraccion cuenta Corriente de $ 700");
        cuenta1.extraer(700);
        cuenta1.mostrar();
        System.out.println(" ");
        
        //Ingresa datos a la CajaDeAhorro y efectua operaciones de pruebas
        CajaDeAhorro caja = new CajaDeAhorro(2135, pers, 155.25);
        caja.mostrar();
        //Prueba si se puede estraer mas de lo que hay de saldo
        System.out.println("1era.extraccion de caja de ahorro de $ 400");
        caja.extraer(400);
        System.out.println("");
        //Pruebas de extracciones posibles
        System.out.println("Deposito de $ 1500");
        caja.depositar(1500);
        caja.mostrar();
        System.out.println("\n2da. extraccion de caja de ahorro de $ 10");
        caja.extraer(10);
        caja.mostrar();
        System.out.println("\n3ra. extraccion de caja de ahorro de $ 20");
        caja.extraer(20);
        caja.mostrar();
        System.out.println("\n4ta. extraccion de caja de ahorro de $ 30");
        caja.extraer(30);
        caja.mostrar();
        System.out.println("\n5ta. extraccion de caja de ahorro de $ 40");
        caja.extraer(40);
        caja.mostrar();
        System.out.println("\n6ta. extraccion de caja de ahorro de $ 50");
        caja.extraer(50);
        caja.mostrar();
        System.out.println("\n7ma. extraccion de caja de ahorro de $ 60");
        caja.extraer(60);
        caja.mostrar();
        System.out.println("\n8va. extraccion de caja de ahorro de $ 70");
        caja.extraer(70);
        caja.mostrar();
        System.out.println("\n9na. extraccion de caja de ahorro de $ 80");
        caja.extraer(80);
        caja.mostrar();
        System.out.println("\n10ma. extraccion de caja de ahorro de $ 90");
        caja.extraer(90);
        caja.mostrar();
        System.out.println("\n11va. extraccion de caja de ahorro de $ 100");
        caja.extraer(100);
        caja.mostrar();
        System.out.println("\n12va. extraccion de caja de ahorro de $ 110");
        caja.extraer(110);
        caja.mostrar();
        System.out.println("");
        System.out.println("              Fin de Operaciones del Cliente               ");
        System.out.println("-----------------------------------------------------------");
    }
}
