import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int intentos = 0;

        do {
            System.out.print("Ingrese un número entre 1 y 100: ");
            numero = sc.nextInt();
            intentos++;

        } while (numero < 1 || numero > 100);

        System.out.println("Valor válido.");
        System.out.println("Intentos realizados: " + intentos);
    }
}