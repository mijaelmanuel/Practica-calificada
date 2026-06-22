public class Ejercicio24 {
    public static void main(String[] args) {

        int[] numeros = {5, -2, 8, -7, 10, -1, 4};

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < 0) {
                continue;
            }

            System.out.println(numeros[i]);
        }
    }
}