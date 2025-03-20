public class Ejemplo2 {
    // Método que puede lanzar nuestra excepción personalizada
    public void dividir(int numerador, int denominador) throws DivisionEntreCero {
        if (denominador == 0) {
            throw new DivisionEntreCero ("No se puede dividir por cero");
        }
        System.out.println(numerador / denominador);
    }

    public static void main(String[] args) {
        try {
            // Asignar null a la variable en lugar de crear una instancia
            Ejemplo2 calculadora = null;

            // Intentar invocar el método con una referencia null
            calculadora.dividir(10, 5);
        } catch (Exception e) {
            // Catch genérico para cualquier excepción
            System.out.println("Se produjo una excepción: " + e.getMessage());
            System.out.println("Tipo de excepción: " + e.getClass().getName());
        }
    }
}
