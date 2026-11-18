public class Impresora{

    //Imprimir Numero entero
    public void impresora(int numero){
        System.out.println("Entero: "+ numero);
    }

    //Imprimir Numero decimal
    public void imprimir(double numero){
        System.out.println("Decimal: "+ numero);
    }

    //Imprimer Texto.
    public void imprimir(String texto){
        System.out.println("Texto: "+texto);
    }

    //Repetir un texto tantas veces como se deseen.
    public void imprimir (String texto, int veces){
        for(int i=0; i<veces; i++){
            System.out.println(texto);
        }
    }

    public String imprir(int a){
        return "El numero es: "+a;
    }
}