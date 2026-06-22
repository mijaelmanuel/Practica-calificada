public class Ejercicio23 {
    public static void main(String[] args) {

        int[] numeros = {10, 25, 8, 40, 15};
        int buscar = 40;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscar) {
                System.out.println("Número encontrado en la posición " + i);
                break;
            }
        }
    }
}