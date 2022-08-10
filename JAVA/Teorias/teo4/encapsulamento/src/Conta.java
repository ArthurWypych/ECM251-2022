public class Conta {
    // atributos da nossa classe
    private int numero;
    private String titular;
    private double saldo;
    private String cpf;

    public Conta(int numero){
        this.numero = numero;
        this.saldo = 0;
    }
    // métodos de classe
    public void visualizarSaldo(){
        System.out.println("Saldo atual na conta " + numero + ": R$" + this.saldo);
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
    
}
