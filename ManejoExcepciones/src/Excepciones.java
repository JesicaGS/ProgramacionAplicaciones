public class Excepciones {
    public static void main(String[] args) {
        // Lanzar un objeto de tipo Exception dentro de un bloque try.
        try {
            System.out.println("Error");
        } catch (Exception e) {
            System.out.println("Los errores en el programa: " + e.getMessage());
            // StackTrace para la excepción.
            e.printStackTrace();
        } finally{
            System.out.println("Finally ha sido alcanzado");
        }
    }
}
