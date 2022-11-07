import java.util.*;
    /**
     * Biblioteca
     * @author (Ramirez Alfredo Agustin)  
     * @author (Solalinde Ciro Damian) 
     * @author (Ramirez Joaquin) 
     * @version(2021/11/5)
    */
public class Biblioteca {
    //Parte de Solalinde Ciro
    private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Socio> socios;
    
    /**
    * Constructor de la clase con 3 parametros
    * @param p_nombre Nombre de la biblioteca.
    * @param p_libros ArraList generico de libros.
    * @param p_socios ArrayList generico de socios.
    * 
    */
    Biblioteca(String p_nombre){
        setNombre(p_nombre);
        setLibros(new ArrayList<Libro>());
        setSocio(new ArrayList<Socio>());
    }

    /**
    * Establece el nombre de la Biblioteca.
    * @param p_nombre se le asigna el nombre a la Biblioteca.
    */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
    * Establece los Libros en el ArrayList de Libros.
    * @param p_nombre se le asigna el Libro al ArrayList
    */
    private void setLibros(ArrayList<Libro> p_libros){
        this.libros = p_libros;
    }

    /**
    * Establece los socios al ArrayList de Socios.
    * @param p_nombre se le asigna el Socio al ArrayList.
    */
    private void setSocio(ArrayList<Socio> p_socios){
        this.socios = p_socios;
    }

    /**
    * Metodo para mostrar el nombre de la Biblioteca
    * @return Regresa el nombre de la Biblioteca
    */
    public String getNombre(){
        return this.nombre;
    }

    /**
    * Metodo para mostrar los Libros del Array
    * @return Regresa el Libro del ArrayList
    */
    public ArrayList<Libro> getLibros(){
        return this.libros;
    }

    /**
    * Metodo para mostrar los Socios del Array
    * @return Regresa el Socio del ArrayList
    */
    public ArrayList<Socio> getSocios(){
        return this.socios;
    }

    /**
    * Metodo para agregar Socios
    * @return Void
    */
    public void addSocio(Socio p_socio){
        this.getSocios().add(p_socio);
    }

    /**
    * Metodo para remover Socios
    * @return Void
    */
    public void removeSocio(Socio p_socio){
        this.getSocios().remove(p_socio);
    }

    /**
    * Metodo para agregar Libros
    * @return Void
    */
    private void addLibro(Libro p_libro){
        this.getLibros().add(p_libro);
    }

    /**
    * Metodo para remover Libros
    * @return Void
    */
    public void removeLibro(Libro p_libro){
        this.getLibros().remove(p_libro);
        
    }

    /**
    * Metodo para agregar un nuevo Libro al ArrayList
    * @return Void
    */
    public void nuevoLibro(String p_titulo, int p_edicion, String p_editorial, int p_anio){
        this.getLibros().add(new Libro(p_titulo, p_edicion, p_editorial, p_anio));
    }

    /**
    * Metodo para agregar un nuevo Socio de tipo Estudiante al ArrayList
    * @return Void
    */
    public void nuevoSocioEstudiante(int p_dniSocio, String p_nombre, String p_carrera){
        this.getSocios().add(new Estudiante(p_dniSocio, p_nombre, p_carrera));
    }

    /**
    * Metodo para agregar un nuevo Socio de tipo Docente al ArrayList
    * @return Void
    */
    public void nuevoSocioDocente(int p_dniSocio, String p_nombre, String p_area){
        this.getSocios().add(new Docente(p_dniSocio, p_nombre, p_area));
    }
    //Parte de Ramirez Alfredo Agustin
    /**
     * Metodo para contar la cantidad de Socios por tipo(Estudiante/Docente).
     * @return int con la cantidad de Socios.
     */
    public int cantidadSociosPorTipo(String p_objeto){
        int cantidad = 0;
        for(Socio socio:socios){
            if(socio.soyDeLaClase() == p_objeto){// se pudo haber usado equals(p_objeto)
                cantidad++;
            }
        }
        return cantidad;
    }

    /**
     * Metodo para realizar un prestamo, se lo agrega al Libro y Socio.
     * @return Boolean Retorna verdadero si se pudo realizar el prestamo, caso contrario devuelve falso.
     */
    public boolean prestarLibro(Calendar p_fechaRetiro, Socio p_socio, Libro p_libro){
        boolean prestar = false;
        if(p_libro.prestado() == false && p_socio.puedePedir() == true){
            Prestamo prestamo = new Prestamo(p_fechaRetiro, p_socio, p_libro);
            Calendar fechaVencimiento = new GregorianCalendar();
            fechaVencimiento.add(Calendar.DATE, 20);
            prestamo.registrarFechaDevolucion(fechaVencimiento);
            p_libro.addPrestamos(prestamo);
            p_socio.addPrestamo(prestamo);
            prestar = true;
        }
        return prestar;
    }

