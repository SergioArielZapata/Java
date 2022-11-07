import java.io.*;
public class leeArchivo{
    public static void main(String[] args) {
        int LU=0;
        String nombre=new String("");
        int edad=0;
        try{
            // Creando un objeto de tipo archivo secuencial para leer
            FileInputStream archiFIS=new FileInputStream("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Alumno.dat");
            DataInputStream archiDIS = new DataInputStream(archiFIS);
            //leyendo archivo
            while (archiDIS.available()>0){ // mientras haya bytes para leer ...
                  LU = archiDIS.readInt();
                  nombre = archiDIS.readUTF();
                  edad = archiDIS.readInt();
                  System.out.println(LU+" "+ nombre + " " + edad);
            }
            archiDIS.close();
        } // cierra try
        catch(FileNotFoundException fnfe){
              System.out.println("Archivo no encontrado");
        }
        catch (IOException ioe){
              System.out.println("Error al leer");
        }
    } // cierra main
} // cierra clase               