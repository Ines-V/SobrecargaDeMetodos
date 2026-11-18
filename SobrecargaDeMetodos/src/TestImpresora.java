public class TestImpresora {
    public static void main(String[] args) {
        Impresora imprimir = new Impresora();

        imprimir.imprimir(2026); //Numero entero.
        imprimir.imprimir(1.27); //Numero decimal.
        imprimir.imprimir("Hola Mundo"); //Texto.
        imprimir.imprimir("Hola Mundo", 3); //Repetir texto.
    }
}