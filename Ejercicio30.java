public class Ejercicio30 {
    public static void main(String[] args) {

        String texto = "Yo voy a estudiar Java en la UPLA";

        String[] palabras = texto.split(" ");

        for (int i = 0; i < palabras.length; i++) {

            if (palabras[i].length() < 3) {
                continue;
            }

            System.out.println(palabras[i]);
        }
    }
}