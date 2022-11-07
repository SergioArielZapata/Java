/**
 * Ejecutable de la Clase ArtefactoHogar
 * Trabajo Practico N° 8 - Ejercicio N° 8
 * @author (Sergio Ariel Zapata)
 * @version (6.8)
 */
public class Comercio{
    public static void main (String[] args){
        //creamos objeto de tipo Cocina
        ArtefactoHogar cocina = new Cocina("Volcan",600,15,4,2000, "80*60*60cm");
        cocina.imprimir();
        System.out.println("\nCuotas 6 - Interes 2.53%");
        System.out.println("\nValor Cuota: "+ cocina.cuotaCredito(6, 2.53f));
        System.out.println("Valor Cuota con Adicionales: " + cocina.creditoConAdicional(6, 2.53f) + "\n");
        //creamos objeto de tipo heladera
        ArtefactoHogar heladera = new Heladera("Gafa", 1200,8,11,2,true);
        heladera.imprimir();
        System.out.println("\nCuotas: 6 - Intereses: 2.53%");
        System.out.println("Valor Cuota: " + heladera.cuotaCredito(6, 2.53f));
        System.out.println("Valor Cuota con Adicionales: " + heladera.creditoConAdicional(6,2.53f) + "\n");
        //creamos objeto de tipo lavarropas
        ArtefactoHogar lavarropas = new Lavarropas("LG", 3500, 10, 20, 300, false);
        lavarropas.imprimir();
        System.out.println("\nCuotas: 6 - Intereses: 2.53%");
        System.out.println("Valor Cuota: " + lavarropas.cuotaCredito(6, 2.53f));
        System.out.println("Valor Cuota con Adicionales: " + lavarropas.creditoConAdicional(6,2.53f) + "\n");
    }
}