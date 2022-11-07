import java.util.*;
/**
 * Ejecutable la clase Curso y Alumno
 * 
 * @author (Sergio Ariel Zapata) 
 * @version (5.5)
 */
public class Carrera{
    public static void main (String [] args){
       Scanner sn = new Scanner(System.in);
       sn.useDelimiter("\n");
       int LU;
       int op = 1;
       String nomAlu;
       String apeAlu;
       double priNot;
       double segNot;
       HashMap<Integer,Alumno> cole = new HashMap<Integer,Alumno>();
       Curso curso = new Curso("Curso-1",cole);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
       while(!salir){
           System.out.print("\u000c");
           System.out.println("\n********    Menú Cursos   ********");
           System.out.println("\n1. Ingresar Alumnos");
           System.out.println("2. Ingresar Alumnos por metodo inscribirAlumno");
           System.out.println("3. Dar de Baja por LU  ");
           System.out.println("4. Buscar Alumno por LU  ");
           System.out.println("5. Promedio de Alumno por LU  ");
           System.out.println("6. Prueba con datos pre-cargados");
           System.out.println("0. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
           switch(opcion){
               case 1:
                   while( op != 0){
                   System.out.print("\u000c");
                   System.out.print("\nIngrese LU del alumno         : ");
                   LU = sn.nextInt();
                   System.out.print("\nIngrese Nombre                : ");
                   nomAlu = sn.next();
                   System.out.print("\nIngrese Apellido              : ");
                   apeAlu = sn.next();
                   System.out.print("\nIngrese Nota 1                : ");
                   priNot= sn.nextInt();
                   System.out.print("\nIngrese Nota 2                : ");
                   segNot = sn.nextInt();
                   Alumno alum = new Alumno(LU,nomAlu,apeAlu);
                   alum.setNota1(priNot);
                   alum.setNota2(segNot);
                   cole.put(alum.getLu(),alum);
                   Curso curso1 = new Curso("Curso-1",cole);
                   curso.mostrarInscriptos();
                   System.out.println("----------------------------------------------------------");
                   System.out.println("\n\n**Escriba -> 0 <- para salir de la Carga de ALUMNOS **");
                   System.out.println("\n**Escriba -> 1 <- para continuar con la carga de datos **");
                   op = sn.nextInt();
                }
                   break;
               case 2: 
                   System.out.print("\u000c");
                   System.out.print("\nIngrese LU del alumno         : ");
                   LU = sn.nextInt();
                   System.out.print("\nIngrese Nombre                : ");
                   nomAlu = sn.next();
                   System.out.print("\nIngrese Apellido              : ");
                   apeAlu = sn.next();
                   System.out.print("\nIngrese Nota 1                : ");
                   priNot= sn.nextInt();
                   System.out.print("\nIngrese Nota 2                : ");
                   segNot = sn.nextInt();
                   Alumno alum = new Alumno(LU,nomAlu,apeAlu);
                   alum.setNota1(priNot);
                   alum.setNota2(segNot);
                   Curso curso2 = new Curso("Curso-1",cole);
                   curso.inscribirAlumno(alum);
                   curso.mostrarInscriptos();
                   System.out.println("----------------------------------------------------------");
                   System.out.println("\n\n**Escriba -> 0 <- para salir de la Carga de ALUMNOS **");
                   op = sn.nextInt();
                   break;
               case 3:
                   int pos;
                   System.out.print("\u000c");
                   curso.mostrarInscriptos();
                   System.out.print("\n\n  Ingrese la LU del alumno a dar de Baja    ");
                   System.out.print("\n      **Escriba -> 0 <- para CANCELAR **    : ");
                   pos = sn.nextInt();
                       if (pos == 0){
                           break;
                       }
                   curso.quitarAlumno(pos);
                   curso.mostrarInscriptos();
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   op = sn.nextInt();
                   break; 
               case 4:
                   int posi;
                   System.out.print("\u000c");
                   System.out.print("\n\n     Ingrese la LU del alumno a Buscar    ");
                   System.out.print("\n      **Escriba -> 0 <- para CANCELAR **    : ");
                   posi = sn.nextInt();
                       if (posi == 0){
                           break;
                       }
                   curso.buscarAlumno(posi).mostrar();
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   op = sn.nextInt();
                   break; 
               case 5:
                   int posic;
                   System.out.print("\u000c");
                   System.out.print("\n\n     Ingrese la LU del alumno a Buscar    ");
                   System.out.print("\n      **Escriba -> 0 <- para CANCELAR **    : ");
                   posic = sn.nextInt();
                       if (posic== 0){
                           break;
                       }
                   System.out.printf("Promedio: %2.2f", curso.buscarAlumno(posic).promedio());
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   op = sn.nextInt();
                   break; 
               case 6:
                   System.out.print("\u000c");
                   //creamos los objetos de tipo Alumno    
                   Alumno alum1 = new Alumno(32555, "Pedro","Gomez");
                   Alumno alum2 = new Alumno(23564, "Maria","Vasquez");
                   Alumno alum3 = new Alumno(30123, "Juan","Perez");    
                   Alumno alum4 = new Alumno(32655, "Marcela","Martinez");
                   alum1.setNota1(7);
                   alum1.setNota2(8);
                   alum2.setNota1(9);
                   alum2.setNota2(4);
                   alum2.setNota1(6);
                   alum2.setNota2(7);
                   alum3.setNota1(10);
                   alum3.setNota2(8);
                   alum4.setNota1(5);
                   alum4.setNota2(9);
                   cole.put(alum1.getLu(),alum1);
                   cole.put(alum2.getLu(),alum2);
                   cole.put(alum3.getLu(),alum3);
                   //creamos un objeto de tipo Curso
                   Curso cur = new Curso("Curso-1",cole);
                   //incorporamos a el ultimo alumno por medio del metodo inscribirAlumno
                   cur.inscribirAlumno(alum4);
                   //imprimimos en pantalla los datos solicitados
                   System.out.println("Cantidad de Inscriptos: "+cur.cantidadDeAlumnos()+"\n");
                   cur.mostrarInscriptos();
                   System.out.println("\n****-- Se da de baja a Pedro porque abandona el curso -- ****");
                   cur.quitarAlumno(32555);
                   System.out.println("Cantidad de Inscriptos: "+cur.cantidadDeAlumnos()+"\n");
                   cur.mostrarInscriptos();
                   System.out.println("\n¿Está Pedro Gomez Inscripto?(int) =>"+cur.estaInscripto(32555));
                   System.out.println("\n¿Está Pedro Gomez Inscripto?(obj) =>"+cur.estaInscripto(alum1));
                   System.out.println("\n****-- Busca y muestra el alumno con Número de Libreta 30123--****");
                   cur.buscarAlumno(30123).mostrar();
                   System.out.println("\n****-- Mostrar promedio del alumno con Número de Libreta 23564--****");
                   System.out.printf("Promedio: %2.2f", cur.buscarAlumno(23564).promedio());
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt();
                   break;
                case 0:
                   System.out.print("\u000c");
                   System.out.println("\n\n\n\n\n\n\n  ******     EL PROGRAMA A FINALIZADO     *******");
                   System.out.println("\n\n\n\n\n\n\n  ****** SEA FELIZ Y HAGA AL ALUMNO FELIZ *******");
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 3");
                }
            }
    }
}