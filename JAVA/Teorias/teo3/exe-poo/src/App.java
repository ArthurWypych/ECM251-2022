public class App {
    public static void main(String[] args) throws Exception {

        // declara um objeto tipo Conta
        Conta minhaConta;
        //instanciar um objeto tipo Conta
        minhaConta = new Conta();
        // declarar e instanciar na mesma linha (foda)
        Conta outraConta = new Conta();

        minhaConta.saldo = 200.0;
        minhaConta.numero = 55252;
        outraConta.saldo = 150.0;
        outraConta.numero = 45456;

        System.out.println("Saldo na minhaConta: ");
        minhaConta.visualizarSaldo();
        System.out.println("Saldo na outaConta: ");
        outraConta.visualizarSaldo();

        // if(!minhaConta.depositar(500)){
        //     System.out.println("Operação falhou!");
        // }
        // if(!minhaConta.sacar(2100)){
        //     System.out.println("Operação Falhou!");
        // }
        // minhaConta.visualizarSaldo();

            minhaConta.transferirDinheiro(-50, outraConta);

        System.out.println("Saldo na minhaConta: ");
        minhaConta.visualizarSaldo();
        System.out.println("Saldo na outaConta: ");
        outraConta.visualizarSaldo();
    }
}
