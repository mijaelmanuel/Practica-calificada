import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Ingrese un número positivo: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        System.out.println("Número válido: " + numero);
    }
}