public class Conta {
    private int idConta;
    private double saldo;
    private static int totalContas = 0;
    public Conta(){
        this.saldo = 0;
        idConta = totalContas;
        totalContas++;
    }
    public boolean depositar(double saldo){
        if(saldo < 0)
            return false;
        this.saldo = this.saldo + saldo;
        return true;
    }

    public boolean sacar(double valor){
        if(valor > saldo)
            return false;
        if(valor < 0)
            return false;
        this.saldo -= valor;
        return true;   
    }
    public boolean transferir(double valor, Conta destino){
        if(!sacar(valor))
            return false;
        return destino.depositar(valor);
    }
    @Override
    public String toString() {
        return "Conta [idConta=" + idConta + ", saldo=" + saldo + "]";
    }
    public double getSaldo() {
        return saldo;
    }
    public int getIdConta() {
        return idConta;
    }
    
}
