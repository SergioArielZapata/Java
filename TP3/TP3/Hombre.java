
/**
 * Trabajo Practico N° 3 - Ejecutable N° 10
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (3.10)
 */
public class Hombre{
    //Variables de instancia
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
    /**
     * Constructor de objetos para la clase Hombre
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad){
        //Inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(null);
    }
    /**
     * Constructor sobrecargod de objetos para la clase Hombre
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa){
        //Inicializacion de variables de instancias
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casado");
        this.setEsposa(p_esposa);
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
    private void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
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
    public Mujer getEsposa(){
        return this.esposa;
    }
    
    //Metodos
    /**
     * Metodo que asigna el congugue y modifica el estado civil
     */
    public void casarseCon(Mujer p_mujer){
       if(!("Casada".equals(p_mujer.getEstadoCivil())) && (this.getEsposa() == null)){
            this.setEsposa(p_mujer);
            esposa.casarseCon(this);
            this.setEstadoCivil("Casado");
       }
    }
    /**
     * Metodo que modifica el estadoCivil de la mujer si se encuentra casada
     */
    public void divorcio(){
        if(!this.getEstadoCivil().equals("Soltero")){
            this.setEsposa(null);
            this.setEstadoCivil("Divorciado");
        }else{
            System.out.println("No se puede divorciar esta Soltero");
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
    public void casadoCon(){
        if(!this.getEstadoCivil().equals("Soltero") && !this.getEstadoCivil().equals("Divorciado")){
            System.out.println(this.datos() + " esta casado con " + this.getEsposa().datos());
        }else{
            System.out.println("No esta Casado, su estado civil es " +  this.getEstadoCivil());
        }
    }
}
