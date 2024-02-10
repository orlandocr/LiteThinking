public class Main {
    public static void main(String[] args) {
        if (args == null || args.length < 1) {
            throw new IllegalArgumentException("Oops! Faltó el nombre \uD83D\uDE2D");
        }

        String nombre = args[0];
        System.out.printf("Hola, mi nombre es: %s", nombre);
    }
}