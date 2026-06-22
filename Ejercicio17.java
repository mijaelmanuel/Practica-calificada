import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        double suma = 0;
        int cantidad = 0;
        String respuesta;

        do {
            System.out.print("Ingrese nota: ");
            nota = sc.nextDouble();

            suma += nota;
            cantidad++;

            sc.nextLine();

            System.out.print("¿Desea continuar? (si/no): ");
            respuesta = sc.nextLine();

        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("Promedio: " + (suma / cantidad));
    }
}