public class Transa {
    public String gerarString(int idConta, String nome, int valor){
        return idConta + ";" + nome + ";" + valor;
    }
    public boolean realizarTransa(String QR, Usuario uPay, Usuario uGet){
        String[] dados = QR.split(";");
        if(dados[0] == uGet.getConta()){
            if(dados[1] == uGet.getNome()){
                double valor = uGet.conta.getSaldo() - Double.parseDouble(dados[2]);
                uGet.conta.setSaldo(valor);
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }
}