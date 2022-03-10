public class Caneta{
    String modelo;
    String cor;
    double ponta;
    int carga;
    // porcentagem seu otario
    final int MAX = 100;

    void escrever (String Texto){
        System.out.println(Texto);
    }

    void iniciarCaneta (String modelo, String cor, double ponta){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = MAX;
    }
    String pegarDados(){
        return "Modelo: " + modelo + " - Cor: " + cor + " - Ponta: " + ponta + " - Carga: " + carga;
    }
}