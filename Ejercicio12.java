import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contraseña;

        do {
            System.out.print("Ingrese la contraseña: ");
            contraseña = sc.nextLine();
        } while (!contraseña.equals("1234"));

        System.out.println("Acceso permitido");
    }
}