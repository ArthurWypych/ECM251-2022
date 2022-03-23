public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("picudo", "321.321.321-21", "gaymail@porra.net", new Conta(1234));

        System.out.println("Nome do Cliente: " + c1.getNome());
        System.out.println("Nome do CPF: " + c1.getCpf());
        System.out.println("Nome do E-mail: " + c1.getEmail());
        c1.getConta().visualizarSaldo();
        
    }
}
