
/**
 * Write a description of class DireccionCultura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DireccionCultura {
    public static void main(String[] args){
        //inicializar la cantiad toal de entradas
        int totalLocaliades = 12;
        
        //crear un objeto localidades
        Localidades localidades = new Localidades(totalLocalidades);
        
        //crear beleteria
        Boleteria boleteria = new Boleteria(localidades);
        
        //crear 3 hilos
        Thread b1 = new Thread(boleteria);
        Thread b2 = new Thread(boleteria);
        Thread b3 = new Thread(boleteria);
        
        //asignar nombres a los hilas
        h1.setName("Anfiteatro");
        h2.setName("Teatro Vera");
        h3.setName("Direccion de cultura");
        
        //iniciar hilos
        h1.start();
        h2.start();
        h3.start();
        
    }
}
