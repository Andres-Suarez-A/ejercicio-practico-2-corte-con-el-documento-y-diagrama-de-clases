import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Animales = new Scanner(System.in);
        Herbivoros vaca = new Herbivoros("vaca","grande","praderas",20,"cuerpo grande,piel con manchas de colores");
        Herbivoros caballo = new Herbivoros("caballo","grande","praderas",30,"extremidades larga, cuello largo y cabeza grande");
        Herbivoros elefante = new Herbivoros("elefante","muy grande","selvas y sabanas",60,"orejas grandes, gran trompa");

        int opcion = 0;

        do {
            System.out.println("Escoger una opcion del tipo de animal que quieras saber");
            System.out.println("1. Herbívoros");
            System.out.println("2. Carnívoros");
            System.out.println("3. Omnívoros");
            System.out.println("4. Salir");
            opcion = Animales.nextInt();

            if (opcion == 1) {
                System.out.println("Animales Herbivoros");
                caballo.mostrarCaracteristicas();
                System.out.println();
                vaca.mostrarCaracteristicas();
                System.out.println();
                elefante.mostrarCaracteristicas();
            } else if (opcion==2) {
                System.out.println("Animales Carnivoros");
                for (Carnivoros carnivoro : Carnivoros.values()) {
                    carnivoro.mostrarCaracteristicas();
                    System.out.println();
                }
                }  else if (opcion==3) {
                    System.out.println("Animales Omnivoros");
                    for (Omnivoros.OmnivorosEnum omnivorosEnum : Omnivoros.OmnivorosEnum.values()) {
                        omnivorosEnum.mostrarCaracteristicas();
                        System.out.println();
                    }
            } else if (opcion == 4) {
                break;
            }
        } while (opcion != 4);

        System.out.println("Adios");
    }
}

