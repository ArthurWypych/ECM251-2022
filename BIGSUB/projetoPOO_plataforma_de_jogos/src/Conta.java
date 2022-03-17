public class Conta {
    String user;
    String nick;
    String senha;
    double saldo;
    String listaJogos[];

    void logar(){

    }
    void compra(double preco, double saldo){
        
    }
    void review(String jooj, String mensagem){
        if(temjogo(jooj))
            System.out.println(mensagem);
        else
            System.out.println("se fode");
    }
    boolean temjogo(String jooj){
        if(jooj == listaJogos)
            return true;
        else
            return false;
    }

}
