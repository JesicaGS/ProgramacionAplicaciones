public class Ejemplo1 {
    public void dividir(int numerador, int denominador) throws DivisionEntreCero {
        if (denominador == 0) {
            throw new DivisionEntreCero("No se puede dividir entre cero");
        }
        System.out.println(numerador / denominador);
    }
    public static void main(String[] args) {
        try {
            // Crear una instancia del objeto
            Ejemplo1 calculadora = new Ejemplo1();
            // Invocar el método que genera la excepción
            calculadora.dividir(10, 0);
        } catch (DivisionEntreCero e) {
            // Controlar la excepción imprimiendo el mensaje
            System.out.println("Error: " + e.getMessage());
        }
    }
}
