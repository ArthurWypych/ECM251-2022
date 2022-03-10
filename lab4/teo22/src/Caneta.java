public class Caneta{
    String modelo;
    String cor;
    double ponta;
    int carga;
    // porcentagem seu otario
    final int MAX = 100;

    void escrever (String texto){
        for (int i = 0; i < texto.length(); i++){
            if(carga > 0){
                System.out.print(texto.charAt(i));
                carga--;
            }
            else{
                System.out.println();
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            }
        }
        System.out.println();
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