    /**
     * Metodo para realizar la devolucion de un Libro, se asigna la fecha de la devolucion.
     * @return Void.
     */
    public void devolverLibro(Libro p_libro){
        Calendar fecha = new GregorianCalendar();
        if(p_libro.prestado() == true){
            p_libro.getPrestamo().setFechaDevolucion(fecha);
            p_libro.getPrestamo().getSocio().removePrestamo(p_libro.getPrestamo());
            p_libro.removePrestamo(null);
        }
    }

    /**
     * Metodo para verificar los prestamos vencidos en el dia.
     * @return ArrayList con los prestamos vencidos.
     */
    public ArrayList<Prestamo> prestamosVencidos(){
        Calendar fecha = new GregorianCalendar();
        ArrayList<Prestamo> vencidos = new ArrayList<Prestamo>();
        for(Libro libro:libros){
            //if(libro.getPrestamo().vencido(fecha)){
            if(libro.getPrestamo() != null && libro.getPrestamo().vencido(fecha)){
                vencidos.add(libro.getPrestamo());
            }
        } 
        return vencidos;
    }
    
    /**
     * El metodo devuelve un colección con los docentes responsables.
     * @return ArrayList con los docentes responsables
     */
    public ArrayList<Docente> docentesResponsables(){
        ArrayList<Docente> responsable = new ArrayList<Docente>();//se genera un ArrayList del tipo docente
        Docente docente = new Docente(000000000,"","");//Inicializamos un objeto del tipo docente
        for(int i =0; i<this.getSocios().size();i++){
            if(this.getSocios().get(i).soyDeLaClase() == "Docente"){
                docente = (Docente)this.getSocios().get(i);//se obtiene el socio de tipo docente para consultar si es responsable o no
                if(docente.esResponsable()==true){
                    responsable.add(docente);//Se agrega al docente responsable al ArrayList de Docentes
                }
            }
        }
        return responsable;
    }
    
    /**
     * quienTieneElLibro(String): devuelve el nombre del Socio que tiene el libro con el título ingresado, y si no se encuentra prestado devuelve “El libro se encuentra
     * en la biblioteca.
     */
    public String quienTieneElLibro(Libro p_libro){
        String socio = "";
        if(p_libro.prestado()==true){
            socio = (p_libro.getPrestamo().getSocio().getNombre()+" "+p_libro.getTitulo());
        }else{
            socio = "EL libro se encuentra en la biblioteca";
        }
        return socio;
    }
    
    //parte Jonathan Ramirez
    /**
    * Método listaDeSocios()
    * Muestra la lista de socios en formato predeterminado.
    */
    public String listaDeSocios(){
        String listaSocio = "";
        int contSocio = 1;
        listaSocio = "\n\t---Lista de Socios---\n";
        for(int i = 0; i < this.getSocios().size(); i++){ 
            listaSocio += contSocio + ") " + this.getSocios().get(i).toString() + "\n";  
            contSocio++;
        }
        listaSocio += "\n**********************************";
        listaSocio += "\n-----Cantidad de Socios de tipo Estudiante:" + this.cantidadSociosPorTipo("Estudiante");
        listaSocio+= "\n-----Cantidad de Socios de tipo Docente:" + this.cantidadSociosPorTipo("Docente");
        listaSocio += "\n**********************************"; 
        return listaSocio;
    }
    
    public String listaDeLibros() {
        ArrayList<Libro> libros = this.getLibros();
        String libroTexto = "Lista de libros: \n\n";
        String prestado = "";
        int cuentaLibro = 0;
        for (int i=0; i < libros.size(); i++){
            cuentaLibro = i+1;
            if (libros.get(i).prestado() == false){
                prestado = "NO PRESTADO";
            }
            else{
                prestado = "SI PRESTADO";
            }
            libroTexto = libroTexto + cuentaLibro + "-" + "Titulo: " +libros.get(i).getTitulo() +" || Prestado: (" +prestado +")\n";
        }
        return libroTexto;        
    }
    
    /**
     * Método listaDeDocentesResponsables()
     * Devulve un string de docentes, según el formato 3 de la guia.
     */
    public String listaDeDocentesResponsables(){
        if(this.docentesResponsables().isEmpty()){
            return "¡No existe un listado de docentes que mostrar!";
        }
        else{
            int cuentaSocio = 1;
            String cadena = "\tLista de Docentes Responsables:\n";

            for (Docente d: this.docentesResponsables()){
                cadena+=(cuentaSocio + ") " + d.toString()+"\n");
                cuentaSocio++;
            }
            return cadena;
        }
    }
    
    /**
     * Método buscarSocio().
     * Mediante el dni ingresado procede a buscar el socio.
     * @param   int dni .
     */
    public Socio buscarSocio(int dni){
        Socio socioLista = null;
        for(int i = 0; i < this.getSocios().size(); i++){
            if(this.getSocios().get(i).getDniSocio() == dni){
                socioLista = this.getSocios().get(i);
            }
        }
        return socioLista;
    }

}

