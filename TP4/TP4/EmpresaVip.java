/**
 * Ejecutable de las clases Empleado
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.12.4.2)
 */
import java.io.*;
import java.util.*;
public class EmpresaVip{
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
          FileInputStream archiFIS = new FileInputStream("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Empleado.dat");
          DataInputStream archiDIS = new DataInputStream(archiFIS);
          FileOutputStream archiFOS = new FileOutputStream("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\EmpleadoVIP.dat", true);   
          DataOutputStream archiDOS = new DataOutputStream(archiFOS);
          System.out.println("\n    CUIL      Apellido     Nombre        Sueldo Basico      Sueldo Neto     Dia Ingreso  Mes Ingreso  Año Ingreso");
          System.out.print  ("=================================================================================================================\n");
        while (archiDIS.available()>0){ //Lee archivo
                cuil = archiDIS.readLong();
                apellido = archiDIS.readUTF();
                nombre = archiDIS.readUTF();
                sueldoBasico = archiDIS.readDouble();
                sueldoNeto = archiDIS.readDouble();
                dia = archiDIS.readInt();
                mes = archiDIS.readInt();
                anioIngreso = archiDIS.readInt();
                Calendar fechaIngreso = Calendar.getInstance();
                fechaIngreso.set(anioIngreso,mes,dia);
                //Cargo Datos para clase Empleado
                Empleado emple = new Empleado(cuil, apellido, nombre, sueldoBasico, fechaIngreso);
                if (emple.antiguedad() >= 10) { //Graba archivo
                      archiDOS.writeLong(cuil);
                      archiDOS.writeUTF(apellido);
                      archiDOS.writeUTF(nombre);
                      archiDOS.writeDouble(sueldoBasico);
                      archiDOS.writeDouble(sueldoNeto);
                      archiDOS.writeInt(dia);
                      archiDOS.writeInt(mes);
                      archiDOS.writeInt(anioIngreso);
                      System.out.printf("%11d   %-10S %-15S    %6.2f          %6.2f            %2d         %2d          %4d %n",cuil, apellido, nombre, sueldoBasico, sueldoNeto, dia, mes, anioIngreso);
                }
        }
          archiDIS.close();
        }
        catch(FileNotFoundException fnfe){
            System.out.println("Archivo no Encontrado");
        }
        catch(IOException ioe){
            System.out.println("Error al Grabar");
        }
    }
}
