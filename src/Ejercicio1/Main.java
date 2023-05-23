package Ejercicio1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> persona = new ArrayList<>();
        int len = persona.size();
        int n;
        System.out.println("Ingrese N usuarios");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            sc.nextLine();
            System.out.println("Ingrese el nombre: " + (i+1));
            String nombre = sc.nextLine();
            System.out.println("Ingrese la edad: " + (i+1));
            String edad = sc.nextLine();
            System.out.println("Ingrese el sueldo: " + (i+1));
            double sueldo = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese la posicion: " + (i+1));
            String posicion = sc.nextLine();
            System.out.println("Ingrese el dorsal: " + (i+1));
            String dorsal = sc.nextLine();

            Messi messi = new Messi(nombre, edad, sueldo, posicion, dorsal);
            persona.add(messi);

        }

        for (int i = 0; i < persona.size(); i++) {
            Persona personav = persona.get(i);
            // Muestra la información general de Persona
            System.out.println("Nombre: " + personav.getName());
            System.out.println("Edad: " + personav.getEdad());
            System.out.println("Sueldo: " + personav.getSueldo());

            if (personav instanceof Messi) {
                Messi messi = (Messi) personav;
                System.out.println("Posición: " + messi.getPosicion()); // Muestra la información específica de Messi
                System.out.println("Dorsal: " + messi.getDorsal()); // Muestra la información específica de Messi
            }

            System.out.println();
        }


    }

    }

