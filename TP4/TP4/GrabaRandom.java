import java.io.*;
public class GrabaRandom{
    public static void main(String[] args) {
        int clave = 0;
        String nombre = " ";
        int edad = 0;
        char opcion = 'S';
        BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
        try {
            // Creando archivo de acceso directo
            RandomAccessFile archi=new RandomAccessFile("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Ran.dat","rw");
            while (opcion != 'n' && opcion != 'N'){
                System.out.print("Ingrese clave: ");
                clave = Integer.parseInt(teclado.readLine());
                System.out.println("Ingrese nombre: ");
                nombre = teclado.readLine();
                //dejando string en 25 caracteres (por tamaño fijo)
                if (nombre.length() < 25){
                    for(int i=nombre.length(); i <25; i++)
                        nombre = nombre+" ";
                    }else{
                        nombre = nombre.substring(0,25);
                }
                System.out.println("Ingrese edad: ");
                edad = Integer.parseInt(teclado.readLine());
                // grabando al archivo
                if (archi.length()!= 0){
                    // se posiciona al final del último registro
                    archi.seek( archi.length() );
                }
                archi.writeInt(clave);
                archi.writeChars(nombre);
                archi.writeInt(edad);
                System.out.println("Más datos ? (S/N): ");
                opcion=teclado.readLine().charAt(0);
            }
            archi.close();
        } // cierra try
        catch(FileNotFoundException fnfe){
            System.out.println("Archivo no encontrado");
        }
        catch (IOException ioe){
            System.out.println("Error al escribir");
        }
    } // cierra main
} // cierra clase               