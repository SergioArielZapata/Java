import java.io.*;
import java.util.*;
public class Ver{
    public static void main(String [] args){
        int DNI;
        String apeYnom;
        String nombre;
        String lugar;
        double costo;
        int mes;
        int dia;
        try{  
            FileInputStream archiFIS = new FileInputStream("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Invitados2.dat");
            DataInputStream archiDIS = new DataInputStream(archiFIS);
            while (archiDIS.available()>0){ 
                  DNI = archiDIS.readInt();        
                  apeYnom = archiDIS.readUTF();
                  nombre = archiDIS.readUTF();
                  lugar = archiDIS.readUTF();
                  costo = archiDIS.readDouble();
                  mes = archiDIS.readInt();
                  dia = archiDIS.readInt();
                  System.out.printf("%d %-20s %s  %s     %6.2f        %d        %d %n", DNI, apeYnom, nombre, lugar, costo, mes, dia);
            }
            archiDIS.close();
        }
        catch(FileNotFoundException fnfe){
           System.out.println("Archivo no encontrado");
        }
        catch(IOException ioe){
            System.out.println("Error al grabar");
        }
      }
}
