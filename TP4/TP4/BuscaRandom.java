import java.io.*;
public class BuscaRandom {
    public static void main(String[] args) {
        int clave = 0;
        String nombre = "";
        int edad = 0;
        long tamreg = 58; // tamaño de registro
        BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
        try{
            RandomAccessFile archi = new RandomAccessFile("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Ran.dat","r");
            System.out.println("Ingrese clave: ");
            clave = Integer.parseInt(teclado.readLine());
            // se posiciona al principio del registro deseado
            archi.seek(clave * tamreg); // argumento es tipo long
            //lee el registro donde se posicionó
            clave=archi.readInt();
            for(int i = 0; i < 25; ++i) {
                nombre += archi.readChar();
            }
            edad=archi.readInt();
            System.out.println(clave+" "+nombre+" "+edad);
            nombre="";
            archi.close();
        } // cierra try
        catch(FileNotFoundException fnfe){ }
            catch (IOException ioe){ }
    } // cierra main
} // cierra clase               