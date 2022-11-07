/**
 * Ejecutable para la toma de pedidos
 * 
 * @author (Sergio Ariel ZApata) 
 * @version (5.3)
 */
import java.util.*;
public class TomaPedido{   
   public static void main (String [] args){
       Scanner sn = new Scanner(System.in);
       sn.useDelimiter("\n");
       ArrayList produc = new ArrayList();// Crea coleccion heterogenea Array produS
       int cont = 0;
       int op = 1;
       int DNICli = 0;
       String nomCli = " ";
       String apeCli = " ";
       double salCli = 0;
       int codPro;
       String rubPro;
       String desPro;
       double cosPro;
       boolean salir = false;
       Laboratorio laboratorio = new Laboratorio("Colgate S.A.","Belgrano 1445","0379154271930");
       Cliente cliente = new Cliente(DNICli,nomCli,apeCli,salCli);
       Pedido pedido = new Pedido(new GregorianCalendar(),cliente,produc);//instanciacion de objeto con collecion heterogenea Array produc
       int opcion; //Guardaremos la opcion del usuario
       while(!salir){
           System.out.print("\u000c");
           System.out.println("\n********  Menú de Pedidos  ********");
           System.out.println("\n1. Ingresar Productos           ");
           System.out.println("2. Remover Productos              ");
           System.out.println("3. Prueba con datos pre-cargados  ");
           System.out.println("0. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   Laboratorio labPro;
                   System.out.print("\u000c");
                   System.out.print("******* Carga del Cliente ********");
                   System.out.print("\nIngrese DNI del Cliente      : ");
                   DNICli = sn.nextInt();
                   System.out.print("\nIngrese Nombre del Cliente   : ");
                   nomCli = sn.next();
                   System.out.print("\nIngrese Apellido del Cliente : ");
                   apeCli = sn.next();
                   System.out.print("\nIngrese Saldo del Cliente    : ");
                   salCli = sn.nextDouble();                   
                   while ( op != 0){
                       System.out.print("\u000c");
                       System.out.println("\n******* Carga de Productos ********");
                       System.out.print("\nIngrese Codigo del Producto  : ");
                       codPro = sn.nextInt();
                       System.out.print("\nIngrese Rubro del Producto   : ");
                       rubPro = sn.next();
                       System.out.print("\nIngrese Descripcion          : ");
                       desPro = sn.next();
                       System.out.print("\nIngrese el Costo             : ");
                       cosPro = sn.nextDouble();
                       Producto prod = new Producto(codPro,rubPro,desPro,cosPro,laboratorio);//carga de datos en objeto prod que sera agregada al Array produc
                       pedido.agregarProducto(prod);//agrega datos al Array produ
                       pedido.mostrarPedido(); 
                       System.out.println("\n\n**Escriba -> 0 <- para salir de la Carga de productos **");
                       System.out.println("\n**Escriba -> 1 <- para continuar con la carga de datos **");
                       op = sn.nextInt();
                   }
                   break;
               case 2:
                   int pos;
                   System.out.print("\u000c");
                   pedido.mostrarPedido();
                   System.out.print("\n\nIngrese la posicion del producto a retirar: ");
                   System.out.print("\n      **Escriba -> 0 <- para CANCELAR **     ");
                   pos = sn.nextInt();
                   if (pos == 0){
                           break;
                       }
                   produc.remove(pos-1);
                   pedido.mostrarPedido();
                   System.out.println("\n\n**Escriba > 0 < para volver al menú**");
                   opcion = sn.nextInt();
                   break;
               case 3:
                   System.out.print("\u000c");
                   //creamos cliente
                   Cliente cli = new Cliente(33063932,"Benjamin","Sandoval",2020);
                   //creamos laboratorio
                   Laboratorio labo = new Laboratorio("Colgate S.A.","Belgrano 1445","0379154271930");
                   //creamos los productos
                   Producto producto1 = new Producto(33,"Perfumes","AXE Desodorantes",15.30,labo);
                   Producto producto2 = new Producto(33,"Perfumes","Rexona Desodorantes",20.30,labo);
                   Producto producto3 = new Producto(33,"Perfumes","Kenzo Perfumes",25.30,labo);
                   Producto producto4 = new Producto(33,"Perfumes","Calvin Klein Perfumes",35.30,labo);
                   //creamos arraylist
                   ArrayList productos = new ArrayList(4);
                   //creamos Pedido con un producto
                   Pedido pedid = new Pedido(new GregorianCalendar(),cli,productos);
                   //agregamos un arraylist a la lista ya creada
                   pedid.agregarProducto(producto1);
                   pedid.agregarProducto(producto2);
                   pedid.agregarProducto(producto3);
                   pedid.agregarProducto(producto4);
                   pedid.mostrarPedido(); 
                   System.out.println("");
                   System.out.println("\nremovemos un producto");
                   pedid.quitarProducto(producto2);
                   //mostramos total contado y financiado despues del cambio                 
                   pedid.mostrarPedido();
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
