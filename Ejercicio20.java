import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String respuesta;

        do {
            System.out.print("Ingrese temperatura en Celsius: ");
            double celsius = sc.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Fahrenheit: " + fahrenheit);

            sc.nextLine();

            System.out.print("¿Desea continuar? (si/no): ");
            respuesta = sc.nextLine();

        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("Programa finalizado.");
    }
}