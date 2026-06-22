import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Ingrese un texto: ");
            String texto = sc.nextLine();

            if (texto.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.println("Procesando: " + texto);
        }

        System.out.println("Programa finalizado.");
    }
}