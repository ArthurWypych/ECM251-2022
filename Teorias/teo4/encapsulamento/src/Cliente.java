public class Cliente {
    private String cpf;
    private String nome;
    private String email;
    private Conta conta;

    public Cliente(String nome, String cpf, String email, Conta conta){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.conta = conta;
    }

    public void vizualisarCliente(){
        System.out.println("Dados do Cliente: ");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("E-mail: "+this.email);
        System.out.println("Conta: "+this.conta);
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getEmail(){
        return this.email;
    }
    public Conta getConta(){
        return this.conta;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
