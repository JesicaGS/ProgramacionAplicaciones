public class Ejemplo3 {
    // Método a que lanza nuestra excepción personalizada
    public void metodoA() throws DivisionEntreCero {
        throw new DivisionEntreCero("Error en el método A");
    }

    // Método b que llama a a, captura su excepción y lanza una nueva
    public void metodoB() throws Exception {
        try {
            metodoA();
        } catch (DivisionEntreCero e) {
            throw new Exception("Error en el método B, causado por: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Ejemplo3 objeto = new Ejemplo3();
        try {
            objeto.metodoB();
        } catch (Exception e) {
            System.out.println("Error capturado en main: " + e.getMessage());
            // Imprimir el stack trace completo
            e.printStackTrace();
        }
    }
}

