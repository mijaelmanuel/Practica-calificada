import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secreto = (int)(Math.random() * 10) + 1;
        int intento;

        do {
            System.out.print("Adivina el número (1-10): ");
            intento = sc.nextInt();

            if (intento != secreto) {
                System.out.println("Incorrecto");
            }

        } while (intento != secreto);

        System.out.println("¡Correcto!");
    }
}