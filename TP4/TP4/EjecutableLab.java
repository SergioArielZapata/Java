
/**
 * Ejecutable de la clase Laboratorio
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (4.3)
 */
import java.io.*;
import java.util.*;
public class EjecutableLab {
    public static void main(String [] args){
        int codigo = 0;
        String nombre;
        String domicilio;
        String telefono;
        int comMin;
        int diaEnt;
        char opcion = 'S';
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        try {
          FileOutputStream archiFOS = new FileOutputStream("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Laboratorio.dat", true);   
          DataOutputStream archiDOS = new DataOutputStream(archiFOS);
          while(opcion != 'n' && opcion != 'N'){
             //Ingreso por teclado de datos
            codigo = codigo + 1;
            System.out.print("Ingresar el Nombre: ");
            nombre = teclado.readLine();
            System.out.print("Ingresar el domicilio: ");
            domicilio = teclado.readLine();
            System.out.print("Ingresar el telefono: ");
            telefono = teclado.readLine();
            System.out.print("Ingrese las compras minimas: ");
            comMin = Integer.parseInt(teclado.readLine());
            System.out.print("Ingrese el dia de entrega: ");
            diaEnt = Integer.parseInt(teclado.readLine());
            //Cargo Datos para clase Empleado
            if(nombre.length() > 30){
                nombre = nombre.substring(1,30);
            }
            if(domicilio.length() > 30){
                domicilio = domicilio.substring(1,30);
            }
            if(telefono.length() > 30){
                telefono = telefono.substring(1,30);
            }
            Laboratorio lab = new Laboratorio(nombre, domicilio, telefono, comMin, diaEnt);
            //Grabar en archivo
            archiDOS.writeInt(codigo);
            archiDOS.writeUTF(lab.getNombre());
            archiDOS.writeUTF(lab.getDomicilio());
            archiDOS.writeUTF(lab.getTelefono());
            archiDOS.writeInt(lab.getCompraMin());
            archiDOS.writeInt(lab.getDiaEnt());
            System.out.print("Ingresar mas Laboratorios? (s-n): ");
            opcion = teclado.readLine().charAt(0);
          }
          FileInputStream archiFIS = new FileInputStream("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Laboratorio.dat");
          DataInputStream archiDIS = new DataInputStream(archiFIS);
          System.out.println("\n  Código    Nombre                          Dirección                       Teléfono                        Compra Min. Dia Entrega");
          System.out.print  ("===================================================================================================================================\n");
          while (archiDIS.available()>0){ 
                  codigo = archiDIS.readInt();
                  nombre = archiDIS.readUTF();
                  domicilio = archiDIS.readUTF();
                  telefono = archiDIS.readUTF();
                  comMin = archiDIS.readInt();
                  diaEnt = archiDIS.readInt();
                  System.out.printf("%010d  %-30S  %-30S  %-30S     %6d       %2d     %n", codigo, nombre, domicilio, telefono, comMin, diaEnt);
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