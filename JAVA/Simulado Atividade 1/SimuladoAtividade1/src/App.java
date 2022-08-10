// Arthur Wypych de Almeida 19.00565-2

public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta(1000);
        Conta c2 = new Conta(250);
        Conta c3 = new Conta(3000);
        Usuario u1 = new Usuario("mefode", "aaaaaaa", "killme@jebas.com", c1);
        Usuario u2 = new Usuario("void", "ui misterio sla", "@jebas.com", c2);
        Usuario u3 = new Usuario("Preistation", "4002-8922", "yudi@jebas.com", c3);
        
        Transa transa = new Transa();
        String QR1 = transa.gerarString(c1.getIdConta(), u1.getNome(), 250);

        transa.realizarTransa(QR1, u1, u2);

        //Atividade1 a1 = new Atividade1();
        //a1.run();
    }
}
