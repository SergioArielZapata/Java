import java.io.*;
public class ModificaRandom {
    public static void main(String[] args) {
            int clave = 0;
            String nombre = "";
            int edad = 0;
            long tamreg = 58;
            long canreg = 0;
            try{
                RandomAccessFile archi=new RandomAccessFile("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Ran.dat","rw");
                canreg = archi.length() /tamreg;
                for (int r=0; r < canreg; r++){
                        clave = archi.readInt();
                    for(int i = 0; i < 25; ++i) {
                        nombre += archi.readChar();
                    } 
                    edad = archi.readInt();
                    //sumando edad + 10
                    edad = edad+10;
                    //regresando apuntador y regrabando con cambio
                    archi.seek(archi.getFilePointer() - tamreg);
                    archi.writeInt(clave);
                    archi.writeChars(nombre);
                    archi.writeInt(edad);
                    nombre="";
                } // cierra for
                archi.close();
            } // cierra try
            catch(FileNotFoundException fnfe) { }
            catch (IOException ioe) { }
    } // cierra main
} // cierra clase               