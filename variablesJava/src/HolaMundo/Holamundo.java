package HolaMundo;

import java.util.Scanner;

public class Holamundo {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Indique nombre del libro: " );
        var titulo = consola.nextLine();
        System.out.println("Indique el Autor del libro: ");
        var autor = consola.nextLine();

        System.out.println("Resultado de la busqueda: " + titulo + " " + autor);

    }
}
