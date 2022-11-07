import java.util.*;
import java.text.*;

/**
     * Clase GestionBiblioteca para promar los métodos de las calses asociadas.
     * 
     * @author (Ramirez Alfredo Agustin) 
     * @author (Zapata Ariel Sergio) 
     * @author (Solalinde Ciro Damian) 
     * @author (Ramirez Joaquin) 
     * @author (Romero Ruiz Diaz Enzo Jose) 
     * @author (Vendler Ramon De Jesus) 
     * @version(2021/11/5)
     */
public class GestionBiblioteca{
    /**
          * Este método se encarga de iniciar la ejecución del programa
          * Éste es el método principal del proyecto
          * @param args[] es un arreglo 
          * @return void
         */
   public static void main(String [] args){
        //Instanciamos un objeto fechaHoy del tipo Calendar
        Calendar fechaHoy =  new GregorianCalendar();
        //Instanciamos el objeto fecha del tipo SimpleDateFormat 
        //SimpleDateFormat (nos ayuda a mostrar las fechas en el formato que queremos o a reconstruirla a partir de una cadena de texto)
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss");
        //Instanciamos un ArrayList de libros
        ArrayList<Libro> libros = new ArrayList<Libro>();
        //Instanciamos un ArrayList de socios
        ArrayList<Socio> socios = new ArrayList<Socio>();
        //Instanciamos el objeto biblioteca del tipo Biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca UNNE");
        //Instanciamos el objeto teclado del tipo Scanner
        Scanner teclado = new Scanner(System.in);
            
        teclado.useDelimiter("\n");
        //Creamos varabiables iniciales
        int opc = 0;   String nom = "";        String area = "";  String carrera = "";      int edicion = 0;
        int dni = 0;   boolean salir = false;  String ape = "";   String titulo = "";       String editorial = "";
        int anio = 0;  int opcion = 0;         int numero = 0;    int mes = 0; int dia = 0; 

        System.out.println("*********** " + fecha.format(fechaHoy.getTime())+ " ********");
        System.out.println("------------------------------------------------------------");
        System.out.println("************ " + biblioteca.getNombre() + " ****************");
        System.out.println("------------------------------------------------------------");

                while(!salir){
                    try{
                    System.out.println("|----------------------------------------------|");
                    System.out.println("|************ MENU DE OPCIONES *************** |");
                    System.out.println("|    [1] Agregar un Nuevo Socio Docente        |");
                    System.out.println("|    [2] Agregar un Nuevo Socio Estudiante     |");
                    System.out.println("|    [3] Agregar un Nuevo Libro                |");
                    System.out.println("|    [4] Prestar un Libro                      |");
                    System.out.println("|    [5] Devolver un Libro                     |");
                    System.out.println("|    [6] Listar Docentes Responsables          |");
                    System.out.println("|    [7] Listar Socios                         |");
                    System.out.println("|    [8] Listar Libros                         |");
                    System.out.println("|    [9] Eliminar un Socio                     |");
                    System.out.println("|    [10] Eliminar un Libro                    |");
                    System.out.println("|    [11] Agregar dia de prestamos a un Docente|");
                    System.out.println("|    [12] Quien tiene prestado el libro        |");
                    System.out.println("|    [13] Prestamos de libros vencidos         |");
                    System.out.println("|    [14] Salir                                |");
                    System.out.println("|----------------------------------------------|");
                    
                    System.out.println("\nIntroduce un numero del (1 al 14)\n");
                    opcion = teclado.nextInt();
                    
                    switch(opcion){
                        case 1://Opcion para agragar un nuevo socio Docente
                             System.out.println("\u000c");
                             System.out.println("[1] Agregar un Nuevo Socio Docente\n");
                             System.out.print("Ingrese numero de D.N.I: "); 
                             dni = teclado.nextInt();
                             System.out.print("\nIngrese Nombre: "); 
                             nom = teclado.next();
                             System.out.print("\nIngrese Apellido: "); 
                             ape = teclado.next();
                             System.out.print("\nIngrese Area: "); 
                             area = teclado.next();
                             biblioteca.nuevoSocioDocente(dni, (nom + " " + ape), area);
                             System.out.println();
                             System.out.println("\nExito, el socio docente fue agregado...");
                             //Opcion para volver al menu
                             System.out.println("\nPara volver al Menu presione un numero\n");
                             opcion = teclado.nextInt();
                             System.out.println("\u000c");
                        break;
                        
                        case 2://Opcion para agregar un nuevo socio Estudiante
                            System.out.println("\u000c");
                            System.out.println("[2] Agregar un Nuevo Socio Estudiante\n");
                            System.out.print("\nIngrese numero de D.N.I: "); 
                            dni = teclado.nextInt();
                            System.out.print("\nIngrese Nombre: "); 
                            nom = teclado.next();
                            System.out.print("\nIngrese Apellido: "); 
                            ape = teclado.next();
                            System.out.print("\nIngrese Carrera: "); 
                            carrera = teclado.next();
                            biblioteca.nuevoSocioEstudiante(dni, (nom + " " + ape), carrera);
                            System.out.println();
                            System.out.println("\nExito, el socio estudiante fue agregado...");
                            System.out.println("\nPara volver al Menu presione un numero\n");
                            opcion = teclado.nextInt();
                            System.out.println("\u000c");
                        break;
                        
                        case 3://Opcion para agregar un nuevo libro
                            System.out.println("\u000c");
                            System.out.println("[3] Agregar un Nuevo Libro\n");
                            System.out.print("\nIngrese Titulo; "); 
                            titulo = teclado.next();
                            System.out.print("\nIngrese Edicion: "); 
                            edicion = teclado.nextInt();
                            System.out.print("\nIngrese Editorial: "); 
                            editorial = teclado.next();
                            System.out.print("\nIngrese Año de Publicacion: ");
                            anio = teclado.nextInt();
                            biblioteca.nuevoLibro(titulo, edicion, editorial, anio);
                            System.out.println();
                            System.out.println("\nExito, el libro ha sido agregado...");
                            System.out.println("\nPara volver al Menu presione un numero\n");
                            opcion = teclado.nextInt();
                            System.out.println("\u000c");
                        break;
                        
                        case 4://Opcion para poder prestar un Libro 
                            System.out.println("\u000c");
                            System.out.println("[4] Prestar un Libro\n");
                            if(biblioteca.getLibros().isEmpty()){
                                System.out.println("\nNo hay libros para prestar\n");
                            }else{
                                //Llamamos al metedo a clase biblioteca y le mandamos el mensaje de listaDeLibros
                                System.out.println(biblioteca.listaDeLibros());
                                System.out.print("\nIngrese el numero del Libro: "); 
                                numero = teclado.nextInt();
                                System.out.print("\nIngrese el numero de DNI del socio: "); 
                                dni = teclado.nextInt();   
                            }
                            
                            if (numero>0 && numero<=biblioteca.getLibros().size()+1 && biblioteca.buscarSocio(dni)!=null){
                                if (biblioteca.prestarLibro(fechaHoy, biblioteca.buscarSocio(dni), biblioteca.getLibros().get(numero-1))){
                                    System.out.println("\nEl " + biblioteca.getLibros().get(numero-1).toString());
                                    System.out.println("Ha sido Prestado al Socio: " + biblioteca.buscarSocio(dni).toString());
                                }else{
                                    System.out.println("\nERROR, Ese libro ya ha sido prestado..");
                                }
                            }
                            System.out.println("\nPara volver al Menu presione un numero\n");
                            opcion = teclado.nextInt();
                            System.out.println("\u000c");
                        break;
                        
                        case 5://Opcion para devolver un Libro
                            System.out.println("\u000c");
                            if(biblioteca.getLibros().isEmpty()){
                                 System.out.println("\nNo hay libros para devolver\n");
                            }else{
                            for (int i = 0; i<biblioteca.getLibros().size(); i++){
                                 System.out.println((i+1) + ") " + biblioteca.getLibros().get(i).toString());
                            }
                                System.out.print("\nIngrese el numero del Libro: "); 
                                numero = teclado.nextInt();
                            }
                            if (numero>0 && numero<=biblioteca.getLibros().size()+1){
                                System.out.println("\nEl Libro" + biblioteca.getLibros().get(numero-1).toString() + " Ha sido Devuelto");
                                biblioteca.devolverLibro(biblioteca.getLibros().get(numero-1));// estaba fuera de la condicional y podria dar erro
                            }else{
                                System.out.println("\nERROR, numero ingresado no es valido..");
                            }
                            System.out.println("\nPara volver al Menu presione un numero\n");
                            opcion = teclado.nextInt();
                            System.out.println("\u000c");
                        break;
                        
                        case 6://Opcion para listar Docentes Responsables
                            System.out.println("\u000c");
                            System.out.println("[6] Listar Docentes Responsables\n");
                            System.out.println(biblioteca.listaDeDocentesResponsables());
                            System.out.println("\nPara volver al Menu presione un numero\n");
                            opcion = teclado.nextInt();
                            System.out.println("\u000c");
                        break;
                        
                        case 7://Opcion para listar Socios 
                            System.out.println("\u000c");
                            System.out.println("[7] Listar Socios\n");
                            System.out.println(biblioteca.listaDeSocios());
                            System.out.println("\nPara volver al Menu presione un numero\n");
                            opcion = teclado.nextInt();
                            System.out.println("\u000c");
                        break;
                        
                        case 8://Opcion para listar Libros 
                            System.out.println("\u000c");
                            System.out.println("[8] Listar Libros\n");
                            if(biblioteca.getLibros().isEmpty()){
                                System.out.println("\nNo hay libros en Biblioteca\n");
                            }else {
                                System.out.println(biblioteca.listaDeLibros());
                            }
                            System.out.println("\nPara volver al Menu presione un numero\n");
                            opcion = teclado.nextInt();
                            System.out.println("\u000c");
                        break;
                        
                        case 9://Opcion para eliminar un Socio 
                            System.out.println("\u000c");
                            System.out.println("[9] Eliminar un Socio\n");
                            System.out.print("Ingrese el DNI del Socio:"); 
                            dni = teclado.nextInt();
                            if(biblioteca.getSocios().isEmpty()){
                                 System.out.println("\nNo hay socios para eleminar\n");
                                }else if (biblioteca.buscarSocio(dni).cantLibrosPrestados() == 0){
                                        biblioteca.removeSocio(biblioteca.buscarSocio(dni));
                                        System.out.println("\nEl socio ha sido eliminado..");
                            }else{
                                        System.out.println("\nERROR, El numero de socio es incorrecto o tiene libros prestado..");
                            }
                            System.out.println("\nPara volver al Menu presione un numero\n");
                            opcion = teclado.nextInt();
                            System.out.println("\u000c");
                        break;
                        
                        case 10://Opcion para eliminar un Libro 
                            System.out.println("\u000c");
                            System.out.println("[10] Eliminar un Libro\n");
                            
                            for (int i = 0; i < biblioteca.getLibros().size(); i++){//deberia validar antes si esta vacio
                                System.out.println((i+1) + ") " + biblioteca.getLibros().get(i).toString());
                            }
                            System.out.print("\nIngrese el numero del Libro: "); 
                            numero = teclado.nextInt();
                            if(biblioteca.getLibros().isEmpty()){
                                 System.out.println("\nNo hay libros para eliminar\n");
                                }else if ((numero > 0 && numero <= biblioteca.getLibros().size()+1 && biblioteca.getLibros().get(numero-1).prestado() != true)){
                                         System.out.println("\nEl Libro " + biblioteca.getLibros().get(numero-1).toString() +" Ha sido eliminado");
                                         biblioteca.removeLibro(biblioteca.getLibros().get(numero-1));                             
                                }else{
                                         System.out.println("\nERROR!, numero ingresado no es valido o el libro esta prestado");
                            }
                            System.out.println("\nPara volver al Menu presione un numero\n");
                            opcion = teclado.nextInt();
                            System.out.println("\u000c");
                        break;
                        
                        case 11://Opcion para agregar dia de prestamos a un Docente
                            System.out.println("\u000c");
                            System.out.println(biblioteca.listaDeDocentesResponsables());
                            System.out.print("\nIngrese el numero de DNI del Docente: "); 
                            dni = teclado.nextInt();
                            if(biblioteca.getLibros().isEmpty()){
                                 System.out.println("\nNo se puede agregar dias\n");
                                }else if(biblioteca.buscarSocio(dni).soyDeLaClase().equals("Docente") && biblioteca.buscarSocio(dni).cantLibrosPrestados() >=1 ){
                                    System.out.print("Ingrese la Cantidad de Dias a Agregar: "); 
                                    int nroDias = teclado.nextInt();
                                        if (biblioteca.buscarSocio(dni).soyDeLaClase().equals("Docente") && nroDias > 0){
                                            Docente v_docente = (Docente)biblioteca.buscarSocio(dni);
                                            v_docente.agregarDiasDePrestamo(nroDias);
                                            System.out.print("\nSe agregaron los dias indicados..");
                                        }else{                       
                                            System.out.print("\nERROR, no se pueden agregar dias..");
                                }
                            }
                            System.out.println("\nPara volver al Menu presione un numero\n");
                            opcion = teclado.nextInt();
                            System.out.println("\u000c");
                        break;
                        
                        case 12://Opcion para ver quien tiene prestado el libro
                            System.out.println("\u000c");
                            System.out.println("[12] Quien tiene prestado el libro\n");
                            if(biblioteca.getLibros().isEmpty()){
                                 System.out.println("\nNo hay libros prestado\n");
                                }
                            for (int i = 0; i < biblioteca.getLibros().size(); i++){
                                System.out.println((i+1) + ") " + biblioteca.getLibros().get(i).toString());
                            }
                            System.out.print("\nIngrese el numero del Libro: "); 
                            numero = teclado.nextInt();
                            if (numero > 0 && numero <= biblioteca.getLibros().size() + 1){
                                System.out.println(biblioteca.quienTieneElLibro(biblioteca.getLibros().get(numero-1)));
                            }else{
                                System.out.println("\nERROR, nadie tiene un libro prestado");
                            }
                            System.out.println("\nPara volver al Menu presione un numero\n");
                            opcion = teclado.nextInt();
                            System.out.println("\u000c");
                        break;

                        case 13://Opcion para ver prestamos de libros vencidos 
                            System.out.println("\u000c");
                            if(biblioteca.getLibros().isEmpty()){
                                System.out.println("\nNo hay libros prestado\n");
                            }
                            System.out.println("[13] Prestamos de libros vencidos\n");
                            for(int i =0; i < biblioteca.prestamosVencidos().size();i++){
                                System.out.println(((Prestamo)biblioteca.prestamosVencidos().get(i)).toStrin());    
                            }
                            System.out.println("\nPara volver al Menu presione un numero\n");
                            opcion = teclado.nextInt();
                            System.out.println("\u000c");
                        break;
                        
                        case 14://Opcion para salir del menu
                            salir = true;    
                            System.out.println("\u000c");
                            System.out.println("\nGRACIAS POR OCUPAR NUESTRO PROGRAMA, HASTA LA PROXIMA!");
                        break;
                        default:
                            System.out.println("\u000c");
                            System.out.println("\nERROR! OPCIONES DEL (1 al 14) VUELVE A INTENTAR\n");
                    }
                }
                catch(InputMismatchException e){
                System.out.println("\u000c");
                System.out.println("\tERROR! DEBES INGRESAR UN NUMERO!\n");
                teclado.next();
                }
                
            }
        }
    }
       