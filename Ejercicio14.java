import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola");
                    break;
                case 2:
                    System.out.println("Fecha no disponible");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 3);
    }
}