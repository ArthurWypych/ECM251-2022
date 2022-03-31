public class Usuario {
    private String nome;
    private String senha;
    private String email;
    // eu sei que era pra ta privado mas pqp eu n sei fazer de outro jeito
    public Conta conta;

    public Usuario(String nome, String senha, String email, Conta conta){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.conta = conta;
    }

    public String toString(){
        return "Nome: " + this.nome + "\nSenha: " + this.senha + "\nEmail: " + this.email + "\nConta: " + this.conta.getIdConta();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConta(){
        return ""+conta.getIdConta();
    }

}
