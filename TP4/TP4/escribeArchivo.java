import java.io.*;
public class escribeArchivo{
    public static void main(String[] args){
        int LU = 0;
        String nombre = "";
        int edad = 0;
        char opcion = 'S';
        // creando objeto teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Creando un objeto de tipo archivo secuencial
            FileOutputStream archiFOS = new FileOutputStream("C:\\Users\\Ariel\\Desktop\\POO\\TP4\\TP4\\Alumno.dat",true);
            DataOutputStream archiDOS = new DataOutputStream(archiFOS);
            while(opcion != 'n' && opcion != 'N'){
                System.out.println("Ingrese LU: ");
                LU = Integer.parseInt(teclado.readLine());
                System.out.println("Ingrese Nombre y Apellido: ");
                nombre=teclado.readLine();
                System.out.println("Ingrese edad: ");
                edad = Integer.parseInt(teclado.readLine());
                //grabando el archivo
                archiDOS.writeInt(LU);
                archiDOS.writeUTF(nombre);
                archiDOS.writeInt(edad);
                System.out.println("Más datos ? (S/N): ");
                opcion=teclado.readLine().charAt(0);
            }
            archiDOS.close();
            } // cierra try
        catch(FileNotFoundException fnfe) {
            System.out.println("Archivo no encontrado");
        }
        catch(IOException ioe){
            System.out.println("Error al grabar");
        }
    } // cierra main
} // cierra clase