import java.util.Scanner;

public class Herbivoros {
    private String Nombre;
    private String Tamano;
    private String Habitat;
    private int  esperanzadeVida;
    private String CaracteristicasFisicas;

    public Herbivoros(String Nombre,String Tamano, String Habitat,int esperanzadeVida, String CaracteristicasFisicas){
        this.Nombre = Nombre;
        this.Tamano = Tamano;
        this.Habitat = Habitat;
        this.esperanzadeVida = esperanzadeVida;
        this.CaracteristicasFisicas = CaracteristicasFisicas;
    }
    public void mostrarCaracteristicas() {
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Tamano: " + this.Tamano);
        System.out.println("Hábitat: " + this.Habitat);
        System.out.println("Esperanza de vida: " + this.esperanzadeVida + " años");
        System.out.println("Características Físicas: " + this.CaracteristicasFisicas);
    }
    public void Herbivoros(){
        System.out.println("Animales Herbivoros:caballo, vaca, elefante");
    }


    }

