
/**
 * Ejecutable de las clases Localidad, Paciente y Hospital
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.8)
 */
public class GestionHospital{
    public static void main(String [] args){
        //Cracion de objetos y envio de datos
        Localidad localidad_1 = new Localidad("Monte Casero", "Corrientes");
        Paciente paciente_1 = new Paciente(578669, "Juan Manuel Ortigoza", "Bulevar 3 de abril", localidad_1,localidad_1);
        Hospital hospital_1 = new Hospital("Garraham", "Leonardo Ruiz", paciente_1);
        
        hospital_1.consultaDatosFiliatorios(paciente_1);
        System.out.println(" ");
        System.out.println(paciente_1.cadenaDeDatos());
    }
}
