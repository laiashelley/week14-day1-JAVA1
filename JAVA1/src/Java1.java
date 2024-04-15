// Pedir nombre, apellido y edad

// Imprimir frase con estos 3 datos: "Te llamas Pepe Luis Gonzalez y tienes 45 años."

import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Como te llamas?");
        String nombre = teclado.nextLine();
        System.out.println("Cual es tu apellido?");
        String apellido = teclado.nextLine();
        System.out.println("Cuantos años tienes?");
        int anyos = teclado.nextInt();

        teclado.close();

        System.out.println("Me llamo " + nombre + " " + apellido + " y tengo " + anyos + " años.");
    }
}
