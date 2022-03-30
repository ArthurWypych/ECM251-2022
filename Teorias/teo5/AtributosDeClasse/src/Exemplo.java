public class Exemplo {
    private String texto;
    private double valor;
    private static int contador = 0;

    public Exemplo(String texto, double valor){
            this.texto = texto;
            this.valor = valor;
            contador++;
    }

    public String toString(){
        return "{Texto: " + this.texto + "\nValor: " + this.valor + "\nContador: " + contador + "}";
    }

    public static int getContador(){
        return contador;
    }
}
