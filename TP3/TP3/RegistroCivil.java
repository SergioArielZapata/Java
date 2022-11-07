
/**
 * Ejecutable de la clase Mujer y Hombre
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.10)
 */
public class RegistroCivil{
    public static void main(String [] args){
        //Crea los objetos Mujer y Hombre
        Mujer mujer_1 = new Mujer("Maria", "Gomez", 28);
        Mujer mujer_2 = new Mujer("Reina","Aguilera", 22);
        Hombre hombre_1 = new Hombre("Jose", "Ortega", 29);
        Hombre hombre_2 = new Hombre("Pepe", "Reyes", 33);
        
        
        System.out.println("Datos de las personas");
        System.out.println(mujer_1.datos());
        System.out.println(hombre_1.datos());
        
        System.out.println("\nEstado Civil de las Personas");
        mujer_1.mostrarEstadoCivil();
        mujer_1.casadaCon();
        hombre_1.mostrarEstadoCivil();
        hombre_1.casadoCon();
        
        System.out.println("\nDivorciar a personas Solteras");
        System.out.print("Mujer: ");
        mujer_1.divorcio();
        System.out.print("Hombre: ");
        hombre_1.divorcio();
        
        System.out.println("\nCasar a: " + mujer_1.getNombre() + " con " + hombre_1.getNombre());
        mujer_1.casarseCon(hombre_1);
        System.out.println("Estado Civil de las personas");
        mujer_1.mostrarEstadoCivil();
        mujer_1.casadaCon();
        hombre_1.mostrarEstadoCivil();
        hombre_1.casadoCon();
                
        System.out.println("\nCasar personas casadas (Prueba)");
        mujer_1.casarseCon(hombre_2);
        hombre_1.casarseCon(mujer_2);
        mujer_1.casadaCon();
        hombre_1.casadoCon();

        System.out.println("\nDivorciar a las personas");
        mujer_1.divorcio();
        hombre_1.divorcio();
        mujer_1.mostrarEstadoCivil();
        hombre_1.mostrarEstadoCivil();
        
        System.out.println("\nNuevo Matrimonio");
        System.out.println(hombre_2.datos());
        System.out.println(mujer_2.datos());
        System.out.println(" ");
        mujer_1.casarseCon(hombre_2);
        hombre_1.casarseCon(mujer_2);
        mujer_1.casadaCon();
        hombre_1.casadoCon();
    }
}
