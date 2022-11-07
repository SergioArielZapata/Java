
/**
 * Trabajo Practico N° 3 - Ejecutable N° 10
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.10)
 */
public class Mujer{
    //Variables de instancia
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    
    /**
     * Constructor de objetos para la clase Mujer
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad){
        //Inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(null);
    }
    /**
     * Constructor sobrecargod de objetos para la clase Mujer
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo){
        //Inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casada");
        this.setEsposo(null);
    }
    
    //Setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    private void setEstadoCivil(String p_estado){
        this.estadoCivil = p_estado;
    }
    private void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    public Hombre getEsposo(){
        return this.esposo;
    }
    
    //Metodos
    /**
     * Metodo que asigna el congugue y modifica el estado civil
     */
    public void casarseCon(Hombre p_hombre){
       if(!("Casado".equals(p_hombre.getEstadoCivil())) && (this.getEsposo() == null)){
           this.setEsposo(p_hombre);
           esposo.casarseCon(this);
           this.setEstadoCivil("Casada");
       }
    }
    /**
     * Metodo que modifica el estadoCivil de la mujer si se encuentra casada
     */
    public void divorcio(){
        if(!this.getEstadoCivil().equals("Soltera")){
            this.setEsposo(null);
            this.setEstadoCivil("Divorciada");
        }else{
            System.out.println("No se puede divorciar esta Soltera");
        }
    }
    /**
     * Metodo que devuelve los datos del objeto (nombre, apellido y edad)
     */
    public String datos(){
        return (this.getNombre()+" "+ this.getApellido() +" de "+ this.getEdad() +" años");
    }
    /**
     * Metodo que muestra el estado civil por pantalla
     */
    public void mostrarEstadoCivil(){
        System.out.println(this.datos() + " - " + this.getEstadoCivil());
    }
    /**
     * Metodo que muestra por pantalla quien esta casado con quien
     */
    public void casadaCon(){
        if(!this.getEstadoCivil().equals("Soltera") && !this.getEstadoCivil().equals("Divorciada")){
            System.out.println(this.datos() + " esta casada con " + this.getEsposo().datos());
        }else{
            System.out.println("No esta Casada, su estado civil es " +  this.getEstadoCivil());
        }
    }
}
