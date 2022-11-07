/**
 * Ejecutable de la clase Alumno
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (2.4)
 */
public class PruebaAlumno{
    public static void main(String [] args){
        Alumno alu1 = new Alumno(2020, "Juan", "Perez");
        Alumno alu2 = new Alumno(2051, "Maria", "Gomez");
        
        alu1.setNota1(5.99);
        alu1.setNota2(10.0);
        alu1.mostrar();
        alu2.setNota1(7.85);
        alu2.setNota2(8.50);
        alu2.mostrar();
        System.out.println("\n Prueba Finalizada Exitosamente!!! ...");
        System.out.println("\n Sistemas SAZ InforPOWER");
    }
}