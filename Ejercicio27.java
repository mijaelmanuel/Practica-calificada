public class Ejercicio27 {
    public static void main(String[] args) {

        String texto = "Hola Mundo Java";

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            if (letra == ' ') {
                continue;
            }

            System.out.print(letra);
        }
    }
}