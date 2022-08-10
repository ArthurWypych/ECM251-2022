public class Conta {
    // atributos da nossa classe
    private int numero;
    private String titular;
    private double saldo;
    private String cpf;
    private Cliente cliente;

    // construtor da classe
    public Conta(int numero, Cliente cliente){
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0;
    }

    // métodos da classe
    public String visualizarSaldo(){
        return String.format("R$%.2f", this.saldo);
    }

    public boolean depositar(double valor){
        if(valor < 0 ) 
            return false;
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor){
        if(valor >= this.saldo) return false;
        if(valor < 0) return false;
        this.saldo -= valor;
        return true;
    }
    
    public boolean transferirDinheiro(double valor, Conta destino){
        if(!sacar(valor)) return false;
        if(destino.depositar(valor)) return false;
        return true;
    }

    public String toString(){
        return "Numero: " + this.numero + "\nCliente: " + this.cliente.getNome() + "\nSaldo: " + visualizarSaldo();
    }
}
