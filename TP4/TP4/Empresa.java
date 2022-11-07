/**
 * Ejecutable de las clases Empleado
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.12.4.1)
 */
import java.io.*;
import java.util.*;
public class Empresa {
    private Calendar fechaIngreso;
    public static void main(String [] args){
        //Variables de instancia
        long cuil;
        String apellido;
        String nombre;
        double sueldoBasico;
        double sueldoNeto;
        int anioIngreso;
        int mes;
        int dia;
        char opcion = 'S';
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        try {
          FileOutputStream archiFOS = new FileOutputStream("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Empleado.dat", true);   
          DataOutputStream archiDOS = new DataOutputStream(archiFOS);
          while(opcion != 'n' && opcion != 'N'){
             //Ingreso por teclado de datos
            System.out.print("Ingresar el CUIL del empleado: ");
            cuil = Long.parseLong(teclado.readLine());
            System.out.print("Ingresar el Apellido: ");
            apellido = teclado.readLine();
            System.out.print("Ingresar el Nombre: ");
            nombre = teclado.readLine();
            System.out.print("Ingresar el sueldo basico: ");
            sueldoBasico = Double.parseDouble(teclado.readLine());
            System.out.print("Ingresar el año de Ingreso: ");
            anioIngreso = Integer.parseInt(teclado.readLine());
            System.out.print("Ingrese el mes de Ingreso: ");
            mes = Integer.parseInt(teclado.readLine());
            System.out.print("Ingrese el dia de Ingreso: ");
            dia = Integer.parseInt(teclado.readLine());
            Calendar fechaIngreso = Calendar.getInstance();
            fechaIngreso.set(anioIngreso,mes,dia);
            //Cargo Datos para clase Empleado
            Empleado emple = new Empleado(cuil, apellido, nombre, sueldoBasico, fechaIngreso);
            //Grabar en archivo
            archiDOS.writeLong(cuil);
            archiDOS.writeUTF(apellido);
            archiDOS.writeUTF(nombre);
            archiDOS.writeDouble(sueldoBasico);
            archiDOS.writeDouble(emple.sueldoNeto());
            archiDOS.writeInt(fechaIngreso.get(Calendar.DATE));
            archiDOS.writeInt(fechaIngreso.get(Calendar.MONTH));
            archiDOS.writeInt(fechaIngreso.get(Calendar.YEAR));
            System.out.print("Ingresar mas empleados? (s-n): ");
            opcion = teclado.readLine().charAt(0);
          }
          FileInputStream archiFIS=new FileInputStream("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Empleado.dat");
          DataInputStream archiDIS = new DataInputStream(archiFIS);
          System.out.println("\n    CUIL      Apellido     Nombre        Sueldo Basico      Sueldo Neto     Dia Ingreso  Mes Ingreso  Año Ingreso");
          System.out.print  ("=================================================================================================================\n");
          while (archiDIS.available()>0){ 
                  cuil = archiDIS.readLong();
                  apellido = archiDIS.readUTF();
                  nombre = archiDIS.readUTF();
                  sueldoBasico = archiDIS.readDouble();
                  sueldoNeto = archiDIS.readDouble();
                  dia = archiDIS.readInt();
                  mes = archiDIS.readInt();
                  anioIngreso = archiDIS.readInt();
                  System.out.printf("%11d   %-10S %-15S    %6.2f          %6.2f            %2d         %2d          %4d %n",cuil, apellido, nombre, sueldoBasico, sueldoNeto, dia, mes, anioIngreso);
            }
          archiDOS.close();
        }
        catch(FileNotFoundException fnfe){
            System.out.println("Archivo no Encontrado");
        }
        catch(IOException ioe){
            System.out.println("Error al Grabar");
        }
    }
}
