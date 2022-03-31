public class Conta {
    private int idConta;
    private double saldo;
    private static int count = 0;

    public Conta(double saldo){
        this.saldo = saldo;
        idConta = count++;
    }

    public int getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
