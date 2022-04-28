// 19.00565-2 Arthur Wypych de Almeida

public class Usuario {
    private String nome;
    private Veiculos veiculo;

    public Usuario(String nome, Veiculos v) {
        this.nome = nome;
        this.veiculo = v;
        veiculo.testar();
    }

    public void trocar(Veiculos v){
        this.veiculo = v;
        v.testar();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
