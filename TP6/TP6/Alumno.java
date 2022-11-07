
/**
 * Trabajo Practico N° 2 - Ejercicio N° 4
 * Trabajo Practico N° 5 - Ejercicio N° 5
 * Trabajo Practico N° 6 - Ejercicio N° 1
 * @author (Sergio Ariel Zapata) 
 * @version (2.4.5.5.6.1)
 */
public class Alumno extends Persona{
    // Variables de instancia
    private int lu;
    //private String nombre;
    //private String apellido;
    private double nota1;
    private double nota2;
    /**
     * Constructor para el objeto de la Clase Alumno
     */
    /*public Alumno(int p_lu, String p_nombre, String p_apellido){
        //Inicializacion de variables de instancia
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
    }*/
    public Alumno(int p_dni, String p_nombre, String p_apellido, int p_fecha, int p_lu, double p_nota1, double p_nota2){
        super (p_dni,p_nombre,p_apellido,p_fecha);
        this.setLu(p_lu);
        this.setNota1(p_nota1);
        this.setNota2(p_nota2);
    }
    
    //Setters
    private void setLu(int p_lu){
        this.lu = p_lu;
    }
    /*private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }*/
    public void setNota1(double p_nota1){
        this.nota1 = p_nota1;
    }
    public void setNota2(double p_nota2){
        this.nota2 = p_nota2;
    }
    
    //Getters
    public int getLu(){
        return this.lu;
    }
    /*public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }*/
    public double getNota1(){
        return this.nota1;
    }
    public double getNota2(){
        return this.nota2;
    }
    
    //Metodos
    /**
     * Metodo aprueba de tipo Logico que devuelve verdadero o falso si el promedio es mayor a 7
     * y si ambos puntos son mayores a 6
     * @return retorna un valor logico de verdadero o falso(true o false)
     */
    private boolean aprueba(){
        if ((this.promedio() > 7)&&(this.getNota1() >= 6)&&(this.getNota2() >= 6)){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * Metodo que devuelve la leyenda de APROBADO O DESAPROBADO de acuerdo con el metodo aprueba
     * @return retorna valor tipo String
     */
    private String leyendaAprueba(){
        if(this.aprueba() == true){
            return ("APROBADO");
        }
        else{
            return ("DESAPROBADO");
        }
    }
    /**
     * Metodo en el se calcula el promedio de la nota1 y la nota2
     * @return retorna un valor tipo Double
     */
    public double promedio(){
        return ((this.nota1)+(this.nota2))/2;
    }
    /**
     * Metodo que devuelve concatenado Nombre y Apellido
     * @return retorna un valor tipo String
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    /**
     * Metodo que devuelve concatenado el Apellido y Nombre
     * @return rotorna un valor tipo String
     */
    public String ApeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    /**
     * Metodo que muestra la salida impresa por pantalla
     */
    public void mostrar(){
        //System.out.println("\nNombre y Apellido: " + this.nomYApe());
        super.mostrar();
        System.out.println("LU: " + this.getLu() + "\tNotas: " + this.getNota1() + " - " + this.getNota2());
        System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());     
    }
}
