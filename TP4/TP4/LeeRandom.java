import java.io.*;
public class LeeRandom{
        public static void main(String[] args) {
            int clave = 0;
            String nombre = "";
            int edad = 0;
            long tamreg = 58; // tamaño de registro
            long canreg = 0; // cantidad de registros
            try{
                // Creando y leyendo archivo
                RandomAccessFile archi=new RandomAccessFile("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Ran.dat","r");
                //calculando cantidad de registros
                canreg = archi.length()/tamreg;
                // en este bucle lee todos los registros del archivo
                for (int r=0; r < canreg; r++) {
                        clave = archi.readInt();
                        //leyendo string (lee de a un carácter y concatena)
                    for(int i = 0; i < 25; ++i){
                        nombre = nombre + archi.readChar();
                    }
                    edad = archi.readInt();
                    System.out.println(clave+" "+nombre+" "+edad);
                    // limpia string, sino concatena con el siguiente
                    nombre = "";
                }
                archi.close();
            } //cierra try
            catch(FileNotFoundException fnfe){
                System.out.println("Archivo no encontrado");
            }
            catch (IOException ioe){
                System.out.println("Error al escribir");
            }
        } // cierra main
} // cierra clase               